package com.backbase.stream.mambu.outbound.account;

import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.mambu.loans.model.LoanAccount;
import com.backbase.stream.dbs.account.outbound.api.ArrangementDetailsApi;
import com.backbase.stream.dbs.account.outbound.model.ArrangementDetails;
import com.backbase.stream.mambu.configuration.MambuConfiguration;
import com.backbase.stream.mambu.service.AccountInfoDetails;
import com.backbase.stream.mambu.service.DepositAccountsService;
import com.backbase.stream.mambu.service.LoanService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequiredArgsConstructor
@Import(MambuConfiguration.class)
public class ArrangementDetailsController implements ArrangementDetailsApi {

    private final DepositAccountsService depositAccountsService;
    private final LoanService loanService;


    @Override
    public Mono<ResponseEntity<ArrangementDetails>> getArrangementdetails(@NotNull @Valid String arrangementId, ServerWebExchange exchange) {
        return Mono.first(getLoanDetails(arrangementId), getDepositDetails(arrangementId))
            .cast(ArrangementDetails.class)
            .map(ResponseEntity::ok);

    }

    public Mono<ArrangementDetails> getLoanDetails(String arrangementDetails) {
        return loanService.getLoanById(arrangementDetails, AccountInfoDetails.FULL)
            .map(this::mapLoanDetails)
            .onErrorResume(WebClientResponseException.NotFound.class, throwable -> Mono.empty());
    }

    public ArrangementDetails mapLoanDetails(LoanAccount loanAccount) {
        // TODO: Resume mapping details
        return new ArrangementDetails().name(loanAccount.getLoanName());
    }

    public ArrangementDetails mapLoanDetails(DepositAccount depositAccount) {
        // TODO: Resume mapping details
        return new ArrangementDetails().name(depositAccount.getName());
    }

    public Mono<ArrangementDetails> getDepositDetails(String arrangementDetails) {
        return depositAccountsService.getDepositAccountById(arrangementDetails, AccountInfoDetails.FULL)
            .map(this::mapLoanDetails)
            .onErrorResume(WebClientResponseException.NotFound.class, throwable -> Mono.empty());
    }
}
