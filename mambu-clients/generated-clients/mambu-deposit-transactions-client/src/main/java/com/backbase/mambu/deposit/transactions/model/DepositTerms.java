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
import com.backbase.mambu.deposit.transactions.model.DepositOverdraftInterestSettings;
import com.backbase.mambu.deposit.transactions.model.DepositOverdraftSettings;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionInterestSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The deposit transaction terms
 */
@ApiModel(description = "The deposit transaction terms")
@JsonPropertyOrder({
  DepositTerms.JSON_PROPERTY_INTEREST_SETTINGS,
  DepositTerms.JSON_PROPERTY_OVERDRAFT_SETTINGS,
  DepositTerms.JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS
})

public class DepositTerms {
  public static final String JSON_PROPERTY_INTEREST_SETTINGS = "interestSettings";
  private DepositTransactionInterestSettings interestSettings;

  public static final String JSON_PROPERTY_OVERDRAFT_SETTINGS = "overdraftSettings";
  private DepositOverdraftSettings overdraftSettings;

  public static final String JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS = "overdraftInterestSettings";
  private DepositOverdraftInterestSettings overdraftInterestSettings;


  public DepositTerms interestSettings(DepositTransactionInterestSettings interestSettings) {
    
    this.interestSettings = interestSettings;
    return this;
  }

   /**
   * Get interestSettings
   * @return interestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositTransactionInterestSettings getInterestSettings() {
    return interestSettings;
  }


  public void setInterestSettings(DepositTransactionInterestSettings interestSettings) {
    this.interestSettings = interestSettings;
  }


  public DepositTerms overdraftSettings(DepositOverdraftSettings overdraftSettings) {
    
    this.overdraftSettings = overdraftSettings;
    return this;
  }

   /**
   * Get overdraftSettings
   * @return overdraftSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositOverdraftSettings getOverdraftSettings() {
    return overdraftSettings;
  }


  public void setOverdraftSettings(DepositOverdraftSettings overdraftSettings) {
    this.overdraftSettings = overdraftSettings;
  }


  public DepositTerms overdraftInterestSettings(DepositOverdraftInterestSettings overdraftInterestSettings) {
    
    this.overdraftInterestSettings = overdraftInterestSettings;
    return this;
  }

   /**
   * Get overdraftInterestSettings
   * @return overdraftInterestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositOverdraftInterestSettings getOverdraftInterestSettings() {
    return overdraftInterestSettings;
  }


  public void setOverdraftInterestSettings(DepositOverdraftInterestSettings overdraftInterestSettings) {
    this.overdraftInterestSettings = overdraftInterestSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTerms depositTerms = (DepositTerms) o;
    return Objects.equals(this.interestSettings, depositTerms.interestSettings) &&
        Objects.equals(this.overdraftSettings, depositTerms.overdraftSettings) &&
        Objects.equals(this.overdraftInterestSettings, depositTerms.overdraftInterestSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestSettings, overdraftSettings, overdraftInterestSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTerms {\n");
    sb.append("    interestSettings: ").append(toIndentedString(interestSettings)).append("\n");
    sb.append("    overdraftSettings: ").append(toIndentedString(overdraftSettings)).append("\n");
    sb.append("    overdraftInterestSettings: ").append(toIndentedString(overdraftInterestSettings)).append("\n");
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

