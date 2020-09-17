package com.backbase.stream.mambu.outbound.transactions;

import com.backbase.stream.dbs.transactions.pull.api.TransactionsApi;
import com.backbase.stream.dbs.transactions.pull.model.FilterItem;
import com.backbase.stream.dbs.transactions.pull.model.TransactionItem;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import java.time.LocalDate;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@Slf4j
public class TransactionPullController implements TransactionsApi {

    private final DepositTransactionsService depositTransactionsService;
    private final TransactionPullMapper transactionPullMapper = Mappers.getMapper(TransactionPullMapper.class);

    @Override
    public Mono<ResponseEntity<Flux<TransactionItem>>> postFilter(@Valid Flux<FilterItem> filterItems,
                                                                  ServerWebExchange exchange) {

        Flux<TransactionItem> transactionItemFlux = filterItems
            .doOnNext(filterItem -> log.info("Pulling transactions for: {}", filterItem.getArrangementId()))
            .flatMap(this::getTransactions)
            .map(transactionPullMapper::map)
            .doOnNext(transactionItem -> log.info("Transaction: {}", transactionItem.getId()));

        return Mono.just(ResponseEntity.ok(transactionItemFlux));
    }

    private Flux<com.backbase.dbs.transaction.presentation.service.model.TransactionItem> getTransactions(FilterItem item) {
        LocalDate dateFrom = null;
        if (item.getFromDatetime() != null) {
            dateFrom = item.getFromDatetime().toLocalDate();
        }
        return depositTransactionsService.getTransactionItemsForPull(item.getArrangementId(),
            dateFrom);
    }
}
