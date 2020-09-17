package com.backbase.stream.mambu.service;

import com.backbase.mambu.loans.api.LoanAccountsApi;
import com.backbase.mambu.loans.model.LoanAccount;
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
public class LoanService {

    private final LoanAccountsApi loanAccountsApi;

    public Flux<LoanAccount> getAllLoanAccounts(String accountHolderId) {
        return loanAccountsApi.getAll(
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            "CLIENT",
            accountHolderId)
            .doOnNext(loanAccount -> log.info("Received Loan account: {}", loanAccount.getId()))
            .doOnError(WebClientResponseException.BadRequest.class, e -> {
                log.error("Failed to get Loans for holder: {} \n{}", accountHolderId, e.getResponseBodyAsString());
            })
            .doOnError(WebClientResponseException.NotFound.class, e -> {
                log.info("No Loans found folder holder: {}", accountHolderId);
            });

    }

    public Mono<LoanAccount> getLoanById(String loanId, AccountInfoDetails accountInfoDetails) {
        return loanAccountsApi.getById(loanId, accountInfoDetails.toString())
            .doOnError(WebClientResponseException.BadRequest.class, e -> {
                log.error("Failed to get Loan by id: {} \n{}", loanId, e.getResponseBodyAsString());
            })
            .onErrorResume(WebClientResponseException.NotFound.class, notFound -> {
                log.info("Loan not found: {}", loanId);
                return Mono.empty();
            });

    }

}
