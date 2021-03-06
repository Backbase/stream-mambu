/*
 * depositproducts
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.deposit.products.model;

import java.util.Objects;
import java.util.Arrays;
import com.backbase.mambu.deposit.products.model.MonthAndDay;
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
 * Defines the interest payment settings for the deposit product and for deposits created based on this product
 */
@ApiModel(description = "Defines the interest payment settings for the deposit product and for deposits created based on this product")
@JsonPropertyOrder({
  InterestPaymentSettings.JSON_PROPERTY_INTEREST_PAYMENT_DATES,
  InterestPaymentSettings.JSON_PROPERTY_INTEREST_PAYMENT_POINT
})

public class InterestPaymentSettings {
  public static final String JSON_PROPERTY_INTEREST_PAYMENT_DATES = "interestPaymentDates";
  private List<MonthAndDay> interestPaymentDates = null;

  /**
   * Specifies when the interest should be paid to the deposit account
   */
  public enum InterestPaymentPointEnum {
    FIRST_DAY_OF_MONTH("FIRST_DAY_OF_MONTH"),
    
    EVERY_WEEK("EVERY_WEEK"),
    
    EVERY_OTHER_WEEK("EVERY_OTHER_WEEK"),
    
    EVERY_MONTH("EVERY_MONTH"),
    
    EVERY_3_MONTHS("EVERY_3_MONTHS"),
    
    ON_FIXED_DATES("ON_FIXED_DATES"),
    
    ON_ACCOUNT_MATURITY("ON_ACCOUNT_MATURITY");

    private String value;

    InterestPaymentPointEnum(String value) {
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
    public static InterestPaymentPointEnum fromValue(String value) {
      for (InterestPaymentPointEnum b : InterestPaymentPointEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_PAYMENT_POINT = "interestPaymentPoint";
  private InterestPaymentPointEnum interestPaymentPoint;


  public InterestPaymentSettings interestPaymentDates(List<MonthAndDay> interestPaymentDates) {
    
    this.interestPaymentDates = interestPaymentDates;
    return this;
  }

  public InterestPaymentSettings addInterestPaymentDatesItem(MonthAndDay interestPaymentDatesItem) {
    if (this.interestPaymentDates == null) {
      this.interestPaymentDates = new ArrayList<>();
    }
    this.interestPaymentDates.add(interestPaymentDatesItem);
    return this;
  }

   /**
   * List of all dates on which the interest is payed into deposit account
   * @return interestPaymentDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all dates on which the interest is payed into deposit account")
  @JsonProperty(JSON_PROPERTY_INTEREST_PAYMENT_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MonthAndDay> getInterestPaymentDates() {
    return interestPaymentDates;
  }


  public void setInterestPaymentDates(List<MonthAndDay> interestPaymentDates) {
    this.interestPaymentDates = interestPaymentDates;
  }


  public InterestPaymentSettings interestPaymentPoint(InterestPaymentPointEnum interestPaymentPoint) {
    
    this.interestPaymentPoint = interestPaymentPoint;
    return this;
  }

   /**
   * Specifies when the interest should be paid to the deposit account
   * @return interestPaymentPoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies when the interest should be paid to the deposit account")
  @JsonProperty(JSON_PROPERTY_INTEREST_PAYMENT_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestPaymentPointEnum getInterestPaymentPoint() {
    return interestPaymentPoint;
  }


  public void setInterestPaymentPoint(InterestPaymentPointEnum interestPaymentPoint) {
    this.interestPaymentPoint = interestPaymentPoint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestPaymentSettings interestPaymentSettings = (InterestPaymentSettings) o;
    return Objects.equals(this.interestPaymentDates, interestPaymentSettings.interestPaymentDates) &&
        Objects.equals(this.interestPaymentPoint, interestPaymentSettings.interestPaymentPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestPaymentDates, interestPaymentPoint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestPaymentSettings {\n");
    sb.append("    interestPaymentDates: ").append(toIndentedString(interestPaymentDates)).append("\n");
    sb.append("    interestPaymentPoint: ").append(toIndentedString(interestPaymentPoint)).append("\n");
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

