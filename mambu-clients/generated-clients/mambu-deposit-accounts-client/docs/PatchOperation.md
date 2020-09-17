

# PatchOperation

A single change that needs to be made to a resource
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**op** | [**OpEnum**](#OpEnum) | The change to perform | 
**path** | **String** | The field to perform the operation on | 
**from** | **String** | The field from where a value should be moved, when using move |  [optional]
**value** | [**Object**](.md) | The value of the field, can be null |  [optional]



## Enum: OpEnum

Name | Value
---- | -----
ADD | &quot;ADD&quot;
REPLACE | &quot;REPLACE&quot;
REMOVE | &quot;REMOVE&quot;
MOVE | &quot;MOVE&quot;



