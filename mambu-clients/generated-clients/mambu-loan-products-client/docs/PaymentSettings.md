

# PaymentSettings

Defines the payment settings for the loan product and for loans crated based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prepaymentSettings** | [**ProductPrepaymentSettings**](ProductPrepaymentSettings.md) |  |  [optional]
**principalPaymentSettings** | [**PrincipalPaymentProductSettings**](PrincipalPaymentProductSettings.md) |  |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | The payment method. Represents the interest payment method that determines whether the payments are made Horizontally (on the Repayments) or Vertically (on the Loan Account) | 
**latePaymentsRecalculationMethod** | [**LatePaymentsRecalculationMethodEnum**](#LatePaymentsRecalculationMethodEnum) | Recalculate the schedule when late payments are posted on dynamic Equal Installments loans. | 
**repaymentAllocationOrder** | [**List&lt;RepaymentAllocationOrderEnum&gt;**](#List&lt;RepaymentAllocationOrderEnum&gt;) | A list of basic repayment allocation elements such as the principal, interest &amp; fees. | 
**amortizationMethod** | [**AmortizationMethodEnum**](#AmortizationMethodEnum) | Payments Method used by loan accounts for repayments schedule generation. |  [optional]



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



## Enum: List&lt;RepaymentAllocationOrderEnum&gt;

Name | Value
---- | -----
PRINCIPAL | &quot;PRINCIPAL&quot;
INTEREST | &quot;INTEREST&quot;
FEE | &quot;FEE&quot;
PENALTY | &quot;PENALTY&quot;



## Enum: AmortizationMethodEnum

Name | Value
---- | -----
STANDARD_PAYMENTS | &quot;STANDARD_PAYMENTS&quot;
BALLOON_PAYMENTS | &quot;BALLOON_PAYMENTS&quot;
OPTIMIZED_PAYMENTS | &quot;OPTIMIZED_PAYMENTS&quot;
PAYMENT_PLAN | &quot;PAYMENT_PLAN&quot;



