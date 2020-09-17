

# PrincipalPaymentAccountSettings

The principal payment account settings, holds the required information for the principal payment process of an account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**includeInterestInFloorAmount** | **Boolean** | Boolean flag, if true, the interest will be included along with the principal in the repayment floor amount, for a revolving credit account |  [optional]
**totalDuePayment** | [**TotalDuePaymentEnum**](#TotalDuePaymentEnum) | The method of total due payment for revolving credit |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) | Fixed amount for being used for the repayments principal due. |  [optional]
**principalFloorValue** | [**BigDecimal**](BigDecimal.md) | The minimum principal due amount a repayment made with this settings can have |  [optional]
**principalPaymentMethod** | [**PrincipalPaymentMethodEnum**](#PrincipalPaymentMethodEnum) | The method of principal payment for revolving credit. |  [optional]
**percentage** | [**BigDecimal**](BigDecimal.md) | Percentage of principal amount used for the repayments principal due. |  [optional]
**includeFeesInFloorAmount** | **Boolean** | Boolean flag, if true, the fees will be included along with the principal in the repayment floor amount, for a revolving credit account |  [optional]
**encodedKey** | **String** | The encoded key of the principal payment base settings, auto generated, unique. |  [optional] [readonly]
**totalDueAmountFloor** | [**BigDecimal**](BigDecimal.md) | The minimum total due amount a repayment made with this settings can have |  [optional]
**principalCeilingValue** | [**BigDecimal**](BigDecimal.md) | The maximum principal due amount a repayment made with this settings can have |  [optional]



## Enum: TotalDuePaymentEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
OUTSTANDING_PRINCIPAL_PERCENTAGE | &quot;OUTSTANDING_PRINCIPAL_PERCENTAGE&quot;
TOTAL_BALANCE_PERCENTAGE | &quot;TOTAL_BALANCE_PERCENTAGE&quot;



## Enum: PrincipalPaymentMethodEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
OUTSTANDING_PRINCIPAL_PERCENTAGE | &quot;OUTSTANDING_PRINCIPAL_PERCENTAGE&quot;
TOTAL_BALANCE_PERCENTAGE | &quot;TOTAL_BALANCE_PERCENTAGE&quot;



