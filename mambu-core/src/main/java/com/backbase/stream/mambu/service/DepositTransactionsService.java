package com.backbase.stream.mambu.service;

import com.backbase.dbs.transaction.presentation.service.model.TransactionItem;
import com.backbase.dbs.transaction.presentation.service.model.TransactionItemPost;
import com.backbase.mambu.deposit.transactions.api.DepositTransactionsApi;
import com.backbase.mambu.deposit.transactions.model.DepositTransaction;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionFilterCriteria;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionSearchCriteria;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionSortingCriteria;
import com.backbase.stream.cursor.model.IngestionCursor;
import com.backbase.stream.mambu.mapper.TransactionMapper;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Slf4j
@Service
@RequiredArgsConstructor
public class DepositTransactionsService {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private final DepositTransactionsApi depositTransactionsApi;
    private final TransactionMapper transactionMapper;

    public Flux<TransactionItemPost> retrieveTransactions(IngestionCursor ingestionCursor) {
        log.debug("ingestionCursor: {}", ingestionCursor);
        String externalArrangementId = ingestionCursor.getExternalArrangementId();
        LocalDate dateFrom = ingestionCursor.getDateFrom();

        if (externalArrangementId == null) {
            log.info("Not a valid ingestion cursor as it does not have an external ArrangementId");
            return Flux.empty();
        }
        log.info("Retrieving transactions for arrangement: {}", externalArrangementId);

        return getTransactionItemsForOutbound(externalArrangementId, dateFrom);
    }

    public Flux<TransactionItemPost> getTransactionItemsForOutbound(String externalArrangementId, LocalDate dateFrom) {
        Flux<DepositTransaction> depositTransactionFlux = getDepositTransactions(externalArrangementId, dateFrom);
        return depositTransactionFlux.flatMap(depositTransaction -> Mono.justOrEmpty(transactionMapper.map(depositTransaction, externalArrangementId)));
    }

    public Flux<TransactionItem> getTransactionItemsForPull(String externalArrangementId, LocalDate dateFrom) {
        Flux<DepositTransaction> depositTransactionFlux = getDepositTransactions(externalArrangementId, dateFrom);
        return depositTransactionFlux.flatMap(depositTransaction -> Mono.justOrEmpty(transactionMapper.mapPull(depositTransaction, externalArrangementId)));
    }


    public Flux<DepositTransaction> getDepositTransactions(String externalArrangementId, LocalDate dateFrom) {
        if(externalArrangementId == null) {
            log.error("Invalid external arrangement id");
        }

        DepositTransactionSearchCriteria searchCriteria = createSearchCriteria(externalArrangementId, dateFrom);
        log.debug("searchCriteria: {}", searchCriteria);

        return depositTransactionsApi.search(searchCriteria, null, null, null, null)
            .doOnError(WebClientResponseException.class, e -> log.error("Failed to get Mambu transactions for: {}. Response[{}]: {}", externalArrangementId, e.getRawStatusCode(), e.getResponseBodyAsString()))
            .onErrorResume(WebClientResponseException.class, e -> Mono.empty());
    }

    private DepositTransactionSearchCriteria createSearchCriteria(String externalArrangementId,
                                                                  LocalDate dateFrom) {
        return new DepositTransactionSearchCriteria()
            .sortingCriteria(
                new DepositTransactionSortingCriteria()
                    .field(DepositTransactionSortingCriteria.FieldEnum.ID)
                    .order(DepositTransactionSortingCriteria.OrderEnum.DESC))
            .filterCriteria(createFilterCriteria(externalArrangementId, dateFrom));
    }

    private List<DepositTransactionFilterCriteria> createFilterCriteria(
        String externalArrangementId,
        LocalDate dateFrom) {

        List<DepositTransactionFilterCriteria> filterCriteria = new ArrayList<>();
        filterCriteria.add(
            new DepositTransactionFilterCriteria()
                .field(DepositTransactionFilterCriteria.FieldEnum.PARENTACCOUNTID)
                .value(externalArrangementId)
                .operator(DepositTransactionFilterCriteria.OperatorEnum.EQUALS)
        );
        if (dateFrom != null) {
            filterCriteria.add(
                new DepositTransactionFilterCriteria()
                    .field(DepositTransactionFilterCriteria.FieldEnum.CREATIONDATE)
                    .value(dateTimeFormatter.format(dateFrom) + "T00:00:00+00:00")
                    .operator(DepositTransactionFilterCriteria.OperatorEnum.AFTER)
            );
        }
        return filterCriteria;
    }
}