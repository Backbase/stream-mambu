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
 * The overdraft settings of the deposit product
 */
@ApiModel(description = "The overdraft settings of the deposit product")
@JsonPropertyOrder({
  DepositProductOverdraftSettings.JSON_PROPERTY_ALLOW_OVERDRAFT,
  DepositProductOverdraftSettings.JSON_PROPERTY_ALLOW_TECHNICAL_OVERDRAFT,
  DepositProductOverdraftSettings.JSON_PROPERTY_MAX_OVERDRAFT_LIMIT
})

public class DepositProductOverdraftSettings {
  public static final String JSON_PROPERTY_ALLOW_OVERDRAFT = "allowOverdraft";
  private Boolean allowOverdraft;

  public static final String JSON_PROPERTY_ALLOW_TECHNICAL_OVERDRAFT = "allowTechnicalOverdraft";
  private Boolean allowTechnicalOverdraft;

  public static final String JSON_PROPERTY_MAX_OVERDRAFT_LIMIT = "maxOverdraftLimit";
  private BigDecimal maxOverdraftLimit;


  public DepositProductOverdraftSettings allowOverdraft(Boolean allowOverdraft) {
    
    this.allowOverdraft = allowOverdraft;
    return this;
  }

   /**
   * Whether the accounts for this product may have overdraft
   * @return allowOverdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the accounts for this product may have overdraft")
  @JsonProperty(JSON_PROPERTY_ALLOW_OVERDRAFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowOverdraft() {
    return allowOverdraft;
  }


  public void setAllowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
  }


  public DepositProductOverdraftSettings allowTechnicalOverdraft(Boolean allowTechnicalOverdraft) {
    
    this.allowTechnicalOverdraft = allowTechnicalOverdraft;
    return this;
  }

   /**
   * Whether the accounts for this product may have technical overdraft
   * @return allowTechnicalOverdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the accounts for this product may have technical overdraft")
  @JsonProperty(JSON_PROPERTY_ALLOW_TECHNICAL_OVERDRAFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowTechnicalOverdraft() {
    return allowTechnicalOverdraft;
  }


  public void setAllowTechnicalOverdraft(Boolean allowTechnicalOverdraft) {
    this.allowTechnicalOverdraft = allowTechnicalOverdraft;
  }


  public DepositProductOverdraftSettings maxOverdraftLimit(BigDecimal maxOverdraftLimit) {
    
    this.maxOverdraftLimit = maxOverdraftLimit;
    return this;
  }

   /**
   * How much money may be taken out for the account to go negative
   * @return maxOverdraftLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much money may be taken out for the account to go negative")
  @JsonProperty(JSON_PROPERTY_MAX_OVERDRAFT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaxOverdraftLimit() {
    return maxOverdraftLimit;
  }


  public void setMaxOverdraftLimit(BigDecimal maxOverdraftLimit) {
    this.maxOverdraftLimit = maxOverdraftLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositProductOverdraftSettings depositProductOverdraftSettings = (DepositProductOverdraftSettings) o;
    return Objects.equals(this.allowOverdraft, depositProductOverdraftSettings.allowOverdraft) &&
        Objects.equals(this.allowTechnicalOverdraft, depositProductOverdraftSettings.allowTechnicalOverdraft) &&
        Objects.equals(this.maxOverdraftLimit, depositProductOverdraftSettings.maxOverdraftLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOverdraft, allowTechnicalOverdraft, maxOverdraftLimit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositProductOverdraftSettings {\n");
    sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
    sb.append("    allowTechnicalOverdraft: ").append(toIndentedString(allowTechnicalOverdraft)).append("\n");
    sb.append("    maxOverdraftLimit: ").append(toIndentedString(maxOverdraftLimit)).append("\n");
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

