

# PenaltySettings

The penalty settings, holds all the fields regarding penalties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**loanPenaltyCalculationMethod** | [**LoanPenaltyCalculationMethodEnum**](#LoanPenaltyCalculationMethodEnum) | The last penalty calculation method, represents on what amount are the penalties calculated. |  [optional]
**penaltyRate** | [**BigDecimal**](BigDecimal.md) | The penalty rate, represents the rate (in percent) which is charged as a penalty. |  [optional]



## Enum: LoanPenaltyCalculationMethodEnum

Name | Value
---- | -----
NONE | &quot;NONE&quot;
OVERDUE_BALANCE | &quot;OVERDUE_BALANCE&quot;
OVERDUE_BALANCE_AND_INTEREST | &quot;OVERDUE_BALANCE_AND_INTEREST&quot;
OUTSTANDING_PRINCIPAL | &quot;OUTSTANDING_PRINCIPAL&quot;



