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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Groups all fields related to a deposit account&#39;s overdraft settings
 */
@ApiModel(description = "Groups all fields related to a deposit account's overdraft settings")
@JsonPropertyOrder({
  DepositAccountOverdraftSettings.JSON_PROPERTY_ALLOW_OVERDRAFT,
  DepositAccountOverdraftSettings.JSON_PROPERTY_OVERDRAFT_LIMIT,
  DepositAccountOverdraftSettings.JSON_PROPERTY_OVERDRAFT_EXPIRY_DATE
})

public class DepositAccountOverdraftSettings {
  public static final String JSON_PROPERTY_ALLOW_OVERDRAFT = "allowOverdraft";
  private Boolean allowOverdraft;

  public static final String JSON_PROPERTY_OVERDRAFT_LIMIT = "overdraftLimit";
  private BigDecimal overdraftLimit;

  public static final String JSON_PROPERTY_OVERDRAFT_EXPIRY_DATE = "overdraftExpiryDate";
  private OffsetDateTime overdraftExpiryDate;


  public DepositAccountOverdraftSettings allowOverdraft(Boolean allowOverdraft) {
    
    this.allowOverdraft = allowOverdraft;
    return this;
  }

   /**
   * Whether this account supports overdraft or not
   * @return allowOverdraft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this account supports overdraft or not")
  @JsonProperty(JSON_PROPERTY_ALLOW_OVERDRAFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowOverdraft() {
    return allowOverdraft;
  }


  public void setAllowOverdraft(Boolean allowOverdraft) {
    this.allowOverdraft = allowOverdraft;
  }


  public DepositAccountOverdraftSettings overdraftLimit(BigDecimal overdraftLimit) {
    
    this.overdraftLimit = overdraftLimit;
    return this;
  }

   /**
   * How much may be taken out as overdraft, null means 0
   * @return overdraftLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How much may be taken out as overdraft, null means 0")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOverdraftLimit() {
    return overdraftLimit;
  }


  public void setOverdraftLimit(BigDecimal overdraftLimit) {
    this.overdraftLimit = overdraftLimit;
  }


  public DepositAccountOverdraftSettings overdraftExpiryDate(OffsetDateTime overdraftExpiryDate) {
    
    this.overdraftExpiryDate = overdraftExpiryDate;
    return this;
  }

   /**
   * The expiration date of an overdraft
   * @return overdraftExpiryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The expiration date of an overdraft")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_EXPIRY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getOverdraftExpiryDate() {
    return overdraftExpiryDate;
  }


  public void setOverdraftExpiryDate(OffsetDateTime overdraftExpiryDate) {
    this.overdraftExpiryDate = overdraftExpiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountOverdraftSettings depositAccountOverdraftSettings = (DepositAccountOverdraftSettings) o;
    return Objects.equals(this.allowOverdraft, depositAccountOverdraftSettings.allowOverdraft) &&
        Objects.equals(this.overdraftLimit, depositAccountOverdraftSettings.overdraftLimit) &&
        Objects.equals(this.overdraftExpiryDate, depositAccountOverdraftSettings.overdraftExpiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowOverdraft, overdraftLimit, overdraftExpiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountOverdraftSettings {\n");
    sb.append("    allowOverdraft: ").append(toIndentedString(allowOverdraft)).append("\n");
    sb.append("    overdraftLimit: ").append(toIndentedString(overdraftLimit)).append("\n");
    sb.append("    overdraftExpiryDate: ").append(toIndentedString(overdraftExpiryDate)).append("\n");
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

