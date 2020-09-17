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
import com.backbase.mambu.deposit.products.model.DepositProductInterestRateSettings;
import com.backbase.mambu.deposit.products.model.InterestPaymentSettings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The interest settings, defines constraints regarding interest that will be used on the deposit account based on this product.
 */
@ApiModel(description = "The interest settings, defines constraints regarding interest that will be used on the deposit account based on this product.")
@JsonPropertyOrder({
  DepositProductInterestSettings.JSON_PROPERTY_INTEREST_RATE_SETTINGS,
  DepositProductInterestSettings.JSON_PROPERTY_COLLECT_INTEREST_WHEN_LOCKED,
  DepositProductInterestSettings.JSON_PROPERTY_INTEREST_CALCULATION_BALANCE,
  DepositProductInterestSettings.JSON_PROPERTY_INTEREST_PAID_INTO_ACCOUNT,
  DepositProductInterestSettings.JSON_PROPERTY_MAXIMUM_BALANCE,
  DepositProductInterestSettings.JSON_PROPERTY_DAYS_IN_YEAR,
  DepositProductInterestSettings.JSON_PROPERTY_INTEREST_PAYMENT_SETTINGS
})

public class DepositProductInterestSettings {
  public static final String JSON_PROPERTY_INTEREST_RATE_SETTINGS = "interestRateSettings";
  private DepositProductInterestRateSettings interestRateSettings;

  public static final String JSON_PROPERTY_COLLECT_INTEREST_WHEN_LOCKED = "collectInterestWhenLocked";
  private Boolean collectInterestWhenLocked;

  /**
   * The balance which is used for the Interest calculation
   */
  public enum InterestCalculationBalanceEnum {
    MINIMUM("MINIMUM"),
    
    AVERAGE("AVERAGE"),
    
    END_OF_DAY("END_OF_DAY"),
    
    MINIMUM_TO_END_OF_DAY("MINIMUM_TO_END_OF_DAY");

    private String value;

    InterestCalculationBalanceEnum(String value) {
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
    public static InterestCalculationBalanceEnum fromValue(String value) {
      for (InterestCalculationBalanceEnum b : InterestCalculationBalanceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_CALCULATION_BALANCE = "interestCalculationBalance";
  private InterestCalculationBalanceEnum interestCalculationBalance;

  public static final String JSON_PROPERTY_INTEREST_PAID_INTO_ACCOUNT = "interestPaidIntoAccount";
  private Boolean interestPaidIntoAccount;

  public static final String JSON_PROPERTY_MAXIMUM_BALANCE = "maximumBalance";
  private BigDecimal maximumBalance;

  /**
   * How many days in a year should be used for interest calculations
   */
  public enum DaysInYearEnum {
    ACTUAL_365_FIXED("ACTUAL_365_FIXED"),
    
    ACTUAL_360("ACTUAL_360"),
    
    ACTUAL_ACTUAL_ISDA("ACTUAL_ACTUAL_ISDA"),
    
    E30_360("E30_360"),
    
    E30_42_365("E30_42_365");

    private String value;

    DaysInYearEnum(String value) {
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
    public static DaysInYearEnum fromValue(String value) {
      for (DaysInYearEnum b : DaysInYearEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DAYS_IN_YEAR = "daysInYear";
  private DaysInYearEnum daysInYear;

  public static final String JSON_PROPERTY_INTEREST_PAYMENT_SETTINGS = "interestPaymentSettings";
  private InterestPaymentSettings interestPaymentSettings;


  public DepositProductInterestSettings interestRateSettings(DepositProductInterestRateSettings interestRateSettings) {
    
    this.interestRateSettings = interestRateSettings;
    return this;
  }

   /**
   * Get interestRateSettings
   * @return interestRateSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DepositProductInterestRateSettings getInterestRateSettings() {
    return interestRateSettings;
  }


  public void setInterestRateSettings(DepositProductInterestRateSettings interestRateSettings) {
    this.interestRateSettings = interestRateSettings;
  }


  public DepositProductInterestSettings collectInterestWhenLocked(Boolean collectInterestWhenLocked) {
    
    this.collectInterestWhenLocked = collectInterestWhenLocked;
    return this;
  }

   /**
   * Whether locked accounts still collect Interest or not
   * @return collectInterestWhenLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether locked accounts still collect Interest or not")
  @JsonProperty(JSON_PROPERTY_COLLECT_INTEREST_WHEN_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCollectInterestWhenLocked() {
    return collectInterestWhenLocked;
  }


  public void setCollectInterestWhenLocked(Boolean collectInterestWhenLocked) {
    this.collectInterestWhenLocked = collectInterestWhenLocked;
  }


  public DepositProductInterestSettings interestCalculationBalance(InterestCalculationBalanceEnum interestCalculationBalance) {
    
    this.interestCalculationBalance = interestCalculationBalance;
    return this;
  }

   /**
   * The balance which is used for the Interest calculation
   * @return interestCalculationBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The balance which is used for the Interest calculation")
  @JsonProperty(JSON_PROPERTY_INTEREST_CALCULATION_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestCalculationBalanceEnum getInterestCalculationBalance() {
    return interestCalculationBalance;
  }


  public void setInterestCalculationBalance(InterestCalculationBalanceEnum interestCalculationBalance) {
    this.interestCalculationBalance = interestCalculationBalance;
  }


  public DepositProductInterestSettings interestPaidIntoAccount(Boolean interestPaidIntoAccount) {
    
    this.interestPaidIntoAccount = interestPaidIntoAccount;
    return this;
  }

   /**
   * If interest should be payed into the deposit account
   * @return interestPaidIntoAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If interest should be payed into the deposit account")
  @JsonProperty(JSON_PROPERTY_INTEREST_PAID_INTO_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInterestPaidIntoAccount() {
    return interestPaidIntoAccount;
  }


  public void setInterestPaidIntoAccount(Boolean interestPaidIntoAccount) {
    this.interestPaidIntoAccount = interestPaidIntoAccount;
  }


  public DepositProductInterestSettings maximumBalance(BigDecimal maximumBalance) {
    
    this.maximumBalance = maximumBalance;
    return this;
  }

   /**
   * The maximum balance used for Interest calculation
   * @return maximumBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum balance used for Interest calculation")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMaximumBalance() {
    return maximumBalance;
  }


  public void setMaximumBalance(BigDecimal maximumBalance) {
    this.maximumBalance = maximumBalance;
  }


  public DepositProductInterestSettings daysInYear(DaysInYearEnum daysInYear) {
    
    this.daysInYear = daysInYear;
    return this;
  }

   /**
   * How many days in a year should be used for interest calculations
   * @return daysInYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many days in a year should be used for interest calculations")
  @JsonProperty(JSON_PROPERTY_DAYS_IN_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DaysInYearEnum getDaysInYear() {
    return daysInYear;
  }


  public void setDaysInYear(DaysInYearEnum daysInYear) {
    this.daysInYear = daysInYear;
  }


  public DepositProductInterestSettings interestPaymentSettings(InterestPaymentSettings interestPaymentSettings) {
    
    this.interestPaymentSettings = interestPaymentSettings;
    return this;
  }

   /**
   * Get interestPaymentSettings
   * @return interestPaymentSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST_PAYMENT_SETTINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestPaymentSettings getInterestPaymentSettings() {
    return interestPaymentSettings;
  }


  public void setInterestPaymentSettings(InterestPaymentSettings interestPaymentSettings) {
    this.interestPaymentSettings = interestPaymentSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositProductInterestSettings depositProductInterestSettings = (DepositProductInterestSettings) o;
    return Objects.equals(this.interestRateSettings, depositProductInterestSettings.interestRateSettings) &&
        Objects.equals(this.collectInterestWhenLocked, depositProductInterestSettings.collectInterestWhenLocked) &&
        Objects.equals(this.interestCalculationBalance, depositProductInterestSettings.interestCalculationBalance) &&
        Objects.equals(this.interestPaidIntoAccount, depositProductInterestSettings.interestPaidIntoAccount) &&
        Objects.equals(this.maximumBalance, depositProductInterestSettings.maximumBalance) &&
        Objects.equals(this.daysInYear, depositProductInterestSettings.daysInYear) &&
        Objects.equals(this.interestPaymentSettings, depositProductInterestSettings.interestPaymentSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateSettings, collectInterestWhenLocked, interestCalculationBalance, interestPaidIntoAccount, maximumBalance, daysInYear, interestPaymentSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositProductInterestSettings {\n");
    sb.append("    interestRateSettings: ").append(toIndentedString(interestRateSettings)).append("\n");
    sb.append("    collectInterestWhenLocked: ").append(toIndentedString(collectInterestWhenLocked)).append("\n");
    sb.append("    interestCalculationBalance: ").append(toIndentedString(interestCalculationBalance)).append("\n");
    sb.append("    interestPaidIntoAccount: ").append(toIndentedString(interestPaidIntoAccount)).append("\n");
    sb.append("    maximumBalance: ").append(toIndentedString(maximumBalance)).append("\n");
    sb.append("    daysInYear: ").append(toIndentedString(daysInYear)).append("\n");
    sb.append("    interestPaymentSettings: ").append(toIndentedString(interestPaymentSettings)).append("\n");
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
