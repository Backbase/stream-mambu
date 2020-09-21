package com.backbase.stream.mambu.outbound.account;

import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.mambu.deposit.accounts.model.DepositAccountBalances;
import com.backbase.mambu.deposit.accounts.model.DepositAccountIBAN;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInterestRateSettings;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInterestSettings;
import com.backbase.mambu.loans.model.Balances;
import com.backbase.mambu.loans.model.InterestSettings;
import com.backbase.mambu.loans.model.LoanAccount;
import com.backbase.stream.dbs.account.outbound.api.ArrangementDetailsApi;
import com.backbase.stream.dbs.account.outbound.model.ArrangementDetails;
import com.backbase.stream.mambu.configuration.MambuConfiguration;
import com.backbase.stream.mambu.service.AccountInfoDetails;
import com.backbase.stream.mambu.service.DepositAccountsService;
import com.backbase.stream.mambu.service.LoanService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        return getDepositDetails(arrangementId)
            .map(ResponseEntity::ok);
    }

    public Mono<ArrangementDetails> getLoanDetails(String arrangementDetails) {
        return loanService.getLoanById(arrangementDetails, AccountInfoDetails.FULL)
            .map(this::mapLoanDetails);
    }

    public ArrangementDetails mapLoanDetails(LoanAccount loanAccount) {
        ArrangementDetails product = new ArrangementDetails();
        product.setName(loanAccount.getLoanName());
        product.setBBAN(loanAccount.getId());


        InterestSettings interestSettings = loanAccount.getInterestSettings();

        if (interestSettings != null) {
            product.setApplicableInterestRate(interestSettings.getInterestRate());
        }

        Balances balances = loanAccount.getBalances();
        if (balances != null) {
            product.setAvailableBalance(balances.getHoldBalance());
        }

        return product;

    }

    public ArrangementDetails mapLoanDetails(DepositAccount depositAccount) {
        ArrangementDetails product = new ArrangementDetails();
        product.setName(depositAccount.getName());
        product.setCurrency(depositAccount.getCurrencyCode());
        product.setBBAN(depositAccount.getId());

        DepositAccountIBAN iban = depositAccount.getIBAN();
        if (iban != null) {
            product.setIBAN(iban.getIBAN());
        }
        DepositAccountInterestSettings interestSettings = depositAccount.getInterestSettings();

        DepositAccountInterestRateSettings interestRateSettings;
        if (interestSettings != null) {
            interestRateSettings = interestSettings.getInterestRateSettings();
            if (interestRateSettings != null) {
                product.setAccountInterestRate(interestRateSettings.getInterestRate());
            }
        }

        DepositAccountBalances balances = depositAccount.getBalances();
        if (balances != null) {
            product.setBookedBalance(balances.getAvailableBalance());
            product.setAvailableBalance(balances.getAvailableBalance());

        }

        return product;
    }

    public Mono<ArrangementDetails> getDepositDetails(String arrangementDetails) {
        return depositAccountsService.getDepositAccountById(arrangementDetails, AccountInfoDetails.FULL)
            .doOnNext(depositAccount -> log.info("Found deposit  account: {} ", depositAccount))
            .map(this::mapLoanDetails)
            .onErrorResume(WebClientResponseException.NotFound.class, throwable -> Mono.empty());
    }
}
