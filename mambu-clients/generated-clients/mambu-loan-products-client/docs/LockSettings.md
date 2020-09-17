

# LockSettings

Settings applied when transitioning accounts to Locked state
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cappingPercentage** | [**BigDecimal**](BigDecimal.md) | Specifies the percentage of principal that cannot be exceeded by the sum of interest, fees and penalty balances. |  [optional]
**lockPeriodDays** | **Integer** | Specifies the number of days for in which the account will be locked if it stays in arrears. |  [optional]
**cappingConstraintType** | [**CappingConstraintTypeEnum**](#CappingConstraintTypeEnum) | Specifies constraint types for capping charges. |  [optional]
**cappingMethod** | [**CappingMethodEnum**](#CappingMethodEnum) | Specifies how principal will be used when calculating capping charges. |  [optional]



## Enum: CappingConstraintTypeEnum

Name | Value
---- | -----
SOFT_CAP | &quot;SOFT_CAP&quot;
HARD_CAP | &quot;HARD_CAP&quot;



## Enum: CappingMethodEnum

Name | Value
---- | -----
OUTSTANDING_PRINCIPAL_PERCENTAGE | &quot;OUTSTANDING_PRINCIPAL_PERCENTAGE&quot;
ORIGINAL_PRINCIPAL_PERCENTAGE | &quot;ORIGINAL_PRINCIPAL_PERCENTAGE&quot;



