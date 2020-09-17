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
import com.backbase.mambu.deposit.accounts.model.DepositAccountAccruedAmounts;
import com.backbase.mambu.deposit.accounts.model.DepositAccountBalances;
import com.backbase.mambu.deposit.accounts.model.DepositAccountIBAN;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInterestSettings;
import com.backbase.mambu.deposit.accounts.model.DepositAccountInternalControls;
import com.backbase.mambu.deposit.accounts.model.DepositAccountOverdraftInterestSettings;
import com.backbase.mambu.deposit.accounts.model.DepositAccountOverdraftSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An account where a customer holds his savings
 */
@ApiModel(description = "An account where a customer holds his savings")
@JsonPropertyOrder({
  DepositAccount.JSON_PROPERTY_ACCOUNT_STATE,
  DepositAccount.JSON_PROPERTY_MIGRATION_EVENT_KEY,
  DepositAccount.JSON_PROPERTY_NOTES,
  DepositAccount.JSON_PROPERTY_LAST_SET_TO_ARREARS_DATE,
  DepositAccount.JSON_PROPERTY_ASSIGNED_BRANCH_KEY,
  DepositAccount.JSON_PROPERTY_LAST_OVERDRAFT_INTEREST_REVIEW_DATE,
  DepositAccount.JSON_PROPERTY_LAST_INTEREST_STORED_DATE,
  DepositAccount.JSON_PROPERTY_INTEREST_SETTINGS,
  DepositAccount.JSON_PROPERTY_BALANCES,
  DepositAccount.JSON_PROPERTY_CREDIT_ARRANGEMENT_KEY,
  DepositAccount.JSON_PROPERTY_MATURITY_DATE,
  DepositAccount.JSON_PROPERTY_ENCODED_KEY,
  DepositAccount.JSON_PROPERTY_ID,
  DepositAccount.JSON_PROPERTY_OVERDRAFT_SETTINGS,
  DepositAccount.JSON_PROPERTY_LAST_ACCOUNT_APPRAISAL_DATE,
  DepositAccount.JSON_PROPERTY_WITHHOLDING_TAX_SOURCE_KEY,
  DepositAccount.JSON_PROPERTY_ASSIGNED_USER_KEY,
  DepositAccount.JSON_PROPERTY_I_B_A_N,
  DepositAccount.JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS,
  DepositAccount.JSON_PROPERTY_LAST_MODIFIED_DATE,
  DepositAccount.JSON_PROPERTY_ACCOUNT_TYPE,
  DepositAccount.JSON_PROPERTY_LOCKED_DATE,
  DepositAccount.JSON_PROPERTY_CREATION_DATE,
  DepositAccount.JSON_PROPERTY_LAST_INTEREST_CALCULATION_DATE,
  DepositAccount.JSON_PROPERTY_ASSIGNED_CENTRE_KEY,
  DepositAccount.JSON_PROPERTY_APPROVED_DATE,
  DepositAccount.JSON_PROPERTY_CLOSED_DATE,
  DepositAccount.JSON_PROPERTY_ACCRUED_AMOUNTS,
  DepositAccount.JSON_PROPERTY_NAME,
  DepositAccount.JSON_PROPERTY_ACCOUNT_HOLDER_KEY,
  DepositAccount.JSON_PROPERTY_PRODUCT_TYPE_KEY,
  DepositAccount.JSON_PROPERTY_ACTIVATION_DATE,
  DepositAccount.JSON_PROPERTY_INTERNAL_CONTROLS,
  DepositAccount.JSON_PROPERTY_CURRENCY_CODE,
  DepositAccount.JSON_PROPERTY_ACCOUNT_HOLDER_TYPE,
  DepositAccount.JSON_PROPERTY_LINKED_SETTLEMENT_ACCOUNT_KEYS
})

public class DepositAccount {
  /**
   * The state of the deposit account
   */
  public enum AccountStateEnum {
    PENDING_APPROVAL("PENDING_APPROVAL"),
    
    APPROVED("APPROVED"),
    
    ACTIVE("ACTIVE"),
    
    ACTIVE_IN_ARREARS("ACTIVE_IN_ARREARS"),
    
    MATURED("MATURED"),
    
    LOCKED("LOCKED"),
    
    DORMANT("DORMANT"),
    
    CLOSED("CLOSED"),
    
    CLOSED_WRITTEN_OFF("CLOSED_WRITTEN_OFF"),
    
    WITHDRAWN("WITHDRAWN"),
    
    CLOSED_REJECTED("CLOSED_REJECTED");

    private String value;

    AccountStateEnum(String value) {
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
    public static AccountStateEnum fromValue(String value) {
      for (AccountStateEnum b : AccountStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_STATE = "accountState";
  private AccountStateEnum accountState;

  public static final String JSON_PROPERTY_MIGRATION_EVENT_KEY = "migrationEventKey";
  private String migrationEventKey;

  public static final String JSON_PROPERTY_NOTES = "notes";
  private String notes;

  public static final String JSON_PROPERTY_LAST_SET_TO_ARREARS_DATE = "lastSetToArrearsDate";
  private OffsetDateTime lastSetToArrearsDate;

  public static final String JSON_PROPERTY_ASSIGNED_BRANCH_KEY = "assignedBranchKey";
  private String assignedBranchKey;

  public static final String JSON_PROPERTY_LAST_OVERDRAFT_INTEREST_REVIEW_DATE = "lastOverdraftInterestReviewDate";
  private OffsetDateTime lastOverdraftInterestReviewDate;

  public static final String JSON_PROPERTY_LAST_INTEREST_STORED_DATE = "lastInterestStoredDate";
  private OffsetDateTime lastInterestStoredDate;

  public static final String JSON_PROPERTY_INTEREST_SETTINGS = "interestSettings";
  private DepositAccountInterestSettings interestSettings;

  public static final String JSON_PROPERTY_BALANCES = "balances";
  private DepositAccountBalances balances;

  public static final String JSON_PROPERTY_CREDIT_ARRANGEMENT_KEY = "creditArrangementKey";
  private String creditArrangementKey;

  public static final String JSON_PROPERTY_MATURITY_DATE = "maturityDate";
  private OffsetDateTime maturityDate;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OVERDRAFT_SETTINGS = "overdraftSettings";
  private DepositAccountOverdraftSettings overdraftSettings;

  public static final String JSON_PROPERTY_LAST_ACCOUNT_APPRAISAL_DATE = "lastAccountAppraisalDate";
  private OffsetDateTime lastAccountAppraisalDate;

  public static final String JSON_PROPERTY_WITHHOLDING_TAX_SOURCE_KEY = "withholdingTaxSourceKey";
  private String withholdingTaxSourceKey;

  public static final String JSON_PROPERTY_ASSIGNED_USER_KEY = "assignedUserKey";
  private String assignedUserKey;

  public static final String JSON_PROPERTY_I_B_A_N = "_IBAN";
  private DepositAccountIBAN _IBAN;

  public static final String JSON_PROPERTY_OVERDRAFT_INTEREST_SETTINGS = "overdraftInterestSettings";
  private DepositAccountOverdraftInterestSettings overdraftInterestSettings;

  public static final String JSON_PROPERTY_LAST_MODIFIED_DATE = "lastModifiedDate";
  private OffsetDateTime lastModifiedDate;

  /**
   * Indicates the type of the deposit account and the product that it belongs to
   */
  public enum AccountTypeEnum {
    CURRENT_ACCOUNT("CURRENT_ACCOUNT"),
    
    REGULAR_SAVINGS("REGULAR_SAVINGS"),
    
    FIXED_DEPOSIT("FIXED_DEPOSIT"),
    
    SAVINGS_PLAN("SAVINGS_PLAN"),
    
    INVESTOR_ACCOUNT("INVESTOR_ACCOUNT");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountTypeEnum accountType;

  public static final String JSON_PROPERTY_LOCKED_DATE = "lockedDate";
  private OffsetDateTime lockedDate;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private OffsetDateTime creationDate;

  public static final String JSON_PROPERTY_LAST_INTEREST_CALCULATION_DATE = "lastInterestCalculationDate";
  private OffsetDateTime lastInterestCalculationDate;

  public static final String JSON_PROPERTY_ASSIGNED_CENTRE_KEY = "assignedCentreKey";
  private String assignedCentreKey;

  public static final String JSON_PROPERTY_APPROVED_DATE = "approvedDate";
  private OffsetDateTime approvedDate;

  public static final String JSON_PROPERTY_CLOSED_DATE = "closedDate";
  private OffsetDateTime closedDate;

  public static final String JSON_PROPERTY_ACCRUED_AMOUNTS = "accruedAmounts";
  private DepositAccountAccruedAmounts accruedAmounts;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_KEY = "accountHolderKey";
  private String accountHolderKey;

  public static final String JSON_PROPERTY_PRODUCT_TYPE_KEY = "productTypeKey";
  private String productTypeKey;

  public static final String JSON_PROPERTY_ACTIVATION_DATE = "activationDate";
  private OffsetDateTime activationDate;

  public static final String JSON_PROPERTY_INTERNAL_CONTROLS = "internalControls";
  private DepositAccountInternalControls internalControls;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  /**
   * The type of the account holder (i.e CLIENT or GROUP)
   */
  public enum AccountHolderTypeEnum {
    CLIENT("CLIENT"),
    
    GROUP("GROUP");

    private String value;

    AccountHolderTypeEnum(String value) {
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
    public static AccountHolderTypeEnum fromValue(String value) {
      for (AccountHolderTypeEnum b : AccountHolderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_HOLDER_TYPE = "accountHolderType";
  private AccountHolderTypeEnum accountHolderType;

  public static final String JSON_PROPERTY_LINKED_SETTLEMENT_ACCOUNT_KEYS = "linkedSettlementAccountKeys";
  private List<String> linkedSettlementAccountKeys = null;


   /**
   * The state of the deposit account
   * @return accountState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the deposit account")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountStateEnum getAccountState() {
    return accountState;
  }




   /**
   * The migration event encoded key associated with this deposit account. If this account was imported, track which &#39;migration event&#39; they came from.
   * @return migrationEventKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The migration event encoded key associated with this deposit account. If this account was imported, track which 'migration event' they came from.")
  @JsonProperty(JSON_PROPERTY_MIGRATION_EVENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMigrationEventKey() {
    return migrationEventKey;
  }




  public DepositAccount notes(String notes) {
    
    this.notes = notes;
    return this;
  }

   /**
   * Extra notes about this deposit account
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra notes about this deposit account")
  @JsonProperty(JSON_PROPERTY_NOTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNotes() {
    return notes;
  }


  public void setNotes(String notes) {
    this.notes = notes;
  }


   /**
   * Date when the deposit account was set to In Arrears state, or null if the account is not In Arrears state (as Organization Time)
   * @return lastSetToArrearsDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "Date when the deposit account was set to In Arrears state, or null if the account is not In Arrears state (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_LAST_SET_TO_ARREARS_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastSetToArrearsDate() {
    return lastSetToArrearsDate;
  }




  public DepositAccount assignedBranchKey(String assignedBranchKey) {
    
    this.assignedBranchKey = assignedBranchKey;
    return this;
  }

   /**
   * Key of the branch this deposit account is assigned to
   * @return assignedBranchKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key of the branch this deposit account is assigned to")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_BRANCH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignedBranchKey() {
    return assignedBranchKey;
  }


  public void setAssignedBranchKey(String assignedBranchKey) {
    this.assignedBranchKey = assignedBranchKey;
  }


   /**
   * When the overdraft interest was last time reviewed
   * @return lastOverdraftInterestReviewDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "When the overdraft interest was last time reviewed")
  @JsonProperty(JSON_PROPERTY_LAST_OVERDRAFT_INTEREST_REVIEW_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastOverdraftInterestReviewDate() {
    return lastOverdraftInterestReviewDate;
  }




   /**
   * When/if the account had last interest applied (stored to balance) (as Organization Time)
   * @return lastInterestStoredDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "When/if the account had last interest applied (stored to balance) (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_LAST_INTEREST_STORED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastInterestStoredDate() {
    return lastInterestStoredDate;
  }




  public DepositAccount interestSettings(DepositAccountInterestSettings interestSettings) {
    
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

  public DepositAccountInterestSettings getInterestSettings() {
    return interestSettings;
  }


  public void setInterestSettings(DepositAccountInterestSettings interestSettings) {
    this.interestSettings = interestSettings;
  }


  public DepositAccount balances(DepositAccountBalances balances) {
    
    this.balances = balances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositAccountBalances getBalances() {
    return balances;
  }


  public void setBalances(DepositAccountBalances balances) {
    this.balances = balances;
  }


  public DepositAccount creditArrangementKey(String creditArrangementKey) {
    
    this.creditArrangementKey = creditArrangementKey;
    return this;
  }

   /**
   * The key to the credit arrangement where this account is registered to
   * @return creditArrangementKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key to the credit arrangement where this account is registered to")
  @JsonProperty(JSON_PROPERTY_CREDIT_ARRANGEMENT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditArrangementKey() {
    return creditArrangementKey;
  }


  public void setCreditArrangementKey(String creditArrangementKey) {
    this.creditArrangementKey = creditArrangementKey;
  }


   /**
   * For fixed or compulsory savings plans, this is when the account matures (as Organization Time)
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "For fixed or compulsory savings plans, this is when the account matures (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }




   /**
   * The encoded key of the deposit account, auto generated, unique
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the deposit account, auto generated, unique")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public DepositAccount id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the deposit account, can be generated and customized, unique
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deposit account, can be generated and customized, unique")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DepositAccount overdraftSettings(DepositAccountOverdraftSettings overdraftSettings) {
    
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

  public DepositAccountOverdraftSettings getOverdraftSettings() {
    return overdraftSettings;
  }


  public void setOverdraftSettings(DepositAccountOverdraftSettings overdraftSettings) {
    this.overdraftSettings = overdraftSettings;
  }


   /**
   * When/if the account had last been evaluated for interest calculations/maturity (as Organization Time)
   * @return lastAccountAppraisalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "When/if the account had last been evaluated for interest calculations/maturity (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_LAST_ACCOUNT_APPRAISAL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastAccountAppraisalDate() {
    return lastAccountAppraisalDate;
  }




  public DepositAccount withholdingTaxSourceKey(String withholdingTaxSourceKey) {
    
    this.withholdingTaxSourceKey = withholdingTaxSourceKey;
    return this;
  }

   /**
   * The tax source from where the account withholding taxes will be updated
   * @return withholdingTaxSourceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tax source from where the account withholding taxes will be updated")
  @JsonProperty(JSON_PROPERTY_WITHHOLDING_TAX_SOURCE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWithholdingTaxSourceKey() {
    return withholdingTaxSourceKey;
  }


  public void setWithholdingTaxSourceKey(String withholdingTaxSourceKey) {
    this.withholdingTaxSourceKey = withholdingTaxSourceKey;
  }


  public DepositAccount assignedUserKey(String assignedUserKey) {
    
    this.assignedUserKey = assignedUserKey;
    return this;
  }

   /**
   * Key of the user this deposit is assigned to
   * @return assignedUserKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key of the user this deposit is assigned to")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_USER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignedUserKey() {
    return assignedUserKey;
  }


  public void setAssignedUserKey(String assignedUserKey) {
    this.assignedUserKey = assignedUserKey;
  }


  public DepositAccount _IBAN(DepositAccountIBAN _IBAN) {
    
    this._IBAN = _IBAN;
    return this;
  }

   /**
   * Get _IBAN
   * @return _IBAN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_I_B_A_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositAccountIBAN getIBAN() {
    return _IBAN;
  }


  public void setIBAN(DepositAccountIBAN _IBAN) {
    this._IBAN = _IBAN;
  }


  public DepositAccount overdraftInterestSettings(DepositAccountOverdraftInterestSettings overdraftInterestSettings) {
    
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

  public DepositAccountOverdraftInterestSettings getOverdraftInterestSettings() {
    return overdraftInterestSettings;
  }


  public void setOverdraftInterestSettings(DepositAccountOverdraftInterestSettings overdraftInterestSettings) {
    this.overdraftInterestSettings = overdraftInterestSettings;
  }


   /**
   * The last date the deposit account was updated (as UTC)
   * @return lastModifiedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The last date the deposit account was updated (as UTC)")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }




  public DepositAccount accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Indicates the type of the deposit account and the product that it belongs to
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates the type of the deposit account and the product that it belongs to")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


   /**
   * The date this deposit account was locked (as Organization Time)
   * @return lockedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this deposit account was locked (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_LOCKED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLockedDate() {
    return lockedDate;
  }




   /**
   * The date this deposit account was created (as UTC)
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this deposit account was created (as UTC)")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }




   /**
   * When/if the account had the interest last calculated (as Organization Time)
   * @return lastInterestCalculationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "When/if the account had the interest last calculated (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_LAST_INTEREST_CALCULATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastInterestCalculationDate() {
    return lastInterestCalculationDate;
  }




  public DepositAccount assignedCentreKey(String assignedCentreKey) {
    
    this.assignedCentreKey = assignedCentreKey;
    return this;
  }

   /**
   * Key of the centre this account is assigned to
   * @return assignedCentreKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key of the centre this account is assigned to")
  @JsonProperty(JSON_PROPERTY_ASSIGNED_CENTRE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssignedCentreKey() {
    return assignedCentreKey;
  }


  public void setAssignedCentreKey(String assignedCentreKey) {
    this.assignedCentreKey = assignedCentreKey;
  }


   /**
   * The date this deposit account was approved (as Organization Time)
   * @return approvedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this deposit account was approved (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_APPROVED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getApprovedDate() {
    return approvedDate;
  }




   /**
   * The date this deposit account was closed (as UTC)
   * @return closedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this deposit account was closed (as UTC)")
  @JsonProperty(JSON_PROPERTY_CLOSED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getClosedDate() {
    return closedDate;
  }




  public DepositAccount accruedAmounts(DepositAccountAccruedAmounts accruedAmounts) {
    
    this.accruedAmounts = accruedAmounts;
    return this;
  }

   /**
   * Get accruedAmounts
   * @return accruedAmounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCRUED_AMOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositAccountAccruedAmounts getAccruedAmounts() {
    return accruedAmounts;
  }


  public void setAccruedAmounts(DepositAccountAccruedAmounts accruedAmounts) {
    this.accruedAmounts = accruedAmounts;
  }


  public DepositAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the deposit account
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the deposit account")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DepositAccount accountHolderKey(String accountHolderKey) {
    
    this.accountHolderKey = accountHolderKey;
    return this;
  }

   /**
   * The encodedKey of the client or group (a.k.a account holder)
   * @return accountHolderKey
  **/
  @ApiModelProperty(required = true, value = "The encodedKey of the client or group (a.k.a account holder)")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountHolderKey() {
    return accountHolderKey;
  }


  public void setAccountHolderKey(String accountHolderKey) {
    this.accountHolderKey = accountHolderKey;
  }


  public DepositAccount productTypeKey(String productTypeKey) {
    
    this.productTypeKey = productTypeKey;
    return this;
  }

   /**
   * The key to the type of product that this account is based on
   * @return productTypeKey
  **/
  @ApiModelProperty(required = true, value = "The key to the type of product that this account is based on")
  @JsonProperty(JSON_PROPERTY_PRODUCT_TYPE_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProductTypeKey() {
    return productTypeKey;
  }


  public void setProductTypeKey(String productTypeKey) {
    this.productTypeKey = productTypeKey;
  }


   /**
   * The date this deposit account was activated (as Organization Time)
   * @return activationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-09-06T13:37:50+03:00", value = "The date this deposit account was activated (as Organization Time)")
  @JsonProperty(JSON_PROPERTY_ACTIVATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActivationDate() {
    return activationDate;
  }




  public DepositAccount internalControls(DepositAccountInternalControls internalControls) {
    
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

  public DepositAccountInternalControls getInternalControls() {
    return internalControls;
  }


  public void setInternalControls(DepositAccountInternalControls internalControls) {
    this.internalControls = internalControls;
  }


  public DepositAccount currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The currency code")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public DepositAccount accountHolderType(AccountHolderTypeEnum accountHolderType) {
    
    this.accountHolderType = accountHolderType;
    return this;
  }

   /**
   * The type of the account holder (i.e CLIENT or GROUP)
   * @return accountHolderType
  **/
  @ApiModelProperty(required = true, value = "The type of the account holder (i.e CLIENT or GROUP)")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountHolderTypeEnum getAccountHolderType() {
    return accountHolderType;
  }


  public void setAccountHolderType(AccountHolderTypeEnum accountHolderType) {
    this.accountHolderType = accountHolderType;
  }


   /**
   * Lists all loan&#39;s keys on which the deposit is used as a settlement account.
   * @return linkedSettlementAccountKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists all loan's keys on which the deposit is used as a settlement account.")
  @JsonProperty(JSON_PROPERTY_LINKED_SETTLEMENT_ACCOUNT_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLinkedSettlementAccountKeys() {
    return linkedSettlementAccountKeys;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositAccount depositAccount = (DepositAccount) o;
    return Objects.equals(this.accountState, depositAccount.accountState) &&
        Objects.equals(this.migrationEventKey, depositAccount.migrationEventKey) &&
        Objects.equals(this.notes, depositAccount.notes) &&
        Objects.equals(this.lastSetToArrearsDate, depositAccount.lastSetToArrearsDate) &&
        Objects.equals(this.assignedBranchKey, depositAccount.assignedBranchKey) &&
        Objects.equals(this.lastOverdraftInterestReviewDate, depositAccount.lastOverdraftInterestReviewDate) &&
        Objects.equals(this.lastInterestStoredDate, depositAccount.lastInterestStoredDate) &&
        Objects.equals(this.interestSettings, depositAccount.interestSettings) &&
        Objects.equals(this.balances, depositAccount.balances) &&
        Objects.equals(this.creditArrangementKey, depositAccount.creditArrangementKey) &&
        Objects.equals(this.maturityDate, depositAccount.maturityDate) &&
        Objects.equals(this.encodedKey, depositAccount.encodedKey) &&
        Objects.equals(this.id, depositAccount.id) &&
        Objects.equals(this.overdraftSettings, depositAccount.overdraftSettings) &&
        Objects.equals(this.lastAccountAppraisalDate, depositAccount.lastAccountAppraisalDate) &&
        Objects.equals(this.withholdingTaxSourceKey, depositAccount.withholdingTaxSourceKey) &&
        Objects.equals(this.assignedUserKey, depositAccount.assignedUserKey) &&
        Objects.equals(this._IBAN, depositAccount._IBAN) &&
        Objects.equals(this.overdraftInterestSettings, depositAccount.overdraftInterestSettings) &&
        Objects.equals(this.lastModifiedDate, depositAccount.lastModifiedDate) &&
        Objects.equals(this.accountType, depositAccount.accountType) &&
        Objects.equals(this.lockedDate, depositAccount.lockedDate) &&
        Objects.equals(this.creationDate, depositAccount.creationDate) &&
        Objects.equals(this.lastInterestCalculationDate, depositAccount.lastInterestCalculationDate) &&
        Objects.equals(this.assignedCentreKey, depositAccount.assignedCentreKey) &&
        Objects.equals(this.approvedDate, depositAccount.approvedDate) &&
        Objects.equals(this.closedDate, depositAccount.closedDate) &&
        Objects.equals(this.accruedAmounts, depositAccount.accruedAmounts) &&
        Objects.equals(this.name, depositAccount.name) &&
        Objects.equals(this.accountHolderKey, depositAccount.accountHolderKey) &&
        Objects.equals(this.productTypeKey, depositAccount.productTypeKey) &&
        Objects.equals(this.activationDate, depositAccount.activationDate) &&
        Objects.equals(this.internalControls, depositAccount.internalControls) &&
        Objects.equals(this.currencyCode, depositAccount.currencyCode) &&
        Objects.equals(this.accountHolderType, depositAccount.accountHolderType) &&
        Objects.equals(this.linkedSettlementAccountKeys, depositAccount.linkedSettlementAccountKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountState, migrationEventKey, notes, lastSetToArrearsDate, assignedBranchKey, lastOverdraftInterestReviewDate, lastInterestStoredDate, interestSettings, balances, creditArrangementKey, maturityDate, encodedKey, id, overdraftSettings, lastAccountAppraisalDate, withholdingTaxSourceKey, assignedUserKey, _IBAN, overdraftInterestSettings, lastModifiedDate, accountType, lockedDate, creationDate, lastInterestCalculationDate, assignedCentreKey, approvedDate, closedDate, accruedAmounts, name, accountHolderKey, productTypeKey, activationDate, internalControls, currencyCode, accountHolderType, linkedSettlementAccountKeys);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositAccount {\n");
    sb.append("    accountState: ").append(toIndentedString(accountState)).append("\n");
    sb.append("    migrationEventKey: ").append(toIndentedString(migrationEventKey)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    lastSetToArrearsDate: ").append(toIndentedString(lastSetToArrearsDate)).append("\n");
    sb.append("    assignedBranchKey: ").append(toIndentedString(assignedBranchKey)).append("\n");
    sb.append("    lastOverdraftInterestReviewDate: ").append(toIndentedString(lastOverdraftInterestReviewDate)).append("\n");
    sb.append("    lastInterestStoredDate: ").append(toIndentedString(lastInterestStoredDate)).append("\n");
    sb.append("    interestSettings: ").append(toIndentedString(interestSettings)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    creditArrangementKey: ").append(toIndentedString(creditArrangementKey)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    overdraftSettings: ").append(toIndentedString(overdraftSettings)).append("\n");
    sb.append("    lastAccountAppraisalDate: ").append(toIndentedString(lastAccountAppraisalDate)).append("\n");
    sb.append("    withholdingTaxSourceKey: ").append(toIndentedString(withholdingTaxSourceKey)).append("\n");
    sb.append("    assignedUserKey: ").append(toIndentedString(assignedUserKey)).append("\n");
    sb.append("    _IBAN: ").append(toIndentedString(_IBAN)).append("\n");
    sb.append("    overdraftInterestSettings: ").append(toIndentedString(overdraftInterestSettings)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    lockedDate: ").append(toIndentedString(lockedDate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastInterestCalculationDate: ").append(toIndentedString(lastInterestCalculationDate)).append("\n");
    sb.append("    assignedCentreKey: ").append(toIndentedString(assignedCentreKey)).append("\n");
    sb.append("    approvedDate: ").append(toIndentedString(approvedDate)).append("\n");
    sb.append("    closedDate: ").append(toIndentedString(closedDate)).append("\n");
    sb.append("    accruedAmounts: ").append(toIndentedString(accruedAmounts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountHolderKey: ").append(toIndentedString(accountHolderKey)).append("\n");
    sb.append("    productTypeKey: ").append(toIndentedString(productTypeKey)).append("\n");
    sb.append("    activationDate: ").append(toIndentedString(activationDate)).append("\n");
    sb.append("    internalControls: ").append(toIndentedString(internalControls)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    accountHolderType: ").append(toIndentedString(accountHolderType)).append("\n");
    sb.append("    linkedSettlementAccountKeys: ").append(toIndentedString(linkedSettlementAccountKeys)).append("\n");
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

