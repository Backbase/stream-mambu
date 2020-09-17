

# DepositAccountOverdraftSettings

Groups all fields related to a deposit account's overdraft settings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowOverdraft** | **Boolean** | Whether this account supports overdraft or not |  [optional]
**overdraftLimit** | [**BigDecimal**](BigDecimal.md) | How much may be taken out as overdraft, null means 0 |  [optional]
**overdraftExpiryDate** | [**OffsetDateTime**](OffsetDateTime.md) | The expiration date of an overdraft |  [optional]



