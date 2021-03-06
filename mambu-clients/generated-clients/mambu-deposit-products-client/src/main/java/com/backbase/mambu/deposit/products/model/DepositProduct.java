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
import com.backbase.mambu.deposit.products.model.CreditArrangementSettings;
import com.backbase.mambu.deposit.products.model.DepositMaturitySettings;
import com.backbase.mambu.deposit.products.model.DepositNewAccountSettings;
import com.backbase.mambu.deposit.products.model.DepositProductAccountingSettings;
import com.backbase.mambu.deposit.products.model.DepositProductAvailabilitySettings;
import com.backbase.mambu.deposit.products.model.DepositProductCurrencySettings;
import com.backbase.mambu.deposit.products.model.DepositProductFeeSettings;
import com.backbase.mambu.deposit.products.model.DepositProductInterestSettings;
import com.backbase.mambu.deposit.products.model.DepositProductInternalControls;
import com.backbase.mambu.deposit.products.model.DepositProductOffsetSettings;
import com.backbase.mambu.deposit.products.model.DepositProductOverdraftSettings;
import com.backbase.mambu.deposit.products.model.DepositProductTaxSettings;
import com.backbase.mambu.deposit.products.model.OverdraftInterestSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A deposit product defines the terms and constraints on deposit accounts
 */
@ApiModel(description = "A deposit product defines the terms and constraints on deposit accounts")
@JsonPropertyOrder({
  DepositProduct.JSON_PROPERTY_NOTES,
  DepositProduct.JSON_PROPERTY_LAST_MODIFIED_DATE,
  DepositProduct.JSON_PROPERTY_AVAILABILITY_SETTINGS,
  DepositProduct.JSON_PROPERTY_FEES_SETTINGS,
  DepositProduct.JSON_PROPERTY_TAX_SETTINGS,
  DepositProduct.JSON_PROPERTY_OFFSET_SETTINGS,
  DepositProduct.JSON_PROPERTY_CREATION_DATE,
  DepositProduct.JSON_PROPERTY_TYPE,
  DepositProduct.JSON_PROPERTY_CREDIT_ARRANGEMENT_SETTINGS,
  DepositProduct.JSON_PROPERTY_CURRENCY_SETTINGS,
  DepositProduct.JSON_PROPERTY_MATURITY_SETTINGS,
  DepositProduct.JSON_PROPERTY_NEW_ACCOUNT_SETTINGS,
  DepositProduct.JSON_PROPERTY_INTEREST_SETTINGS,
  DepositProduct.JSON_PROPERTY_ACCOUNTING_SETTINGS,
  DepositProduct.JSON_PROPERTY_NAME,
  DepositProduct.JSON_PROPERTY_ENCODED_KEY,
  DepositProduct.JSON_PROPERTY_ID,
  DepositProduct.JSON_PROPERTY_STATE,
  DepositProduct.JSON_PROPERTY_OVERDRAFT_SETTINGS,
  DepositProduct.JSON_PROPERTY_INTERNAL_CONTROLS,
  DepositProduct.JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS
})

public class DepositProduct {
  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  public static final String JSON_PROPERTY_AVAILABILITY_SETTINGS = "availabilitySettings";
  private DepositProductAvailabilitySettings availabilitySettings;

  public static final String JSON_PROPERTY_FEES_SETTINGS = "feesSettings";
  private DepositProductFeeSettings feesSettings;

  public static final String JSON_PROPERTY_TAX_SETTINGS = "taxSettings";
  private DepositProductTaxSettings taxSettings;

  public static final String JSON_PROPERTY_OFFSET_SETTINGS = "offsetSettings";
  private DepositProductOffsetSettings offsetSettings;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  /**
   * Indicates the type of product.
   */
  public enum TypeEnum {
    CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
    
    REGULAR_SAVINGS("REGULAR_SAVINGS"),
    
    FIXED_DEPOSIT("FIXED_DEPOSIT"),
    
    SAVINGS_PLAN("SAVINGS_PLAN"),
    
    INVESTOR_ACCOUNT("INVESTOR_ACCOUNT");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_CREDIT_ARRANGEMENT_SETTINGS = "creditArrangementSettings";
  private CreditArrangementSettings creditArrangementSettings;

  public static final String JSON_PROPERTY_CURRENCY_SETTINGS = "currencySettings";
  private DepositProductCurrencySettings currencySettings;

  public static final String JSON_PROPERTY_MATURITY_SETTINGS = "maturitySettings";
  private DepositMaturitySettings maturitySettings;

  public static final String JSON_PROPERTY_NEW_ACCOUNT_SETTINGS = "newAccountSettings";
  private DepositNewAccountSettings newAccountSettings;

  public static final String JSON_PROPERTY_INTEREST_SETTINGS = "interestSettings";
  private DepositProductInterestSettings interestSettings;

  public static final String JSON_PROPERTY_ACCOUNTING_SETTINGS = "accountingSettings";
  private DepositProductAccountingSettings accountingSettings;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Indicates the current state of the product
   */
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public static final String JSON_PROPERTY_OVERDRAFT_SETTINGS = "overdraftSettings";
  private DepositProductOverdraftSettings overdraftSettings;

  public static final String JSON_PROPERTY_INTERNAL_CONTROLS = "internalControls";
  private DepositProductInternalControls internalControls;

  public static final String JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS = "overdraftInterestSettings";
  private OverdraftInterestSettings overdraftInterestSettings;


  public DepositProduct notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Some notes/a description about the product
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Some notes/a description about the product")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


  public DepositProduct lastModifiedDate(OffsetDateTime lastModifiedDate) {
    
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * The last date the product was updated
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The last date the product was updated")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }


  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }


  public DepositProduct availabilitySettings(DepositProductAvailabilitySettings availabilitySettings) {
    
    this.availabilitySettings = availabilitySettings;
    return this;
  }

   /**
   * Get availabilitySettings
   * @return availabilitySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductAvailabilitySettings getAvailabilitySettings() {
    return availabilitySettings;
  }


  public void setAvailabilitySettings(DepositProductAvailabilitySettings availabilitySettings) {
    this.availabilitySettings = availabilitySettings;
  }


  public DepositProduct feesSettings(DepositProductFeeSettings feesSettings) {
    
    this.feesSettings = feesSettings;
    return this;
  }

   /**
   * Get feesSettings
   * @return feesSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FEES_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductFeeSettings getFeesSettings() {
    return feesSettings;
  }


  public void setFeesSettings(DepositProductFeeSettings feesSettings) {
    this.feesSettings = feesSettings;
  }


  public DepositProduct taxSettings(DepositProductTaxSettings taxSettings) {
    
    this.taxSettings = taxSettings;
    return this;
  }

   /**
   * Get taxSettings
   * @return taxSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductTaxSettings getTaxSettings() {
    return taxSettings;
  }


  public void setTaxSettings(DepositProductTaxSettings taxSettings) {
    this.taxSettings = taxSettings;
  }


  public DepositProduct offsetSettings(DepositProductOffsetSettings offsetSettings) {
    
    this.offsetSettings = offsetSettings;
    return this;
  }

   /**
   * Get offsetSettings
   * @return offsetSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductOffsetSettings getOffsetSettings() {
    return offsetSettings;
  }


  public void setOffsetSettings(DepositProductOffsetSettings offsetSettings) {
    this.offsetSettings = offsetSettings;
  }


  public DepositProduct creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * The date this product was created
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this product was created")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public DepositProduct type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of product.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of product.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public DepositProduct creditArrangementSettings(CreditArrangementSettings creditArrangementSettings) {
    
    this.creditArrangementSettings = creditArrangementSettings;
    return this;
  }

   /**
   * Get creditArrangementSettings
   * @return creditArrangementSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDIT_ARRANGEMENT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CreditArrangementSettings getCreditArrangementSettings() {
    return creditArrangementSettings;
  }


  public void setCreditArrangementSettings(CreditArrangementSettings creditArrangementSettings) {
    this.creditArrangementSettings = creditArrangementSettings;
  }


  public DepositProduct currencySettings(DepositProductCurrencySettings currencySettings) {
    
    this.currencySettings = currencySettings;
    return this;
  }

   /**
   * Get currencySettings
   * @return currencySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductCurrencySettings getCurrencySettings() {
    return currencySettings;
  }


  public void setCurrencySettings(DepositProductCurrencySettings currencySettings) {
    this.currencySettings = currencySettings;
  }


  public DepositProduct maturitySettings(DepositMaturitySettings maturitySettings) {
    
    this.maturitySettings = maturitySettings;
    return this;
  }

   /**
   * Get maturitySettings
   * @return maturitySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATURITY_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositMaturitySettings getMaturitySettings() {
    return maturitySettings;
  }


  public void setMaturitySettings(DepositMaturitySettings maturitySettings) {
    this.maturitySettings = maturitySettings;
  }


  public DepositProduct newAccountSettings(DepositNewAccountSettings newAccountSettings) {
    
    this.newAccountSettings = newAccountSettings;
    return this;
  }

   /**
   * Get newAccountSettings
   * @return newAccountSettings
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NEW_ACCOUNT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositNewAccountSettings getNewAccountSettings() {
    return newAccountSettings;
  }


  public void setNewAccountSettings(DepositNewAccountSettings newAccountSettings) {
    this.newAccountSettings = newAccountSettings;
  }


  public DepositProduct interestSettings(DepositProductInterestSettings interestSettings) {
    
    this.interestSettings = interestSettings;
    return this;
  }

   /**
   * Get interestSettings
   * @return interestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductInterestSettings getInterestSettings() {
    return interestSettings;
  }


  public void setInterestSettings(DepositProductInterestSettings interestSettings) {
    this.interestSettings = interestSettings;
  }


  public DepositProduct accountingSettings(DepositProductAccountingSettings accountingSettings) {
    
    this.accountingSettings = accountingSettings;
    return this;
  }

   /**
   * Get accountingSettings
   * @return accountingSettings
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DepositProductAccountingSettings getAccountingSettings() {
    return accountingSettings;
  }


  public void setAccountingSettings(DepositProductAccountingSettings accountingSettings) {
    this.accountingSettings = accountingSettings;
  }


  public DepositProduct name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the product
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the product")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The encoded key of the deposit product, auto generated, unique
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the deposit product, auto generated, unique")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public DepositProduct id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the product, can be generated and customized, unique
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The id of the product, can be generated and customized, unique")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DepositProduct state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the current state of the product
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Indicates the current state of the product")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public DepositProduct overdraftSettings(DepositProductOverdraftSettings overdraftSettings) {
    
    this.overdraftSettings = overdraftSettings;
    return this;
  }

   /**
   * Get overdraftSettings
   * @return overdraftSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductOverdraftSettings getOverdraftSettings() {
    return overdraftSettings;
  }


  public void setOverdraftSettings(DepositProductOverdraftSettings overdraftSettings) {
    this.overdraftSettings = overdraftSettings;
  }


  public DepositProduct internalControls(DepositProductInternalControls internalControls) {
    
    this.internalControls = internalControls;
    return this;
  }

   /**
   * Get internalControls
   * @return internalControls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_CONTROLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductInternalControls getInternalControls() {
    return internalControls;
  }


  public void setInternalControls(DepositProductInternalControls internalControls) {
    this.internalControls = internalControls;
  }


  public DepositProduct overdraftInterestSettings(OverdraftInterestSettings overdraftInterestSettings) {
    
    this.overdraftInterestSettings = overdraftInterestSettings;
    return this;
  }

   /**
   * Get overdraftInterestSettings
   * @return overdraftInterestSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OverdraftInterestSettings getOverdraftInterestSettings() {
    return overdraftInterestSettings;
  }


  public void setOverdraftInterestSettings(OverdraftInterestSettings overdraftInterestSettings) {
    this.overdraftInterestSettings = overdraftInterestSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositProduct depositProduct = (DepositProduct) o;
    return Objects.equals(this.notes, depositProduct.notes) &&
        Objects.equals(this.lastModifiedDate, depositProduct.lastModifiedDate) &&
        Objects.equals(this.availabilitySettings, depositProduct.availabilitySettings) &&
        Objects.equals(this.feesSettings, depositProduct.feesSettings) &&
        Objects.equals(this.taxSettings, depositProduct.taxSettings) &&
        Objects.equals(this.offsetSettings, depositProduct.offsetSettings) &&
        Objects.equals(this.creationDate, depositProduct.creationDate) &&
        Objects.equals(this.type, depositProduct.type) &&
        Objects.equals(this.creditArrangementSettings, depositProduct.creditArrangementSettings) &&
        Objects.equals(this.currencySettings, depositProduct.currencySettings) &&
        Objects.equals(this.maturitySettings, depositProduct.maturitySettings) &&
        Objects.equals(this.newAccountSettings, depositProduct.newAccountSettings) &&
        Objects.equals(this.interestSettings, depositProduct.interestSettings) &&
        Objects.equals(this.accountingSettings, depositProduct.accountingSettings) &&
        Objects.equals(this.name, depositProduct.name) &&
        Objects.equals(this.encodedKey, depositProduct.encodedKey) &&
        Objects.equals(this.id, depositProduct.id) &&
        Objects.equals(this.state, depositProduct.state) &&
        Objects.equals(this.overdraftSettings, depositProduct.overdraftSettings) &&
        Objects.equals(this.internalControls, depositProduct.internalControls) &&
        Objects.equals(this.overdraftInterestSettings, depositProduct.overdraftInterestSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, lastModifiedDate, availabilitySettings, feesSettings, taxSettings, offsetSettings, creationDate, type, creditArrangementSettings, currencySettings, maturitySettings, newAccountSettings, interestSettings, accountingSettings, name, encodedKey, id, state, overdraftSettings, internalControls, overdraftInterestSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositProduct {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    availabilitySettings: ").append(toIndentedString(availabilitySettings)).append("\n");
    sb.append("    feesSettings: ").append(toIndentedString(feesSettings)).append("\n");
    sb.append("    taxSettings: ").append(toIndentedString(taxSettings)).append("\n");
    sb.append("    offsetSettings: ").append(toIndentedString(offsetSettings)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creditArrangementSettings: ").append(toIndentedString(creditArrangementSettings)).append("\n");
    sb.append("    currencySettings: ").append(toIndentedString(currencySettings)).append("\n");
    sb.append("    maturitySettings: ").append(toIndentedString(maturitySettings)).append("\n");
    sb.append("    newAccountSettings: ").append(toIndentedString(newAccountSettings)).append("\n");
    sb.append("    interestSettings: ").append(toIndentedString(interestSettings)).append("\n");
    sb.append("    accountingSettings: ").append(toIndentedString(accountingSettings)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    overdraftSettings: ").append(toIndentedString(overdraftSettings)).append("\n");
    sb.append("    internalControls: ").append(toIndentedString(internalControls)).append("\n");
    sb.append("    overdraftInterestSettings: ").append(toIndentedString(overdraftInterestSettings)).append("\n");
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

