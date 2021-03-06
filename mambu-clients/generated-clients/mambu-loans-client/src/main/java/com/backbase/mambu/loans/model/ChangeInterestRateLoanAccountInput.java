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
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Represents the request payload for performing an interest rate change action
 */
@ApiModel(description = "Represents the request payload for performing an interest rate change action")
@JsonPropertyOrder({
  ChangeInterestRateLoanAccountInput.JSON_PROPERTY_INTEREST_RATE,
  ChangeInterestRateLoanAccountInput.JSON_PROPERTY_VALUE_DATE,
  ChangeInterestRateLoanAccountInput.JSON_PROPERTY_NOTES
})

public class ChangeInterestRateLoanAccountInput {
  public static final String JSON_PROPERTY_INTEREST_RATE = "interestRate";
  private BigDecimal interestRate;

  public static final String JSON_PROPERTY_VALUE_DATE = "valueDate";
  private OffsetDateTime valueDate;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;


  public ChangeInterestRateLoanAccountInput interestRate(BigDecimal interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * The new interest rate to be available on the account
   * @return interestRate
  **/
  @ApiModelProperty(required = true, value = "The new interest rate to be available on the account")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  public ChangeInterestRateLoanAccountInput valueDate(OffsetDateTime valueDate) {
    
    this.valueDate = valueDate;
    return this;
  }

   /**
   * The date when to change the interest rate (as Organization Time)
   * @return valueDate
  **/
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", required = true, value = "The date when to change the interest rate (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_VALUE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getValueDate() {
    return valueDate;
  }


  public void setValueDate(OffsetDateTime valueDate) {
    this.valueDate = valueDate;
  }


  public ChangeInterestRateLoanAccountInput notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * The notes for the change interest rate action performed on the loan account
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The notes for the change interest rate action performed on the loan account")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeInterestRateLoanAccountInput changeInterestRateLoanAccountInput = (ChangeInterestRateLoanAccountInput) o;
    return Objects.equals(this.interestRate, changeInterestRateLoanAccountInput.interestRate) &&
        Objects.equals(this.valueDate, changeInterestRateLoanAccountInput.valueDate) &&
        Objects.equals(this.notes, changeInterestRateLoanAccountInput.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRate, valueDate, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeInterestRateLoanAccountInput {\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

