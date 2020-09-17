

# Document

Holds information regarding the documents uploaded as attachments
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) | Determines the owner type of the document |  [optional] [readonly]
**fileName** | **String** | The original file name of the document |  [optional]
**notes** | **String** | Detailed notes about the document |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last modified date of the document, stored as UTC |  [optional] [readonly]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date of the document, stored as UTC |  [optional] [readonly]
**type** | **String** | The extension of the document | 
**ownerKey** | **String** | Represents the holder of this document. If null, means nobody is the owner of this document |  [optional] [readonly]
**fileSize** | **Long** | The file size of the document |  [optional]
**name** | **String** | The name of the document | 
**encodedKey** | **String** | The document encodedKey |  [optional] [readonly]
**location** | **String** | Location where the document can be found, eg /myfiles/mypicture.jpeg |  [optional]
**id** | **Long** | The document id | 



## Enum: OwnerTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;
LOAN_PRODUCT | &quot;LOAN_PRODUCT&quot;
SAVINGS_PRODUCT | &quot;SAVINGS_PRODUCT&quot;
CENTRE | &quot;CENTRE&quot;
BRANCH | &quot;BRANCH&quot;
USER | &quot;USER&quot;
LOAN_ACCOUNT | &quot;LOAN_ACCOUNT&quot;
DEPOSIT_ACCOUNT | &quot;DEPOSIT_ACCOUNT&quot;
ID_DOCUMENT | &quot;ID_DOCUMENT&quot;
LINE_OF_CREDIT | &quot;LINE_OF_CREDIT&quot;
GL_JOURNAL_ENTRY | &quot;GL_JOURNAL_ENTRY&quot;



