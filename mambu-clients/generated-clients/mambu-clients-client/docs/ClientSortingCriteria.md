

# ClientSortingCriteria

The sorting criteria used for Clients
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | Contains the field that can be used as sorting selection. Can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId]. | 
**order** | [**OrderEnum**](#OrderEnum) | The sorting order: ASC or DESC. The default order is DESC. |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
ENCODEDKEY | &quot;encodedKey&quot;
ID | &quot;id&quot;
FULLNAME | &quot;fullName&quot;
FIRSTNAME | &quot;firstName&quot;
MIDDLENAME | &quot;middleName&quot;
LASTNAME | &quot;lastName&quot;
CREATIONDATE | &quot;creationDate&quot;
LASTMODIFIEDDATE | &quot;lastModifiedDate&quot;
DEPOSITSBALANCE | &quot;depositsBalance&quot;
LOANSBALANCE | &quot;loansBalance&quot;
PENDINGLOANAMOUNT | &quot;pendingLoanAmount&quot;
APPROVEDLOANAMOUNT | &quot;approvedLoanAmount&quot;
TOTALBALANCE | &quot;totalBalance&quot;
TOTALDUE | &quot;totalDue&quot;
HOMEPHONENUMBER | &quot;homePhoneNumber&quot;
MOBILEPHONENUMBER | &quot;mobilePhoneNumber&quot;
EMAILADDRESS | &quot;emailAddress&quot;
BIRTHDATE | &quot;birthdate&quot;
LOANCYCLE | &quot;loanCycle&quot;
GROUPLOANCYCLE | &quot;groupLoanCycle&quot;
PORTALSTATE | &quot;portalState&quot;



## Enum: OrderEnum

Name | Value
---- | -----
ASC | &quot;ASC&quot;
DESC | &quot;DESC&quot;



