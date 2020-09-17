

# TaxSettings

Tax settings, defines some settings for taxes on the loan product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxSourceKey** | **String** | The tax source from where the loan account taxes will be updated. |  [optional]
**taxesOnInterestEnabled** | **Boolean** | Shows whether taxes on interest are enabled for this product or not. |  [optional]
**taxesOnPenaltyEnabled** | **Boolean** | Shows whether taxes on penalties are enabled for this product or not. |  [optional]
**taxCalculationMethod** | [**TaxCalculationMethodEnum**](#TaxCalculationMethodEnum) | Shows whether the tax is added on top of the target amount or not. |  [optional]
**taxesOnFeesEnabled** | **Boolean** | Shows whether taxes on fees are enabled for this product or not. |  [optional]



## Enum: TaxCalculationMethodEnum

Name | Value
---- | -----
INCLUSIVE | &quot;INCLUSIVE&quot;
EXCLUSIVE | &quot;EXCLUSIVE&quot;



