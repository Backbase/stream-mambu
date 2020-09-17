

# DepositTransactionFilterCriteria

The unit that composes the list used for Deposit transactions client directed searching
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | [**FieldEnum**](#FieldEnum) | Contains the actual searching fields that can be native (one from the provided list) or otherwise can specify a custom field using the format [customFieldSetId].[customFieldId]. |Field with limited capabilities          |Data Type |Operators   | |-----------------------------------------|----------|------------| |originalTransactionKey                   |KEY       |EQUALS, IN  | |transactionDetails.transactionChannelId  |STRING    |EQUALS      | |originalTransactionID                    |STRING    |EQUALS      |  | 
**value** | **String** | The value to match the searching criteria |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | | **Operator**  | **Affected values** | **Available for**                                                    | |---------------|----------------------|----------------------------------------------------------------------| | EQUALS        | ONE_VALUE            | BIG_DECIMAL,BOOLEAN,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY        | | MORE_THAN     | ONE_VALUE            | BIG_DECIMAL,NUMBER,MONEY                                             | | LESS_THAN     | ONE_VALUE            | BIG_DECIMAL,NUMBER,MONEY                                             | | BETWEEN       | TWO_VALUES           | BIG_DECIMAL,NUMBER,MONEY,DATE,DATE_TIME                              | | ON            | ONE_VALUE            | DATE,DATE_TIME                                                       | | AFTER         | ONE_VALUE            | DATE,DATE_TIME                                                       | | BEFORE        | ONE_VALUE            | DATE,DATE_TIME                                                       | | STARTS_WITH   | ONE_VALUE            | STRING                                                               | | IN            | LIST                 | ENUM,KEY                                                             | | TODAY         | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_WEEK     | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_MONTH    | NO_VALUE             | DATE,DATE_TIME                                                       | | THIS_YEAR     | NO_VALUE             | DATE,DATE_TIME                                                       | | LAST_DAYS     | ONE_VALUE            | NUMBER                                                               | | EMPTY         | NO_VALUE             | BIG_DECIMAL,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY,DATE,DATE_TIME | | NOT_EMPTY     | NO_VALUE             | BIG_DECIMAL,LONG,MONEY,NUMBER,PERCENT,STRING,ENUM,KEY,DATE,DATE_TIME | | 
**secondValue** | **String** | The second value to match the searching criteria, when using BETWEEN, together with value |  [optional]
**values** | **List&lt;String&gt;** | List of values when operator is IN. |  [optional]



## Enum: FieldEnum

Name | Value
---- | -----
ENCODEDKEY | &quot;encodedKey&quot;
ID | &quot;id&quot;
EXTERNALID | &quot;externalId&quot;
PRODUCTID | &quot;productID&quot;
CURRENCYCODE | &quot;currencyCode&quot;
BRANCHID | &quot;branchID&quot;
BRANCHKEY | &quot;branchKey&quot;
CENTREID | &quot;centreID&quot;
CENTREKEY | &quot;centreKey&quot;
TILLID | &quot;tillID&quot;
TILLKEY | &quot;tillKey&quot;
AMOUNT | &quot;amount&quot;
AFFECTEDAMOUNTS_FUNDSAMOUNT | &quot;affectedAmounts.fundsAmount&quot;
AFFECTEDAMOUNTS_INTERESTAMOUNT | &quot;affectedAmounts.interestAmount&quot;
AFFECTEDAMOUNTS_FEESAMOUNT | &quot;affectedAmounts.feesAmount&quot;
PARENTACCOUNTKEY | &quot;parentAccountKey&quot;
PARENTACCOUNTID | &quot;parentAccountID&quot;
PRODUCTTYPEKEY | &quot;productTypeKey&quot;
USERKEY | &quot;userKey&quot;
ADJUSTMENTTRANSACTIONID | &quot;adjustmentTransactionID&quot;
ADJUSTMENTTRANSACTIONKEY | &quot;adjustmentTransactionKey&quot;
ORIGINALTRANSACTIONKEY | &quot;originalTransactionKey&quot;
ORIGINALTRANSACTIONID | &quot;originalTransactionID&quot;
TRANSACTIONDETAILS_TRANSACTIONCHANNELKEY | &quot;transactionDetails.transactionChannelKey&quot;
TRANSACTIONDETAILS_TRANSACTIONCHANNELID | &quot;transactionDetails.transactionChannelId&quot;
TYPE | &quot;type&quot;
CREATIONDATE | &quot;creationDate&quot;
ACCOUNTBALANCES_TOTALBALANCE | &quot;accountBalances.totalBalance&quot;
VALUEDATE | &quot;valueDate&quot;
TAXES_TAXRATE | &quot;taxes.taxRate&quot;
TERMS_INTERESTSETTINGS_INTERESTRATE | &quot;terms.interestSettings.interestRate&quot;
FEES_TRIGGER | &quot;fees.trigger&quot;
FEES_NAME | &quot;fees.name&quot;
FEES_PREDEFINEDFEEKEY | &quot;fees.predefinedFeeKey&quot;
WASADJUSTED | &quot;wasAdjusted&quot;
TYPEISADJUSTMENT | &quot;typeIsAdjustment&quot;
AFFECTEDAMOUNTS_OVERDRAFTAMOUNT | &quot;affectedAmounts.overdraftAmount&quot;
AFFECTEDAMOUNTS_OVERDRAFTINTERESTAMOUNT | &quot;affectedAmounts.overdraftInterestAmount&quot;
AFFECTEDAMOUNTS_OVERDRAFTFEESAMOUNT | &quot;affectedAmounts.overdraftFeesAmount&quot;
AFFECTEDAMOUNTS_TECHNICALOVERDRAFTAMOUNT | &quot;affectedAmounts.technicalOverdraftAmount&quot;
AFFECTEDAMOUNTS_TECHNICALOVERDRAFTINTERESTAMOUNT | &quot;affectedAmounts.technicalOverdraftInterestAmount&quot;
TERMS_OVERDRAFTINTERESTSETTINGS_INTERESTRATE | &quot;terms.overdraftInterestSettings.interestRate&quot;
TERMS_OVERDRAFTINTERESTSETTINGS_INDEXINTERESTRATE | &quot;terms.overdraftInterestSettings.indexInterestRate&quot;



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



