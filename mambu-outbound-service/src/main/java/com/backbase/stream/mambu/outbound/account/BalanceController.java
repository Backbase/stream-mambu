package com.backbase.stream.mambu.outbound.account;

import com.backbase.stream.dbs.account.outbound.api.BalancesApi;
import com.backbase.stream.dbs.account.outbound.model.BalanceItemItem;
import com.backbase.stream.mambu.configuration.MambuConfiguration;
import com.backbase.stream.mambu.service.AccountInfoDetails;
import com.backbase.stream.mambu.service.DepositAccountsService;
import com.backbase.stream.mambu.service.LoanService;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@AllArgsConstructor
@Import(MambuConfiguration.class)
public class BalanceController implements BalancesApi {

    private final DepositAccountsService depositAccountsService;
    private final LoanService loanService;

    @Override
    public Mono<ResponseEntity<Flux<BalanceItemItem>>> getBalances(@NotNull @Valid String arrangementIds, ServerWebExchange exchange) {
        log.info("Getting balance for arrangementIds: {}", arrangementIds);
        Flux<BalanceItemItem> balanceItems = Flux.fromArray(arrangementIds.split(","))
            .map(String::trim)
            .flatMap(mambuProductId ->
                Flux.merge(getDepositAccountBalance(mambuProductId), getLoanAccountBalance(mambuProductId)))
            .doOnNext(balanceItemItem -> log.info("Returning balance item: {}", balanceItemItem.getAvailableBalance()));
        return Mono.just(ResponseEntity.ok(balanceItems));
    }

    private Mono<BalanceItemItem> getLoanAccountBalance(String mambuProductId) {
        log.info("Getting Loan Balance By Id: {}", mambuProductId);
        return loanService.getLoanById(mambuProductId, AccountInfoDetails.BASIC)
            .map(loanAccount -> {
                BalanceItemItem balanceItemItem = new BalanceItemItem();
                balanceItemItem.setArrangementId(loanAccount.getId());
                if (loanAccount.getBalances() != null) {
                    // this is bull shit. only for demo purposes
                    balanceItemItem.setAvailableBalance(loanAccount.getBalances().getPrincipalBalance());
                    balanceItemItem.setBookedBalance(loanAccount.getBalances().getHoldBalance());
                }
                log.info("Mapped Loan Account Balance: {}", balanceItemItem);
                return balanceItemItem;
            });
    }

    private Mono<BalanceItemItem> getDepositAccountBalance(String mambuProductId) {
        log.info("Getting Deposit Account Balance for: {}", mambuProductId);
        return depositAccountsService.getDepositAccountById(mambuProductId, AccountInfoDetails.BASIC)
            .map(depositAccount -> {

                BalanceItemItem balanceItemItem = new BalanceItemItem();
                balanceItemItem.setArrangementId(depositAccount.getId());
                if (depositAccount.getBalances() != null) {
                    balanceItemItem.setAvailableBalance(depositAccount.getBalances().getAvailableBalance());
                    balanceItemItem.setBookedBalance(depositAccount.getBalances().getTotalBalance());
                }
                log.info("Mapped Deposit Account Balance: {}", balanceItemItem.getAvailableBalance());
                return balanceItemItem;
            });
    }


}
