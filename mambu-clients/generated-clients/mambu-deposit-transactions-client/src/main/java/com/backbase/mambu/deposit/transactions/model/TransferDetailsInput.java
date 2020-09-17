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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Represents the input for the transfer details for a transfer transaction
 */
@ApiModel(description = "Represents the input for the transfer details for a transfer transaction")
@JsonPropertyOrder({
  TransferDetailsInput.JSON_PROPERTY_LINKED_ACCOUNT_ID,
  TransferDetailsInput.JSON_PROPERTY_LINKED_ACCOUNT_TYPE,
  TransferDetailsInput.JSON_PROPERTY_LINKED_ACCOUNT_KEY
})

public class TransferDetailsInput {
  public static final String JSON_PROPERTY_LINKED_ACCOUNT_ID = "linkedAccountId";
  private String linkedAccountId;

  /**
   * The type of the linked account. Can be LOAN or DEPOSIT
   */
  public enum LinkedAccountTypeEnum {
    LOAN("LOAN"),
    
    DEPOSIT("DEPOSIT");

    private String value;

    LinkedAccountTypeEnum(String value) {
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
    public static LinkedAccountTypeEnum fromValue(String value) {
      for (LinkedAccountTypeEnum b : LinkedAccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LINKED_ACCOUNT_TYPE = "linkedAccountType";
  private LinkedAccountTypeEnum linkedAccountType;

  public static final String JSON_PROPERTY_LINKED_ACCOUNT_KEY = "linkedAccountKey";
  private String linkedAccountKey;


  public TransferDetailsInput linkedAccountId(String linkedAccountId) {
    
    this.linkedAccountId = linkedAccountId;
    return this;
  }

   /**
   * The id of the linked account
   * @return linkedAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the linked account")
  @JsonProperty(JSON_PROPERTY_LINKED_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedAccountId() {
    return linkedAccountId;
  }


  public void setLinkedAccountId(String linkedAccountId) {
    this.linkedAccountId = linkedAccountId;
  }


  public TransferDetailsInput linkedAccountType(LinkedAccountTypeEnum linkedAccountType) {
    
    this.linkedAccountType = linkedAccountType;
    return this;
  }

   /**
   * The type of the linked account. Can be LOAN or DEPOSIT
   * @return linkedAccountType
  **/
  @ApiModelProperty(required = true, value = "The type of the linked account. Can be LOAN or DEPOSIT")
  @JsonProperty(JSON_PROPERTY_LINKED_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LinkedAccountTypeEnum getLinkedAccountType() {
    return linkedAccountType;
  }


  public void setLinkedAccountType(LinkedAccountTypeEnum linkedAccountType) {
    this.linkedAccountType = linkedAccountType;
  }


  public TransferDetailsInput linkedAccountKey(String linkedAccountKey) {
    
    this.linkedAccountKey = linkedAccountKey;
    return this;
  }

   /**
   * The encoded key of the linked account
   * @return linkedAccountKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the linked account")
  @JsonProperty(JSON_PROPERTY_LINKED_ACCOUNT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedAccountKey() {
    return linkedAccountKey;
  }


  public void setLinkedAccountKey(String linkedAccountKey) {
    this.linkedAccountKey = linkedAccountKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDetailsInput transferDetailsInput = (TransferDetailsInput) o;
    return Objects.equals(this.linkedAccountId, transferDetailsInput.linkedAccountId) &&
        Objects.equals(this.linkedAccountType, transferDetailsInput.linkedAccountType) &&
        Objects.equals(this.linkedAccountKey, transferDetailsInput.linkedAccountKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkedAccountId, linkedAccountType, linkedAccountKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDetailsInput {\n");
    sb.append("    linkedAccountId: ").append(toIndentedString(linkedAccountId)).append("\n");
    sb.append("    linkedAccountType: ").append(toIndentedString(linkedAccountType)).append("\n");
    sb.append("    linkedAccountKey: ").append(toIndentedString(linkedAccountKey)).append("\n");
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
