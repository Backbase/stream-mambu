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
 * A single change that needs to be made to a resource
 */
@ApiModel(description = "A single change that needs to be made to a resource")
@JsonPropertyOrder({
  PatchOperation.JSON_PROPERTY_OP,
  PatchOperation.JSON_PROPERTY_PATH,
  PatchOperation.JSON_PROPERTY_FROM,
  PatchOperation.JSON_PROPERTY_VALUE
})

public class PatchOperation {
  /**
   * The change to perform
   */
  public enum OpEnum {
    ADD("ADD"),
    
    REPLACE("REPLACE"),
    
    REMOVE("REMOVE"),
    
    MOVE("MOVE");

    private String value;

    OpEnum(String value) {
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
    public static OpEnum fromValue(String value) {
      for (OpEnum b : OpEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OP = "op";
  private OpEnum op;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;


  public PatchOperation op(OpEnum op) {
    
    this.op = op;
    return this;
  }

   /**
   * The change to perform
   * @return op
  **/
  @ApiModelProperty(required = true, value = "The change to perform")
  @JsonProperty(JSON_PROPERTY_OP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OpEnum getOp() {
    return op;
  }


  public void setOp(OpEnum op) {
    this.op = op;
  }


  public PatchOperation path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The field to perform the operation on
   * @return path
  **/
  @ApiModelProperty(required = true, value = "The field to perform the operation on")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public PatchOperation from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The field from where a value should be moved, when using move
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The field from where a value should be moved, when using move")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public PatchOperation value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the field, can be null
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the field, can be null")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchOperation patchOperation = (PatchOperation) o;
    return Objects.equals(this.op, patchOperation.op) &&
        Objects.equals(this.path, patchOperation.path) &&
        Objects.equals(this.from, patchOperation.from) &&
        Objects.equals(this.value, patchOperation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, from, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchOperation {\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

