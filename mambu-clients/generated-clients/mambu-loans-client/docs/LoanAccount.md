

# LoanAccount

Represents the amount that your organization lends to a customer. An account associated to a borrower with terms and conditions defined by a loan product. In a loan account Mambu stores all the information related to disbursements, repayments, interest rates and withdrawals.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountState** | [**AccountStateEnum**](#AccountStateEnum) | The state of the loan account |  [optional]
**prepaymentSettings** | [**PrepaymentSettings**](PrepaymentSettings.md) |  |  [optional]
**migrationEventKey** | **String** | The migration event encoded key associated with this loan account. If this account was imported, track which &#39;migration event&#39; they came from. |  [optional]
**lastSetToArrearsDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the loan account was set to last standing, or null if never set (as Organization Time) |  [optional]
**notes** | **String** | Extra notes about this loan account. |  [optional]
**disbursementDetails** | [**DisbursementDetails**](DisbursementDetails.md) |  |  [optional]
**daysInArrears** | **Integer** | The number of days in arrears |  [optional] [readonly]
**accountSubState** | [**AccountSubStateEnum**](#AccountSubStateEnum) | This field holds a second state for the account. Beside the account state, we might need to hold sometimes a different information to actually represent the correct life-cycle step in which the account is at that moment. The account behaves as the main state implies, but it  can have either some limitations either some extra behavior rules. For example, even if the account is Active, it can also be Locked in the same time which impliessome limitations over the actions which can be performed with the account. |  [optional]
**loanName** | **String** | The name of the loan account. |  [optional]
**interestSettings** | [**InterestSettings**](InterestSettings.md) |  |  [optional]
**assets** | [**List&lt;Asset&gt;**](Asset.md) | A list of assets associated with the current loan account |  [optional]
**lastInterestReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last interest review date. Indicates the date the interest was reviewed last time. Stored as Organization Time. |  [optional]
**id** | **String** | The id of the loan, can be generated and customized, unique |  [optional]
**assignedUserKey** | **String** | Key of the user this loan is assigned to |  [optional]
**futurePaymentsAcceptance** | [**FuturePaymentsAcceptanceEnum**](#FuturePaymentsAcceptanceEnum) | Shows whether the future payments are allowed or not for this account (repayment transactions with entry date set in the future) |  [optional]
**originalAccountKey** | **String** | Key of the original rescheduled/refinanced account |  [optional]
**lockedOperations** | [**List&lt;LockedOperationsEnum&gt;**](#List&lt;LockedOperationsEnum&gt;) | A list with operations which are locked when the account is in sub-state AccountState.LOCKED. |  [optional]
**accruedInterest** | [**BigDecimal**](BigDecimal.md) | The accrued interest. Represents the amount of interest that has been accrued in the account. |  [optional]
**accruedPenalty** | [**BigDecimal**](BigDecimal.md) | The accrued penalty, represents the amount of penalty that has been accrued in the account. |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this loan account was created |  [optional]
**assignedCentreKey** | **String** | Key of the centre this account is assigned to |  [optional]
**tranches** | [**List&lt;LoanTranche&gt;**](LoanTranche.md) | A list of disbursement tranches available for the current loan account. |  [optional]
**approvedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this loan account was approved |  [optional]
**taxRate** | [**BigDecimal**](BigDecimal.md) | The tax rate. |  [optional]
**lastTaxRateReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last tax rate review date. Indicates When/if the account had last tax rate checked (as Organization Time). |  [optional]
**interestFromArrearsAccrued** | [**BigDecimal**](BigDecimal.md) | The interest from arrears accrued. Represents the amount of interest from arrears that has been accrued in the account. |  [optional] [readonly]
**scheduleSettings** | [**ScheduleSettings**](ScheduleSettings.md) |  | 
**daysLate** | **Integer** | The number of days late |  [optional] [readonly]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  The payment method. Represents the interest payment method that determines whether the payments are made Horizontally (on the Repayments) or Vertically (on the Loan Account) |  [optional]
**accountHolderKey** | **String** | The encodedKey of the client (a.k.a account holder) | 
**latePaymentsRecalculationMethod** | [**LatePaymentsRecalculationMethodEnum**](#LatePaymentsRecalculationMethodEnum) | Overdue payments recalculation method copied from the loan product on which this account is based |  [optional]
**fundingSources** | [**List&lt;InvestorFund&gt;**](InvestorFund.md) | A list of funds associated with the current loan account |  [optional]
**accountHolderType** | [**AccountHolderTypeEnum**](#AccountHolderTypeEnum) | The type of the account holder (i.e CLIENT) | 
**arrearsTolerancePeriod** | **Integer** | The arrears tolerance (period or day of month) depending on the product settings |  [optional]
**lastInterestAppliedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last interest applied date. Indicates when/if the account had last interest applied (stored to interest balance) (as Organization Time) |  [optional]
**rescheduledAccountKey** | **String** | Key pointing to where this account was rescheduled/refinanced to. only not null if rescheduled |  [optional]
**activationTransactionKey** | **String** | The encoded key of the transaction that activated this account |  [optional]
**assignedBranchKey** | **String** | Key of the branch this loan account is assigned to. Loan account&#39;s branch is set to unassigned if no branch field is set |  [optional]
**balances** | [**Balances**](Balances.md) |  |  [optional]
**creditArrangementKey** | **String** | The key to the line of credit where this account is registered to. |  [optional]
**interestCommission** | [**BigDecimal**](BigDecimal.md) | The value of the interest booked by the organization from the accounts funded by investors. Null if the funds are not enable |  [optional]
**encodedKey** | **String** | The encoded key of the loan account, auto generated, unique |  [optional] [readonly]
**lastAccountAppraisalDate** | [**OffsetDateTime**](OffsetDateTime.md) | When/if the account had last been evaluated for interest, principal, fees and penalties calculations (as Organization Time) |  [optional]
**penaltySettings** | [**PenaltySettings**](PenaltySettings.md) |  |  [optional]
**settlementAccountKey** | **String** | The encodedKey of the settlement account |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the loan was updated |  [optional]
**principalPaymentSettings** | [**PrincipalPaymentAccountSettings**](PrincipalPaymentAccountSettings.md) |  |  [optional]
**lastLockedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Holds the date when the account was set for the last time in the LOCKED state. If null, the account is not locked anymore. Stored as Organization Time |  [optional]
**loanAmount** | [**BigDecimal**](BigDecimal.md) | The loan amount | 
**closedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this loan was closed |  [optional]
**productTypeKey** | **String** | The key to the type of product that this account is based on. | 
**allowOffset** | **Boolean** | Specify if the account is allowing offset links. |  [optional]
**guarantors** | [**List&lt;Guarantor&gt;**](Guarantor.md) | A list of guarantees associated with the current loan account |  [optional]
**accountArrearsSettings** | [**AccountArrearsSettings**](AccountArrearsSettings.md) |  |  [optional]



## Enum: AccountStateEnum

Name | Value
---- | -----
PARTIAL_APPLICATION | &quot;PARTIAL_APPLICATION&quot;
PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot;
APPROVED | &quot;APPROVED&quot;
ACTIVE | &quot;ACTIVE&quot;
ACTIVE_IN_ARREARS | &quot;ACTIVE_IN_ARREARS&quot;
CLOSED | &quot;CLOSED&quot;



## Enum: AccountSubStateEnum

Name | Value
---- | -----
PARTIALLY_DISBURSED | &quot;PARTIALLY_DISBURSED&quot;
LOCKED | &quot;LOCKED&quot;
LOCKED_CAPPING | &quot;LOCKED_CAPPING&quot;
REFINANCED | &quot;REFINANCED&quot;
RESCHEDULED | &quot;RESCHEDULED&quot;
WITHDRAWN | &quot;WITHDRAWN&quot;
REPAID | &quot;REPAID&quot;
REJECTED | &quot;REJECTED&quot;
WRITTEN_OFF | &quot;WRITTEN_OFF&quot;



## Enum: FuturePaymentsAcceptanceEnum

Name | Value
---- | -----
NO_FUTURE_PAYMENTS | &quot;NO_FUTURE_PAYMENTS&quot;
ACCEPT_FUTURE_PAYMENTS | &quot;ACCEPT_FUTURE_PAYMENTS&quot;
ACCEPT_OVERPAYMENTS | &quot;ACCEPT_OVERPAYMENTS&quot;



## Enum: List&lt;LockedOperationsEnum&gt;

Name | Value
---- | -----
INTEREST | &quot;APPLY_INTEREST&quot;
FEES | &quot;APPLY_FEES&quot;
PENALTIES | &quot;APPLY_PENALTIES&quot;



## Enum: PaymentMethodEnum

Name | Value
---- | -----
HORIZONTAL | &quot;HORIZONTAL&quot;
VERTICAL | &quot;VERTICAL&quot;



## Enum: LatePaymentsRecalculationMethodEnum

Name | Value
---- | -----
OVERDUE_INSTALLMENTS_INCREASE | &quot;OVERDUE_INSTALLMENTS_INCREASE&quot;
LAST_INSTALLMENT_INCREASE | &quot;LAST_INSTALLMENT_INCREASE&quot;



## Enum: AccountHolderTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



