

# Asset

Asset, holds information about a client asset entry.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount used by the client for the guaranty | 
**depositAccountKey** | **String** | The key of the deposit account used by the guarantor (populated when the guaranty type is GUARANTOR). It can be null. |  [optional]
**assetName** | **String** | The name of a value the client guarantees with (populated when the guaranty type is ASSET) | 
**encodedKey** | **String** | The encoded key of the security, auto generated, unique. |  [optional] [readonly]
**guarantorKey** | **String** | The key of the client/group used as the guarantor. |  [optional]
**guarantorType** | [**GuarantorTypeEnum**](#GuarantorTypeEnum) | The type of the guarantor (client/group) |  [optional]



## Enum: GuarantorTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



