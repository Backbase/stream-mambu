

# Fee

An amount of predefined fee that was applied or paid on an account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the predefined fee |  [optional] [readonly]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of the fee that was applied/paid in the transaction for the given predefined fee. |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Shows the event that will trigger a fee |  [optional] [readonly]
**taxAmount** | [**BigDecimal**](BigDecimal.md) | The amount of the taxes on fee that was applied/paid in the transaction. |  [optional]
**predefinedFeeKey** | **String** | The encoded key of the predefined fee, auto generated, unique | 



## Enum: TriggerEnum

Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
DISBURSEMENT | &quot;DISBURSEMENT&quot;
CAPITALIZED_DISBURSEMENT | &quot;CAPITALIZED_DISBURSEMENT&quot;
UPFRONT_DISBURSEMENT | &quot;UPFRONT_DISBURSEMENT&quot;
LATE_REPAYMENT | &quot;LATE_REPAYMENT&quot;
MONTHLY_FEE | &quot;MONTHLY_FEE&quot;
PAYMENT_DUE | &quot;PAYMENT_DUE&quot;
PAYMENT_DUE_APPLIED_ON_DUE_DATES | &quot;PAYMENT_DUE_APPLIED_ON_DUE_DATES&quot;
ARBITRARY | &quot;ARBITRARY&quot;



