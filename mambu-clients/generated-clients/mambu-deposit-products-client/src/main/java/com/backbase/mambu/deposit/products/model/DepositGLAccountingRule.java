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
 * The GL accounting rule, it maps a financial resource with a GL account for a specific product (i.e loan or saving).
 */
@ApiModel(description = "The GL accounting rule, it maps a financial resource with a GL account for a specific product (i.e loan or saving).")
@JsonPropertyOrder({
  DepositGLAccountingRule.JSON_PROPERTY_ENCODED_KEY,
  DepositGLAccountingRule.JSON_PROPERTY_GL_ACCOUNT_KEY,
  DepositGLAccountingRule.JSON_PROPERTY_FINANCIAL_RESOURCE
})

public class DepositGLAccountingRule {
  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_GL_ACCOUNT_KEY = "glAccountKey";
  private String glAccountKey;

  /**
   * General Ledger Financial Resources used to setup the product accounting rules and determine the credit and debit accounts when logging journal entries
   */
  public enum FinancialResourceEnum {
    PORTFOLIO_CONTROL("PORTFOLIO_CONTROL"),
    
    FUND_SOURCE("FUND_SOURCE"),
    
    WRITE_OFF_EXPENSE("WRITE_OFF_EXPENSE"),
    
    INTEREST_INCOME("INTEREST_INCOME"),
    
    TAXES_PAYABLE("TAXES_PAYABLE"),
    
    FEE_INCOME("FEE_INCOME"),
    
    PENALTY_INCOME("PENALTY_INCOME"),
    
    INTEREST_RECEIVABLE("INTEREST_RECEIVABLE"),
    
    FEE_RECEIVABLE("FEE_RECEIVABLE"),
    
    PENALTY_RECEIVABLE("PENALTY_RECEIVABLE"),
    
    TAXES_RECEIVABLE("TAXES_RECEIVABLE"),
    
    DEFERRED_INTERESTS_INCOME("DEFERRED_INTERESTS_INCOME"),
    
    DEFERRED_FEE_INCOME("DEFERRED_FEE_INCOME"),
    
    DEFERRED_TAXES("DEFERRED_TAXES"),
    
    DEPOSIT_REFERENCE("DEPOSIT_REFERENCE"),
    
    SAVINGS_CONTROL("SAVINGS_CONTROL"),
    
    INTEREST_EXPENSE("INTEREST_EXPENSE"),
    
    INTEREST_PAYABLE("INTEREST_PAYABLE"),
    
    OVERDRAFT_PORTFOLIO_CONTROL("OVERDRAFT_PORTFOLIO_CONTROL"),
    
    OVERDRAFT_INTEREST_INCOME("OVERDRAFT_INTEREST_INCOME"),
    
    OVERDRAFT_WRITE_OFF_EXPENSE("OVERDRAFT_WRITE_OFF_EXPENSE"),
    
    OVERDRAFT_INTEREST_RECEIVABLE("OVERDRAFT_INTEREST_RECEIVABLE"),
    
    INTER_BRANCH_TRANSFER("INTER_BRANCH_TRANSFER");

    private String value;

    FinancialResourceEnum(String value) {
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
    public static FinancialResourceEnum fromValue(String value) {
      for (FinancialResourceEnum b : FinancialResourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FINANCIAL_RESOURCE = "financialResource";
  private FinancialResourceEnum financialResource;


   /**
   * The encoded key of the accounting rule, auto generated, unique.
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the accounting rule, auto generated, unique.")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public DepositGLAccountingRule glAccountKey(String glAccountKey) {
    
    this.glAccountKey = glAccountKey;
    return this;
  }

   /**
   * The encoded key of the account that is mapped to the financialResource
   * @return glAccountKey
  **/
  @ApiModelProperty(required = true, value = "The encoded key of the account that is mapped to the financialResource")
  @JsonProperty(JSON_PROPERTY_GL_ACCOUNT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGlAccountKey() {
    return glAccountKey;
  }


  public void setGlAccountKey(String glAccountKey) {
    this.glAccountKey = glAccountKey;
  }


  public DepositGLAccountingRule financialResource(FinancialResourceEnum financialResource) {
    
    this.financialResource = financialResource;
    return this;
  }

   /**
   * General Ledger Financial Resources used to setup the product accounting rules and determine the credit and debit accounts when logging journal entries
   * @return financialResource
  **/
  @ApiModelProperty(required = true, value = "General Ledger Financial Resources used to setup the product accounting rules and determine the credit and debit accounts when logging journal entries")
  @JsonProperty(JSON_PROPERTY_FINANCIAL_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FinancialResourceEnum getFinancialResource() {
    return financialResource;
  }


  public void setFinancialResource(FinancialResourceEnum financialResource) {
    this.financialResource = financialResource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositGLAccountingRule depositGLAccountingRule = (DepositGLAccountingRule) o;
    return Objects.equals(this.encodedKey, depositGLAccountingRule.encodedKey) &&
        Objects.equals(this.glAccountKey, depositGLAccountingRule.glAccountKey) &&
        Objects.equals(this.financialResource, depositGLAccountingRule.financialResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedKey, glAccountKey, financialResource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositGLAccountingRule {\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    glAccountKey: ").append(toIndentedString(glAccountKey)).append("\n");
    sb.append("    financialResource: ").append(toIndentedString(financialResource)).append("\n");
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

