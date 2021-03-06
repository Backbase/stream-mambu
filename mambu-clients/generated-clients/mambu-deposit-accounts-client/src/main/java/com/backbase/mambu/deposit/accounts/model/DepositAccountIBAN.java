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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Account IBAN
 */
@ApiModel(description = "Account IBAN")
@JsonPropertyOrder({
  DepositAccountIBAN.JSON_PROPERTY_I_B_A_N
})

public class DepositAccountIBAN {
  public static final String JSON_PROPERTY_I_B_A_N = "IBAN";
  private String IBAN;


  public DepositAccountIBAN IBAN(String IBAN) {
    
    this.IBAN = IBAN;
    return this;
  }

   /**
   * Account IBAN
   * @return IBAN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account IBAN")
  @JsonProperty(JSON_PROPERTY_I_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIBAN() {
    return IBAN;
  }


  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccountIBAN depositAccountIBAN = (DepositAccountIBAN) o;
    return Objects.equals(this.IBAN, depositAccountIBAN.IBAN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IBAN);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccountIBAN {\n");
    sb.append("    IBAN: ").append(toIndentedString(IBAN)).append("\n");
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

