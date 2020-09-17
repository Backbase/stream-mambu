

# LoanProduct

The response representation of a LoanProduct.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**notes** | **String** | Some notes/a description about the loan product |  [optional]
**availabilitySettings** | [**ProductAvailabilitySettings**](ProductAvailabilitySettings.md) |  |  [optional]
**paymentSettings** | [**PaymentSettings**](PaymentSettings.md) |  |  [optional]
**taxSettings** | [**TaxSettings**](TaxSettings.md) |  |  [optional]
**redrawSettings** | [**ProductRedrawSettings**](ProductRedrawSettings.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Indicates the type of loan product. | 
**arrearsSettings** | [**ProductArrearsSettings**](ProductArrearsSettings.md) |  |  [optional]
**newAccountSettings** | [**NewAccountSettings**](NewAccountSettings.md) |  |  [optional]
**interestSettings** | [**ProductInterestSettings**](ProductInterestSettings.md) |  |  [optional]
**encodedKey** | **String** | The encoded key of the loan product, auto generated, unique |  [optional] [readonly]
**id** | **String** | The id of the loan product, can be generated and customized, unique | 
**state** | [**StateEnum**](#StateEnum) | Indicates the current state of the product |  [optional]
**penaltySettings** | [**ProductPenaltySettings**](ProductPenaltySettings.md) |  |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the loan product was updated |  [optional]
**feesSettings** | [**FeesSettings**](FeesSettings.md) |  |  [optional]
**accountLinkSettings** | [**AccountLinkSettings**](AccountLinkSettings.md) |  |  [optional]
**securitySettings** | [**SecuritySettings**](SecuritySettings.md) |  |  [optional]
**gracePeriodSettings** | [**GracePeriodSettings**](GracePeriodSettings.md) |  |  [optional]
**offsetSettings** | [**OffsetSettings**](OffsetSettings.md) |  |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this loan product was created |  [optional]
**creditArrangementSettings** | [**CreditArrangementSettings**](CreditArrangementSettings.md) |  | 
**allowCustomRepaymentAllocation** | **Boolean** | Whether a payment could be customly allocated on the account, ignoring the default repayment allocation order |  [optional]
**productOffsetSettings** | [**ProductOffsetSettings**](ProductOffsetSettings.md) |  |  [optional]
**scheduleSettings** | [**LoanProductScheduleSettings**](LoanProductScheduleSettings.md) |  |  [optional]
**accountingSettings** | [**AccountingSettings**](AccountingSettings.md) |  |  [optional]
**name** | **String** | The name of the loan product | 
**loanAmountSettings** | [**LoanAmountSettings**](LoanAmountSettings.md) |  |  [optional]
**internalControls** | [**InternalControls**](InternalControls.md) |  |  [optional]
**fundingSettings** | [**FundingSettings**](FundingSettings.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
FIXED_TERM_LOAN | &quot;FIXED_TERM_LOAN&quot;
DYNAMIC_TERM_LOAN | &quot;DYNAMIC_TERM_LOAN&quot;
INTEREST_FREE_LOAN | &quot;INTEREST_FREE_LOAN&quot;
TRANCHED_LOAN | &quot;TRANCHED_LOAN&quot;
REVOLVING_CREDIT | &quot;REVOLVING_CREDIT&quot;
OFFSET_LOAN | &quot;OFFSET_LOAN&quot;



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



