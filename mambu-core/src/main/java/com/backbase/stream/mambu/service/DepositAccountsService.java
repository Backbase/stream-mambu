package com.backbase.stream.mambu.service;

import com.backbase.mambu.deposit.accounts.api.DepositAccountsApi;
import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Slf4j
@RequiredArgsConstructor
@Service
public class DepositAccountsService {

    private final DepositAccountsApi depositAccountsApi;

    public Flux<DepositAccount> getAllDepositAccounts(String accountHolderId) {
        return depositAccountsApi.getAll(
            null,
            null,
            null,
            AccountInfoDetails.FULL.toString(),
            null,
            null,
            null,
            null,
            "CLIENT",
            accountHolderId)
            .doOnNext(depositAccount -> log.info("Received deposit account: {}", depositAccount.getId()))
            .doOnError(WebClientResponseException.BadRequest.class, e -> {
                log.error("Failed to get accounts for holder: {} \n{}", accountHolderId, e.getResponseBodyAsString());
            })
            .doOnError(WebClientResponseException.NotFound.class, e -> {
                log.info("No Accounts found folder holder: {}", accountHolderId);
            });

    }


    public Mono<DepositAccount> getDepositAccountById(String accountId, AccountInfoDetails accountInfoDetails) {
        return depositAccountsApi.getById(accountId, accountInfoDetails.toString())
            .doOnError(WebClientResponseException.BadRequest.class, e -> {
                log.error("Failed to get account by id: {} \n{}", accountId, e.getResponseBodyAsString());
            })
            .onErrorResume(WebClientResponseException.NotFound.class, notFound -> {
                log.info("Account not found: {}", accountId);
                return Mono.empty();
            });

    }
}
