

# DepositProductInterestSettings

The interest settings, defines constraints regarding interest that will be used on the deposit account based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestRateSettings** | [**DepositProductInterestRateSettings**](DepositProductInterestRateSettings.md) |  |  [optional]
**collectInterestWhenLocked** | **Boolean** | Whether locked accounts still collect Interest or not |  [optional]
**interestCalculationBalance** | [**InterestCalculationBalanceEnum**](#InterestCalculationBalanceEnum) | The balance which is used for the Interest calculation |  [optional]
**interestPaidIntoAccount** | **Boolean** | If interest should be payed into the deposit account |  [optional]
**maximumBalance** | [**BigDecimal**](BigDecimal.md) | The maximum balance used for Interest calculation |  [optional]
**daysInYear** | [**DaysInYearEnum**](#DaysInYearEnum) | How many days in a year should be used for interest calculations |  [optional]
**interestPaymentSettings** | [**InterestPaymentSettings**](InterestPaymentSettings.md) |  |  [optional]



## Enum: InterestCalculationBalanceEnum

Name | Value
---- | -----
MINIMUM | &quot;MINIMUM&quot;
AVERAGE | &quot;AVERAGE&quot;
END_OF_DAY | &quot;END_OF_DAY&quot;
MINIMUM_TO_END_OF_DAY | &quot;MINIMUM_TO_END_OF_DAY&quot;



## Enum: DaysInYearEnum

Name | Value
---- | -----
ACTUAL_365_FIXED | &quot;ACTUAL_365_FIXED&quot;
ACTUAL_360 | &quot;ACTUAL_360&quot;
ACTUAL_ACTUAL_ISDA | &quot;ACTUAL_ACTUAL_ISDA&quot;
E30_360 | &quot;E30_360&quot;
E30_42_365 | &quot;E30_42_365&quot;



