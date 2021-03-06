/*
 * depositproducts
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.deposit.products.model;

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
 * New Account settings for deposit accounts
 */
@ApiModel(description = "New Account settings for deposit accounts")
@JsonPropertyOrder({
  DepositNewAccountSettings.JSON_PROPERTY_ID_GENERATOR_TYPE,
  DepositNewAccountSettings.JSON_PROPERTY_ID_PATTERN
})

public class DepositNewAccountSettings {
  /**
   * The type of generator used for IDs creation.
   */
  public enum IdGeneratorTypeEnum {
    INCREMENTAL_NUMBER("INCREMENTAL_NUMBER"),
    
    RANDOM_PATTERN("RANDOM_PATTERN");

    private String value;

    IdGeneratorTypeEnum(String value) {
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
    public static IdGeneratorTypeEnum fromValue(String value) {
      for (IdGeneratorTypeEnum b : IdGeneratorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ID_GENERATOR_TYPE = "idGeneratorType";
  private IdGeneratorTypeEnum idGeneratorType;

  public static final String JSON_PROPERTY_ID_PATTERN = "idPattern";
  private String idPattern;


  public DepositNewAccountSettings idGeneratorType(IdGeneratorTypeEnum idGeneratorType) {
    
    this.idGeneratorType = idGeneratorType;
    return this;
  }

   /**
   * The type of generator used for IDs creation.
   * @return idGeneratorType
  **/
  @ApiModelProperty(required = true, value = "The type of generator used for IDs creation.")
  @JsonProperty(JSON_PROPERTY_ID_GENERATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IdGeneratorTypeEnum getIdGeneratorType() {
    return idGeneratorType;
  }


  public void setIdGeneratorType(IdGeneratorTypeEnum idGeneratorType) {
    this.idGeneratorType = idGeneratorType;
  }


  public DepositNewAccountSettings idPattern(String idPattern) {
    
    this.idPattern = idPattern;
    return this;
  }

   /**
   * The pattern that will be used for ID validation (as referred to as an input mask).
   * @return idPattern
  **/
  @ApiModelProperty(required = true, value = "The pattern that will be used for ID validation (as referred to as an input mask).")
  @JsonProperty(JSON_PROPERTY_ID_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIdPattern() {
    return idPattern;
  }


  public void setIdPattern(String idPattern) {
    this.idPattern = idPattern;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositNewAccountSettings depositNewAccountSettings = (DepositNewAccountSettings) o;
    return Objects.equals(this.idGeneratorType, depositNewAccountSettings.idGeneratorType) &&
        Objects.equals(this.idPattern, depositNewAccountSettings.idPattern);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idGeneratorType, idPattern);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositNewAccountSettings {\n");
    sb.append("    idGeneratorType: ").append(toIndentedString(idGeneratorType)).append("\n");
    sb.append("    idPattern: ").append(toIndentedString(idPattern)).append("\n");
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

