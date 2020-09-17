

# DepositProduct

A deposit product defines the terms and constraints on deposit accounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | **String** | Some notes/a description about the product |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the product was updated |  [optional]
**availabilitySettings** | [**DepositProductAvailabilitySettings**](DepositProductAvailabilitySettings.md) |  |  [optional]
**feesSettings** | [**DepositProductFeeSettings**](DepositProductFeeSettings.md) |  |  [optional]
**taxSettings** | [**DepositProductTaxSettings**](DepositProductTaxSettings.md) |  |  [optional]
**offsetSettings** | [**DepositProductOffsetSettings**](DepositProductOffsetSettings.md) |  |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this product was created |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of product. | 
**creditArrangementSettings** | [**CreditArrangementSettings**](CreditArrangementSettings.md) |  |  [optional]
**currencySettings** | [**DepositProductCurrencySettings**](DepositProductCurrencySettings.md) |  |  [optional]
**maturitySettings** | [**DepositMaturitySettings**](DepositMaturitySettings.md) |  |  [optional]
**newAccountSettings** | [**DepositNewAccountSettings**](DepositNewAccountSettings.md) |  | 
**interestSettings** | [**DepositProductInterestSettings**](DepositProductInterestSettings.md) |  |  [optional]
**accountingSettings** | [**DepositProductAccountingSettings**](DepositProductAccountingSettings.md) |  | 
**name** | **String** | The name of the product | 
**encodedKey** | **String** | The encoded key of the deposit product, auto generated, unique |  [optional] [readonly]
**id** | **String** | The id of the product, can be generated and customized, unique | 
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the product | 
**overdraftSettings** | [**DepositProductOverdraftSettings**](DepositProductOverdraftSettings.md) |  |  [optional]
**internalControls** | [**DepositProductInternalControls**](DepositProductInternalControls.md) |  |  [optional]
**overdraftInterestSettings** | [**OverdraftInterestSettings**](OverdraftInterestSettings.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
CURRENT_ACCOUNT | &quot;CURRENT_ACCOUNT&quot;
REGULAR_SAVINGS | &quot;REGULAR_SAVINGS&quot;
FIXED_DEPOSIT | &quot;FIXED_DEPOSIT&quot;
SAVINGS_PLAN | &quot;SAVINGS_PLAN&quot;
INVESTOR_ACCOUNT | &quot;INVESTOR_ACCOUNT&quot;



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



