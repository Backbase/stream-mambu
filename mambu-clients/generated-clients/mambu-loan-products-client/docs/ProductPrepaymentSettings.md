

# ProductPrepaymentSettings

Defines the prepayment settings for the product
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**futurePaymentsAcceptance** | [**FuturePaymentsAcceptanceEnum**](#FuturePaymentsAcceptanceEnum) | Shows whether the future payments are allowed or not for this product (repayment transactions with entry date set in the future) | 
**applyInterestOnPrepaymentMethod** | [**ApplyInterestOnPrepaymentMethodEnum**](#ApplyInterestOnPrepaymentMethodEnum) | Whether the interest on prepayment is applied manual or automatic. |  [optional]
**prepaymentAcceptance** | [**PrepaymentAcceptanceEnum**](#PrepaymentAcceptanceEnum) | Shows whether the pre-payments are allowed or not for this product. |  [optional]
**elementsRecalculationMethod** | [**ElementsRecalculationMethodEnum**](#ElementsRecalculationMethodEnum) | The elements recalculation method, indicates how the declining balance with equal installments repayments are recalculated |  [optional]
**principalPaidInstallmentStatus** | [**PrincipalPaidInstallmentStatusEnum**](#PrincipalPaidInstallmentStatusEnum) | Installment status for the case when principal is paid off (copied from loan product) |  [optional]
**prepaymentRecalculationMethod** | [**PrepaymentRecalculationMethodEnum**](#PrepaymentRecalculationMethodEnum) | Prepayment recalculation method copied from the loan product on which this account is based |  [optional]



## Enum: FuturePaymentsAcceptanceEnum

Name | Value
---- | -----
NO_FUTURE_PAYMENTS | &quot;NO_FUTURE_PAYMENTS&quot;
ACCEPT_FUTURE_PAYMENTS | &quot;ACCEPT_FUTURE_PAYMENTS&quot;
ACCEPT_OVERPAYMENTS | &quot;ACCEPT_OVERPAYMENTS&quot;



## Enum: ApplyInterestOnPrepaymentMethodEnum

Name | Value
---- | -----
AUTOMATIC | &quot;AUTOMATIC&quot;
MANUAL | &quot;MANUAL&quot;



## Enum: PrepaymentAcceptanceEnum

Name | Value
---- | -----
ACCEPT_PREPAYMENTS | &quot;ACCEPT_PREPAYMENTS&quot;
NO_PREPAYMENTS | &quot;NO_PREPAYMENTS&quot;



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



