

# InterestSettings

The interest settings, holds all the properties regarding interests for the loan account.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestRateReviewUnit** | [**InterestRateReviewUnitEnum**](#InterestRateReviewUnitEnum) | The interest rate review unit. Defines the interest rate update frequency measurement unit. |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) | The interest rate. Represents the interest rate for the loan account. The interest on loans is accrued on a daily basis, which allows charging the clients only for the days they actually used the loan amount. |  [optional]
**interestRateSource** | [**InterestRateSourceEnum**](#InterestRateSourceEnum) | The interest rate source. Represents the interest calculation method: fixed or (interest spread + active organization index interest rate) |  [optional]
**interestApplicationMethod** | [**InterestApplicationMethodEnum**](#InterestApplicationMethodEnum) | The interest application method. Represents the interest application method that determines whether the interest gets applied on the account&#39;s disbursement or on each repayment. |  [optional]
**interestChargeFrequency** | [**InterestChargeFrequencyEnum**](#InterestChargeFrequencyEnum) | The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts |  [optional]
**interestType** | [**InterestTypeEnum**](#InterestTypeEnum) | The possible values for how we compute and apply the interest |  [optional]
**accrueInterestAfterMaturity** | **Boolean** | The accrue interest after maturity. If the product support this option, specify if the interest should be accrued after the account maturity date. |  [optional]
**interestBalanceCalculationMethod** | [**InterestBalanceCalculationMethodEnum**](#InterestBalanceCalculationMethodEnum) | The interest balance calculation method. Represents the option which determines the way the balance for the account&#39;s interest is computed. |  [optional]
**interestSpread** | [**BigDecimal**](BigDecimal.md) | Interest to be added to active organization index interest rate in order to find out actual interest rate |  [optional]
**interestCalculationMethod** | [**InterestCalculationMethodEnum**](#InterestCalculationMethodEnum) | The interest calculation method. Holds the type of interest calculation method. |  [optional]
**interestRateReviewCount** | **Integer** | Interest rate update frequency unit count. |  [optional]
**accrueLateInterest** | **Boolean** | Indicates whether late interest is accrued for this loan account |  [optional] [readonly]



## Enum: InterestRateReviewUnitEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;



## Enum: InterestRateSourceEnum

Name | Value
---- | -----
FIXED_INTEREST_RATE | &quot;FIXED_INTEREST_RATE&quot;
INDEX_INTEREST_RATE | &quot;INDEX_INTEREST_RATE&quot;



## Enum: InterestApplicationMethodEnum

Name | Value
---- | -----
AFTER_DISBURSEMENT | &quot;AFTER_DISBURSEMENT&quot;
REPAYMENT_DUE_DATE | &quot;REPAYMENT_DUE_DATE&quot;



## Enum: InterestChargeFrequencyEnum

Name | Value
---- | -----
ANNUALIZED | &quot;ANNUALIZED&quot;
EVERY_MONTH | &quot;EVERY_MONTH&quot;
EVERY_FOUR_WEEKS | &quot;EVERY_FOUR_WEEKS&quot;
EVERY_WEEK | &quot;EVERY_WEEK&quot;
EVERY_DAY | &quot;EVERY_DAY&quot;
EVERY_X_DAYS | &quot;EVERY_X_DAYS&quot;



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



## Enum: InterestCalculationMethodEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
DECLINING_BALANCE | &quot;DECLINING_BALANCE&quot;
DECLINING_BALANCE_DISCOUNTED | &quot;DECLINING_BALANCE_DISCOUNTED&quot;



