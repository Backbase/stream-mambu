

# TransferDepositTransactionInput

Represents the input for a transfer deposit transaction.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount to transfer from account | 
**notes** | **String** | Extra notes about this deposit transaction |  [optional]
**transferDetails** | [**TransferDetailsInput**](TransferDetailsInput.md) |  | 
**paymentOrderId** | **String** | The payment order id of the transfer transaction, customizable |  [optional]
**externalId** | **String** | The external id of the transfer transaction, customizable, unique |  [optional]
**valueDate** | [**OffsetDateTime**](OffsetDateTime.md) | The entry date of the transfer. If not specified it is considered the current date (as Organization Time) |  [optional]



