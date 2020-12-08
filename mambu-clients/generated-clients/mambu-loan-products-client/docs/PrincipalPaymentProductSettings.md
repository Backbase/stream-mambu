

# PrincipalPaymentProductSettings

Defines the principal payment settings constraints for the loans that will be created based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultPrincipalRepaymentInterval** | **Integer** | How many repayments the principal has to be paid |  [optional]
**includeInterestInFloorAmount** | **Boolean** | If true, the interest will be included along with the principal in the repayment floor amount, for a revolving credit account |  [optional]
**amount** | [**AmountDecimalConstraints**](AmountDecimalConstraints.md) |  |  [optional]
**totalDuePayment** | [**TotalDuePaymentEnum**](#TotalDuePaymentEnum) | The method of total due payment for revolving credit |  [optional]
**principalFloorValue** | [**BigDecimal**](BigDecimal.md) | The minimum principal due amount a repayment made with this settings can have |  [optional]
**principalPaymentMethod** | [**PrincipalPaymentMethodEnum**](#PrincipalPaymentMethodEnum) | The method of principal payment for revolving credit |  [optional]
**percentage** | [**DecimalConstraints**](DecimalConstraints.md) |  |  [optional]
**includeFeesInFloorAmount** | **Boolean** | If true, the fees will be included along with the principal in the repayment floor amount, for a revolving credit account |  [optional]
**encodedKey** | **String** | The encoded key of the settings, auto generated, unique |  [optional] [readonly]
**totalDueAmountFloor** | [**BigDecimal**](BigDecimal.md) | The minimum total due amount a repayment made with this settings can have |  [optional]
**principalCeilingValue** | [**BigDecimal**](BigDecimal.md) | The maximum principal due amount a repayment made with this settings can have |  [optional]



## Enum: TotalDuePaymentEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
OUTSTANDING_PRINCIPAL_PERCENTAGE | &quot;OUTSTANDING_PRINCIPAL_PERCENTAGE&quot;
TOTAL_BALANCE_PERCENTAGE | &quot;TOTAL_BALANCE_PERCENTAGE&quot;
TOTAL_BALANCE_FLAT | &quot;TOTAL_BALANCE_FLAT&quot;
TOTAL_PRINCIPAL_PERCENTAGE | &quot;TOTAL_PRINCIPAL_PERCENTAGE&quot;



## Enum: PrincipalPaymentMethodEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
OUTSTANDING_PRINCIPAL_PERCENTAGE | &quot;OUTSTANDING_PRINCIPAL_PERCENTAGE&quot;
TOTAL_BALANCE_PERCENTAGE | &quot;TOTAL_BALANCE_PERCENTAGE&quot;
TOTAL_BALANCE_FLAT | &quot;TOTAL_BALANCE_FLAT&quot;
TOTAL_PRINCIPAL_PERCENTAGE | &quot;TOTAL_PRINCIPAL_PERCENTAGE&quot;



