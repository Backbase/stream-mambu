

# InvestorFund

Contains the details about an investor fund including fields like encoded key, guarantor type, amount and guarantor key
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount used by the client for the guaranty | 
**interestCommission** | [**BigDecimal**](BigDecimal.md) | The constraint minimum value |  [optional]
**depositAccountKey** | **String** | The key of the deposit account used by the guarantor (populated when the guaranty type is GUARANTOR). It can be null. |  [optional]
**assetName** | **String** | The name of a value the client guarantees with (populated when the guaranty type is ASSET) |  [optional]
**encodedKey** | **String** | The encoded key of the entity, generated, globally unique |  [optional] [readonly]
**id** | **String** | Investor fund unique identifier. All versions of an investor fund will have same id. |  [optional]
**guarantorKey** | **String** | The key of the client/group used as the guarantor. | 
**guarantorType** | [**GuarantorTypeEnum**](#GuarantorTypeEnum) | The type of the guarantor (client/group) | 
**sharePercentage** | [**BigDecimal**](BigDecimal.md) | Percentage of loan shares this investor owns |  [optional]



## Enum: GuarantorTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



