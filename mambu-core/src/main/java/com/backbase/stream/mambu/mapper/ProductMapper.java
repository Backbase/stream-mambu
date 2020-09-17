package com.backbase.stream.mambu.mapper;

import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.mambu.deposit.accounts.model.DepositAccountBalances;
import com.backbase.mambu.deposit.accounts.model.DepositAccountIBAN;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInterestRateSettings;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInterestSettings;
import com.backbase.mambu.loans.model.InterestSettings;
import com.backbase.mambu.loans.model.LoanAccount;
import com.backbase.stream.cursor.model.IngestionCursor;
import com.backbase.stream.legalentity.model.AvailableBalance;
import com.backbase.stream.legalentity.model.CurrentAccount;
import com.backbase.stream.legalentity.model.InterestPaymentFrequencyUnit;
import com.backbase.stream.legalentity.model.JobProfileUser;
import com.backbase.stream.legalentity.model.LegalEntity;
import com.backbase.stream.legalentity.model.LegalEntityReference;
import com.backbase.stream.legalentity.model.Loan;
import com.backbase.stream.legalentity.model.PrincipalAmount;
import com.backbase.stream.legalentity.model.ProductGroup;
import com.backbase.stream.legalentity.model.TermUnit;
import com.backbase.stream.legalentity.model.User;
import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


@AllArgsConstructor
public class ProductMapper {

    public ProductGroup map(List<DepositAccount> depositAccounts, IngestionCursor ingestionCursor) {

        LegalEntity legalEntity = new LegalEntity();
        legalEntity.setInternalId(ingestionCursor.getInternalLegalEntityId());
        legalEntity.setExternalId(ingestionCursor.getExternalLegalEntityId());

        User user = new User();
        user.setLegalEntityId(legalEntity.getInternalId());
        user.setExternalId(ingestionCursor.getExternalUserId());
        user.setInternalId(ingestionCursor.getInternalUserId());

        // Create Job Profile User with full access sepa (to be configurable)
        JobProfileUser jobProfileUser = new JobProfileUser();
        jobProfileUser.setLegalEntityReference(new LegalEntityReference().externalId("mambu"));
        jobProfileUser.setUser(user);

        List<JobProfileUser> users = Collections.singletonList(jobProfileUser);

        return getProductGroup(depositAccounts, users);
    }

    public ProductGroup getProductGroup(List<DepositAccount> depositAccounts,
                                        List<JobProfileUser> users) {
        List<CurrentAccount> products = depositAccounts.stream()
            .map(this::mapMambuToDbs)
            .collect(Collectors.toList());
        // Create Product Group with Mambu Accounts and assign users for Data Access Groups and Business Function Grousp
        // To Setup Entitlements automagically
        ProductGroup productGroup = new ProductGroup();
        productGroup.setName("Deposits");
        productGroup.setCurrentAccounts(products);
        productGroup.setUsers(users);

        return productGroup;
    }

    public CurrentAccount mapMambuToDbs(DepositAccount depositAccount) {
        CurrentAccount product = new CurrentAccount();

        product.setExternalId(depositAccount.getId());
        product.setName(depositAccount.getName());
        product.setAccountHolderName(null);
        product.setBankAlias(depositAccount.getName() + " - " + depositAccount.getId());
        product.setProductTypeExternalId(depositAccount.getProductTypeKey());
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
        if(balances!=null) {
            product.setAvailableBalance(new AvailableBalance().currencyCode(depositAccount.getCurrencyCode()).amount(balances.getAvailableBalance()));
        }


        return product;
    }

    public Loan mapMambuToDbs(LoanAccount loanAccount, LegalEntity legalEntity, String defaultLoanCurrency) {
        Loan loan = new Loan();

        loan.setExternalId(loanAccount.getId());
        loan.setName(loanAccount.getLoanName());
        loan.setAccountHolderName(loanAccount.getAccountHolderKey());
        loan.setProductTypeExternalId(loanAccount.getProductTypeKey());
        loan.setBBAN(loanAccount.getId());
        loan.setAccountInterestRate(loanAccount.getTaxRate());
        loan.setAccountOpeningDate(loanAccount.getApprovedDate());
        loan.setCurrency(defaultLoanCurrency);
        loan.setPrincipalAmount(new PrincipalAmount().amount(loanAccount.getLoanAmount()).currencyCode(defaultLoanCurrency));
        loan.setLastUpdateDate(loanAccount.getLastModifiedDate());

        InterestSettings interestSettings = loanAccount.getInterestSettings();
        if (interestSettings != null) {
            loan.setAccountInterestRate(interestSettings.getInterestRate());
            loan.setTermUnit(TermUnit.YEARLY);
            loan.setBankAlias(loanAccount.getId());
        }

        return loan;
    }

    private InterestPaymentFrequencyUnit map(DepositAccountInterestRateSettings.InterestChargeFrequencyEnum interestChargeFrequencyEnum) {
        switch (interestChargeFrequencyEnum) {
            case ANNUALIZED:
                return InterestPaymentFrequencyUnit.YEARLY;
            case EVERY_MONTH:
            case EVERY_FOUR_WEEKS:
                return InterestPaymentFrequencyUnit.MONTHLY;
            case EVERY_DAY:
                return InterestPaymentFrequencyUnit.DAILY;
            case EVERY_WEEK:
                return InterestPaymentFrequencyUnit.WEEKLY;
            default:
                return null;
        }
    }


}
