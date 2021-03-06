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
import com.backbase.mambu.deposit.products.model.DepositGLAccountingRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The response representation of the PredefinedFee. Represents a fee with a defined name and a fixed value.
 */
@ApiModel(description = "The response representation of the PredefinedFee. Represents a fee with a defined name and a fixed value.")
@JsonPropertyOrder({
  DepositProductPredefinedFee.JSON_PROPERTY_AMOUNT,
  DepositProductPredefinedFee.JSON_PROPERTY_ACCOUNTING_RULES,
  DepositProductPredefinedFee.JSON_PROPERTY_AMOUNT_CALCULATION_METHOD,
  DepositProductPredefinedFee.JSON_PROPERTY_NAME,
  DepositProductPredefinedFee.JSON_PROPERTY_FEE_APPLICATION,
  DepositProductPredefinedFee.JSON_PROPERTY_ENCODED_KEY,
  DepositProductPredefinedFee.JSON_PROPERTY_TRIGGER,
  DepositProductPredefinedFee.JSON_PROPERTY_STATE,
  DepositProductPredefinedFee.JSON_PROPERTY_CREATION_DATE,
  DepositProductPredefinedFee.JSON_PROPERTY_APPLY_DATE_METHOD
})

public class DepositProductPredefinedFee {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_ACCOUNTING_RULES = "accountingRules";
  private List<DepositGLAccountingRule> accountingRules = null;

  /**
   * The amount from which the fee is calculated using percentageAmount
   */
  public enum AmountCalculationMethodEnum {
    FLAT("FLAT"),
    
    LOAN_AMOUNT_PERCENTAGE("LOAN_AMOUNT_PERCENTAGE"),
    
    REPAYMENT_PRINCIPAL_AMOUNT_PERCENTAGE("REPAYMENT_PRINCIPAL_AMOUNT_PERCENTAGE"),
    
    LOAN_AMOUNT_PERCENTAGE_NUMBER_OF_INSTALLMENTS("LOAN_AMOUNT_PERCENTAGE_NUMBER_OF_INSTALLMENTS"),
    
    FLAT_NUMBER_OF_INSTALLMENTS("FLAT_NUMBER_OF_INSTALLMENTS");

    private String value;

    AmountCalculationMethodEnum(String value) {
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
    public static AmountCalculationMethodEnum fromValue(String value) {
      for (AmountCalculationMethodEnum b : AmountCalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AMOUNT_CALCULATION_METHOD = "amountCalculationMethod";
  private AmountCalculationMethodEnum amountCalculationMethod;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The type of fee application when disbursement is applied
   */
  public enum FeeApplicationEnum {
    REQUIRED("REQUIRED"),
    
    OPTIONAL("OPTIONAL");

    private String value;

    FeeApplicationEnum(String value) {
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
    public static FeeApplicationEnum fromValue(String value) {
      for (FeeApplicationEnum b : FeeApplicationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FEE_APPLICATION = "feeApplication";
  private FeeApplicationEnum feeApplication;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  /**
   * Shows the event that will trigger a fee
   */
  public enum TriggerEnum {
    MANUAL("MANUAL"),
    
    DISBURSEMENT("DISBURSEMENT"),
    
    CAPITALIZED_DISBURSEMENT("CAPITALIZED_DISBURSEMENT"),
    
    UPFRONT_DISBURSEMENT("UPFRONT_DISBURSEMENT"),
    
    LATE_REPAYMENT("LATE_REPAYMENT"),
    
    MONTHLY_FEE("MONTHLY_FEE"),
    
    PAYMENT_DUE("PAYMENT_DUE"),
    
    PAYMENT_DUE_APPLIED_ON_DUE_DATES("PAYMENT_DUE_APPLIED_ON_DUE_DATES"),
    
    ARBITRARY("ARBITRARY");

    private String value;

    TriggerEnum(String value) {
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
    public static TriggerEnum fromValue(String value) {
      for (TriggerEnum b : TriggerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private TriggerEnum trigger;

  /**
   * Indicates the state of the fee
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

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  /**
   * Shows when a fee should be applied; to be used with monthly deposit fees
   */
  public enum ApplyDateMethodEnum {
    MONTHLY_FROM_ACTIVATION("MONTHLY_FROM_ACTIVATION"),
    
    FIRST_OF_EVERY_MONTH("FIRST_OF_EVERY_MONTH");

    private String value;

    ApplyDateMethodEnum(String value) {
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
    public static ApplyDateMethodEnum fromValue(String value) {
      for (ApplyDateMethodEnum b : ApplyDateMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_APPLY_DATE_METHOD = "applyDateMethod";
  private ApplyDateMethodEnum applyDateMethod;


  public DepositProductPredefinedFee amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the fee
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the fee")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public DepositProductPredefinedFee accountingRules(List<DepositGLAccountingRule> accountingRules) {
    
    this.accountingRules = accountingRules;
    return this;
  }

  public DepositProductPredefinedFee addAccountingRulesItem(DepositGLAccountingRule accountingRulesItem) {
    if (this.accountingRules == null) {
      this.accountingRules = new ArrayList<>();
    }
    this.accountingRules.add(accountingRulesItem);
    return this;
  }

   /**
   * A list of accounting rules defined for this fee. If null, product default rules are selected.
   * @return accountingRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of accounting rules defined for this fee. If null, product default rules are selected.")
  @JsonProperty(JSON_PROPERTY_ACCOUNTING_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DepositGLAccountingRule> getAccountingRules() {
    return accountingRules;
  }


  public void setAccountingRules(List<DepositGLAccountingRule> accountingRules) {
    this.accountingRules = accountingRules;
  }


  public DepositProductPredefinedFee amountCalculationMethod(AmountCalculationMethodEnum amountCalculationMethod) {
    
    this.amountCalculationMethod = amountCalculationMethod;
    return this;
  }

   /**
   * The amount from which the fee is calculated using percentageAmount
   * @return amountCalculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount from which the fee is calculated using percentageAmount")
  @JsonProperty(JSON_PROPERTY_AMOUNT_CALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmountCalculationMethodEnum getAmountCalculationMethod() {
    return amountCalculationMethod;
  }


  public void setAmountCalculationMethod(AmountCalculationMethodEnum amountCalculationMethod) {
    this.amountCalculationMethod = amountCalculationMethod;
  }


  public DepositProductPredefinedFee name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the fee
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the fee")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DepositProductPredefinedFee feeApplication(FeeApplicationEnum feeApplication) {
    
    this.feeApplication = feeApplication;
    return this;
  }

   /**
   * The type of fee application when disbursement is applied
   * @return feeApplication
  **/
  @ApiModelProperty(required = true, value = "The type of fee application when disbursement is applied")
  @JsonProperty(JSON_PROPERTY_FEE_APPLICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FeeApplicationEnum getFeeApplication() {
    return feeApplication;
  }


  public void setFeeApplication(FeeApplicationEnum feeApplication) {
    this.feeApplication = feeApplication;
  }


   /**
   * The encoded key of the predefined fee, auto generated, unique
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the predefined fee, auto generated, unique")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public DepositProductPredefinedFee trigger(TriggerEnum trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Shows the event that will trigger a fee
   * @return trigger
  **/
  @ApiModelProperty(required = true, value = "Shows the event that will trigger a fee")
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TriggerEnum getTrigger() {
    return trigger;
  }


  public void setTrigger(TriggerEnum trigger) {
    this.trigger = trigger;
  }


  public DepositProductPredefinedFee state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Indicates the state of the fee
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Indicates the state of the fee")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public DepositProductPredefinedFee creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Shows the creation date of the fee
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "Shows the creation date of the fee")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public DepositProductPredefinedFee applyDateMethod(ApplyDateMethodEnum applyDateMethod) {
    
    this.applyDateMethod = applyDateMethod;
    return this;
  }

   /**
   * Shows when a fee should be applied; to be used with monthly deposit fees
   * @return applyDateMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows when a fee should be applied; to be used with monthly deposit fees")
  @JsonProperty(JSON_PROPERTY_APPLY_DATE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ApplyDateMethodEnum getApplyDateMethod() {
    return applyDateMethod;
  }


  public void setApplyDateMethod(ApplyDateMethodEnum applyDateMethod) {
    this.applyDateMethod = applyDateMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositProductPredefinedFee depositProductPredefinedFee = (DepositProductPredefinedFee) o;
    return Objects.equals(this.amount, depositProductPredefinedFee.amount) &&
        Objects.equals(this.accountingRules, depositProductPredefinedFee.accountingRules) &&
        Objects.equals(this.amountCalculationMethod, depositProductPredefinedFee.amountCalculationMethod) &&
        Objects.equals(this.name, depositProductPredefinedFee.name) &&
        Objects.equals(this.feeApplication, depositProductPredefinedFee.feeApplication) &&
        Objects.equals(this.encodedKey, depositProductPredefinedFee.encodedKey) &&
        Objects.equals(this.trigger, depositProductPredefinedFee.trigger) &&
        Objects.equals(this.state, depositProductPredefinedFee.state) &&
        Objects.equals(this.creationDate, depositProductPredefinedFee.creationDate) &&
        Objects.equals(this.applyDateMethod, depositProductPredefinedFee.applyDateMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, accountingRules, amountCalculationMethod, name, feeApplication, encodedKey, trigger, state, creationDate, applyDateMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositProductPredefinedFee {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    accountingRules: ").append(toIndentedString(accountingRules)).append("\n");
    sb.append("    amountCalculationMethod: ").append(toIndentedString(amountCalculationMethod)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    feeApplication: ").append(toIndentedString(feeApplication)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    applyDateMethod: ").append(toIndentedString(applyDateMethod)).append("\n");
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

