/*
 * loans
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.loans.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The disbursement details regarding a loan tranche.
 */
@ApiModel(description = "The disbursement details regarding a loan tranche.")
@JsonPropertyOrder({
  TrancheDisbursementDetails.JSON_PROPERTY_EXPECTED_DISBURSEMENT_DATE,
  TrancheDisbursementDetails.JSON_PROPERTY_DISBURSEMENT_TRANSACTION_KEY
})

public class TrancheDisbursementDetails {
  public static final String JSON_PROPERTY_EXPECTED_DISBURSEMENT_DATE = "expectedDisbursementDate";
  private OffsetDateTime expectedDisbursementDate;

  public static final String JSON_PROPERTY_DISBURSEMENT_TRANSACTION_KEY = "disbursementTransactionKey";
  private String disbursementTransactionKey;


  public TrancheDisbursementDetails expectedDisbursementDate(OffsetDateTime expectedDisbursementDate) {
    
    this.expectedDisbursementDate = expectedDisbursementDate;
    return this;
  }

   /**
   * The date when this tranche is supposed to be disbursed (as Organization Time)
   * @return expectedDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date when this tranche is supposed to be disbursed (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_EXPECTED_DISBURSEMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpectedDisbursementDate() {
    return expectedDisbursementDate;
  }


  public void setExpectedDisbursementDate(OffsetDateTime expectedDisbursementDate) {
    this.expectedDisbursementDate = expectedDisbursementDate;
  }


  public TrancheDisbursementDetails disbursementTransactionKey(String disbursementTransactionKey) {
    
    this.disbursementTransactionKey = disbursementTransactionKey;
    return this;
  }

   /**
   * The key of the disbursement transaction logged when this tranche was disbursed. This field will be null until the tranche disbursement
   * @return disbursementTransactionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the disbursement transaction logged when this tranche was disbursed. This field will be null until the tranche disbursement")
  @JsonProperty(JSON_PROPERTY_DISBURSEMENT_TRANSACTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisbursementTransactionKey() {
    return disbursementTransactionKey;
  }


  public void setDisbursementTransactionKey(String disbursementTransactionKey) {
    this.disbursementTransactionKey = disbursementTransactionKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrancheDisbursementDetails trancheDisbursementDetails = (TrancheDisbursementDetails) o;
    return Objects.equals(this.expectedDisbursementDate, trancheDisbursementDetails.expectedDisbursementDate) &&
        Objects.equals(this.disbursementTransactionKey, trancheDisbursementDetails.disbursementTransactionKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedDisbursementDate, disbursementTransactionKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrancheDisbursementDetails {\n");
    sb.append("    expectedDisbursementDate: ").append(toIndentedString(expectedDisbursementDate)).append("\n");
    sb.append("    disbursementTransactionKey: ").append(toIndentedString(disbursementTransactionKey)).append("\n");
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

