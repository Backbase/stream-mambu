

# DepositTransactionInput

Represents the request payload for creating a transaction of type DEPOSIT.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDetails** | [**TransactionDetailsInput**](TransactionDetailsInput.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount that was added to an account | 
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**paymentOrderId** | **String** | The payment order id of the deposit transaction, customizable |  [optional]
**externalId** | **String** | The external id of the deposit transaction, customizable, unique |  [optional]
**bookingDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of Journal Entry (as Organization Time) |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entry date of the deposit (as Organization Time) |  [optional]



