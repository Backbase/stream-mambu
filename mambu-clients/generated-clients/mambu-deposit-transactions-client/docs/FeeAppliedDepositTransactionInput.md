

# FeeAppliedDepositTransactionInput

Represents the request payload for creating a transaction of type FEE_APPLIED.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalId** | **String** | The external id of the current transaction, customizable, unique |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | The value of the fee applied on the account |  [optional]
**notes** | **String** | Extra notes about the current transaction |  [optional]
**predefinedFeeKey** | **String** | The encodedKey of the predefined fee that defines the current fee |  [optional]



