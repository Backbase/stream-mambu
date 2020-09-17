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
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The principal payment account settings, holds the required information for the principal payment process of an account.
 */
@ApiModel(description = "The principal payment account settings, holds the required information for the principal payment process of an account.")
@JsonPropertyOrder({
  PrincipalPaymentAccountSettings.JSON_PROPERTY_INCLUDE_INTEREST_IN_FLOOR_AMOUNT,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_TOTAL_DUE_PAYMENT,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_AMOUNT,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_PRINCIPAL_FLOOR_VALUE,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_PRINCIPAL_PAYMENT_METHOD,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_PERCENTAGE,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_INCLUDE_FEES_IN_FLOOR_AMOUNT,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_ENCODED_KEY,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_TOTAL_DUE_AMOUNT_FLOOR,
  PrincipalPaymentAccountSettings.JSON_PROPERTY_PRINCIPAL_CEILING_VALUE
})

public class PrincipalPaymentAccountSettings {
  public static final String JSON_PROPERTY_INCLUDE_INTEREST_IN_FLOOR_AMOUNT = "includeInterestInFloorAmount";
  private Boolean includeInterestInFloorAmount;

  /**
   * The method of total due payment for revolving credit
   */
  public enum TotalDuePaymentEnum {
    FLAT("FLAT"),
    
    OUTSTANDING_PRINCIPAL_PERCENTAGE("OUTSTANDING_PRINCIPAL_PERCENTAGE"),
    
    TOTAL_BALANCE_PERCENTAGE("TOTAL_BALANCE_PERCENTAGE");

    private String value;

    TotalDuePaymentEnum(String value) {
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
    public static TotalDuePaymentEnum fromValue(String value) {
      for (TotalDuePaymentEnum b : TotalDuePaymentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TOTAL_DUE_PAYMENT = "totalDuePayment";
  private TotalDuePaymentEnum totalDuePayment;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_PRINCIPAL_FLOOR_VALUE = "principalFloorValue";
  private BigDecimal principalFloorValue;

  /**
   * The method of principal payment for revolving credit.
   */
  public enum PrincipalPaymentMethodEnum {
    FLAT("FLAT"),
    
    OUTSTANDING_PRINCIPAL_PERCENTAGE("OUTSTANDING_PRINCIPAL_PERCENTAGE"),
    
    TOTAL_BALANCE_PERCENTAGE("TOTAL_BALANCE_PERCENTAGE");

    private String value;

    PrincipalPaymentMethodEnum(String value) {
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
    public static PrincipalPaymentMethodEnum fromValue(String value) {
      for (PrincipalPaymentMethodEnum b : PrincipalPaymentMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PRINCIPAL_PAYMENT_METHOD = "principalPaymentMethod";
  private PrincipalPaymentMethodEnum principalPaymentMethod;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private BigDecimal percentage;

  public static final String JSON_PROPERTY_INCLUDE_FEES_IN_FLOOR_AMOUNT = "includeFeesInFloorAmount";
  private Boolean includeFeesInFloorAmount;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_TOTAL_DUE_AMOUNT_FLOOR = "totalDueAmountFloor";
  private BigDecimal totalDueAmountFloor;

  public static final String JSON_PROPERTY_PRINCIPAL_CEILING_VALUE = "principalCeilingValue";
  private BigDecimal principalCeilingValue;


  public PrincipalPaymentAccountSettings includeInterestInFloorAmount(Boolean includeInterestInFloorAmount) {
    
    this.includeInterestInFloorAmount = includeInterestInFloorAmount;
    return this;
  }

   /**
   * Boolean flag, if true, the interest will be included along with the principal in the repayment floor amount, for a revolving credit account
   * @return includeInterestInFloorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean flag, if true, the interest will be included along with the principal in the repayment floor amount, for a revolving credit account")
  @JsonProperty(JSON_PROPERTY_INCLUDE_INTEREST_IN_FLOOR_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeInterestInFloorAmount() {
    return includeInterestInFloorAmount;
  }


  public void setIncludeInterestInFloorAmount(Boolean includeInterestInFloorAmount) {
    this.includeInterestInFloorAmount = includeInterestInFloorAmount;
  }


  public PrincipalPaymentAccountSettings totalDuePayment(TotalDuePaymentEnum totalDuePayment) {
    
    this.totalDuePayment = totalDuePayment;
    return this;
  }

   /**
   * The method of total due payment for revolving credit
   * @return totalDuePayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method of total due payment for revolving credit")
  @JsonProperty(JSON_PROPERTY_TOTAL_DUE_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TotalDuePaymentEnum getTotalDuePayment() {
    return totalDuePayment;
  }


  public void setTotalDuePayment(TotalDuePaymentEnum totalDuePayment) {
    this.totalDuePayment = totalDuePayment;
  }


  public PrincipalPaymentAccountSettings amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Fixed amount for being used for the repayments principal due.
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fixed amount for being used for the repayments principal due.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public PrincipalPaymentAccountSettings principalFloorValue(BigDecimal principalFloorValue) {
    
    this.principalFloorValue = principalFloorValue;
    return this;
  }

   /**
   * The minimum principal due amount a repayment made with this settings can have
   * @return principalFloorValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum principal due amount a repayment made with this settings can have")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_FLOOR_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrincipalFloorValue() {
    return principalFloorValue;
  }


  public void setPrincipalFloorValue(BigDecimal principalFloorValue) {
    this.principalFloorValue = principalFloorValue;
  }


  public PrincipalPaymentAccountSettings principalPaymentMethod(PrincipalPaymentMethodEnum principalPaymentMethod) {
    
    this.principalPaymentMethod = principalPaymentMethod;
    return this;
  }

   /**
   * The method of principal payment for revolving credit.
   * @return principalPaymentMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The method of principal payment for revolving credit.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_PAYMENT_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrincipalPaymentMethodEnum getPrincipalPaymentMethod() {
    return principalPaymentMethod;
  }


  public void setPrincipalPaymentMethod(PrincipalPaymentMethodEnum principalPaymentMethod) {
    this.principalPaymentMethod = principalPaymentMethod;
  }


  public PrincipalPaymentAccountSettings percentage(BigDecimal percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * Percentage of principal amount used for the repayments principal due.
   * @return percentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of principal amount used for the repayments principal due.")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPercentage() {
    return percentage;
  }


  public void setPercentage(BigDecimal percentage) {
    this.percentage = percentage;
  }


  public PrincipalPaymentAccountSettings includeFeesInFloorAmount(Boolean includeFeesInFloorAmount) {
    
    this.includeFeesInFloorAmount = includeFeesInFloorAmount;
    return this;
  }

   /**
   * Boolean flag, if true, the fees will be included along with the principal in the repayment floor amount, for a revolving credit account
   * @return includeFeesInFloorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean flag, if true, the fees will be included along with the principal in the repayment floor amount, for a revolving credit account")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FEES_IN_FLOOR_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFeesInFloorAmount() {
    return includeFeesInFloorAmount;
  }


  public void setIncludeFeesInFloorAmount(Boolean includeFeesInFloorAmount) {
    this.includeFeesInFloorAmount = includeFeesInFloorAmount;
  }


   /**
   * The encoded key of the principal payment base settings, auto generated, unique.
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the principal payment base settings, auto generated, unique.")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public PrincipalPaymentAccountSettings totalDueAmountFloor(BigDecimal totalDueAmountFloor) {
    
    this.totalDueAmountFloor = totalDueAmountFloor;
    return this;
  }

   /**
   * The minimum total due amount a repayment made with this settings can have
   * @return totalDueAmountFloor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum total due amount a repayment made with this settings can have")
  @JsonProperty(JSON_PROPERTY_TOTAL_DUE_AMOUNT_FLOOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTotalDueAmountFloor() {
    return totalDueAmountFloor;
  }


  public void setTotalDueAmountFloor(BigDecimal totalDueAmountFloor) {
    this.totalDueAmountFloor = totalDueAmountFloor;
  }


  public PrincipalPaymentAccountSettings principalCeilingValue(BigDecimal principalCeilingValue) {
    
    this.principalCeilingValue = principalCeilingValue;
    return this;
  }

   /**
   * The maximum principal due amount a repayment made with this settings can have
   * @return principalCeilingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum principal due amount a repayment made with this settings can have")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_CEILING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrincipalCeilingValue() {
    return principalCeilingValue;
  }


  public void setPrincipalCeilingValue(BigDecimal principalCeilingValue) {
    this.principalCeilingValue = principalCeilingValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrincipalPaymentAccountSettings principalPaymentAccountSettings = (PrincipalPaymentAccountSettings) o;
    return Objects.equals(this.includeInterestInFloorAmount, principalPaymentAccountSettings.includeInterestInFloorAmount) &&
        Objects.equals(this.totalDuePayment, principalPaymentAccountSettings.totalDuePayment) &&
        Objects.equals(this.amount, principalPaymentAccountSettings.amount) &&
        Objects.equals(this.principalFloorValue, principalPaymentAccountSettings.principalFloorValue) &&
        Objects.equals(this.principalPaymentMethod, principalPaymentAccountSettings.principalPaymentMethod) &&
        Objects.equals(this.percentage, principalPaymentAccountSettings.percentage) &&
        Objects.equals(this.includeFeesInFloorAmount, principalPaymentAccountSettings.includeFeesInFloorAmount) &&
        Objects.equals(this.encodedKey, principalPaymentAccountSettings.encodedKey) &&
        Objects.equals(this.totalDueAmountFloor, principalPaymentAccountSettings.totalDueAmountFloor) &&
        Objects.equals(this.principalCeilingValue, principalPaymentAccountSettings.principalCeilingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeInterestInFloorAmount, totalDuePayment, amount, principalFloorValue, principalPaymentMethod, percentage, includeFeesInFloorAmount, encodedKey, totalDueAmountFloor, principalCeilingValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrincipalPaymentAccountSettings {\n");
    sb.append("    includeInterestInFloorAmount: ").append(toIndentedString(includeInterestInFloorAmount)).append("\n");
    sb.append("    totalDuePayment: ").append(toIndentedString(totalDuePayment)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    principalFloorValue: ").append(toIndentedString(principalFloorValue)).append("\n");
    sb.append("    principalPaymentMethod: ").append(toIndentedString(principalPaymentMethod)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    includeFeesInFloorAmount: ").append(toIndentedString(includeFeesInFloorAmount)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    totalDueAmountFloor: ").append(toIndentedString(totalDueAmountFloor)).append("\n");
    sb.append("    principalCeilingValue: ").append(toIndentedString(principalCeilingValue)).append("\n");
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

