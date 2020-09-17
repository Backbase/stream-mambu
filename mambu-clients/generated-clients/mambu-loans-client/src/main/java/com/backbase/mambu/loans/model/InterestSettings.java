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
 * The interest settings, holds all the properties regarding interests for the loan account.
 */
@ApiModel(description = "The interest settings, holds all the properties regarding interests for the loan account.")
@JsonPropertyOrder({
  InterestSettings.JSON_PROPERTY_INTEREST_RATE_REVIEW_UNIT,
  InterestSettings.JSON_PROPERTY_INTEREST_RATE,
  InterestSettings.JSON_PROPERTY_INTEREST_RATE_SOURCE,
  InterestSettings.JSON_PROPERTY_INTEREST_APPLICATION_METHOD,
  InterestSettings.JSON_PROPERTY_INTEREST_CHARGE_FREQUENCY,
  InterestSettings.JSON_PROPERTY_INTEREST_TYPE,
  InterestSettings.JSON_PROPERTY_ACCRUE_INTEREST_AFTER_MATURITY,
  InterestSettings.JSON_PROPERTY_INTEREST_BALANCE_CALCULATION_METHOD,
  InterestSettings.JSON_PROPERTY_INTEREST_SPREAD,
  InterestSettings.JSON_PROPERTY_INTEREST_CALCULATION_METHOD,
  InterestSettings.JSON_PROPERTY_INTEREST_RATE_REVIEW_COUNT,
  InterestSettings.JSON_PROPERTY_ACCRUE_LATE_INTEREST
})

public class InterestSettings {
  /**
   * The interest rate review unit. Defines the interest rate update frequency measurement unit.
   */
  public enum InterestRateReviewUnitEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS");

    private String value;

    InterestRateReviewUnitEnum(String value) {
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
    public static InterestRateReviewUnitEnum fromValue(String value) {
      for (InterestRateReviewUnitEnum b : InterestRateReviewUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_RATE_REVIEW_UNIT = "interestRateReviewUnit";
  private InterestRateReviewUnitEnum interestRateReviewUnit;

  public static final String JSON_PROPERTY_INTEREST_RATE = "interestRate";
  private BigDecimal interestRate;

  /**
   * The interest rate source. Represents the interest calculation method: fixed or (interest spread + active organization index interest rate)
   */
  public enum InterestRateSourceEnum {
    FIXED_INTEREST_RATE("FIXED_INTEREST_RATE"),
    
    INDEX_INTEREST_RATE("INDEX_INTEREST_RATE");

    private String value;

    InterestRateSourceEnum(String value) {
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
    public static InterestRateSourceEnum fromValue(String value) {
      for (InterestRateSourceEnum b : InterestRateSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_RATE_SOURCE = "interestRateSource";
  private InterestRateSourceEnum interestRateSource;

  /**
   * The interest application method. Represents the interest application method that determines whether the interest gets applied on the account&#39;s disbursement or on each repayment.
   */
  public enum InterestApplicationMethodEnum {
    AFTER_DISBURSEMENT("AFTER_DISBURSEMENT"),
    
    REPAYMENT_DUE_DATE("REPAYMENT_DUE_DATE");

    private String value;

    InterestApplicationMethodEnum(String value) {
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
    public static InterestApplicationMethodEnum fromValue(String value) {
      for (InterestApplicationMethodEnum b : InterestApplicationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_APPLICATION_METHOD = "interestApplicationMethod";
  private InterestApplicationMethodEnum interestApplicationMethod;

  /**
   * The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts
   */
  public enum InterestChargeFrequencyEnum {
    ANNUALIZED("ANNUALIZED"),
    
    EVERY_MONTH("EVERY_MONTH"),
    
    EVERY_FOUR_WEEKS("EVERY_FOUR_WEEKS"),
    
    EVERY_WEEK("EVERY_WEEK"),
    
    EVERY_DAY("EVERY_DAY"),
    
    EVERY_X_DAYS("EVERY_X_DAYS");

    private String value;

    InterestChargeFrequencyEnum(String value) {
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
    public static InterestChargeFrequencyEnum fromValue(String value) {
      for (InterestChargeFrequencyEnum b : InterestChargeFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_CHARGE_FREQUENCY = "interestChargeFrequency";
  private InterestChargeFrequencyEnum interestChargeFrequency;

  /**
   * The possible values for how we compute and apply the interest
   */
  public enum InterestTypeEnum {
    SIMPLE_INTEREST("SIMPLE_INTEREST"),
    
    CAPITALIZED_INTEREST("CAPITALIZED_INTEREST");

    private String value;

    InterestTypeEnum(String value) {
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
    public static InterestTypeEnum fromValue(String value) {
      for (InterestTypeEnum b : InterestTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_TYPE = "interestType";
  private InterestTypeEnum interestType;

  public static final String JSON_PROPERTY_ACCRUE_INTEREST_AFTER_MATURITY = "accrueInterestAfterMaturity";
  private Boolean accrueInterestAfterMaturity;

  /**
   * The interest balance calculation method. Represents the option which determines the way the balance for the account&#39;s interest is computed.
   */
  public enum InterestBalanceCalculationMethodEnum {
    ONLY_PRINCIPAL("ONLY_PRINCIPAL"),
    
    PRINCIPAL_AND_INTEREST("PRINCIPAL_AND_INTEREST");

    private String value;

    InterestBalanceCalculationMethodEnum(String value) {
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
    public static InterestBalanceCalculationMethodEnum fromValue(String value) {
      for (InterestBalanceCalculationMethodEnum b : InterestBalanceCalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_BALANCE_CALCULATION_METHOD = "interestBalanceCalculationMethod";
  private InterestBalanceCalculationMethodEnum interestBalanceCalculationMethod;

  public static final String JSON_PROPERTY_INTEREST_SPREAD = "interestSpread";
  private BigDecimal interestSpread;

  /**
   * The interest calculation method. Holds the type of interest calculation method.
   */
  public enum InterestCalculationMethodEnum {
    FLAT("FLAT"),
    
    DECLINING_BALANCE("DECLINING_BALANCE"),
    
    DECLINING_BALANCE_DISCOUNTED("DECLINING_BALANCE_DISCOUNTED");

    private String value;

    InterestCalculationMethodEnum(String value) {
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
    public static InterestCalculationMethodEnum fromValue(String value) {
      for (InterestCalculationMethodEnum b : InterestCalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEREST_CALCULATION_METHOD = "interestCalculationMethod";
  private InterestCalculationMethodEnum interestCalculationMethod;

  public static final String JSON_PROPERTY_INTEREST_RATE_REVIEW_COUNT = "interestRateReviewCount";
  private Integer interestRateReviewCount;

  public static final String JSON_PROPERTY_ACCRUE_LATE_INTEREST = "accrueLateInterest";
  private Boolean accrueLateInterest;


  public InterestSettings interestRateReviewUnit(InterestRateReviewUnitEnum interestRateReviewUnit) {
    
    this.interestRateReviewUnit = interestRateReviewUnit;
    return this;
  }

   /**
   * The interest rate review unit. Defines the interest rate update frequency measurement unit.
   * @return interestRateReviewUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest rate review unit. Defines the interest rate update frequency measurement unit.")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE_REVIEW_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestRateReviewUnitEnum getInterestRateReviewUnit() {
    return interestRateReviewUnit;
  }


  public void setInterestRateReviewUnit(InterestRateReviewUnitEnum interestRateReviewUnit) {
    this.interestRateReviewUnit = interestRateReviewUnit;
  }


  public InterestSettings interestRate(BigDecimal interestRate) {
    
    this.interestRate = interestRate;
    return this;
  }

   /**
   * The interest rate. Represents the interest rate for the loan account. The interest on loans is accrued on a daily basis, which allows charging the clients only for the days they actually used the loan amount.
   * @return interestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest rate. Represents the interest rate for the loan account. The interest on loans is accrued on a daily basis, which allows charging the clients only for the days they actually used the loan amount.")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInterestRate() {
    return interestRate;
  }


  public void setInterestRate(BigDecimal interestRate) {
    this.interestRate = interestRate;
  }


  public InterestSettings interestRateSource(InterestRateSourceEnum interestRateSource) {
    
    this.interestRateSource = interestRateSource;
    return this;
  }

   /**
   * The interest rate source. Represents the interest calculation method: fixed or (interest spread + active organization index interest rate)
   * @return interestRateSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest rate source. Represents the interest calculation method: fixed or (interest spread + active organization index interest rate)")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestRateSourceEnum getInterestRateSource() {
    return interestRateSource;
  }


  public void setInterestRateSource(InterestRateSourceEnum interestRateSource) {
    this.interestRateSource = interestRateSource;
  }


  public InterestSettings interestApplicationMethod(InterestApplicationMethodEnum interestApplicationMethod) {
    
    this.interestApplicationMethod = interestApplicationMethod;
    return this;
  }

   /**
   * The interest application method. Represents the interest application method that determines whether the interest gets applied on the account&#39;s disbursement or on each repayment.
   * @return interestApplicationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest application method. Represents the interest application method that determines whether the interest gets applied on the account's disbursement or on each repayment.")
  @JsonProperty(JSON_PROPERTY_INTEREST_APPLICATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestApplicationMethodEnum getInterestApplicationMethod() {
    return interestApplicationMethod;
  }


  public void setInterestApplicationMethod(InterestApplicationMethodEnum interestApplicationMethod) {
    this.interestApplicationMethod = interestApplicationMethod;
  }


  public InterestSettings interestChargeFrequency(InterestChargeFrequencyEnum interestChargeFrequency) {
    
    this.interestChargeFrequency = interestChargeFrequency;
    return this;
  }

   /**
   * The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts
   * @return interestChargeFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest change frequency. Holds the possible values for how often is interest charged on loan or deposit accounts")
  @JsonProperty(JSON_PROPERTY_INTEREST_CHARGE_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestChargeFrequencyEnum getInterestChargeFrequency() {
    return interestChargeFrequency;
  }


  public void setInterestChargeFrequency(InterestChargeFrequencyEnum interestChargeFrequency) {
    this.interestChargeFrequency = interestChargeFrequency;
  }


  public InterestSettings interestType(InterestTypeEnum interestType) {
    
    this.interestType = interestType;
    return this;
  }

   /**
   * The possible values for how we compute and apply the interest
   * @return interestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The possible values for how we compute and apply the interest")
  @JsonProperty(JSON_PROPERTY_INTEREST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestTypeEnum getInterestType() {
    return interestType;
  }


  public void setInterestType(InterestTypeEnum interestType) {
    this.interestType = interestType;
  }


  public InterestSettings accrueInterestAfterMaturity(Boolean accrueInterestAfterMaturity) {
    
    this.accrueInterestAfterMaturity = accrueInterestAfterMaturity;
    return this;
  }

   /**
   * The accrue interest after maturity. If the product support this option, specify if the interest should be accrued after the account maturity date.
   * @return accrueInterestAfterMaturity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The accrue interest after maturity. If the product support this option, specify if the interest should be accrued after the account maturity date.")
  @JsonProperty(JSON_PROPERTY_ACCRUE_INTEREST_AFTER_MATURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAccrueInterestAfterMaturity() {
    return accrueInterestAfterMaturity;
  }


  public void setAccrueInterestAfterMaturity(Boolean accrueInterestAfterMaturity) {
    this.accrueInterestAfterMaturity = accrueInterestAfterMaturity;
  }


  public InterestSettings interestBalanceCalculationMethod(InterestBalanceCalculationMethodEnum interestBalanceCalculationMethod) {
    
    this.interestBalanceCalculationMethod = interestBalanceCalculationMethod;
    return this;
  }

   /**
   * The interest balance calculation method. Represents the option which determines the way the balance for the account&#39;s interest is computed.
   * @return interestBalanceCalculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest balance calculation method. Represents the option which determines the way the balance for the account's interest is computed.")
  @JsonProperty(JSON_PROPERTY_INTEREST_BALANCE_CALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestBalanceCalculationMethodEnum getInterestBalanceCalculationMethod() {
    return interestBalanceCalculationMethod;
  }


  public void setInterestBalanceCalculationMethod(InterestBalanceCalculationMethodEnum interestBalanceCalculationMethod) {
    this.interestBalanceCalculationMethod = interestBalanceCalculationMethod;
  }


  public InterestSettings interestSpread(BigDecimal interestSpread) {
    
    this.interestSpread = interestSpread;
    return this;
  }

   /**
   * Interest to be added to active organization index interest rate in order to find out actual interest rate
   * @return interestSpread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interest to be added to active organization index interest rate in order to find out actual interest rate")
  @JsonProperty(JSON_PROPERTY_INTEREST_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInterestSpread() {
    return interestSpread;
  }


  public void setInterestSpread(BigDecimal interestSpread) {
    this.interestSpread = interestSpread;
  }


  public InterestSettings interestCalculationMethod(InterestCalculationMethodEnum interestCalculationMethod) {
    
    this.interestCalculationMethod = interestCalculationMethod;
    return this;
  }

   /**
   * The interest calculation method. Holds the type of interest calculation method.
   * @return interestCalculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The interest calculation method. Holds the type of interest calculation method.")
  @JsonProperty(JSON_PROPERTY_INTEREST_CALCULATION_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InterestCalculationMethodEnum getInterestCalculationMethod() {
    return interestCalculationMethod;
  }


  public void setInterestCalculationMethod(InterestCalculationMethodEnum interestCalculationMethod) {
    this.interestCalculationMethod = interestCalculationMethod;
  }


  public InterestSettings interestRateReviewCount(Integer interestRateReviewCount) {
    
    this.interestRateReviewCount = interestRateReviewCount;
    return this;
  }

   /**
   * Interest rate update frequency unit count.
   * @return interestRateReviewCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interest rate update frequency unit count.")
  @JsonProperty(JSON_PROPERTY_INTEREST_RATE_REVIEW_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInterestRateReviewCount() {
    return interestRateReviewCount;
  }


  public void setInterestRateReviewCount(Integer interestRateReviewCount) {
    this.interestRateReviewCount = interestRateReviewCount;
  }


   /**
   * Indicates whether late interest is accrued for this loan account
   * @return accrueLateInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether late interest is accrued for this loan account")
  @JsonProperty(JSON_PROPERTY_ACCRUE_LATE_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAccrueLateInterest() {
    return accrueLateInterest;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InterestSettings interestSettings = (InterestSettings) o;
    return Objects.equals(this.interestRateReviewUnit, interestSettings.interestRateReviewUnit) &&
        Objects.equals(this.interestRate, interestSettings.interestRate) &&
        Objects.equals(this.interestRateSource, interestSettings.interestRateSource) &&
        Objects.equals(this.interestApplicationMethod, interestSettings.interestApplicationMethod) &&
        Objects.equals(this.interestChargeFrequency, interestSettings.interestChargeFrequency) &&
        Objects.equals(this.interestType, interestSettings.interestType) &&
        Objects.equals(this.accrueInterestAfterMaturity, interestSettings.accrueInterestAfterMaturity) &&
        Objects.equals(this.interestBalanceCalculationMethod, interestSettings.interestBalanceCalculationMethod) &&
        Objects.equals(this.interestSpread, interestSettings.interestSpread) &&
        Objects.equals(this.interestCalculationMethod, interestSettings.interestCalculationMethod) &&
        Objects.equals(this.interestRateReviewCount, interestSettings.interestRateReviewCount) &&
        Objects.equals(this.accrueLateInterest, interestSettings.accrueLateInterest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interestRateReviewUnit, interestRate, interestRateSource, interestApplicationMethod, interestChargeFrequency, interestType, accrueInterestAfterMaturity, interestBalanceCalculationMethod, interestSpread, interestCalculationMethod, interestRateReviewCount, accrueLateInterest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterestSettings {\n");
    sb.append("    interestRateReviewUnit: ").append(toIndentedString(interestRateReviewUnit)).append("\n");
    sb.append("    interestRate: ").append(toIndentedString(interestRate)).append("\n");
    sb.append("    interestRateSource: ").append(toIndentedString(interestRateSource)).append("\n");
    sb.append("    interestApplicationMethod: ").append(toIndentedString(interestApplicationMethod)).append("\n");
    sb.append("    interestChargeFrequency: ").append(toIndentedString(interestChargeFrequency)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    accrueInterestAfterMaturity: ").append(toIndentedString(accrueInterestAfterMaturity)).append("\n");
    sb.append("    interestBalanceCalculationMethod: ").append(toIndentedString(interestBalanceCalculationMethod)).append("\n");
    sb.append("    interestSpread: ").append(toIndentedString(interestSpread)).append("\n");
    sb.append("    interestCalculationMethod: ").append(toIndentedString(interestCalculationMethod)).append("\n");
    sb.append("    interestRateReviewCount: ").append(toIndentedString(interestRateReviewCount)).append("\n");
    sb.append("    accrueLateInterest: ").append(toIndentedString(accrueLateInterest)).append("\n");
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

