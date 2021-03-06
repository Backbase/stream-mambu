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
import com.backbase.mambu.deposit.accounts.model.DepositAccountOverdraftInterestRateSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Groups all fields related to a deposit account&#39;s overdraft interest settings
 */
@ApiModel(description = "Groups all fields related to a deposit account's overdraft interest settings")
@JsonPropertyOrder({
  DepositAccountOverdraftInterestSettings.JSON_PROPERTY_INTEREST_RATE_SETTINGS
})

public class DepositAccountOverdraftInterestSettings {
  public static final String JSON_PROPERTY_INTEREST_RATE_SETTINGS = "interestRateSettings";
  private DepositAccountOverdraftInterestRateSettings interestRateSettings;


  public DepositAccountOverdraftInterestSettings interestRateSettings(DepositAccountOverdraftInterestRateSettings interestRateSettings) {
    
    this.interestRateSettings = interestRateSettings;
    return this;
  }

   /**
   * Get interestRateSettings
   * @return interestRateSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositAccountOverdraftInterestRateSettings getInterestRateSettings() {
    return interestRateSettings;
  }


  public void setInterestRateSettings(DepositAccountOverdraftInterestRateSettings interestRateSettings) {
    this.interestRateSettings = interestRateSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountOverdraftInterestSettings depositAccountOverdraftInterestSettings = (DepositAccountOverdraftInterestSettings) o;
    return Objects.equals(this.interestRateSettings, depositAccountOverdraftInterestSettings.interestRateSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountOverdraftInterestSettings {\n");
    sb.append("    interestRateSettings: ").append(toIndentedString(interestRateSettings)).append("\n");
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

