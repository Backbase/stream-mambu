

# AccountArrearsSettings

The account arrears settings, holds the required information for the arrears settings of an account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**monthlyToleranceDay** | **Integer** | Defines monthly arrears tolerance day value. |  [optional]
**nonWorkingDaysMethod** | [**NonWorkingDaysMethodEnum**](#NonWorkingDaysMethodEnum) | Shows whether the non working days are taken in consideration or not when applying penaltees/late fees or when setting an account into arrears |  [optional]
**tolerancePeriod** | **Integer** | Defines the arrears tolerance period value. |  [optional]
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



