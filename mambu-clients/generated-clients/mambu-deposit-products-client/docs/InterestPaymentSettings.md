

# InterestPaymentSettings

Defines the interest payment settings for the deposit product and for deposits created based on this product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interestPaymentDates** | [**List&lt;MonthAndDay&gt;**](MonthAndDay.md) | List of all dates on which the interest is payed into deposit account |  [optional]
**interestPaymentPoint** | [**InterestPaymentPointEnum**](#InterestPaymentPointEnum) | Specifies when the interest should be paid to the deposit account |  [optional]



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



