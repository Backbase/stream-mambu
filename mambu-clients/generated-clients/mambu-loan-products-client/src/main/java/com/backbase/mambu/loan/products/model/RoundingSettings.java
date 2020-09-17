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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Defines the rounding settings used in the loan computation.
 */
@ApiModel(description = "Defines the rounding settings used in the loan computation.")
@JsonPropertyOrder({
  RoundingSettings.JSON_PROPERTY_ROUNDING_REPAYMENT_SCHEDULE_METHOD,
  RoundingSettings.JSON_PROPERTY_REPAYMENT_CURRENCY_ROUNDING,
  RoundingSettings.JSON_PROPERTY_REPAYMENT_ELEMENTS_ROUNDING_METHOD
})

public class RoundingSettings {
  /**
   * Specifies the rounding repayment schedule method.
   */
  public enum RoundingRepaymentScheduleMethodEnum {
    NO_ROUNDING("NO_ROUNDING"),
    
    ROUND_REMAINDER_INTO_LAST_REPAYMENT("ROUND_REMAINDER_INTO_LAST_REPAYMENT"),
    
    ROUND_PRINCIPAL_AND_INTEREST_REMAINDER_INTO_LAST_REPAYMENT("ROUND_PRINCIPAL_AND_INTEREST_REMAINDER_INTO_LAST_REPAYMENT");

    private String value;

    RoundingRepaymentScheduleMethodEnum(String value) {
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
    public static RoundingRepaymentScheduleMethodEnum fromValue(String value) {
      for (RoundingRepaymentScheduleMethodEnum b : RoundingRepaymentScheduleMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROUNDING_REPAYMENT_SCHEDULE_METHOD = "roundingRepaymentScheduleMethod";
  private RoundingRepaymentScheduleMethodEnum roundingRepaymentScheduleMethod;

  /**
   * Specifies the repayment currency rounding method.
   */
  public enum RepaymentCurrencyRoundingEnum {
    NO_ROUNDING("NO_ROUNDING"),
    
    ROUND_TO_NEAREST_WHOLE_UNIT("ROUND_TO_NEAREST_WHOLE_UNIT"),
    
    ROUND_UP_TO_NEAREST_WHOLE_UNIT("ROUND_UP_TO_NEAREST_WHOLE_UNIT");

    private String value;

    RepaymentCurrencyRoundingEnum(String value) {
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
    public static RepaymentCurrencyRoundingEnum fromValue(String value) {
      for (RepaymentCurrencyRoundingEnum b : RepaymentCurrencyRoundingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPAYMENT_CURRENCY_ROUNDING = "repaymentCurrencyRounding";
  private RepaymentCurrencyRoundingEnum repaymentCurrencyRounding;

  /**
   * Determines how the repayment currency rounding is handled on each element from the schedule.
   */
  public enum RepaymentElementsRoundingMethodEnum {
    NO_ROUNDING("NO_ROUNDING"),
    
    ROUND_ALL("ROUND_ALL"),
    
    PAYMENT_DUE("PAYMENT_DUE");

    private String value;

    RepaymentElementsRoundingMethodEnum(String value) {
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
    public static RepaymentElementsRoundingMethodEnum fromValue(String value) {
      for (RepaymentElementsRoundingMethodEnum b : RepaymentElementsRoundingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPAYMENT_ELEMENTS_ROUNDING_METHOD = "repaymentElementsRoundingMethod";
  private RepaymentElementsRoundingMethodEnum repaymentElementsRoundingMethod;


  public RoundingSettings roundingRepaymentScheduleMethod(RoundingRepaymentScheduleMethodEnum roundingRepaymentScheduleMethod) {
    
    this.roundingRepaymentScheduleMethod = roundingRepaymentScheduleMethod;
    return this;
  }

   /**
   * Specifies the rounding repayment schedule method.
   * @return roundingRepaymentScheduleMethod
  **/
  @ApiModelProperty(required = true, value = "Specifies the rounding repayment schedule method.")
  @JsonProperty(JSON_PROPERTY_ROUNDING_REPAYMENT_SCHEDULE_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RoundingRepaymentScheduleMethodEnum getRoundingRepaymentScheduleMethod() {
    return roundingRepaymentScheduleMethod;
  }


  public void setRoundingRepaymentScheduleMethod(RoundingRepaymentScheduleMethodEnum roundingRepaymentScheduleMethod) {
    this.roundingRepaymentScheduleMethod = roundingRepaymentScheduleMethod;
  }


  public RoundingSettings repaymentCurrencyRounding(RepaymentCurrencyRoundingEnum repaymentCurrencyRounding) {
    
    this.repaymentCurrencyRounding = repaymentCurrencyRounding;
    return this;
  }

   /**
   * Specifies the repayment currency rounding method.
   * @return repaymentCurrencyRounding
  **/
  @ApiModelProperty(required = true, value = "Specifies the repayment currency rounding method.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_CURRENCY_ROUNDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RepaymentCurrencyRoundingEnum getRepaymentCurrencyRounding() {
    return repaymentCurrencyRounding;
  }


  public void setRepaymentCurrencyRounding(RepaymentCurrencyRoundingEnum repaymentCurrencyRounding) {
    this.repaymentCurrencyRounding = repaymentCurrencyRounding;
  }


  public RoundingSettings repaymentElementsRoundingMethod(RepaymentElementsRoundingMethodEnum repaymentElementsRoundingMethod) {
    
    this.repaymentElementsRoundingMethod = repaymentElementsRoundingMethod;
    return this;
  }

   /**
   * Determines how the repayment currency rounding is handled on each element from the schedule.
   * @return repaymentElementsRoundingMethod
  **/
  @ApiModelProperty(required = true, value = "Determines how the repayment currency rounding is handled on each element from the schedule.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_ELEMENTS_ROUNDING_METHOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RepaymentElementsRoundingMethodEnum getRepaymentElementsRoundingMethod() {
    return repaymentElementsRoundingMethod;
  }


  public void setRepaymentElementsRoundingMethod(RepaymentElementsRoundingMethodEnum repaymentElementsRoundingMethod) {
    this.repaymentElementsRoundingMethod = repaymentElementsRoundingMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoundingSettings roundingSettings = (RoundingSettings) o;
    return Objects.equals(this.roundingRepaymentScheduleMethod, roundingSettings.roundingRepaymentScheduleMethod) &&
        Objects.equals(this.repaymentCurrencyRounding, roundingSettings.repaymentCurrencyRounding) &&
        Objects.equals(this.repaymentElementsRoundingMethod, roundingSettings.repaymentElementsRoundingMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roundingRepaymentScheduleMethod, repaymentCurrencyRounding, repaymentElementsRoundingMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoundingSettings {\n");
    sb.append("    roundingRepaymentScheduleMethod: ").append(toIndentedString(roundingRepaymentScheduleMethod)).append("\n");
    sb.append("    repaymentCurrencyRounding: ").append(toIndentedString(repaymentCurrencyRounding)).append("\n");
    sb.append("    repaymentElementsRoundingMethod: ").append(toIndentedString(repaymentElementsRoundingMethod)).append("\n");
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

