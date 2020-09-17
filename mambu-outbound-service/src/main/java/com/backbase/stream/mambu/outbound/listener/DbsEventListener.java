package com.backbase.stream.mambu.outbound.listener;

import com.backbase.dbs.transaction.presentation.service.model.TransactionIds;
import com.backbase.paymentorder.event.spec.v1.PaymentOrderUpdatedEvent;
import com.backbase.stream.TransactionService;
import com.backbase.stream.configuration.AccessControlConfiguration;
import com.backbase.stream.configuration.TransactionServiceConfiguration;
import com.backbase.stream.cursor.configuration.CursorServiceConfiguration;
import com.backbase.stream.cursor.events.AuditLoginEventListener;
import com.backbase.stream.mambu.configuration.MambuConfiguration;
import com.backbase.stream.mambu.outbound.model.MambuAccount;
import com.backbase.stream.mambu.outbound.repository.MambuAccountRepository;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
@Slf4j
@RequiredArgsConstructor
@Import({TransactionServiceConfiguration.class, MambuConfiguration.class, DepositTransactionsService.class, CursorServiceConfiguration.class, AccessControlConfiguration.class})
//@ConditionalOnProperty(value = "backbase.stream.mambu.listener.enabled", havingValue = "true")
public class DbsEventListener {

    private final TransactionService transactionService;
    private final MambuAccountRepository mambuAccountRepository;
    private final AuditLoginEventListener auditLoginEventListener;
    private final DepositTransactionsService depositTransactionsService;
    private final ObjectMapper objectMapper = new ObjectMapper()
        .registerModule(new JavaTimeModule());

    @PostConstruct
    private void ingestTransactionsOnLogin() {
        Flux.from(auditLoginEventListener.getLoginEventProcessor())
            .map(depositTransactionsService::retrieveTransactions)
            .flatMap(transactionService::processTransactions)
            .collectList()
            .doOnError(throwable -> log.error("Failed to ingest: ", throwable))
            .subscribe(this::logTransactionIds);
    }

    private void logTransactionIds(java.util.List<TransactionIds> ids) {
        log.info("Ingested Transactions: {}", ids.stream().map(TransactionIds::getExternalId).collect(Collectors.joining(", ")));
    }

    @JmsListener(destination = "VirtualTopic.com.backbase.paymentorder.event.spec.v1.PaymentOrderCreatedEvent")
    private void paymentListener(byte[] bytes) {

        String message = new String(bytes);
        try {
            PaymentOrderUpdatedEvent paymentOrderUpdatedEvent = objectMapper.readValue(message, PaymentOrderUpdatedEvent.class);
            log.info("Payment Order Received");
            String fromAccountId = paymentOrderUpdatedEvent.getPaymentOrder().getOriginatorAccount().getExternalArrangementId();
            String toAccountIban = paymentOrderUpdatedEvent.getPaymentOrder().getTransferTransactionInformation().getCounterpartyAccount().getIdentification().getIdentification();
            Optional<MambuAccount> mambuAccountLookup = mambuAccountRepository.findByIban(toAccountIban).blockOptional();
            ingestTransactionsFor(fromAccountId);
            mambuAccountLookup.ifPresent(mambuAccount -> ingestTransactionsFor(mambuAccount.getAccountId()));
        } catch (JsonProcessingException e) {
            log.info("Cannot read incoming message: {}", message);
        }
    }

    private void ingestTransactionsFor(String fromAccountId) {
        log.info("Ingesting transactions for: {}", fromAccountId);
        transactionService.processTransactions(depositTransactionsService.getTransactionItemsForOutbound(fromAccountId, LocalDate.now().minusDays(2)))
            .subscribe(transactionIds -> log.info("Ingested transaction: {}", transactionIds.getExternalId()));
    }

}
