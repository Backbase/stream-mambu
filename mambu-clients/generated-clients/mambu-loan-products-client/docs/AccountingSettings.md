

# AccountingSettings

Accounting settings, defines the accounting settings for the product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | A list of accounting rules for the product. | 
**accountingRules** | [**List&lt;GLAccountingRule&gt;**](GLAccountingRule.md) | A list of accounting rules for the product. |  [optional]
**interestAccruedAccountingMethod** | [**InterestAccruedAccountingMethodEnum**](#InterestAccruedAccountingMethodEnum) | A list of accounting rules for the product. |  [optional]



## Enum: AccountingMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
CASH | &quot;CASH&quot;
ACCRUAL | &quot;ACCRUAL&quot;



## Enum: InterestAccruedAccountingMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
DAILY | &quot;DAILY&quot;
END_OF_MONTH | &quot;END_OF_MONTH&quot;



