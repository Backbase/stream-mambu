

# PrepaymentSettings

The prepayment settings, holds all prepayment properties.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elementsRecalculationMethod** | [**ElementsRecalculationMethodEnum**](#ElementsRecalculationMethodEnum) | The elements recalculation method, indicates how the declining balance with equal installments repayments are recalculated. |  [optional]
**principalPaidInstallmentStatus** | [**PrincipalPaidInstallmentStatusEnum**](#PrincipalPaidInstallmentStatusEnum) | Installment status for the case when principal is paid off (copied from loan product). |  [optional]
**prepaymentRecalculationMethod** | [**PrepaymentRecalculationMethodEnum**](#PrepaymentRecalculationMethodEnum) | Prepayment recalculation method copied from the loan product on which this account is based. |  [optional]
**applyInterestOnPrepaymentMethod** | [**ApplyInterestOnPrepaymentMethodEnum**](#ApplyInterestOnPrepaymentMethodEnum) | Apply interest on prepayment method copied from loan product on which this account is based. |  [optional]



## Enum: ElementsRecalculationMethodEnum

Name | Value
---- | -----
PRINCIPAL_EXPECTED_FIXED | &quot;PRINCIPAL_EXPECTED_FIXED&quot;
TOTAL_EXPECTED_FIXED | &quot;TOTAL_EXPECTED_FIXED&quot;



## Enum: PrincipalPaidInstallmentStatusEnum

Name | Value
---- | -----
PARTIALLY_PAID | &quot;PARTIALLY_PAID&quot;
PAID | &quot;PAID&quot;
ORIGINAL_TOTAL_EXPECTED_PAID | &quot;ORIGINAL_TOTAL_EXPECTED_PAID&quot;



## Enum: PrepaymentRecalculationMethodEnum

Name | Value
---- | -----
NO_RECALCULATION | &quot;NO_RECALCULATION&quot;
RESCHEDULE_REMAINING_REPAYMENTS | &quot;RESCHEDULE_REMAINING_REPAYMENTS&quot;
RECALCULATE_SCHEDULE_KEEP_SAME_NUMBER_OF_TERMS | &quot;RECALCULATE_SCHEDULE_KEEP_SAME_NUMBER_OF_TERMS&quot;
RECALCULATE_SCHEDULE_KEEP_SAME_PRINCIPAL_AMOUNT | &quot;RECALCULATE_SCHEDULE_KEEP_SAME_PRINCIPAL_AMOUNT&quot;
RECALCULATE_SCHEDULE_KEEP_SAME_TOTAL_REPAYMENT_AMOUNT | &quot;RECALCULATE_SCHEDULE_KEEP_SAME_TOTAL_REPAYMENT_AMOUNT&quot;
REDUCE_AMOUNT_PER_INSTALLMENT | &quot;REDUCE_AMOUNT_PER_INSTALLMENT&quot;
REDUCE_NUMBER_OF_INSTALLMENTS | &quot;REDUCE_NUMBER_OF_INSTALLMENTS&quot;
REDUCE_NUMBER_OF_INSTALLMENTS_NEW | &quot;REDUCE_NUMBER_OF_INSTALLMENTS_NEW&quot;



## Enum: ApplyInterestOnPrepaymentMethodEnum

Name | Value
---- | -----
AUTOMATIC | &quot;AUTOMATIC&quot;
MANUAL | &quot;MANUAL&quot;



