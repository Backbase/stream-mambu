

# Guarantor

Guarantor, holds information about a client guaranty entry. It can be defined based on another client which guarantees (including or not a savings account whether it is a client of the organization using Mambu or not) or based on a value the client holds (an asset)
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount used by the client for the guaranty | 
**depositAccountKey** | **String** | The key of the deposit account used by the guarantor (populated when the guaranty type is GUARANTOR). It can be null. |  [optional]
**assetName** | **String** | The name of a value the client guarantees with (populated when the guaranty type is ASSET) |  [optional]
**encodedKey** | **String** | The encoded key of the security, auto generated, unique. |  [optional] [readonly]
**guarantorKey** | **String** | The key of the client/group used as the guarantor. | 
**guarantorType** | [**GuarantorTypeEnum**](#GuarantorTypeEnum) | The type of the guarantor (client/group) | 



## Enum: GuarantorTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



