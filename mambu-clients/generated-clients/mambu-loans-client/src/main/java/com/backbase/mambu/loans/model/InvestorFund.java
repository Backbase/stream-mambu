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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Contains the details about an investor fund including fields like encoded key, guarantor type, amount and guarantor key
 */
@ApiModel(description = "Contains the details about an investor fund including fields like encoded key, guarantor type, amount and guarantor key")
@JsonPropertyOrder({
  InvestorFund.JSON_PROPERTY_AMOUNT,
  InvestorFund.JSON_PROPERTY_INTEREST_COMMISSION,
  InvestorFund.JSON_PROPERTY_DEPOSIT_ACCOUNT_KEY,
  InvestorFund.JSON_PROPERTY_ASSET_NAME,
  InvestorFund.JSON_PROPERTY_ENCODED_KEY,
  InvestorFund.JSON_PROPERTY_ID,
  InvestorFund.JSON_PROPERTY_GUARANTOR_KEY,
  InvestorFund.JSON_PROPERTY_GUARANTOR_TYPE,
  InvestorFund.JSON_PROPERTY_SHARE_PERCENTAGE
})

public class InvestorFund {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_INTEREST_COMMISSION = "interestCommission";
  private BigDecimal interestCommission;

  public static final String JSON_PROPERTY_DEPOSIT_ACCOUNT_KEY = "depositAccountKey";
  private String depositAccountKey;

  public static final String JSON_PROPERTY_ASSET_NAME = "assetName";
  private String assetName;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_GUARANTOR_KEY = "guarantorKey";
  private String guarantorKey;

  /**
   * The type of the guarantor (client/group)
   */
  public enum GuarantorTypeEnum {
    CLIENT("CLIENT"),
    
    GROUP("GROUP");

    private String value;

    GuarantorTypeEnum(String value) {
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
    public static GuarantorTypeEnum fromValue(String value) {
      for (GuarantorTypeEnum b : GuarantorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GUARANTOR_TYPE = "guarantorType";
  private GuarantorTypeEnum guarantorType;

  public static final String JSON_PROPERTY_SHARE_PERCENTAGE = "sharePercentage";
  private BigDecimal sharePercentage;


  public InvestorFund amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount used by the client for the guaranty
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount used by the client for the guaranty")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public InvestorFund interestCommission(BigDecimal interestCommission) {
    
    this.interestCommission = interestCommission;
    return this;
  }

   /**
   * The constraint minimum value
   * @return interestCommission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The constraint minimum value")
  @JsonProperty(JSON_PROPERTY_INTEREST_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInterestCommission() {
    return interestCommission;
  }


  public void setInterestCommission(BigDecimal interestCommission) {
    this.interestCommission = interestCommission;
  }


  public InvestorFund depositAccountKey(String depositAccountKey) {
    
    this.depositAccountKey = depositAccountKey;
    return this;
  }

   /**
   * The key of the deposit account used by the guarantor (populated when the guaranty type is GUARANTOR). It can be null.
   * @return depositAccountKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the deposit account used by the guarantor (populated when the guaranty type is GUARANTOR). It can be null.")
  @JsonProperty(JSON_PROPERTY_DEPOSIT_ACCOUNT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepositAccountKey() {
    return depositAccountKey;
  }


  public void setDepositAccountKey(String depositAccountKey) {
    this.depositAccountKey = depositAccountKey;
  }


  public InvestorFund assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * The name of a value the client guarantees with (populated when the guaranty type is ASSET)
   * @return assetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of a value the client guarantees with (populated when the guaranty type is ASSET)")
  @JsonProperty(JSON_PROPERTY_ASSET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


   /**
   * The encoded key of the entity, generated, globally unique
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the entity, generated, globally unique")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public InvestorFund id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Investor fund unique identifier. All versions of an investor fund will have same id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Investor fund unique identifier. All versions of an investor fund will have same id.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public InvestorFund guarantorKey(String guarantorKey) {
    
    this.guarantorKey = guarantorKey;
    return this;
  }

   /**
   * The key of the client/group used as the guarantor.
   * @return guarantorKey
  **/
  @ApiModelProperty(required = true, value = "The key of the client/group used as the guarantor.")
  @JsonProperty(JSON_PROPERTY_GUARANTOR_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGuarantorKey() {
    return guarantorKey;
  }


  public void setGuarantorKey(String guarantorKey) {
    this.guarantorKey = guarantorKey;
  }


  public InvestorFund guarantorType(GuarantorTypeEnum guarantorType) {
    
    this.guarantorType = guarantorType;
    return this;
  }

   /**
   * The type of the guarantor (client/group)
   * @return guarantorType
  **/
  @ApiModelProperty(required = true, value = "The type of the guarantor (client/group)")
  @JsonProperty(JSON_PROPERTY_GUARANTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GuarantorTypeEnum getGuarantorType() {
    return guarantorType;
  }


  public void setGuarantorType(GuarantorTypeEnum guarantorType) {
    this.guarantorType = guarantorType;
  }


  public InvestorFund sharePercentage(BigDecimal sharePercentage) {
    
    this.sharePercentage = sharePercentage;
    return this;
  }

   /**
   * Percentage of loan shares this investor owns
   * @return sharePercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage of loan shares this investor owns")
  @JsonProperty(JSON_PROPERTY_SHARE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSharePercentage() {
    return sharePercentage;
  }


  public void setSharePercentage(BigDecimal sharePercentage) {
    this.sharePercentage = sharePercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestorFund investorFund = (InvestorFund) o;
    return Objects.equals(this.amount, investorFund.amount) &&
        Objects.equals(this.interestCommission, investorFund.interestCommission) &&
        Objects.equals(this.depositAccountKey, investorFund.depositAccountKey) &&
        Objects.equals(this.assetName, investorFund.assetName) &&
        Objects.equals(this.encodedKey, investorFund.encodedKey) &&
        Objects.equals(this.id, investorFund.id) &&
        Objects.equals(this.guarantorKey, investorFund.guarantorKey) &&
        Objects.equals(this.guarantorType, investorFund.guarantorType) &&
        Objects.equals(this.sharePercentage, investorFund.sharePercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, interestCommission, depositAccountKey, assetName, encodedKey, id, guarantorKey, guarantorType, sharePercentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestorFund {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    interestCommission: ").append(toIndentedString(interestCommission)).append("\n");
    sb.append("    depositAccountKey: ").append(toIndentedString(depositAccountKey)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guarantorKey: ").append(toIndentedString(guarantorKey)).append("\n");
    sb.append("    guarantorType: ").append(toIndentedString(guarantorType)).append("\n");
    sb.append("    sharePercentage: ").append(toIndentedString(sharePercentage)).append("\n");
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

