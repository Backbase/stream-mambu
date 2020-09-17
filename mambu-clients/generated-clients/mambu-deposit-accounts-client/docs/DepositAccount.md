

# DepositAccount

An account where a customer holds his savings
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountState** | [**AccountStateEnum**](#AccountStateEnum) | The state of the deposit account |  [optional] [readonly]
**migrationEventKey** | **String** | The migration event encoded key associated with this deposit account. If this account was imported, track which &#39;migration event&#39; they came from. |  [optional] [readonly]
**notes** | **String** | Extra notes about this deposit account |  [optional]
**lastSetToArrearsDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date when the deposit account was set to In Arrears state, or null if the account is not In Arrears state (as Organization Time) |  [optional] [readonly]
**assignedBranchKey** | **String** | Key of the branch this deposit account is assigned to |  [optional]
**lastOverdraftInterestReviewDate** | [**OffsetDateTime**](OffsetDateTime.md) | When the overdraft interest was last time reviewed |  [optional] [readonly]
**lastInterestStoredDate** | [**OffsetDateTime**](OffsetDateTime.md) | When/if the account had last interest applied (stored to balance) (as Organization Time) |  [optional] [readonly]
**interestSettings** | [**DepositAccountInterestSettings**](DepositAccountInterestSettings.md) |  |  [optional]
**balances** | [**DepositAccountBalances**](DepositAccountBalances.md) |  |  [optional]
**creditArrangementKey** | **String** | The key to the credit arrangement where this account is registered to |  [optional]
**maturityDate** | [**OffsetDateTime**](OffsetDateTime.md) | For fixed or compulsory savings plans, this is when the account matures (as Organization Time) |  [optional] [readonly]
**encodedKey** | **String** | The encoded key of the deposit account, auto generated, unique |  [optional] [readonly]
**id** | **String** | The id of the deposit account, can be generated and customized, unique |  [optional]
**overdraftSettings** | [**DepositAccountOverdraftSettings**](DepositAccountOverdraftSettings.md) |  |  [optional]
**lastAccountAppraisalDate** | [**OffsetDateTime**](OffsetDateTime.md) | When/if the account had last been evaluated for interest calculations/maturity (as Organization Time) |  [optional] [readonly]
**withholdingTaxSourceKey** | **String** | The tax source from where the account withholding taxes will be updated |  [optional]
**assignedUserKey** | **String** | Key of the user this deposit is assigned to |  [optional]
**_IBAN** | [**DepositAccountIBAN**](DepositAccountIBAN.md) |  |  [optional]
**overdraftInterestSettings** | [**DepositAccountOverdraftInterestSettings**](DepositAccountOverdraftInterestSettings.md) |  |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the deposit account was updated (as UTC) |  [optional] [readonly]
**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Indicates the type of the deposit account and the product that it belongs to |  [optional]
**lockedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this deposit account was locked (as Organization Time) |  [optional] [readonly]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this deposit account was created (as UTC) |  [optional] [readonly]
**lastInterestCalculationDate** | [**OffsetDateTime**](OffsetDateTime.md) | When/if the account had the interest last calculated (as Organization Time) |  [optional] [readonly]
**assignedCentreKey** | **String** | Key of the centre this account is assigned to |  [optional]
**approvedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this deposit account was approved (as Organization Time) |  [optional] [readonly]
**closedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this deposit account was closed (as UTC) |  [optional] [readonly]
**accruedAmounts** | [**DepositAccountAccruedAmounts**](DepositAccountAccruedAmounts.md) |  |  [optional]
**name** | **String** | The name of the deposit account | 
**accountHolderKey** | **String** | The encodedKey of the client or group (a.k.a account holder) | 
**productTypeKey** | **String** | The key to the type of product that this account is based on | 
**activationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this deposit account was activated (as Organization Time) |  [optional] [readonly]
**internalControls** | [**DepositAccountInternalControls**](DepositAccountInternalControls.md) |  |  [optional]
**currencyCode** | **String** | The currency code |  [optional]
**accountHolderType** | [**AccountHolderTypeEnum**](#AccountHolderTypeEnum) | The type of the account holder (i.e CLIENT or GROUP) | 
**linkedSettlementAccountKeys** | **List&lt;String&gt;** | Lists all loan&#39;s keys on which the deposit is used as a settlement account. |  [optional] [readonly]



## Enum: AccountStateEnum

Name | Value
---- | -----
PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot;
APPROVED | &quot;APPROVED&quot;
ACTIVE | &quot;ACTIVE&quot;
ACTIVE_IN_ARREARS | &quot;ACTIVE_IN_ARREARS&quot;
MATURED | &quot;MATURED&quot;
LOCKED | &quot;LOCKED&quot;
DORMANT | &quot;DORMANT&quot;
CLOSED | &quot;CLOSED&quot;
CLOSED_WRITTEN_OFF | &quot;CLOSED_WRITTEN_OFF&quot;
WITHDRAWN | &quot;WITHDRAWN&quot;
CLOSED_REJECTED | &quot;CLOSED_REJECTED&quot;



## Enum: AccountTypeEnum

Name | Value
---- | -----
CURRENT_ACCOUNT | &quot;CURRENT_ACCOUNT&quot;
REGULAR_SAVINGS | &quot;REGULAR_SAVINGS&quot;
FIXED_DEPOSIT | &quot;FIXED_DEPOSIT&quot;
SAVINGS_PLAN | &quot;SAVINGS_PLAN&quot;
INVESTOR_ACCOUNT | &quot;INVESTOR_ACCOUNT&quot;



## Enum: AccountHolderTypeEnum

Name | Value
---- | -----
CLIENT | &quot;CLIENT&quot;
GROUP | &quot;GROUP&quot;



