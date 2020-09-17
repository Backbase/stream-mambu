

# RoundingSettings

Defines the rounding settings used in the loan computation.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**roundingRepaymentScheduleMethod** | [**RoundingRepaymentScheduleMethodEnum**](#RoundingRepaymentScheduleMethodEnum) | Specifies the rounding repayment schedule method. | 
**repaymentCurrencyRounding** | [**RepaymentCurrencyRoundingEnum**](#RepaymentCurrencyRoundingEnum) | Specifies the repayment currency rounding method. | 
**repaymentElementsRoundingMethod** | [**RepaymentElementsRoundingMethodEnum**](#RepaymentElementsRoundingMethodEnum) | Determines how the repayment currency rounding is handled on each element from the schedule. | 



## Enum: RoundingRepaymentScheduleMethodEnum

Name | Value
---- | -----
NO_ROUNDING | &quot;NO_ROUNDING&quot;
ROUND_REMAINDER_INTO_LAST_REPAYMENT | &quot;ROUND_REMAINDER_INTO_LAST_REPAYMENT&quot;
ROUND_PRINCIPAL_AND_INTEREST_REMAINDER_INTO_LAST_REPAYMENT | &quot;ROUND_PRINCIPAL_AND_INTEREST_REMAINDER_INTO_LAST_REPAYMENT&quot;



## Enum: RepaymentCurrencyRoundingEnum

Name | Value
---- | -----
NO_ROUNDING | &quot;NO_ROUNDING&quot;
ROUND_TO_NEAREST_WHOLE_UNIT | &quot;ROUND_TO_NEAREST_WHOLE_UNIT&quot;
ROUND_UP_TO_NEAREST_WHOLE_UNIT | &quot;ROUND_UP_TO_NEAREST_WHOLE_UNIT&quot;



## Enum: RepaymentElementsRoundingMethodEnum

Name | Value
---- | -----
NO_ROUNDING | &quot;NO_ROUNDING&quot;
ROUND_ALL | &quot;ROUND_ALL&quot;
PAYMENT_DUE | &quot;PAYMENT_DUE&quot;



