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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Tax settings, defines some settings for taxes on the loan product
 */
@ApiModel(description = "Tax settings, defines some settings for taxes on the loan product")
@JsonPropertyOrder({
  DepositProductTaxSettings.JSON_PROPERTY_WITHHOLDING_TAX_ENABLED
})

public class DepositProductTaxSettings {
  public static final String JSON_PROPERTY_WITHHOLDING_TAX_ENABLED = "withholdingTaxEnabled";
  private Boolean withholdingTaxEnabled;


  public DepositProductTaxSettings withholdingTaxEnabled(Boolean withholdingTaxEnabled) {
    
    this.withholdingTaxEnabled = withholdingTaxEnabled;
    return this;
  }

   /**
   * Whether withholding taxes are enabled for this product or not
   * @return withholdingTaxEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether withholding taxes are enabled for this product or not")
  @JsonProperty(JSON_PROPERTY_WITHHOLDING_TAX_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getWithholdingTaxEnabled() {
    return withholdingTaxEnabled;
  }


  public void setWithholdingTaxEnabled(Boolean withholdingTaxEnabled) {
    this.withholdingTaxEnabled = withholdingTaxEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositProductTaxSettings depositProductTaxSettings = (DepositProductTaxSettings) o;
    return Objects.equals(this.withholdingTaxEnabled, depositProductTaxSettings.withholdingTaxEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(withholdingTaxEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositProductTaxSettings {\n");
    sb.append("    withholdingTaxEnabled: ").append(toIndentedString(withholdingTaxEnabled)).append("\n");
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

