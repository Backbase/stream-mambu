

# DepositAccountInterestRateTier

Used or TIERED interest rates, holds the values to define how the interest is computed
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endingBalance** | [**BigDecimal**](BigDecimal.md) | The top-limit value for the account balance in order to determine if this tier is used or not |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) | The rate used for computing the interest for an account which has the balance less than the ending balance | 
**encodedKey** | **String** | The encoded key of the interest rate tier, auto generated, unique |  [optional] [readonly]
**endingDay** | **Integer** | The top-limit value for the account period since activation in order to determine if this tier is used or not |  [optional]



