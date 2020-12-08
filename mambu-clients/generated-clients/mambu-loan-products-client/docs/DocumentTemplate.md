

# DocumentTemplate

Template documents of the product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name the document |  [optional]
**encodedKey** | **String** | The document encodedKey |  [optional] [readonly]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the document |  [optional] [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The type of the template |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last modified date of the document |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
ACCOUNT | &quot;ACCOUNT&quot;
TRANSACTION | &quot;TRANSACTION&quot;
ACCOUNT_WITH_TRANSACTIONS | &quot;ACCOUNT_WITH_TRANSACTIONS&quot;



