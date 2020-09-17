

# DisbursementDetails

The the disbursement details it holds the information related to the disbursement details as disbursement date, first repayment date, disbursement fees.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionDetails** | [**LoanTransactionDetails**](LoanTransactionDetails.md) |  |  [optional]
**expectedDisbursementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the expected disbursement.Stored as Organization Time. |  [optional]
**fees** | [**List&lt;CustomPredefinedFee&gt;**](CustomPredefinedFee.md) | List of fees that should be applied at the disbursement time. |  [optional]
**firstRepaymentDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date of the expected first repayment. Stored as Organization Time. |  [optional]
**disbursementDate** | [**OffsetDateTime**](OffsetDateTime.md) | The activation date, the date when the disbursement actually took place. |  [optional]
**encodedKey** | **String** | The encoded key of the disbursement details, auto generated, unique |  [optional] [readonly]



