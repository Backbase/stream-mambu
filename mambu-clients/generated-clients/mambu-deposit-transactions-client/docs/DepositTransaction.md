

# DepositTransaction

Represents the action performed on an Deposit Account after which the account's amount changes its value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**migrationEventKey** | **String** | The migration event encoded key associated with this deposit account. If this account was imported, track which &#39;migration event&#39; they came from |  [optional]
**transactionDetails** | [**TransactionDetails**](TransactionDetails.md) |  |  [optional]
**fees** | [**List&lt;Fee&gt;**](Fee.md) | All the amounts that have been applied or paid within this transaction and involved predefined fees |  [optional] [readonly]
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**affectedAmounts** | [**DepositAffectedAmounts**](DepositAffectedAmounts.md) |  |  [optional]
**cardTransaction** | [**CardTransaction**](CardTransaction.md) |  |  [optional]
**taxes** | [**DepositTaxes**](DepositTaxes.md) |  |  [optional]
**tillKey** | **String** | The till key associated with this transaction |  [optional]
**adjustmentTransactionKey** | **String** | The key of the deposit transaction where the adjustment for this transaction was made (if any adjustment was involved) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the deposit transaction |  [optional]
**branchKey** | **String** | The branch where the transaction was performed |  [optional] [readonly]
**terms** | [**DepositTerms**](DepositTerms.md) |  |  [optional]
**transferDetails** | [**TransferDetails**](TransferDetails.md) |  |  [optional]
**paymentOrderId** | **String** | The payment order id of the deposit transaction, customizable |  [optional]
**encodedKey** | **String** | The encoded key of the deposit transaction, auto generated, unique |  [optional] [readonly]
**id** | **String** | The id of the deposit transaction, auto generated, unique |  [optional]
**originalTransactionKey** | **String** | The encodedKey of the transaction that was adjusted as part of this one. Available only for adjustment transactions |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | How much was added/removed in account |  [optional]
**centreKey** | **String** | The center where the transaction was performed |  [optional] [readonly]
**externalId** | **String** | The external id of the deposit transaction, customizable, unique |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date of the entry (eg date of repayment or disbursal, etc.) (as Organization Time) |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when this deposit transaction was created |  [optional] [readonly]
**userKey** | **String** | The person that performed the transaction |  [optional]
**parentAccountKey** | **String** | The key of the parent deposit account |  [optional]
**accountBalances** | [**DepositTransactionBalances**](DepositTransactionBalances.md) |  |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when corresponding JE is booked (as Organization Time) |  [optional]
**currencyCode** | **String** | The currency in which this transaction was posted |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
IMPORT | &quot;IMPORT&quot;
WRITE_OFF | &quot;WRITE_OFF&quot;
WRITE_OFF_ADJUSTMENT | &quot;WRITE_OFF_ADJUSTMENT&quot;
DEPOSIT | &quot;DEPOSIT&quot;
ADJUSTMENT | &quot;ADJUSTMENT&quot;
WITHDRAWAL | &quot;WITHDRAWAL&quot;
WITHDRAWAL_ADJUSTMENT | &quot;WITHDRAWAL_ADJUSTMENT&quot;
CARD_TRANSACTION_REVERSAL | &quot;CARD_TRANSACTION_REVERSAL&quot;
TRANSFER | &quot;TRANSFER&quot;
TRANSFER_ADJUSTMENT | &quot;TRANSFER_ADJUSTMENT&quot;
FEE_APPLIED | &quot;FEE_APPLIED&quot;
FEE_ADJUSTED | &quot;FEE_ADJUSTED&quot;
FEES_DUE_REDUCED | &quot;FEES_DUE_REDUCED&quot;
INTEREST_APPLIED | &quot;INTEREST_APPLIED&quot;
INTEREST_APPLIED_ADJUSTMENT | &quot;INTEREST_APPLIED_ADJUSTMENT&quot;
FEE_REDUCTION_ADJUSTMENT | &quot;FEE_REDUCTION_ADJUSTMENT&quot;
WITHHOLDING_TAX | &quot;WITHHOLDING_TAX&quot;
WITHHOLDING_TAX_ADJUSTMENT | &quot;WITHHOLDING_TAX_ADJUSTMENT&quot;
INTEREST_RATE_CHANGED | &quot;INTEREST_RATE_CHANGED&quot;
OVERDRAFT_INTEREST_RATE_CHANGED | &quot;OVERDRAFT_INTEREST_RATE_CHANGED&quot;
OVERDRAFT_LIMIT_CHANGED | &quot;OVERDRAFT_LIMIT_CHANGED&quot;
BRANCH_CHANGED | &quot;BRANCH_CHANGED&quot;
LOAN_FUNDED | &quot;LOAN_FUNDED&quot;
LOAN_FUNDED_ADJUSTMENT | &quot;LOAN_FUNDED_ADJUSTMENT&quot;
LOAN_REPAID | &quot;LOAN_REPAID&quot;
LOAN_REPAID_ADJUSTMENT | &quot;LOAN_REPAID_ADJUSTMENT&quot;
LOAN_FRACTION_BOUGHT | &quot;LOAN_FRACTION_BOUGHT&quot;
LOAN_FRACTION_BOUGHT_ADJUSTMENT | &quot;LOAN_FRACTION_BOUGHT_ADJUSTMENT&quot;
LOAN_FRACTION_SOLD | &quot;LOAN_FRACTION_SOLD&quot;
LOAN_FRACTION_SOLD_ADJUSTMENT | &quot;LOAN_FRACTION_SOLD_ADJUSTMENT&quot;



