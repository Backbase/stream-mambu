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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Decimal constraints, like min/max/default.
 */
@ApiModel(description = "Decimal constraints, like min/max/default.")
@JsonPropertyOrder({
  DecimalInterval.JSON_PROPERTY_MIN_VALUE,
  DecimalInterval.JSON_PROPERTY_MAX_VALUE,
  DecimalInterval.JSON_PROPERTY_DEFAULT_VALUE
})

public class DecimalInterval {
  public static final String JSON_PROPERTY_MIN_VALUE = "minValue";
  private BigDecimal minValue;

  public static final String JSON_PROPERTY_MAX_VALUE = "maxValue";
  private BigDecimal maxValue;

  public static final String JSON_PROPERTY_DEFAULT_VALUE = "defaultValue";
  private BigDecimal defaultValue;


  public DecimalInterval minValue(BigDecimal minValue) {
    
    this.minValue = minValue;
    return this;
  }

   /**
   * The minimum value.
   * @return minValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum value.")
  @JsonProperty(JSON_PROPERTY_MIN_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMinValue() {
    return minValue;
  }


  public void setMinValue(BigDecimal minValue) {
    this.minValue = minValue;
  }


  public DecimalInterval maxValue(BigDecimal maxValue) {
    
    this.maxValue = maxValue;
    return this;
  }

   /**
   * The maximum value.
   * @return maxValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum value.")
  @JsonProperty(JSON_PROPERTY_MAX_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxValue() {
    return maxValue;
  }


  public void setMaxValue(BigDecimal maxValue) {
    this.maxValue = maxValue;
  }


  public DecimalInterval defaultValue(BigDecimal defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value, will be used in case no other value was filled in by the user.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default value, will be used in case no other value was filled in by the user.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(BigDecimal defaultValue) {
    this.defaultValue = defaultValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecimalInterval decimalInterval = (DecimalInterval) o;
    return Objects.equals(this.minValue, decimalInterval.minValue) &&
        Objects.equals(this.maxValue, decimalInterval.maxValue) &&
        Objects.equals(this.defaultValue, decimalInterval.defaultValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minValue, maxValue, defaultValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecimalInterval {\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
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

