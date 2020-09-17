/*
 * deposits/transactions
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.deposit.transactions.model;

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
 * The taxes applied within a transaction
 */
@ApiModel(description = "The taxes applied within a transaction")
@JsonPropertyOrder({
  DepositTaxes.JSON_PROPERTY_TAX_RATE
})

public class DepositTaxes {
  public static final String JSON_PROPERTY_TAX_RATE = "taxRate";
  private BigDecimal taxRate;


  public DepositTaxes taxRate(BigDecimal taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * The tax rate that was set or changed in this transaction
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax rate that was set or changed in this transaction")
  @JsonProperty(JSON_PROPERTY_TAX_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(BigDecimal taxRate) {
    this.taxRate = taxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTaxes depositTaxes = (DepositTaxes) o;
    return Objects.equals(this.taxRate, depositTaxes.taxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTaxes {\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

