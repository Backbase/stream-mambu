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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Allows specifying the action details for a loan account
 */
@ApiModel(description = "Allows specifying the action details for a loan account")
@JsonPropertyOrder({
  LoanAccountAction.JSON_PROPERTY_ACTION,
  LoanAccountAction.JSON_PROPERTY_NOTES
})

public class LoanAccountAction {
  /**
   * The action type to be applied
   */
  public enum ActionEnum {
    REQUEST_APPROVAL("REQUEST_APPROVAL"),
    
    SET_INCOMPLETE("SET_INCOMPLETE"),
    
    APPROVE("APPROVE"),
    
    UNDO_APPROVE("UNDO_APPROVE"),
    
    REJECT("REJECT"),
    
    WITHDRAW("WITHDRAW"),
    
    CLOSE("CLOSE"),
    
    UNDO_REJECT("UNDO_REJECT"),
    
    UNDO_WITHDRAW("UNDO_WITHDRAW"),
    
    UNDO_CLOSE("UNDO_CLOSE");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;


  public LoanAccountAction action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * The action type to be applied
   * @return action
  **/
  @ApiModelProperty(required = true, value = "The action type to be applied")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public LoanAccountAction notes(String notes) {
    
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
    LoanAccountAction loanAccountAction = (LoanAccountAction) o;
    return Objects.equals(this.action, loanAccountAction.action) &&
        Objects.equals(this.notes, loanAccountAction.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoanAccountAction {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

