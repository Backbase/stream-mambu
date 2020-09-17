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
import com.backbase.mambu.loans.model.PayOffAdjustableAmounts;
import com.backbase.mambu.loans.model.TransactionDetails;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Allows specifying the input for loan account pay off
 */
@ApiModel(description = "Allows specifying the input for loan account pay off")
@JsonPropertyOrder({
  LoanAccountPayOffInput.JSON_PROPERTY_TRANSACTION_DETAILS,
  LoanAccountPayOffInput.JSON_PROPERTY_EXTERNAL_ID,
  LoanAccountPayOffInput.JSON_PROPERTY_NOTES,
  LoanAccountPayOffInput.JSON_PROPERTY_PAY_OFF_ADJUSTABLE_AMOUNTS
})

public class LoanAccountPayOffInput {
  public static final String JSON_PROPERTY_TRANSACTION_DETAILS = "transactionDetails";
  private TransactionDetails transactionDetails;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_PAY_OFF_ADJUSTABLE_AMOUNTS = "payOffAdjustableAmounts";
  private PayOffAdjustableAmounts payOffAdjustableAmounts;


  public LoanAccountPayOffInput transactionDetails(TransactionDetails transactionDetails) {
    
    this.transactionDetails = transactionDetails;
    return this;
  }

   /**
   * Get transactionDetails
   * @return transactionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionDetails getTransactionDetails() {
    return transactionDetails;
  }


  public void setTransactionDetails(TransactionDetails transactionDetails) {
    this.transactionDetails = transactionDetails;
  }


  public LoanAccountPayOffInput externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External id for Repayment transaction
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External id for Repayment transaction")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public LoanAccountPayOffInput notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Extra notes for Repayment transaction logged for Pay Off action
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra notes for Repayment transaction logged for Pay Off action")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public LoanAccountPayOffInput payOffAdjustableAmounts(PayOffAdjustableAmounts payOffAdjustableAmounts) {
    
    this.payOffAdjustableAmounts = payOffAdjustableAmounts;
    return this;
  }

   /**
   * Get payOffAdjustableAmounts
   * @return payOffAdjustableAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAY_OFF_ADJUSTABLE_AMOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PayOffAdjustableAmounts getPayOffAdjustableAmounts() {
    return payOffAdjustableAmounts;
  }


  public void setPayOffAdjustableAmounts(PayOffAdjustableAmounts payOffAdjustableAmounts) {
    this.payOffAdjustableAmounts = payOffAdjustableAmounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoanAccountPayOffInput loanAccountPayOffInput = (LoanAccountPayOffInput) o;
    return Objects.equals(this.transactionDetails, loanAccountPayOffInput.transactionDetails) &&
        Objects.equals(this.externalId, loanAccountPayOffInput.externalId) &&
        Objects.equals(this.notes, loanAccountPayOffInput.notes) &&
        Objects.equals(this.payOffAdjustableAmounts, loanAccountPayOffInput.payOffAdjustableAmounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDetails, externalId, notes, payOffAdjustableAmounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanAccountPayOffInput {\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    payOffAdjustableAmounts: ").append(toIndentedString(payOffAdjustableAmounts)).append("\n");
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
