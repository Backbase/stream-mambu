

# FundingSettings

The funding settings, holds the settings regarding the funding for the loan product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**organizationInterestCommission** | [**DecimalConstraints**](DecimalConstraints.md) |  |  [optional]
**lockFundsAtApproval** | **Boolean** | Shows whether investor funds are locked or not at the loan account&#39;s approval. |  [optional]
**funderInterestCommission** | [**DecimalConstraints**](DecimalConstraints.md) |  |  [optional]
**requiredFunds** | [**BigDecimal**](BigDecimal.md) | The required investor funds percentage, for opening an account with external funding. If null, the investor funds are not enabled. |  [optional]
**funderInterestCommissionAllocationType** | [**FunderInterestCommissionAllocationTypeEnum**](#FunderInterestCommissionAllocationTypeEnum) | Define how the Interest is allocated to the investors(if the investors can define their own percentages for their own contribution to the loan, or if all of them are using the same percentage). |  [optional]
**enabled** | **Boolean** | Indicates whether the product has the investor funds enabled or not. |  [optional]



## Enum: FunderInterestCommissionAllocationTypeEnum

Name | Value
---- | -----
PERCENTAGE_OF_LOAN_FUNDING | &quot;PERCENTAGE_OF_LOAN_FUNDING&quot;
FIXED_INTEREST_COMMISSIONS | &quot;FIXED_INTEREST_COMMISSIONS&quot;



