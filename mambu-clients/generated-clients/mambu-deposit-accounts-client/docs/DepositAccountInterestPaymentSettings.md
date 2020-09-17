

# DepositAccountInterestPaymentSettings

Groups all fields related to a deposit account's interest payment settings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestPaymentDates** | [**List&lt;MonthAndDay&gt;**](MonthAndDay.md) | The list of all dates on which the interest is payed into deposit account |  [optional]
**interestPaymentPoint** | [**InterestPaymentPointEnum**](#InterestPaymentPointEnum) | The interest payment point, specifies when the interest should be paid to the account |  [optional]



## Enum: InterestPaymentPointEnum

Name | Value
---- | -----
FIRST_DAY_OF_MONTH | &quot;FIRST_DAY_OF_MONTH&quot;
EVERY_WEEK | &quot;EVERY_WEEK&quot;
EVERY_OTHER_WEEK | &quot;EVERY_OTHER_WEEK&quot;
EVERY_MONTH | &quot;EVERY_MONTH&quot;
EVERY_3_MONTHS | &quot;EVERY_3_MONTHS&quot;
ON_FIXED_DATES | &quot;ON_FIXED_DATES&quot;
ON_ACCOUNT_MATURITY | &quot;ON_ACCOUNT_MATURITY&quot;



