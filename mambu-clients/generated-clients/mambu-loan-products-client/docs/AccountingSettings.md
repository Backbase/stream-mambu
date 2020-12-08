

# AccountingSettings

Accounting settings, defines the accounting settings for the product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingMethod** | [**AccountingMethodEnum**](#AccountingMethodEnum) | A list of accounting rules for the product. | 
**interestAccrualCalculation** | [**InterestAccrualCalculationEnum**](#InterestAccrualCalculationEnum) | The accounting interest calculation option selected for the product. |  [optional]
**accountingRules** | [**List&lt;GLAccountingRule&gt;**](GLAccountingRule.md) | A list of accounting rules for the product. |  [optional]
**interestAccruedAccountingMethod** | [**InterestAccruedAccountingMethodEnum**](#InterestAccruedAccountingMethodEnum) | A list of accounting rules for the product. |  [optional]



## Enum: AccountingMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
CASH | &quot;CASH&quot;
ACCRUAL | &quot;ACCRUAL&quot;



## Enum: InterestAccrualCalculationEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
AGGREGATED_AMOUNT | &quot;AGGREGATED_AMOUNT&quot;
BREAKDOWN_PER_ACCOUNT | &quot;BREAKDOWN_PER_ACCOUNT&quot;



## Enum: InterestAccruedAccountingMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
DAILY | &quot;DAILY&quot;
END_OF_MONTH | &quot;END_OF_MONTH&quot;



