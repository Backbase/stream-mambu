

# DepositProductOverdraftInterestRateSettings

The overdraft interest settings, defines constraints regarding interest that will be used on the account created based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestRate** | [**DecimalInterval**](DecimalInterval.md) |  |  [optional]
**interestRateReviewUnit** | [**InterestRateReviewUnitEnum**](#InterestRateReviewUnitEnum) | Interest rate review frequency measurement unit |  [optional]
**interestRateSource** | [**InterestRateSourceEnum**](#InterestRateSourceEnum) | Interest calculation method: fixed or (interest spread + active organization index interest rate) |  [optional]
**interestRateReviewCount** | **Integer** | Interest rate review frequency unit count |  [optional]
**indexSourceKey** | **String** | Index rate source key. |  [optional]
**interestRateTiers** | [**List&lt;DepositProductOverdraftInterestRateTier&gt;**](DepositProductOverdraftInterestRateTier.md) | The list of interest rate tiers available for the current settings instance |  [optional]
**interestChargeFrequency** | [**InterestChargeFrequencyEnum**](#InterestChargeFrequencyEnum) | The interval used for determining how often is interest charged |  [optional]
**interestRateTerms** | [**InterestRateTermsEnum**](#InterestRateTermsEnum) | The option for how is the interest rate determined when being accrued for an account |  [optional]
**interestChargeFrequencyCount** | **Integer** | the count of units to apply over the interval |  [optional]



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



## Enum: InterestChargeFrequencyEnum

Name | Value
---- | -----
ANNUALIZED | &quot;ANNUALIZED&quot;
EVERY_MONTH | &quot;EVERY_MONTH&quot;
EVERY_FOUR_WEEKS | &quot;EVERY_FOUR_WEEKS&quot;
EVERY_WEEK | &quot;EVERY_WEEK&quot;
EVERY_DAY | &quot;EVERY_DAY&quot;
EVERY_X_DAYS | &quot;EVERY_X_DAYS&quot;



## Enum: InterestRateTermsEnum

Name | Value
---- | -----
FIXED | &quot;FIXED&quot;
TIERED | &quot;TIERED&quot;
TIERED_PERIOD | &quot;TIERED_PERIOD&quot;



