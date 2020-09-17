

# DepositTransactionSortingCriteria

The sorting criteria used for Deposit transactions client directed query
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | Contains the field that can be used as sorting selection. Can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId]. | 
**order** | [**OrderEnum**](#OrderEnum) | The sorting order: ASC or DESC. The default order is DESC. |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
ID | &quot;id&quot;
EXTERNALID | &quot;externalId&quot;
PARENTACCOUNTID | &quot;parentAccountId&quot;
PRODUCTID | &quot;productId&quot;
VALUEDATE | &quot;valueDate&quot;
CREATIONDATE | &quot;creationDate&quot;
AMOUNT | &quot;amount&quot;
BRANCHID | &quot;branchId&quot;
CENTREID | &quot;centreId&quot;
TILLID | &quot;tillId&quot;
FEES_NAME | &quot;fees.name&quot;
TRANSACTIONDETAILS_TRANSACTIONCHANNELID | &quot;transactionDetails.transactionChannelId&quot;
TAXES_TAXRATE | &quot;taxes.taxRate&quot;
TERMS_INTERESTSETTINGS_INTERESTRATE | &quot;terms.interestSettings.interestRate&quot;
TERMS_OVERDRAFTINTERESTSETTINGS_INTERESTRATE | &quot;terms.overdraftInterestSettings.interestRate&quot;
TERMS_OVERDRAFTSETTINGS_OVERDRAFTLIMIT | &quot;terms.overdraftSettings.overdraftLimit&quot;
AFFECTEDAMOUNTS_INTERESTAMOUNT | &quot;affectedAmounts.interestAmount&quot;
AFFECTEDAMOUNTS_FEESAMOUNT | &quot;affectedAmounts.feesAmount&quot;
ACCOUNTBALANCES_TOTALBALANCE | &quot;accountBalances.totalBalance&quot;



## Enum: OrderEnum

Name | Value
---- | -----
ASC | &quot;ASC&quot;
DESC | &quot;DESC&quot;



