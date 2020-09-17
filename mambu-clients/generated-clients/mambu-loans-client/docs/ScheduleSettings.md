

# ScheduleSettings

The schedule settings, holds all schedule properties.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gracePeriod** | **Integer** | The grace period. Represents the grace period for loan repayment - in number of installments. | 
**periodicPayment** | [**BigDecimal**](BigDecimal.md) | The periodic payment amount for the accounts which have balloon payments or Reduce Number of Installments and Optimized Payments |  [optional]
**repaymentScheduleMethod** | [**RepaymentScheduleMethodEnum**](#RepaymentScheduleMethodEnum) | The repayment schedule method. Represents the method that determines whether the schedule will be fixed all over the loan account&#39;s life cycle or will be dynamically recomputed when required. |  [optional]
**paymentPlan** | [**List&lt;PeriodicPayment&gt;**](PeriodicPayment.md) | A list of periodic payments for the current loan account. |  [optional]
**shortMonthHandlingMethod** | [**ShortMonthHandlingMethodEnum**](#ShortMonthHandlingMethodEnum) | The short handling method. Determines how to handle the short months, if they select a fixed day of month &gt; 28. Will be null if no such date is selected and also for the Interval methodology. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH. |  [optional]
**repaymentInstallments** | **Integer** | The repayment installments. Represents how many installments are required to pay back the loan. |  [optional]
**gracePeriodType** | [**GracePeriodTypeEnum**](#GracePeriodTypeEnum) | The grace period type. Representing the type of grace period which is possible for a loan account. |  [optional]
**principalRepaymentInterval** | **Integer** | The principal repayment interval. Indicates the interval of repayments that the principal has to be paid. |  [optional]
**hasCustomSchedule** | **Boolean** | Flag used when the repayments schedule for the current account was determined by the user, by editing the due dates or the principal due |  [optional]
**repaymentPeriodUnit** | [**RepaymentPeriodUnitEnum**](#RepaymentPeriodUnitEnum) | The repayment period unit. Represents the frequency of loan repayment. |  [optional]
**fixedDaysOfMonth** | **List&lt;Integer&gt;** | Specifies the days of the month when the repayment due dates should be. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH. |  [optional]
**scheduleDueDatesMethod** | [**ScheduleDueDatesMethodEnum**](#ScheduleDueDatesMethodEnum) | The schedule due dates method. Represents the methodology used by this account to compute the due dates of the repayments. |  [optional]
**repaymentPeriodCount** | **Integer** | The repayment period count. Represents how often the loan is to be repaid: stored based on the type repayment option. |  [optional]
**defaultFirstRepaymentDueDateOffset** | **Integer** | The default first repayment due date offset, indicates how many days the first repayment due date should be extended(all other due dates from the schedule are relative to first repayment due date - they will also be affected by the offset) |  [optional]



## Enum: RepaymentScheduleMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
FIXED | &quot;FIXED&quot;
DYNAMIC | &quot;DYNAMIC&quot;



## Enum: ShortMonthHandlingMethodEnum

Name | Value
---- | -----
LAST_DAY_IN_MONTH | &quot;LAST_DAY_IN_MONTH&quot;
FIRST_DAY_OF_NEXT_MONTH | &quot;FIRST_DAY_OF_NEXT_MONTH&quot;



## Enum: GracePeriodTypeEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
PAY_INTEREST_ONLY | &quot;PAY_INTEREST_ONLY&quot;
INTEREST_FORGIVENESS | &quot;INTEREST_FORGIVENESS&quot;



## Enum: RepaymentPeriodUnitEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;



## Enum: ScheduleDueDatesMethodEnum

Name | Value
---- | -----
INTERVAL | &quot;INTERVAL&quot;
FIXED_DAYS_OF_MONTH | &quot;FIXED_DAYS_OF_MONTH&quot;



