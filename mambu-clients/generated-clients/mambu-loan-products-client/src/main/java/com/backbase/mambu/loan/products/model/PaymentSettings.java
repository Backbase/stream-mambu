/*
 * loanproducts
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.loan.products.model;

import java.util.Objects;
import java.util.Arrays;
import com.backbase.mambu.loan.products.model.PrincipalPaymentProductSettings;
import com.backbase.mambu.loan.products.model.ProductPrepaymentSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Defines the payment settings for the loan product and for loans crated based on this product.
 */
@ApiModel(description = "Defines the payment settings for the loan product and for loans crated based on this product.")
@JsonPropertyOrder({
  PaymentSettings.JSON_PROPERTY_PREPAYMENT_SETTINGS,
  PaymentSettings.JSON_PROPERTY_PRINCIPAL_PAYMENT_SETTINGS,
  PaymentSettings.JSON_PROPERTY_PAYMENT_METHOD,
  PaymentSettings.JSON_PROPERTY_LATE_PAYMENTS_RECALCULATION_METHOD,
  PaymentSettings.JSON_PROPERTY_REPAYMENT_ALLOCATION_ORDER,
  PaymentSettings.JSON_PROPERTY_AMORTIZATION_METHOD
})

public class PaymentSettings {
  public static final String JSON_PROPERTY_PREPAYMENT_SETTINGS = "prepaymentSettings";
  private ProductPrepaymentSettings prepaymentSettings;

  public static final String JSON_PROPERTY_PRINCIPAL_PAYMENT_SETTINGS = "principalPaymentSettings";
  private PrincipalPaymentProductSettings principalPaymentSettings;

  /**
   * The payment method. Represents the interest payment method that determines whether the payments are made Horizontally (on the Repayments) or Vertically (on the Loan Account)
   */
  public enum PaymentMethodEnum {
    HORIZONTAL("HORIZONTAL"),
    
    VERTICAL("VERTICAL");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PaymentMethodEnum fromValue(String value) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_METHOD = "paymentMethod";
  private PaymentMethodEnum paymentMethod;

  /**
   * Recalculate the schedule when late payments are posted on dynamic Equal Installments loans.
   */
  public enum LatePaymentsRecalculationMethodEnum {
    OVERDUE_INSTALLMENTS_INCREASE("OVERDUE_INSTALLMENTS_INCREASE"),
    
    LAST_INSTALLMENT_INCREASE("LAST_INSTALLMENT_INCREASE");

    private String value;

    LatePaymentsRecalculationMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LatePaymentsRecalculationMethodEnum fromValue(String value) {
      for (LatePaymentsRecalculationMethodEnum b : LatePaymentsRecalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LATE_PAYMENTS_RECALCULATION_METHOD = "latePaymentsRecalculationMethod";
  private LatePaymentsRecalculationMethodEnum latePaymentsRecalculationMethod;

  /**
   * Gets or Sets repaymentAllocationOrder
   */
  public enum RepaymentAllocationOrderEnum {
    PRINCIPAL("PRINCIPAL"),
    
    INTEREST("INTEREST"),
    
    FEE("FEE"),
    
    PENALTY("PENALTY");

    private String value;

    RepaymentAllocationOrderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RepaymentAllocationOrderEnum fromValue(String value) {
      for (RepaymentAllocationOrderEnum b : RepaymentAllocationOrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPAYMENT_ALLOCATION_ORDER = "repaymentAllocationOrder";
  private List<RepaymentAllocationOrderEnum> repaymentAllocationOrder = new ArrayList<>();

  /**
   * Payments Method used by loan accounts for repayments schedule generation.
   */
  public enum AmortizationMethodEnum {
    STANDARD_PAYMENTS("STANDARD_PAYMENTS"),
    
    BALLOON_PAYMENTS("BALLOON_PAYMENTS"),
    
    OPTIMIZED_PAYMENTS("OPTIMIZED_PAYMENTS"),
    
    PAYMENT_PLAN("PAYMENT_PLAN");

    private String value;

    AmortizationMethodEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AmortizationMethodEnum fromValue(String value) {
      for (AmortizationMethodEnum b : AmortizationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AMORTIZATION_METHOD = "amortizationMethod";
  private AmortizationMethodEnum amortizationMethod;


  public PaymentSettings prepaymentSettings(ProductPrepaymentSettings prepaymentSettings) {
    
    this.prepaymentSettings = prepaymentSettings;
    return this;
  }

   /**
   * Get prepaymentSettings
   * @return prepaymentSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREPAYMENT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProductPrepaymentSettings getPrepaymentSettings() {
    return prepaymentSettings;
  }


  public void setPrepaymentSettings(ProductPrepaymentSettings prepaymentSettings) {
    this.prepaymentSettings = prepaymentSettings;
  }


  public PaymentSettings principalPaymentSettings(PrincipalPaymentProductSettings principalPaymentSettings) {
    
    this.principalPaymentSettings = principalPaymentSettings;
    return this;
  }

   /**
   * Get principalPaymentSettings
   * @return principalPaymentSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PAYMENT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrincipalPaymentProductSettings getPrincipalPaymentSettings() {
    return principalPaymentSettings;
  }


  public void setPrincipalPaymentSettings(PrincipalPaymentProductSettings principalPaymentSettings) {
    this.principalPaymentSettings = principalPaymentSettings;
  }


  public PaymentSettings paymentMethod(PaymentMethodEnum paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The payment method. Represents the interest payment method that determines whether the payments are made Horizontally (on the Repayments) or Vertically (on the Loan Account)
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "The payment method. Represents the interest payment method that determines whether the payments are made Horizontally (on the Repayments) or Vertically (on the Loan Account)")
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }


  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentSettings latePaymentsRecalculationMethod(LatePaymentsRecalculationMethodEnum latePaymentsRecalculationMethod) {
    
    this.latePaymentsRecalculationMethod = latePaymentsRecalculationMethod;
    return this;
  }

   /**
   * Recalculate the schedule when late payments are posted on dynamic Equal Installments loans.
   * @return latePaymentsRecalculationMethod
  **/
  @ApiModelProperty(required = true, value = "Recalculate the schedule when late payments are posted on dynamic Equal Installments loans.")
  @JsonProperty(JSON_PROPERTY_LATE_PAYMENTS_RECALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LatePaymentsRecalculationMethodEnum getLatePaymentsRecalculationMethod() {
    return latePaymentsRecalculationMethod;
  }


  public void setLatePaymentsRecalculationMethod(LatePaymentsRecalculationMethodEnum latePaymentsRecalculationMethod) {
    this.latePaymentsRecalculationMethod = latePaymentsRecalculationMethod;
  }


  public PaymentSettings repaymentAllocationOrder(List<RepaymentAllocationOrderEnum> repaymentAllocationOrder) {
    
    this.repaymentAllocationOrder = repaymentAllocationOrder;
    return this;
  }

  public PaymentSettings addRepaymentAllocationOrderItem(RepaymentAllocationOrderEnum repaymentAllocationOrderItem) {
    this.repaymentAllocationOrder.add(repaymentAllocationOrderItem);
    return this;
  }

   /**
   * A list of basic repayment allocation elements such as the principal, interest &amp; fees.
   * @return repaymentAllocationOrder
  **/
  @ApiModelProperty(required = true, value = "A list of basic repayment allocation elements such as the principal, interest & fees.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_ALLOCATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<RepaymentAllocationOrderEnum> getRepaymentAllocationOrder() {
    return repaymentAllocationOrder;
  }


  public void setRepaymentAllocationOrder(List<RepaymentAllocationOrderEnum> repaymentAllocationOrder) {
    this.repaymentAllocationOrder = repaymentAllocationOrder;
  }


  public PaymentSettings amortizationMethod(AmortizationMethodEnum amortizationMethod) {
    
    this.amortizationMethod = amortizationMethod;
    return this;
  }

   /**
   * Payments Method used by loan accounts for repayments schedule generation.
   * @return amortizationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payments Method used by loan accounts for repayments schedule generation.")
  @JsonProperty(JSON_PROPERTY_AMORTIZATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmortizationMethodEnum getAmortizationMethod() {
    return amortizationMethod;
  }


  public void setAmortizationMethod(AmortizationMethodEnum amortizationMethod) {
    this.amortizationMethod = amortizationMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSettings paymentSettings = (PaymentSettings) o;
    return Objects.equals(this.prepaymentSettings, paymentSettings.prepaymentSettings) &&
        Objects.equals(this.principalPaymentSettings, paymentSettings.principalPaymentSettings) &&
        Objects.equals(this.paymentMethod, paymentSettings.paymentMethod) &&
        Objects.equals(this.latePaymentsRecalculationMethod, paymentSettings.latePaymentsRecalculationMethod) &&
        Objects.equals(this.repaymentAllocationOrder, paymentSettings.repaymentAllocationOrder) &&
        Objects.equals(this.amortizationMethod, paymentSettings.amortizationMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepaymentSettings, principalPaymentSettings, paymentMethod, latePaymentsRecalculationMethod, repaymentAllocationOrder, amortizationMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSettings {\n");
    sb.append("    prepaymentSettings: ").append(toIndentedString(prepaymentSettings)).append("\n");
    sb.append("    principalPaymentSettings: ").append(toIndentedString(principalPaymentSettings)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    latePaymentsRecalculationMethod: ").append(toIndentedString(latePaymentsRecalculationMethod)).append("\n");
    sb.append("    repaymentAllocationOrder: ").append(toIndentedString(repaymentAllocationOrder)).append("\n");
    sb.append("    amortizationMethod: ").append(toIndentedString(amortizationMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
