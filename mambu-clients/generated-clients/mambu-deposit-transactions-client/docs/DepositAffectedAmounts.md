

# DepositAffectedAmounts

The amounts affected after completing the deposit transaction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feesAmount** | [**BigDecimal**](BigDecimal.md) | Amount of fees involved in a transaction that affects an account with positive balance |  [optional]
**overdraftInterestAmount** | [**BigDecimal**](BigDecimal.md) | Interest amount involved in a transaction that affects an overdraft |  [optional]
**overdraftFeesAmount** | [**BigDecimal**](BigDecimal.md) | Fees amount involved in a transaction that affects an overdraft |  [optional]
**fractionAmount** | [**BigDecimal**](BigDecimal.md) | In the case of an LOAN_FRACTION_BOUGHT this represent the fraction amount which was bought from another investor |  [optional]
**technicalOverdraftAmount** | [**BigDecimal**](BigDecimal.md) | The amount of money that was added/subtracted from the account by this transaction as technical overdraft |  [optional]
**overdraftAmount** | [**BigDecimal**](BigDecimal.md) | The amount of money that was added/subtracted from the account by this transaction as overdraft |  [optional]
**interestAmount** | [**BigDecimal**](BigDecimal.md) | Amount of interest involved in a transaction that affects an account with positive balance |  [optional]
**technicalOverdraftInterestAmount** | [**BigDecimal**](BigDecimal.md) | The amount of money that was added/subtracted from the account by this transaction as technical overdraft interest |  [optional]
**fundsAmount** | [**BigDecimal**](BigDecimal.md) | Balance change amount involved in a transaction that affects an account with positive balance |  [optional]



