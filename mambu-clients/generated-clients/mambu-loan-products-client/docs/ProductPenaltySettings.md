

# ProductPenaltySettings

Defines the penalty settings for the product that will be used by the loan accounts based on this product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanPenaltyGracePeriod** | **Integer** | Number of days to wait before applying the loan penalty amounts |  [optional]
**loanPenaltyCalculationMethod** | [**LoanPenaltyCalculationMethodEnum**](#LoanPenaltyCalculationMethodEnum) | The penalty calculation method | 
**penaltyRate** | [**DecimalConstraints**](DecimalConstraints.md) |  |  [optional]



## Enum: LoanPenaltyCalculationMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
OVERDUE_BALANCE | &quot;OVERDUE_BALANCE&quot;
OVERDUE_BALANCE_AND_INTEREST | &quot;OVERDUE_BALANCE_AND_INTEREST&quot;
OUTSTANDING_PRINCIPAL | &quot;OUTSTANDING_PRINCIPAL&quot;



