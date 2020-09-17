package com.backbase.stream.mambu.outbound.configuration;

import com.backbase.mambu.deposit.accounts.api.DepositAccountsApi;
import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.mambu.deposit.accounts.model.DepositAccountIBAN;
import com.backbase.stream.mambu.outbound.model.MambuAccount;
import com.backbase.stream.mambu.outbound.repository.MambuAccountRepository;
import java.util.EmptyStackException;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.ipc.netty.http.client.HttpClientException;

@Component
@Slf4j
@RequiredArgsConstructor
@EnableScheduling
public class MambuDatabaseFiller {

    private final MambuAccountRepository mambuAccountRepository;
    private final DepositAccountsApi depositAccountsApi;

    @Scheduled(cron = "0 0 * ? * *")
    public void scheduled() {
        fill();
    }

    @PostConstruct
    public void fill() {
        log.info("Filling Mambu Account Lookup");
        getDepositAccounts(0, 250)
            .onErrorResume(EmptyStackException.class, (throwable) -> {
                log.info("Reached the end. Were done...");
                return Flux.empty();
            })
            .collectList()
            .subscribe();
    }

    public void handleException(Throwable throwable) {
        log.error("Failed storing Mambu accounts: {}", throwable.getMessage(), throwable);
    }

    public Mono<MambuAccount> persist(MambuAccount mambuAccount) {
        return mambuAccountRepository.findByIban(mambuAccount.getIban())
            .doOnNext(existing -> log.debug("Mambu Account: {} already mapped", mambuAccount.getAccountId()))
            .switchIfEmpty(mambuAccountRepository.save(mambuAccount)
                .doOnNext(newAccount -> log.info("Saved new Mambu Account mapping: {}", newAccount.getAccountId())));
    }

    public boolean DepositAccountHasIBAN(DepositAccount depositAccount) {
        DepositAccountIBAN iban = depositAccount.getIBAN();
        if (iban == null) {
            log.debug("Deposit Account: {} does not have IBAN. Skipping...", depositAccount.getId());
        } else {
            log.debug("Deposit Account: {} has IBAN: {}. Adding...", depositAccount.getId(), depositAccount.getIBAN().getIBAN());
        }
        return iban != null;
    }

    public Flux<MambuAccount> getDepositAccounts(int offset, int limit) {

        return getDepositAccountList(offset, limit)

            .expand(depositAccounts -> {
                log.info("Expand offset: {} limit: {}", offset, limit);
                if (depositAccounts.isEmpty()) {
                    return Mono.error(EmptyStackException::new);
                } else {
                    return getDepositAccounts(offset + limit, limit).collectList();
                }
            })
            .doOnError(HttpClientException.class, this::handleException)
            .flatMap(Flux::fromIterable);
    }

    public Mono<List<MambuAccount>> getDepositAccountList(int offset, int limit) {
        log.info("Get Deposit Accounts Offset: {} Limit: {}", offset, limit);
        return depositAccountsApi.getAll(
            offset,
            limit,
            null,
            "FULL",
            null,
            null,
            null,
            "ACTIVE",
            null,
            null)
            .filter(this::DepositAccountHasIBAN)
            .map(MambuAccount::new)
            .flatMap(this::persist)
            .collectList();
    }
}
