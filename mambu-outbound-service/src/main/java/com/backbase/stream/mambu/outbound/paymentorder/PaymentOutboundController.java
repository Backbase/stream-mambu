package com.backbase.stream.mambu.outbound.paymentorder;

import com.backbase.dbs.transaction.presentation.service.model.TransactionItemPost;
import com.backbase.mambu.deposit.transactions.api.DepositTransactionsApi;
import com.backbase.mambu.deposit.transactions.model.DepositTransaction;
import com.backbase.mambu.deposit.transactions.model.TransferDepositTransactionInput;
import com.backbase.mambu.deposit.transactions.model.TransferDetailsInput;
import com.backbase.stream.TransactionService;
import com.backbase.stream.configuration.TransactionServiceConfiguration;
import com.backbase.stream.dbs.paymentorder.outbound.api.PaymentOrdersApi;
import com.backbase.stream.dbs.paymentorder.outbound.model.AccountIdentificationIdentification;
import com.backbase.stream.dbs.paymentorder.outbound.model.InvolvedParty;
import com.backbase.stream.dbs.paymentorder.outbound.model.PaymentOrdersPostResponseBody;
import com.backbase.stream.dbs.paymentorder.outbound.model.PaymentorderPost;
import com.backbase.stream.dbs.paymentorder.outbound.model.PaymentordercancelresponsePost;
import com.backbase.stream.dbs.paymentorder.outbound.model.PostalAddress;
import com.backbase.stream.dbs.paymentorder.outbound.model.RemittanceInformation;
import com.backbase.stream.dbs.paymentorder.outbound.model.TransferTransactionInformation;
import com.backbase.stream.mambu.mapper.MambuTransactionMapper;
import com.backbase.stream.mambu.outbound.repository.MambuAccountRepository;
import com.backbase.stream.worker.exception.StreamTaskException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@Import({TransactionServiceConfiguration.class})
@Slf4j
class PaymentOutboundController implements PaymentOrdersApi {

    private final DepositTransactionsApi depositTransactionsApi;

    private final MambuAccountRepository mambuAccountRepository;

    private final TransactionService transactionService;

    private final MambuTransactionMapper mambuTransactionMapper;

    @Override
    public Mono<ResponseEntity<PaymentordercancelresponsePost>> postCancelByBankReferenceId(@Size(max = 64) String bankReferenceId, ServerWebExchange exchange) {
        return cancelByBankReference(bankReferenceId)
            .map(ResponseEntity::ok);
    }

    @Override
    public Mono<ResponseEntity<PaymentOrdersPostResponseBody>> postPaymentorders(@Valid Mono<PaymentorderPost> paymentorderPost, ServerWebExchange exchange) {
        return execute(paymentorderPost)
            .map(ResponseEntity::ok);
    }


    public Mono<PaymentOrdersPostResponseBody> execute(@Valid Mono<PaymentorderPost> paymentordersPostMono) {

        return paymentordersPostMono
            .doOnNext(paymentOrder -> log.info("Executing Mambu Deposit Payment Order: {}", paymentOrder))
            .flatMap(this::findAndReplaceDepositAccount)
            .flatMap(this::executeAndEnrichMambuPayment)
            .map(this::mapMambuResponse)
            .doOnNext(paymentOrderResponse -> log.info("Returning payment order response: {}", paymentOrderResponse))
            .doOnError(WebClientResponseException.class, throwable -> log.error("Failed to execute payment order: {}", throwable.getResponseBodyAsString()))
            .onErrorResume(WebClientResponseException.class, this::handleRejection);
    }


    private Mono<PaymentorderPost> findAndReplaceDepositAccount(PaymentorderPost paymentorderPost) {
        AccountIdentificationIdentification identification = paymentorderPost.getTransferTransactionInformation().getCounterpartyAccount().getIdentification();
        String iban = identification.getIdentification();
        return mambuAccountRepository.findByIban(iban)
            .map(mambuAccount -> {
                paymentorderPost.getTransferTransactionInformation().getCounterpartyAccount().setArrangementId(iban);
                paymentorderPost.getTransferTransactionInformation().getCounterpartyAccount().setExternalArrangementId(mambuAccount.getAccountId());
                return paymentorderPost;
            })
            .switchIfEmpty(Mono.error(() -> new IllegalStateException("IBAN is not registered in Mambu Sandbox")));
    }

    public Mono<PaymentOrdersPostResponseBody> handleRejection(WebClientResponseException httpException) {
        return Mono.just(new PaymentOrdersPostResponseBody()
            .errorDescription(httpException.getResponseBodyAsString())
            .bankStatus("REJECTED"));
    }

    public PaymentOrdersPostResponseBody mapMambuResponse(DepositTransaction depositTransaction) {
        return new PaymentOrdersPostResponseBody()
            .bankReferenceId(depositTransaction.getId())
            .bankStatus("ACCEPTED");
    }

    private Mono<DepositTransaction> executeAndEnrichMambuPayment(PaymentorderPost paymentOrder) {
        return executeMambuPayment(paymentOrder)
            .doOnNext(depositTransaction -> enrichTransaction(paymentOrder, depositTransaction));
    }


    private void enrichTransaction(PaymentorderPost paymentOrder, DepositTransaction depositTransaction) {

        Optional<TransactionItemPost> transactionItemPost = mambuTransactionMapper.map(depositTransaction, paymentOrder.getOriginatorAccount().getExternalArrangementId());

        transactionItemPost.ifPresent(transaction -> {
            TransferTransactionInformation transferTransactionInformation = paymentOrder.getTransferTransactionInformation();
            InvolvedParty counterparty = paymentOrder.getTransferTransactionInformation().getCounterparty();
            transaction.setCounterPartyName(transferTransactionInformation.getCounterparty().getName());
            PostalAddress postalAddress = counterparty.getPostalAddress();
            if (postalAddress != null) {
                transaction.setCounterPartyAddress(postalAddress.getAddressLine1());
                transaction.setCounterPartyCity(postalAddress.getTown());
                transaction.setCounterPartyCountry(postalAddress.getCountry());
            }
            transaction.setReference(paymentOrder.getId());

            transactionService.processTransactions(Flux.fromIterable(Collections.singleton(transaction)))
                .doOnError(StreamTaskException.class, streamTaskException -> {
                    log.error("Failed to ingest transaction:");
                    streamTaskException.getTask().logSummary();
                })
                .doOnError(Exception.class, ex -> {
                    log.error("Failed to ingest enriched transaction: {}", transaction, ex);
                })
                .subscribe(transactionIds -> log.info("Enriched Transaction: {}", transactionIds));
        });
    }

    public Mono<DepositTransaction> executeMambuPayment(PaymentorderPost paymentOrder) {
        TransferTransactionInformation transferTransactionInformation = paymentOrder.getTransferTransactionInformation();
        BigDecimal amount = new BigDecimal(transferTransactionInformation.getInstructedAmount().getAmount());
        TransferDepositTransactionInput mambuRequest = new TransferDepositTransactionInput()
            .amount(amount)
            .transferDetails(new TransferDetailsInput()
                .linkedAccountType(TransferDetailsInput.LinkedAccountTypeEnum.DEPOSIT)
                .linkedAccountKey(transferTransactionInformation.getCounterpartyAccount().getExternalArrangementId())
            );
        RemittanceInformation remittanceInformation = transferTransactionInformation.getRemittanceInformation();
        if (remittanceInformation != null) {
            mambuRequest.setNotes(remittanceInformation.getContent());
        }
        String idempotencyKey = UUID.randomUUID().toString();
        log.info("Sending Payment Request: {}", mambuRequest);
        String externalArrangementId = paymentOrder.getOriginatorAccount().getExternalArrangementId();
        return depositTransactionsApi.makeTransfer(externalArrangementId, mambuRequest, idempotencyKey);
    }

    public Mono<PaymentordercancelresponsePost> cancelByBankReference(String bankReferenceId) {
        throw new UnsupportedOperationException();
    }


}
