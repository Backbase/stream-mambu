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
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The action to start the maturity period for a deposit account
 */
@ApiModel(description = "The action to start the maturity period for a deposit account")
@JsonPropertyOrder({
  StartMaturityAction.JSON_PROPERTY_MATURITY_DATE,
  StartMaturityAction.JSON_PROPERTY_NOTES
})

public class StartMaturityAction {
  public static final String JSON_PROPERTY_MATURITY_DATE = "maturityDate";
  private LocalDate maturityDate;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;


  public StartMaturityAction maturityDate(LocalDate maturityDate) {
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * The date at which the maturity period starts
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Apr 26 02:00:00 CEST 1987", value = "The date at which the maturity period starts")
  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }


  public StartMaturityAction notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * The notes related to the action performed
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The notes related to the action performed")
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
    StartMaturityAction startMaturityAction = (StartMaturityAction) o;
    return Objects.equals(this.maturityDate, startMaturityAction.maturityDate) &&
        Objects.equals(this.notes, startMaturityAction.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maturityDate, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartMaturityAction {\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
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
