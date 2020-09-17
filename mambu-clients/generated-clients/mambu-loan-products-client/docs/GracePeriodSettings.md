

# GracePeriodSettings

The funding settings, holds the settings regarding the funding for the loan product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gracePeriod** | [**IntegerIntervalConstraints**](IntegerIntervalConstraints.md) |  |  [optional]
**gracePeriodType** | [**GracePeriodTypeEnum**](#GracePeriodTypeEnum) | The grace period type. Representing the type of grace period which is possible for a loan account. |  [optional]



## Enum: GracePeriodTypeEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
PAY_INTEREST_ONLY | &quot;PAY_INTEREST_ONLY&quot;
INTEREST_FORGIVENESS | &quot;INTEREST_FORGIVENESS&quot;



