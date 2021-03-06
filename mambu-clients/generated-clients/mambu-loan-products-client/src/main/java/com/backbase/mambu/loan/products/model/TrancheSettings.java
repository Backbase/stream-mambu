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
 * The tranche settings, indicates the settings regarding tranches in case the product is configured to support tranches.
 */
@ApiModel(description = "The tranche settings, indicates the settings regarding tranches in case the product is configured to support tranches.")
@JsonPropertyOrder({
  TrancheSettings.JSON_PROPERTY_MAX_NUMBER_OF_TRANCHES
})

public class TrancheSettings {
  public static final String JSON_PROPERTY_MAX_NUMBER_OF_TRANCHES = "maxNumberOfTranches";
  private Integer maxNumberOfTranches;


  public TrancheSettings maxNumberOfTranches(Integer maxNumberOfTranches) {
    
    this.maxNumberOfTranches = maxNumberOfTranches;
    return this;
  }

   /**
   * The number of tranches supported by the loan product
   * @return maxNumberOfTranches
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of tranches supported by the loan product")
  @JsonProperty(JSON_PROPERTY_MAX_NUMBER_OF_TRANCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumberOfTranches() {
    return maxNumberOfTranches;
  }


  public void setMaxNumberOfTranches(Integer maxNumberOfTranches) {
    this.maxNumberOfTranches = maxNumberOfTranches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrancheSettings trancheSettings = (TrancheSettings) o;
    return Objects.equals(this.maxNumberOfTranches, trancheSettings.maxNumberOfTranches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxNumberOfTranches);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrancheSettings {\n");
    sb.append("    maxNumberOfTranches: ").append(toIndentedString(maxNumberOfTranches)).append("\n");
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

