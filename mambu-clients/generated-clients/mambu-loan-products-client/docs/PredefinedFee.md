

# PredefinedFee

The response representation of the PredefinedFee. Represents a fee with a defined name and a fixed value.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of the fee |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | Shows the last modified date of the fee |  [optional]
**amountCalculationMethod** | [**AmountCalculationMethodEnum**](#AmountCalculationMethodEnum) | The amount from which the fee is calculated using percentageAmount |  [optional]
**trigger** | [**TriggerEnum**](#TriggerEnum) | Shows the event that will trigger a fee | 
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | Shows the creation date of the fee |  [optional]
**accountingRules** | [**List&lt;GLAccountingRule&gt;**](GLAccountingRule.md) | A list of accounting rules defined for this fee. If null, product default rules are selected. |  [optional]
**name** | **String** | The name of the fee |  [optional]
**feeApplication** | [**FeeApplicationEnum**](#FeeApplicationEnum) | The type of fee application when disbursement is applied | 
**amortizationSettings** | [**PeriodIntervalSettings**](PeriodIntervalSettings.md) |  |  [optional]
**encodedKey** | **String** | The encoded key of the predefined fee, auto generated, unique |  [optional] [readonly]
**state** | [**StateEnum**](#StateEnum) | Indicates the state of the fee | 
**applyDateMethod** | [**ApplyDateMethodEnum**](#ApplyDateMethodEnum) | Shows when a fee should be applied; to be used with monthly deposit fees |  [optional]
**percentageAmount** | [**BigDecimal**](BigDecimal.md) | The amount of the fee in percents applied to percentSource |  [optional]



## Enum: AmountCalculationMethodEnum

Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
LOAN_AMOUNT_PERCENTAGE | &quot;LOAN_AMOUNT_PERCENTAGE&quot;
REPAYMENT_PRINCIPAL_AMOUNT_PERCENTAGE | &quot;REPAYMENT_PRINCIPAL_AMOUNT_PERCENTAGE&quot;
LOAN_AMOUNT_PERCENTAGE_NUMBER_OF_INSTALLMENTS | &quot;LOAN_AMOUNT_PERCENTAGE_NUMBER_OF_INSTALLMENTS&quot;
FLAT_NUMBER_OF_INSTALLMENTS | &quot;FLAT_NUMBER_OF_INSTALLMENTS&quot;



## Enum: TriggerEnum

Name | Value
---- | -----
MANUAL | &quot;MANUAL&quot;
DISBURSEMENT | &quot;DISBURSEMENT&quot;
CAPITALIZED_DISBURSEMENT | &quot;CAPITALIZED_DISBURSEMENT&quot;
UPFRONT_DISBURSEMENT | &quot;UPFRONT_DISBURSEMENT&quot;
LATE_REPAYMENT | &quot;LATE_REPAYMENT&quot;
MONTHLY_FEE | &quot;MONTHLY_FEE&quot;
PAYMENT_DUE | &quot;PAYMENT_DUE&quot;
PAYMENT_DUE_APPLIED_ON_DUE_DATES | &quot;PAYMENT_DUE_APPLIED_ON_DUE_DATES&quot;
ARBITRARY | &quot;ARBITRARY&quot;



## Enum: FeeApplicationEnum

Name | Value
---- | -----
REQUIRED | &quot;REQUIRED&quot;
OPTIONAL | &quot;OPTIONAL&quot;



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;ACTIVE&quot;
INACTIVE | &quot;INACTIVE&quot;



## Enum: ApplyDateMethodEnum

Name | Value
---- | -----
MONTHLY_FROM_ACTIVATION | &quot;MONTHLY_FROM_ACTIVATION&quot;
FIRST_OF_EVERY_MONTH | &quot;FIRST_OF_EVERY_MONTH&quot;



