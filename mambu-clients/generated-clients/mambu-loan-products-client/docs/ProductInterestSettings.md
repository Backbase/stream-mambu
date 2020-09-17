

# ProductInterestSettings

The interest settings, defines constraints regarding interest that will be used on the loan account crated based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestCalculationMethod** | [**InterestCalculationMethodEnum**](#InterestCalculationMethodEnum) | The interest calculation method. Holds the type of interest calculation method. | 
**scheduleInterestDaysCountMethod** | [**ScheduleInterestDaysCountMethodEnum**](#ScheduleInterestDaysCountMethodEnum) | Shows  whether all the installments should compute the interest based on the actual number of days or based on the defined repayment periodicity. | 
**interestApplicationMethod** | [**InterestApplicationMethodEnum**](#InterestApplicationMethodEnum) | The interest application method. Represents the interest application method that determines whether the interest gets applied on the account&#39;s disbursement or on each repayment. |  [optional]
**interestType** | [**InterestTypeEnum**](#InterestTypeEnum) | The possible values for how we compute and apply the interest |  [optional]
**indexRateSettings** | [**InterestProductSettings**](InterestProductSettings.md) |  |  [optional]
**interestBalanceCalculationMethod** | [**InterestBalanceCalculationMethodEnum**](#InterestBalanceCalculationMethodEnum) | The interest balance calculation method. Represents the option which determines the way the balance for the account&#39;s interest is computed. |  [optional]
**daysInYear** | [**DaysInYearEnum**](#DaysInYearEnum) | The days in year that should be used for loan calculations. | 
**accrueLateInterest** | **Boolean** | Whether late interest should be accrued, applied and paid |  [optional]



## Enum: InterestCalculationMethodEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
DECLINING_BALANCE | &quot;DECLINING_BALANCE&quot;
DECLINING_BALANCE_DISCOUNTED | &quot;DECLINING_BALANCE_DISCOUNTED&quot;



## Enum: ScheduleInterestDaysCountMethodEnum

Name | Value
---- | -----
REPAYMENT_PERIODICITY | &quot;REPAYMENT_PERIODICITY&quot;
ACTUAL_DAYS_COUNT | &quot;ACTUAL_DAYS_COUNT&quot;



## Enum: InterestApplicationMethodEnum

Name | Value
---- | -----
AFTER_DISBURSEMENT | &quot;AFTER_DISBURSEMENT&quot;
REPAYMENT_DUE_DATE | &quot;REPAYMENT_DUE_DATE&quot;



## Enum: InterestTypeEnum

Name | Value
---- | -----
SIMPLE_INTEREST | &quot;SIMPLE_INTEREST&quot;
CAPITALIZED_INTEREST | &quot;CAPITALIZED_INTEREST&quot;



## Enum: InterestBalanceCalculationMethodEnum

Name | Value
---- | -----
ONLY_PRINCIPAL | &quot;ONLY_PRINCIPAL&quot;
PRINCIPAL_AND_INTEREST | &quot;PRINCIPAL_AND_INTEREST&quot;



## Enum: DaysInYearEnum

Name | Value
---- | -----
ACTUAL_365_FIXED | &quot;ACTUAL_365_FIXED&quot;
ACTUAL_364 | &quot;ACTUAL_364&quot;
ACTUAL_360 | &quot;ACTUAL_360&quot;
ACTUAL_ACTUAL_ISDA | &quot;ACTUAL_ACTUAL_ISDA&quot;
E30_360 | &quot;E30_360&quot;
E30_42_365 | &quot;E30_42_365&quot;



