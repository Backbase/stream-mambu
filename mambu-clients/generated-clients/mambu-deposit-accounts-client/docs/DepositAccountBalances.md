

# DepositAccountBalances

Groups all fields related to a deposit account's balances
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overdraftInterestDue** | [**BigDecimal**](BigDecimal.md) | How much interest is due to be paid on this account as a result of the authorized overdraft |  [optional] [readonly]
**totalBalance** | [**BigDecimal**](BigDecimal.md) | The current balance of the account |  [optional] [readonly]
**lockedBalance** | [**BigDecimal**](BigDecimal.md) | No operation can modify the balance of the account and get it lower than this locked balance |  [optional] [readonly]
**technicalOverdraftAmount** | [**BigDecimal**](BigDecimal.md) | How much money has been taken out as unplanned overdraft |  [optional] [readonly]
**overdraftAmount** | [**BigDecimal**](BigDecimal.md) | How much money has been taken out in overdraft |  [optional] [readonly]
**holdBalance** | [**BigDecimal**](BigDecimal.md) | The sum of all the authorization hold amounts on this account |  [optional] [readonly]
**technicalOverdraftInterestDue** | [**BigDecimal**](BigDecimal.md) | How much interest is due to be paid on this account as a result of the technical overdraft |  [optional] [readonly]
**feesDue** | [**BigDecimal**](BigDecimal.md) | How much fees is due to be paid on this account |  [optional] [readonly]
**availableBalance** | [**BigDecimal**](BigDecimal.md) | The current available balance for deposit transactions |  [optional] [readonly]



