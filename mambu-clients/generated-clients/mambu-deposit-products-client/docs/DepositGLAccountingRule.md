

# DepositGLAccountingRule

The GL accounting rule, it maps a financial resource with a GL account for a specific product (i.e loan or saving).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the accounting rule, auto generated, unique. |  [optional] [readonly]
**glAccountKey** | **String** | The encoded key of the account that is mapped to the financialResource | 
**financialResource** | [**FinancialResourceEnum**](#FinancialResourceEnum) | General Ledger Financial Resources used to setup the product accounting rules and determine the credit and debit accounts when logging journal entries | 



## Enum: FinancialResourceEnum

Name | Value
---- | -----
PORTFOLIO_CONTROL | &quot;PORTFOLIO_CONTROL&quot;
FUND_SOURCE | &quot;FUND_SOURCE&quot;
WRITE_OFF_EXPENSE | &quot;WRITE_OFF_EXPENSE&quot;
INTEREST_INCOME | &quot;INTEREST_INCOME&quot;
TAXES_PAYABLE | &quot;TAXES_PAYABLE&quot;
FEE_INCOME | &quot;FEE_INCOME&quot;
PENALTY_INCOME | &quot;PENALTY_INCOME&quot;
INTEREST_RECEIVABLE | &quot;INTEREST_RECEIVABLE&quot;
FEE_RECEIVABLE | &quot;FEE_RECEIVABLE&quot;
PENALTY_RECEIVABLE | &quot;PENALTY_RECEIVABLE&quot;
TAXES_RECEIVABLE | &quot;TAXES_RECEIVABLE&quot;
DEFERRED_INTERESTS_INCOME | &quot;DEFERRED_INTERESTS_INCOME&quot;
DEFERRED_FEE_INCOME | &quot;DEFERRED_FEE_INCOME&quot;
DEFERRED_TAXES | &quot;DEFERRED_TAXES&quot;
DEPOSIT_REFERENCE | &quot;DEPOSIT_REFERENCE&quot;
SAVINGS_CONTROL | &quot;SAVINGS_CONTROL&quot;
INTEREST_EXPENSE | &quot;INTEREST_EXPENSE&quot;
INTEREST_PAYABLE | &quot;INTEREST_PAYABLE&quot;
OVERDRAFT_PORTFOLIO_CONTROL | &quot;OVERDRAFT_PORTFOLIO_CONTROL&quot;
OVERDRAFT_INTEREST_INCOME | &quot;OVERDRAFT_INTEREST_INCOME&quot;
OVERDRAFT_WRITE_OFF_EXPENSE | &quot;OVERDRAFT_WRITE_OFF_EXPENSE&quot;
OVERDRAFT_INTEREST_RECEIVABLE | &quot;OVERDRAFT_INTEREST_RECEIVABLE&quot;
INTER_BRANCH_TRANSFER | &quot;INTER_BRANCH_TRANSFER&quot;



