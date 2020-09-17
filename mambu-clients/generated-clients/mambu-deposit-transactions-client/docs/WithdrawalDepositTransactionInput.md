

# WithdrawalDepositTransactionInput

Represents the input for a withdrawal transaction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDetails** | [**TransactionDetailsInput**](TransactionDetailsInput.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount to withdraw from account | 
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**paymentOrderId** | **String** | The payment order id of the withdrawal transaction, customizable |  [optional]
**externalId** | **String** | The external id of the withdrawal transaction, customizable, unique |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the withdrawal when the transaction is logged into accounting. If not specified it is considered the value date |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entry date of the withdrawal. If not specified it is considered the current date (as Organization Time) |  [optional]



