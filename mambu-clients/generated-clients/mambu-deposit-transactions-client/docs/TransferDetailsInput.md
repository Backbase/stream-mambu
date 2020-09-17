

# TransferDetailsInput

Represents the input for the transfer details for a transfer transaction
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**linkedAccountId** | **String** | The id of the linked account |  [optional]
**linkedAccountType** | [**LinkedAccountTypeEnum**](#LinkedAccountTypeEnum) | The type of the linked account. Can be LOAN or DEPOSIT | 
**linkedAccountKey** | **String** | The encoded key of the linked account |  [optional]



## Enum: LinkedAccountTypeEnum

Name | Value
---- | -----
LOAN | &quot;LOAN&quot;
DEPOSIT | &quot;DEPOSIT&quot;



