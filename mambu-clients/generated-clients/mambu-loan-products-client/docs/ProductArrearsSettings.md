

# ProductArrearsSettings

The product arrears settings, shows whether the non working days are taken in consideration or not when applying penalties/late fees or when setting an account into arrears
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monthlyToleranceDay** | **Integer** | Defines the tolerance monthly date |  [optional]
**nonWorkingDaysMethod** | [**NonWorkingDaysMethodEnum**](#NonWorkingDaysMethodEnum) | Shows whether the non working days are taken in consideration or not when applying penaltees/late fees or when setting an account into arrears |  [optional]
**tolerancePeriod** | [**IntegerIntervalConstraints**](IntegerIntervalConstraints.md) |  |  [optional]
**encodedKey** | **String** | The encoded key of the arrears base settings, auto generated, unique. |  [optional] [readonly]
**toleranceCalculationMethod** | [**ToleranceCalculationMethodEnum**](#ToleranceCalculationMethodEnum) | Defines the tolerance calculation method |  [optional]
**dateCalculationMethod** | [**DateCalculationMethodEnum**](#DateCalculationMethodEnum) | The arrears date calculation method. |  [optional]



## Enum: NonWorkingDaysMethodEnum

Name | Value
---- | -----
INCLUDED | &quot;INCLUDED&quot;
EXCLUDED | &quot;EXCLUDED&quot;



## Enum: ToleranceCalculationMethodEnum

Name | Value
---- | -----
ARREARS_TOLERANCE_PERIOD | &quot;ARREARS_TOLERANCE_PERIOD&quot;
MONTHLY_ARREARS_TOLERANCE_DAY | &quot;MONTHLY_ARREARS_TOLERANCE_DAY&quot;



## Enum: DateCalculationMethodEnum

Name | Value
---- | -----
ACCOUNT_FIRST_WENT_TO_ARREARS | &quot;ACCOUNT_FIRST_WENT_TO_ARREARS&quot;
LAST_LATE_REPAYMENT | &quot;LAST_LATE_REPAYMENT&quot;



