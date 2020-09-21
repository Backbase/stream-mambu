package com.backbase.stream.mambu.mapper;

import com.backbase.dbs.transaction.presentation.service.model.CreditDebitIndicator;
import com.backbase.dbs.transaction.presentation.service.model.Currency;
import com.backbase.dbs.transaction.presentation.service.model.TransactionItem;
import com.backbase.dbs.transaction.presentation.service.model.TransactionItemPost;
import com.backbase.mambu.deposit.transactions.model.DepositTransaction;
import com.backbase.stream.mambu.configuration.MambuConfigurationProperties;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TransactionMapper {

    private final MambuConfigurationProperties mambuConfigurationProperties;

    public TransactionMapper(MambuConfigurationProperties mambuConfigurationProperties) {
        this.mambuConfigurationProperties = mambuConfigurationProperties;
    }

    public Optional<TransactionItemPost> map(DepositTransaction depositTransaction, String arrangementId) {
        String description = (depositTransaction.getNotes() == null) ? "" : depositTransaction.getNotes();
        BigDecimal amount = depositTransaction.getAmount();

        if (amount == null) {
            log.error("Transaction: {} of: {} does not have an amount!", depositTransaction.getId(), arrangementId);
            amount = BigDecimal.ZERO;
        }
        CreditDebitIndicator indicator;
        boolean amountIsNegative = amount.compareTo(BigDecimal.ZERO) < 0;
        if (amountIsNegative) {
            log.info("Amount: {} is negative", amount);
            indicator = CreditDebitIndicator.DBIT;
            amount = amount.negate();
        } else {
            indicator = CreditDebitIndicator.CRDT;
        }

        log.info("Ingesting transaction: {} with Amount: {} [{}] for: {}", depositTransaction.getId(), amount, indicator, arrangementId);
        DepositTransaction.TypeEnum type = depositTransaction.getType();

        if (type == null) {
            log.error("Transaction: {} for {} does not have a type!", depositTransaction.getId(), arrangementId);
            return Optional.empty();
        }

        String transactionTypeGroup = getTransactionTypeGroup(type);
        String transactionType = getTransactionType(type);

        OffsetDateTime creationDate = depositTransaction.getCreationDate();
        assert creationDate != null;
        OffsetDateTime midnightDate = creationDate.withHour(0).withMinute(0).withSecond(0);

        // Int sequence number
        Duration between = Duration.between(midnightDate, creationDate);
        long minutesFromMidnight = between.getSeconds() * 60;


        return Optional.of(new TransactionItemPost()
            .billingStatus("BILLED")
            .externalId(depositTransaction.getId())
            .externalArrangementId(arrangementId)
            .typeGroup(transactionTypeGroup)
            .type(transactionType)
            .sequenceNumber(Long.toString(minutesFromMidnight))
            .bookingDate(creationDate.toLocalDate())
            .transactionAmountCurrency(new Currency()
                .amount(amount.toEngineeringString())
                .currencyCode(depositTransaction.getCurrencyCode()))
            .description(description)
            .creditDebitIndicator(indicator));

    }

    public Optional<TransactionItem> mapPull(DepositTransaction depositTransaction, String arrangementId) {
        String description = (depositTransaction.getNotes() == null) ? "" : depositTransaction.getNotes();
        BigDecimal amount = depositTransaction.getAmount();

        if (amount == null) {
            log.error("Transaction: {} of: {} does not have an amount!", depositTransaction.getId(), arrangementId);
            amount = BigDecimal.ZERO;
        }

        CreditDebitIndicator indicator =
            (amount.compareTo(BigDecimal.ZERO) < 0)
                ? CreditDebitIndicator.CRDT
                : CreditDebitIndicator.DBIT;

        log.info("Ingesting transaction: {} for: {}", depositTransaction.getId(), arrangementId);

        DepositTransaction.TypeEnum type = depositTransaction.getType();

        if (type == null) {
            log.error("Transaction: {} for {} does not have a type!", depositTransaction.getId(), arrangementId);
            return Optional.empty();
        }

        String transactionTypeGroup = getTransactionTypeGroup(type);
        String transactionType = getTransactionType(type);

        if(depositTransaction.getCreationDate() == null) {
            log.warn("Transaction {} does not have a creation date. Skipping", depositTransaction.getId());
            return Optional.empty();
        }

        LocalDate bookingDate = depositTransaction.getCreationDate().toLocalDate();

        return Optional.of(new TransactionItem()
            .id(depositTransaction.getId())
            .arrangementId(arrangementId)
            .typeGroup(transactionTypeGroup)
            .type(transactionType)
            .bookingDate(bookingDate)
            .transactionAmountCurrency(new Currency()
                .amount(amount.toEngineeringString())
                .currencyCode(depositTransaction.getCurrencyCode()))
            .description(description)
            .creditDebitIndicator(indicator));
    }

    private String getTransactionTypeGroup(DepositTransaction.TypeEnum mambuType) {
        String typeGroup = getTransactionsMapping().getTransactionTypeGroupMap().get(mambuType.getValue());
        if (typeGroup == null) {
            typeGroup = mambuType.getValue();
        }
        log.info("Mapped Mambu Type Group: {} to: {}", mambuType, typeGroup);
        return typeGroup;
    }

    private String getTransactionType(DepositTransaction.TypeEnum mambuType) {
        String type = getTransactionsMapping().getTransactionTypeMap().get(mambuType.getValue());
        if (type == null) {
            type = mambuType.getValue();
        }
        log.info("Mapped Mambu Type: {} to: {}", mambuType, type);
        return type;
    }

    private MambuConfigurationProperties.Mapping.MambuTransactionConfigurationProperties getTransactionsMapping() {
        return mambuConfigurationProperties.getMapping().getTransactions();
    }


}
