

# IdentificationDocument

An Id document represents a document that can be used to identify a person like a passport, a drivers license an id card etc.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identificationDocumentTemplateKey** | **String** | Encoded key of the template used for this document |  [optional]
**issuingAuthority** | **String** | Authority that issued the document, eg. Police |  [optional]
**attachments** | [**List&lt;Document&gt;**](Document.md) | A list containing information about the attached files for this document |  [optional]
**clientKey** | **String** | The encoded key of the client that owns this document |  [optional] [readonly]
**documentType** | **String** | The type of the document, Passport, Id card Drivers license, etc. | 
**indexInList** | **Integer** | This document&#39;s index in the list of documents |  [optional]
**validUntil** | [**LocalDate**](LocalDate.md) | Date when the validity of the document ends |  [optional]
**encodedKey** | **String** | The encoded key of the document, generated, unique |  [optional] [readonly]
**documentId** | **String** | The id of the document | 



