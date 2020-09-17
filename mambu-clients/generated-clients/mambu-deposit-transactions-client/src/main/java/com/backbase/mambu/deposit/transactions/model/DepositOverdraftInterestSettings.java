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
 * Holds the deposit overdraft interest settings
 */
@ApiModel(description = "Holds the deposit overdraft interest settings")
@JsonPropertyOrder({
  DepositOverdraftInterestSettings.JSON_PROPERTY_INTEREST_RATE,
  DepositOverdraftInterestSettings.JSON_PROPERTY_INDEX_INTEREST_RATE
})

public class DepositOverdraftInterestSettings {
  public static final String JSON_PROPERTY_INTEREST_RATE = "interestRate";
  private BigDecimal interestRate;

  public static final String JSON_PROPERTY_INDEX_INTEREST_RATE = "indexInterestRate";
  private BigDecimal indexInterestRate;


  public DepositOverdraftInterestSettings interestRate(BigDecimal interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * The interest rate that was set or changed in this transaction. Used on product interest rate changes or interest tier switches
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest rate that was set or changed in this transaction. Used on product interest rate changes or interest tier switches")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  public DepositOverdraftInterestSettings indexInterestRate(BigDecimal indexInterestRate) {
    
    this.indexInterestRate = indexInterestRate;
    return this;
  }

   /**
   * The value of the index interest rate set or changed in this transaction
   * @return indexInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the index interest rate set or changed in this transaction")
  @JsonProperty(JSON_PROPERTY_INDEX_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIndexInterestRate() {
    return indexInterestRate;
  }


  public void setIndexInterestRate(BigDecimal indexInterestRate) {
    this.indexInterestRate = indexInterestRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositOverdraftInterestSettings depositOverdraftInterestSettings = (DepositOverdraftInterestSettings) o;
    return Objects.equals(this.interestRate, depositOverdraftInterestSettings.interestRate) &&
        Objects.equals(this.indexInterestRate, depositOverdraftInterestSettings.indexInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRate, indexInterestRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositOverdraftInterestSettings {\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    indexInterestRate: ").append(toIndentedString(indexInterestRate)).append("\n");
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

