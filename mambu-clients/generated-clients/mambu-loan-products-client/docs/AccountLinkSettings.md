

# AccountLinkSettings

Defines the settings for account linking.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**linkedAccountOptions** | [**List&lt;LinkedAccountOptionsEnum&gt;**](#List&lt;LinkedAccountOptionsEnum&gt;) | A set of linked account options. |  [optional]
**settlementMethod** | [**SettlementMethodEnum**](#SettlementMethodEnum) | Set the option of automated transfer that should be made from linked deposit accounts into loan accounts create from this product. |  [optional]
**enabled** | **Boolean** | Shows whether the loan accounts created using this product can be linked to a savings account. | 
**linkableDepositProductKey** | **String** | Loan accounts created for this product can only be linked the the savings accounts that use the savings product with this key. If null, the loan accounts for this product can be linked to any savings account. |  [optional]



## Enum: List&lt;LinkedAccountOptionsEnum&gt;

Name | Value
---- | -----
LINK_ACCOUNTS | &quot;AUTO_LINK_ACCOUNTS&quot;
CREATE_LINKED_ACCOUNTS | &quot;AUTO_CREATE_LINKED_ACCOUNTS&quot;



## Enum: SettlementMethodEnum

Name | Value
---- | -----
FULL_DUE_AMOUNTS | &quot;FULL_DUE_AMOUNTS&quot;
PARTIAL_DUE_AMOUNTS | &quot;PARTIAL_DUE_AMOUNTS&quot;
NO_AUTOMATED_TRANSFERS | &quot;NO_AUTOMATED_TRANSFERS&quot;



