/*
 * loans
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.loans.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The prepayment settings, holds all prepayment properties.
 */
@ApiModel(description = "The prepayment settings, holds all prepayment properties.")
@JsonPropertyOrder({
  PrepaymentSettings.JSON_PROPERTY_ELEMENTS_RECALCULATION_METHOD,
  PrepaymentSettings.JSON_PROPERTY_PRINCIPAL_PAID_INSTALLMENT_STATUS,
  PrepaymentSettings.JSON_PROPERTY_PREPAYMENT_RECALCULATION_METHOD,
  PrepaymentSettings.JSON_PROPERTY_APPLY_INTEREST_ON_PREPAYMENT_METHOD
})

public class PrepaymentSettings {
  /**
   * The elements recalculation method, indicates how the declining balance with equal installments repayments are recalculated.
   */
  public enum ElementsRecalculationMethodEnum {
    PRINCIPAL_EXPECTED_FIXED("PRINCIPAL_EXPECTED_FIXED"),
    
    TOTAL_EXPECTED_FIXED("TOTAL_EXPECTED_FIXED");

    private String value;

    ElementsRecalculationMethodEnum(String value) {
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
    public static ElementsRecalculationMethodEnum fromValue(String value) {
      for (ElementsRecalculationMethodEnum b : ElementsRecalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ELEMENTS_RECALCULATION_METHOD = "elementsRecalculationMethod";
  private ElementsRecalculationMethodEnum elementsRecalculationMethod;

  /**
   * Installment status for the case when principal is paid off (copied from loan product).
   */
  public enum PrincipalPaidInstallmentStatusEnum {
    PARTIALLY_PAID("PARTIALLY_PAID"),
    
    PAID("PAID"),
    
    ORIGINAL_TOTAL_EXPECTED_PAID("ORIGINAL_TOTAL_EXPECTED_PAID");

    private String value;

    PrincipalPaidInstallmentStatusEnum(String value) {
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
    public static PrincipalPaidInstallmentStatusEnum fromValue(String value) {
      for (PrincipalPaidInstallmentStatusEnum b : PrincipalPaidInstallmentStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRINCIPAL_PAID_INSTALLMENT_STATUS = "principalPaidInstallmentStatus";
  private PrincipalPaidInstallmentStatusEnum principalPaidInstallmentStatus;

  /**
   * Prepayment recalculation method copied from the loan product on which this account is based.
   */
  public enum PrepaymentRecalculationMethodEnum {
    NO_RECALCULATION("NO_RECALCULATION"),
    
    RESCHEDULE_REMAINING_REPAYMENTS("RESCHEDULE_REMAINING_REPAYMENTS"),
    
    RECALCULATE_SCHEDULE_KEEP_SAME_NUMBER_OF_TERMS("RECALCULATE_SCHEDULE_KEEP_SAME_NUMBER_OF_TERMS"),
    
    RECALCULATE_SCHEDULE_KEEP_SAME_PRINCIPAL_AMOUNT("RECALCULATE_SCHEDULE_KEEP_SAME_PRINCIPAL_AMOUNT"),
    
    RECALCULATE_SCHEDULE_KEEP_SAME_TOTAL_REPAYMENT_AMOUNT("RECALCULATE_SCHEDULE_KEEP_SAME_TOTAL_REPAYMENT_AMOUNT"),
    
    REDUCE_AMOUNT_PER_INSTALLMENT("REDUCE_AMOUNT_PER_INSTALLMENT"),
    
    REDUCE_NUMBER_OF_INSTALLMENTS("REDUCE_NUMBER_OF_INSTALLMENTS"),
    
    REDUCE_NUMBER_OF_INSTALLMENTS_NEW("REDUCE_NUMBER_OF_INSTALLMENTS_NEW");

    private String value;

    PrepaymentRecalculationMethodEnum(String value) {
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
    public static PrepaymentRecalculationMethodEnum fromValue(String value) {
      for (PrepaymentRecalculationMethodEnum b : PrepaymentRecalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PREPAYMENT_RECALCULATION_METHOD = "prepaymentRecalculationMethod";
  private PrepaymentRecalculationMethodEnum prepaymentRecalculationMethod;

  /**
   * Apply interest on prepayment method copied from loan product on which this account is based.
   */
  public enum ApplyInterestOnPrepaymentMethodEnum {
    AUTOMATIC("AUTOMATIC"),
    
    MANUAL("MANUAL");

    private String value;

    ApplyInterestOnPrepaymentMethodEnum(String value) {
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
    public static ApplyInterestOnPrepaymentMethodEnum fromValue(String value) {
      for (ApplyInterestOnPrepaymentMethodEnum b : ApplyInterestOnPrepaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLY_INTEREST_ON_PREPAYMENT_METHOD = "applyInterestOnPrepaymentMethod";
  private ApplyInterestOnPrepaymentMethodEnum applyInterestOnPrepaymentMethod;


  public PrepaymentSettings elementsRecalculationMethod(ElementsRecalculationMethodEnum elementsRecalculationMethod) {
    
    this.elementsRecalculationMethod = elementsRecalculationMethod;
    return this;
  }

   /**
   * The elements recalculation method, indicates how the declining balance with equal installments repayments are recalculated.
   * @return elementsRecalculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The elements recalculation method, indicates how the declining balance with equal installments repayments are recalculated.")
  @JsonProperty(JSON_PROPERTY_ELEMENTS_RECALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ElementsRecalculationMethodEnum getElementsRecalculationMethod() {
    return elementsRecalculationMethod;
  }


  public void setElementsRecalculationMethod(ElementsRecalculationMethodEnum elementsRecalculationMethod) {
    this.elementsRecalculationMethod = elementsRecalculationMethod;
  }


  public PrepaymentSettings principalPaidInstallmentStatus(PrincipalPaidInstallmentStatusEnum principalPaidInstallmentStatus) {
    
    this.principalPaidInstallmentStatus = principalPaidInstallmentStatus;
    return this;
  }

   /**
   * Installment status for the case when principal is paid off (copied from loan product).
   * @return principalPaidInstallmentStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Installment status for the case when principal is paid off (copied from loan product).")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PAID_INSTALLMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrincipalPaidInstallmentStatusEnum getPrincipalPaidInstallmentStatus() {
    return principalPaidInstallmentStatus;
  }


  public void setPrincipalPaidInstallmentStatus(PrincipalPaidInstallmentStatusEnum principalPaidInstallmentStatus) {
    this.principalPaidInstallmentStatus = principalPaidInstallmentStatus;
  }


  public PrepaymentSettings prepaymentRecalculationMethod(PrepaymentRecalculationMethodEnum prepaymentRecalculationMethod) {
    
    this.prepaymentRecalculationMethod = prepaymentRecalculationMethod;
    return this;
  }

   /**
   * Prepayment recalculation method copied from the loan product on which this account is based.
   * @return prepaymentRecalculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Prepayment recalculation method copied from the loan product on which this account is based.")
  @JsonProperty(JSON_PROPERTY_PREPAYMENT_RECALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrepaymentRecalculationMethodEnum getPrepaymentRecalculationMethod() {
    return prepaymentRecalculationMethod;
  }


  public void setPrepaymentRecalculationMethod(PrepaymentRecalculationMethodEnum prepaymentRecalculationMethod) {
    this.prepaymentRecalculationMethod = prepaymentRecalculationMethod;
  }


  public PrepaymentSettings applyInterestOnPrepaymentMethod(ApplyInterestOnPrepaymentMethodEnum applyInterestOnPrepaymentMethod) {
    
    this.applyInterestOnPrepaymentMethod = applyInterestOnPrepaymentMethod;
    return this;
  }

   /**
   * Apply interest on prepayment method copied from loan product on which this account is based.
   * @return applyInterestOnPrepaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Apply interest on prepayment method copied from loan product on which this account is based.")
  @JsonProperty(JSON_PROPERTY_APPLY_INTEREST_ON_PREPAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplyInterestOnPrepaymentMethodEnum getApplyInterestOnPrepaymentMethod() {
    return applyInterestOnPrepaymentMethod;
  }


  public void setApplyInterestOnPrepaymentMethod(ApplyInterestOnPrepaymentMethodEnum applyInterestOnPrepaymentMethod) {
    this.applyInterestOnPrepaymentMethod = applyInterestOnPrepaymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaymentSettings prepaymentSettings = (PrepaymentSettings) o;
    return Objects.equals(this.elementsRecalculationMethod, prepaymentSettings.elementsRecalculationMethod) &&
        Objects.equals(this.principalPaidInstallmentStatus, prepaymentSettings.principalPaidInstallmentStatus) &&
        Objects.equals(this.prepaymentRecalculationMethod, prepaymentSettings.prepaymentRecalculationMethod) &&
        Objects.equals(this.applyInterestOnPrepaymentMethod, prepaymentSettings.applyInterestOnPrepaymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementsRecalculationMethod, principalPaidInstallmentStatus, prepaymentRecalculationMethod, applyInterestOnPrepaymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaymentSettings {\n");
    sb.append("    elementsRecalculationMethod: ").append(toIndentedString(elementsRecalculationMethod)).append("\n");
    sb.append("    principalPaidInstallmentStatus: ").append(toIndentedString(principalPaidInstallmentStatus)).append("\n");
    sb.append("    prepaymentRecalculationMethod: ").append(toIndentedString(prepaymentRecalculationMethod)).append("\n");
    sb.append("    applyInterestOnPrepaymentMethod: ").append(toIndentedString(applyInterestOnPrepaymentMethod)).append("\n");
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

