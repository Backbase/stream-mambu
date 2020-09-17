/*
 * deposits
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.deposit.accounts.model;

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
 * Groups all fields related to internal controls
 */
@ApiModel(description = "Groups all fields related to internal controls")
@JsonPropertyOrder({
  DepositAccountInternalControls.JSON_PROPERTY_RECOMMENDED_DEPOSIT_AMOUNT,
  DepositAccountInternalControls.JSON_PROPERTY_TARGET_AMOUNT,
  DepositAccountInternalControls.JSON_PROPERTY_MAX_WITHDRAWAL_AMOUNT
})

public class DepositAccountInternalControls {
  public static final String JSON_PROPERTY_RECOMMENDED_DEPOSIT_AMOUNT = "recommendedDepositAmount";
  private BigDecimal recommendedDepositAmount;

  public static final String JSON_PROPERTY_TARGET_AMOUNT = "targetAmount";
  private BigDecimal targetAmount;

  public static final String JSON_PROPERTY_MAX_WITHDRAWAL_AMOUNT = "maxWithdrawalAmount";
  private BigDecimal maxWithdrawalAmount;


  public DepositAccountInternalControls recommendedDepositAmount(BigDecimal recommendedDepositAmount) {
    
    this.recommendedDepositAmount = recommendedDepositAmount;
    return this;
  }

   /**
   * Recommended amount for a deposit
   * @return recommendedDepositAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recommended amount for a deposit")
  @JsonProperty(JSON_PROPERTY_RECOMMENDED_DEPOSIT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRecommendedDepositAmount() {
    return recommendedDepositAmount;
  }


  public void setRecommendedDepositAmount(BigDecimal recommendedDepositAmount) {
    this.recommendedDepositAmount = recommendedDepositAmount;
  }


  public DepositAccountInternalControls targetAmount(BigDecimal targetAmount) {
    
    this.targetAmount = targetAmount;
    return this;
  }

   /**
   * The target amount (the monthly/weekly/daily deposits should/may lead towards a savings goal)
   * @return targetAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target amount (the monthly/weekly/daily deposits should/may lead towards a savings goal)")
  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTargetAmount() {
    return targetAmount;
  }


  public void setTargetAmount(BigDecimal targetAmount) {
    this.targetAmount = targetAmount;
  }


  public DepositAccountInternalControls maxWithdrawalAmount(BigDecimal maxWithdrawalAmount) {
    
    this.maxWithdrawalAmount = maxWithdrawalAmount;
    return this;
  }

   /**
   * The maximum amount allowed for a withdrawal
   * @return maxWithdrawalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum amount allowed for a withdrawal")
  @JsonProperty(JSON_PROPERTY_MAX_WITHDRAWAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxWithdrawalAmount() {
    return maxWithdrawalAmount;
  }


  public void setMaxWithdrawalAmount(BigDecimal maxWithdrawalAmount) {
    this.maxWithdrawalAmount = maxWithdrawalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountInternalControls depositAccountInternalControls = (DepositAccountInternalControls) o;
    return Objects.equals(this.recommendedDepositAmount, depositAccountInternalControls.recommendedDepositAmount) &&
        Objects.equals(this.targetAmount, depositAccountInternalControls.targetAmount) &&
        Objects.equals(this.maxWithdrawalAmount, depositAccountInternalControls.maxWithdrawalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedDepositAmount, targetAmount, maxWithdrawalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountInternalControls {\n");
    sb.append("    recommendedDepositAmount: ").append(toIndentedString(recommendedDepositAmount)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    maxWithdrawalAmount: ").append(toIndentedString(maxWithdrawalAmount)).append("\n");
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
