

# PeriodIntervalSettings

The settings for defining period intervals.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feeAmortizationUponRescheduleRefinanceOption** | [**FeeAmortizationUponRescheduleRefinanceOptionEnum**](#FeeAmortizationUponRescheduleRefinanceOptionEnum) | Flag for signaling if fee amortization should be continued or finished at account reschedule/refinance |  [optional]
**intervalType** | [**IntervalTypeEnum**](#IntervalTypeEnum) | Defines the options for an interval |  [optional]
**periodCount** | **Integer** | Period count used in conjunction with periodUnit to determine the next date of the interval |  [optional]
**intervalCount** | **Integer** | Total number of intervals |  [optional]
**encodedKey** | **String** | The encoded key of the period interval settings, auto generated, unique. |  [optional] [readonly]
**amortizationProfile** | [**AmortizationProfileEnum**](#AmortizationProfileEnum) | Type of amortization profile used for fee |  [optional]
**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) | Amortization unit to determine the interval between amortizations |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Frequency settings of the fee amortization |  [optional]



## Enum: FeeAmortizationUponRescheduleRefinanceOptionEnum

Name | Value
---- | -----
END_AMORTIZATION_ON_THE_ORIGINAL_ACCOUNT | &quot;END_AMORTIZATION_ON_THE_ORIGINAL_ACCOUNT&quot;
CONTINUE_AMORTIZATION_ON_THE_RESCHEDULED_REFINANCED_ACCOUNT | &quot;CONTINUE_AMORTIZATION_ON_THE_RESCHEDULED_REFINANCED_ACCOUNT&quot;



## Enum: IntervalTypeEnum

Name | Value
---- | -----
PREDEFINED_INTERVALS | &quot;PREDEFINED_INTERVALS&quot;
FULL_TERM | &quot;FULL_TERM&quot;



## Enum: AmortizationProfileEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
SUM_OF_YEARS_DIGITS | &quot;SUM_OF_YEARS_DIGITS&quot;
STRAIGHT_LINE | &quot;STRAIGHT_LINE&quot;
EFFECTIVE_INTEREST_RATE | &quot;EFFECTIVE_INTEREST_RATE&quot;



## Enum: PeriodUnitEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;



## Enum: FrequencyEnum

Name | Value
---- | -----
ACCOUNT_INSTALLMENTS_DUE_DATES | &quot;ACCOUNT_INSTALLMENTS_DUE_DATES&quot;
ACCOUNT_INSTALLMENTS_DUE_DATES_DAILY_BOOKING | &quot;ACCOUNT_INSTALLMENTS_DUE_DATES_DAILY_BOOKING&quot;
CUSTOM_INTERVAL | &quot;CUSTOM_INTERVAL&quot;



