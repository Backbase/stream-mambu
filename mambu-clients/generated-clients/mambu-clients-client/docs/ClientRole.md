

# ClientRole

Describes the role of a client/group in the system
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientType** | [**ClientTypeEnum**](#ClientTypeEnum) | The type of the client for which this role was created |  [optional]
**requireID** | **Boolean** | Indicates whether identification documents must be provided for the client to be created |  [optional]
**canGuarantee** | **Boolean** | Indicates whether the clients under this type can be used as guarantors |  [optional]
**useDefaultAddress** | **Boolean** | Indicates whether the Mambu default address section will be available |  [optional]
**name** | **String** | The name of the client role |  [optional]
**canOpenAccounts** | **Boolean** | Indicates whether new accounts for this client type can be created |  [optional]
**description** | **String** | Text description for this client role |  [optional]
**encodedKey** | **String** | The encoded key of the client, auto generated, unique |  [optional] [readonly]
**id** | **String** | The ID of the client role, can be generated and customized, unique |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the client role |  [optional] [readonly]



## Enum: ClientTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



