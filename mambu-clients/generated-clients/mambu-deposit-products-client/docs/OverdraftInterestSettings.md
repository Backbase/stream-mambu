

# OverdraftInterestSettings

Overdraft settings for the product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestRateSettings** | [**DepositProductOverdraftInterestRateSettings**](DepositProductOverdraftInterestRateSettings.md) |  |  [optional]
**daysInYear** | [**DaysInYearEnum**](#DaysInYearEnum) | How many days in a year should be used for interest calculations |  [optional]
**interestCalculationBalance** | [**InterestCalculationBalanceEnum**](#InterestCalculationBalanceEnum) | The balance which is used for the overdraft interest calculation. Default value is MINIMUM. If set to null on a PUT call and the product allows overdrafts, the null value is ignored and not changed. |  [optional]



## Enum: DaysInYearEnum

Name | Value
---- | -----
ACTUAL_365_FIXED | &quot;ACTUAL_365_FIXED&quot;
ACTUAL_360 | &quot;ACTUAL_360&quot;
ACTUAL_ACTUAL_ISDA | &quot;ACTUAL_ACTUAL_ISDA&quot;
E30_360 | &quot;E30_360&quot;
E30_42_365 | &quot;E30_42_365&quot;



## Enum: InterestCalculationBalanceEnum

Name | Value
---- | -----
MINIMUM | &quot;MINIMUM&quot;
AVERAGE | &quot;AVERAGE&quot;
END_OF_DAY | &quot;END_OF_DAY&quot;
MINIMUM_TO_END_OF_DAY | &quot;MINIMUM_TO_END_OF_DAY&quot;



