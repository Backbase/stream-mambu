

# DepositAccountOverdraftInterestRateSettings

Overdraft interest rate settings for deposit accounts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestRate** | [**BigDecimal**](BigDecimal.md) | The interest rate for the deposit account |  [optional]
**interestSpread** | [**BigDecimal**](BigDecimal.md) | The rate based on which the interest is accrued and applied for accounts with InterestRateSource#INDEX_INTEREST_RATE |  [optional]
**interestRateReviewUnit** | [**InterestRateReviewUnitEnum**](#InterestRateReviewUnitEnum) | The interest rate review frequency measurement unit |  [optional]
**interestRateSource** | [**InterestRateSourceEnum**](#InterestRateSourceEnum) | The interest rate source. Represents the interest calculation method |  [optional] [readonly]
**interestRateReviewCount** | **Integer** | The interest rate review frequency unit count |  [optional]
**interestRateTiers** | [**List&lt;DepositAccountInterestRateTier&gt;**](DepositAccountInterestRateTier.md) | The list of interest rate tiers. An interest rate tier holds the values to define how the interest is computed |  [optional]
**interestChargeFrequency** | [**InterestChargeFrequencyEnum**](#InterestChargeFrequencyEnum) | The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts |  [optional]
**encodedKey** | **String** | The encoded for this set of interest settings, auto generated, unique |  [optional] [readonly]
**interestChargeFrequencyCount** | **Integer** | The count of units to apply over the interval (e.g. [x] weeks) |  [optional]
**interestRateTerms** | [**InterestRateTermsEnum**](#InterestRateTermsEnum) | How is the interest rate determined when being accrued for an account |  [optional]



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



