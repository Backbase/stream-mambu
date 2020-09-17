

# LoanTranche

In some cases organizations may approve loans but not disburse the full amount initially. They would like to spread the disbursement (and risk) over time. Likewise for the client, they may not need the full loan amount up front. They may want to have a loan to buy some equipment for their business but will make one purchase today and another purchase in a few months.  In these cases, they don't need the full amount and wouldn't want to pay interest on cash they don't need yet. A solution for this matter is the usage of disbursement in tranches. This class holds the information required for one of this tranche. 
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the transaction details , auto generated, unique. |  [optional] [readonly]
**amount** | [**BigDecimal**](BigDecimal.md) | The amount this tranche has available for disburse | 
**disbursementDetails** | [**TrancheDisbursementDetails**](TrancheDisbursementDetails.md) |  |  [optional]
**trancheNumber** | **Integer** | Index indicating the tranche number |  [optional]



