

# ClientFilterCriteria

The unit that composes the list used for Clients searching
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | Contains the actual searching fields that can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId].  | 
**value** | **String** | The value to match the searching criteria |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | | **Operator**  | **Affected values** | **Available for**                                                    | |---------------|----------------------|----------------------------------------------------------------------| | EQUALS        | ONE_VALUE            | BIG_DECIMAL,BOOLEAN,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY        | | MORE_THAN     | ONE_VALUE            | BIG_DECIMAL,NUMBER,MONEY                                             | | LESS_THAN     | ONE_VALUE            | BIG_DECIMAL,NUMBER,MONEY                                             | | BETWEEN       | TWO_VALUES           | BIG_DECIMAL,NUMBER,MONEY,DATE,DATE_TIME                              | | ON            | ONE_VALUE            | DATE,DATE_TIME                                                       | | AFTER         | ONE_VALUE            | DATE,DATE_TIME                                                       | | BEFORE        | ONE_VALUE            | DATE,DATE_TIME                                                       | | STARTS_WITH   | ONE_VALUE            | STRING                                                               | | IN            | LIST                 | ENUM,KEY                                                             | | TODAY         | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_WEEK     | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_MONTH    | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_YEAR     | NO_VALUE             | DATE,DATE_TIME                                                       | | LAST_DAYS     | ONE_VALUE            | NUMBER                                                               | | EMPTY         | NO_VALUE             | BIG_DECIMAL,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY,DATE,DATE_TIME | | NOT_EMPTY     | NO_VALUE             | BIG_DECIMAL,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY,DATE,DATE_TIME | | 
**secondValue** | **String** | The second value to match the searching criteria, when using BETWEEN, together with value |  [optional]
**values** | **List&lt;String&gt;** | List of values when operator is IN. |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
ENCODEDKEY | &quot;encodedKey&quot;
CREDITOFFICERKEY | &quot;creditOfficerKey&quot;
CLIENTROLEKEY | &quot;clientRoleKey&quot;
BRANCHKEY | &quot;branchKey&quot;
CENTREKEY | &quot;centreKey&quot;
GROUPKEY | &quot;groupKey&quot;
FULLNAME | &quot;fullName&quot;
FIRSTNAME | &quot;firstName&quot;
MIDDLENAME | &quot;middleName&quot;
LASTNAME | &quot;lastName&quot;
CREATIONDATE | &quot;creationDate&quot;
LASTMODIFIEDDATE | &quot;lastModifiedDate&quot;
ID | &quot;id&quot;
DEPOSITSBALANCE | &quot;depositsBalance&quot;
LOANSBALANCE | &quot;loansBalance&quot;
PENDINGLOANAMOUNT | &quot;pendingLoanAmount&quot;
APPROVEDLOANAMOUNT | &quot;approvedLoanAmount&quot;
TOTALBALANCE | &quot;totalBalance&quot;
TOTALDUE | &quot;totalDue&quot;
HOMEPHONENUMBER | &quot;homePhoneNumber&quot;
MOBILEPHONENUMBER | &quot;mobilePhoneNumber&quot;
EMAILADDRESS | &quot;emailAddress&quot;
CLIENTADDRESS | &quot;clientAddress&quot;
BIRTHDATE | &quot;birthdate&quot;
GENDER | &quot;gender&quot;
LOANCYCLE | &quot;loanCycle&quot;
GROUPLOANCYCLE | &quot;groupLoanCycle&quot;
CLIENTSTATE | &quot;clientState&quot;
PORTALSTATE | &quot;portalState&quot;
PREFERREDLANGUAGE | &quot;preferredLanguage&quot;
GROUPID | &quot;groupId&quot;



## Enum: OperatorEnum

Name | Value
---- | -----
EQUALS | &quot;EQUALS&quot;
EQUALS_CASE_SENSITIVE | &quot;EQUALS_CASE_SENSITIVE&quot;
DIFFERENT_THAN | &quot;DIFFERENT_THAN&quot;
MORE_THAN | &quot;MORE_THAN&quot;
LESS_THAN | &quot;LESS_THAN&quot;
BETWEEN | &quot;BETWEEN&quot;
ON | &quot;ON&quot;
AFTER | &quot;AFTER&quot;
BEFORE | &quot;BEFORE&quot;
STARTS_WITH | &quot;STARTS_WITH&quot;
STARTS_WITH_CASE_SENSITIVE | &quot;STARTS_WITH_CASE_SENSITIVE&quot;
IN | &quot;IN&quot;
TODAY | &quot;TODAY&quot;
THIS_WEEK | &quot;THIS_WEEK&quot;
THIS_MONTH | &quot;THIS_MONTH&quot;
THIS_YEAR | &quot;THIS_YEAR&quot;
LAST_DAYS | &quot;LAST_DAYS&quot;
EMPTY | &quot;EMPTY&quot;
NOT_EMPTY | &quot;NOT_EMPTY&quot;



