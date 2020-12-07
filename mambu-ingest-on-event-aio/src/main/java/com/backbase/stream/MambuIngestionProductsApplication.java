package com.backbase.stream;

import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.stream.cursor.events.ArrangementListener;
import com.backbase.stream.cursor.events.AuditLoginEventListener;
import com.backbase.stream.cursor.model.IngestionCursor;
import com.backbase.stream.mambu.mapper.ProductMapper;
import com.backbase.stream.mambu.service.DepositAccountsService;
import com.backbase.stream.mambu.service.DepositTransactionsService;
import com.backbase.stream.product.BatchProductIngestionSaga;
import com.backbase.stream.product.task.ProductGroupTask;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@SpringBootApplication
public class MambuIngestionProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MambuIngestionProductsApplication.class, args);
    }

    @Slf4j
    @Component
    @AllArgsConstructor
    static class IngestOnLoginRunner implements ApplicationRunner {

        private final ArrangementListener arrangementListener;
        private final AuditLoginEventListener auditLoginEventListener;
        private final DepositAccountsService reactiveDepositAccountsService;
        private final ProductMapper productMapper;
        private final BatchProductIngestionSaga productIngestionSaga;
        private final DepositTransactionsService depositTransactionsService;
        private final TransactionService transactionService;

        @Override
        public void run(ApplicationArguments args) {

            setuIngestArrangementsOnLoginEventListener();
            setupArrangementAddedEventListener();
            setupIngestTransactionsOnLoginEventListener();

//            auditLoginEventListener.publishIngestionCursorsFor(new LoginEvent(), "bart.veenstra");
//            auditLoginEventListener.publishIngestionCursorsFor(new LoginEvent(), "dope.dealer");

        }

        private void setupIngestTransactionsOnLoginEventListener() {
            Flux.from(auditLoginEventListener.getLoginEventProcessor())
                .map(depositTransactionsService::retrieveTransactions)
                .flatMap(transactionService::processTransactions)
                .collectList()
                .doOnError(throwable -> log.error("Failed to ingest: ", throwable))
                .subscribe(ids -> log.info("Ingested Transactions: {}", ids));
        }

        private void setupArrangementAddedEventListener() {
            Flux.from(arrangementListener.getArrangementAddedEventCursorProcessor())
                .map(depositTransactionsService::retrieveTransactions)
                .flatMap(transactionService::processTransactions)
                .collectList()
                .doOnError(throwable -> log.error("Failed to ingest: ", throwable))
                .subscribe(ids -> log.info("Ingested Transactions: {}", ids));
        }

        private void setuIngestArrangementsOnLoginEventListener() {
            Flux.from(auditLoginEventListener.getLoginEventProcessor())
                .flatMap(this::getAllDepositAccounts)
                .map(depositAccountsAndIngestionCursor -> {
                    List<DepositAccount> depositAccountList = depositAccountsAndIngestionCursor.getT1();
                    IngestionCursor ingestionCursor = depositAccountsAndIngestionCursor.getT2();
                    return productMapper.map(depositAccountList, ingestionCursor);
                })
                .map(ProductGroupTask::new)
                .flatMap(productIngestionSaga::process)
                .subscribe(ids -> log.info("Ingested Accounts: {}", ids));
        }

        private Mono<Tuple2<List<DepositAccount>, IngestionCursor>> getAllDepositAccounts(IngestionCursor ingestionCursor) {
            return reactiveDepositAccountsService.getAllDepositAccounts(ingestionCursor.getExternalLegalEntityId())
                .collectList()
                .zipWith(Mono.just(ingestionCursor));
        }
    }
}
