

# LoanProductScheduleSettings

Defines the settings and constraints for schedule for the loans that are created based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**repaymentScheduleMethod** | [**RepaymentScheduleMethodEnum**](#RepaymentScheduleMethodEnum) | The repayment schedule method. Represents the method that determines whether the schedule will be fixed all over the loan account&#39;s life cycle or will be dynamically recomputed when required. | 
**repaymentPeriodUnit** | [**RepaymentPeriodUnitEnum**](#RepaymentPeriodUnitEnum) | The frequency of the loan repayment. |  [optional]
**repaymentReschedulingMethod** | [**RepaymentReschedulingMethodEnum**](#RepaymentReschedulingMethodEnum) | The repayment rescheduling method used in calculations. | 
**defaultRepaymentPeriodCount** | **Integer** | Interval Repayment Methodology Settings. |  [optional]
**fixedDaysOfMonth** | **List&lt;Integer&gt;** |  Specifies the days of the month when the repayment due dates should be. Only available if the Repayment Methodology is ScheduleDueDatesMethodDTO#FIXED_DAYS_OF_MONTH. |  [optional]
**shortMonthHandlingMethod** | [**ShortMonthHandlingMethodEnum**](#ShortMonthHandlingMethodEnum) | Determines how to handle the short months, if they select a fixed day of month &gt; 28. Will be null if no such date is selected and also for the Interval methodology. Only available if the Schedule Due Dates Method is ScheduleDueDatesMethodDTO#FIXED_DAYS_OF_MONTHs. |  [optional]
**repaymentScheduleEditOptions** | [**List&lt;RepaymentScheduleEditOptionsEnum&gt;**](#List&lt;RepaymentScheduleEditOptionsEnum&gt;) | Shows the properties from the repayment schedule can be edited. |  [optional]
**scheduleDueDatesMethod** | [**ScheduleDueDatesMethodEnum**](#ScheduleDueDatesMethodEnum) | The methodology used by this product to compute the due dates of the repayments. | 
**numInstallments** | [**IntegerIntervalConstraints**](IntegerIntervalConstraints.md) |  |  [optional]
**firstRepaymentDueDateOffset** | [**IntegerIntervalConstraints**](IntegerIntervalConstraints.md) |  |  [optional]
**roundingSettings** | [**RoundingSettings**](RoundingSettings.md) |  |  [optional]



## Enum: RepaymentScheduleMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
FIXED | &quot;FIXED&quot;
DYNAMIC | &quot;DYNAMIC&quot;



## Enum: RepaymentPeriodUnitEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;



## Enum: RepaymentReschedulingMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
NEXT_WORKING_DAY | &quot;NEXT_WORKING_DAY&quot;
PREVIOUS_WORKING_DAY | &quot;PREVIOUS_WORKING_DAY&quot;
EXTEND_SCHEDULE | &quot;EXTEND_SCHEDULE&quot;



## Enum: ShortMonthHandlingMethodEnum

Name | Value
---- | -----
LAST_DAY_IN_MONTH | &quot;LAST_DAY_IN_MONTH&quot;
FIRST_DAY_OF_NEXT_MONTH | &quot;FIRST_DAY_OF_NEXT_MONTH&quot;



## Enum: List&lt;RepaymentScheduleEditOptionsEnum&gt;

Name | Value
---- | -----
PAYMENT_DATES | &quot;ADJUST_PAYMENT_DATES&quot;
PRINCIPAL_PAYMENT_SCHEDULE | &quot;ADJUST_PRINCIPAL_PAYMENT_SCHEDULE&quot;
INTEREST_PAYMENT_SCHEDULE | &quot;ADJUST_INTEREST_PAYMENT_SCHEDULE&quot;
FEE_PAYMENT_SCHEDULE | &quot;ADJUST_FEE_PAYMENT_SCHEDULE&quot;
PENALTY_PAYMENT_SCHEDULE | &quot;ADJUST_PENALTY_PAYMENT_SCHEDULE&quot;
NUMBER_OF_INSTALLMENTS | &quot;ADJUST_NUMBER_OF_INSTALLMENTS&quot;



## Enum: ScheduleDueDatesMethodEnum

Name | Value
---- | -----
INTERVAL | &quot;INTERVAL&quot;
FIXED_DAYS_OF_MONTH | &quot;FIXED_DAYS_OF_MONTH&quot;



