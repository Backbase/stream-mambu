/*
 * loanproducts
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.backbase.mambu.loan.products.model;

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
 * The settings for defining period intervals.
 */
@ApiModel(description = "The settings for defining period intervals.")
@JsonPropertyOrder({
  PeriodIntervalSettings.JSON_PROPERTY_FEE_AMORTIZATION_UPON_RESCHEDULE_REFINANCE_OPTION,
  PeriodIntervalSettings.JSON_PROPERTY_INTERVAL_TYPE,
  PeriodIntervalSettings.JSON_PROPERTY_PERIOD_COUNT,
  PeriodIntervalSettings.JSON_PROPERTY_INTERVAL_COUNT,
  PeriodIntervalSettings.JSON_PROPERTY_ENCODED_KEY,
  PeriodIntervalSettings.JSON_PROPERTY_AMORTIZATION_PROFILE,
  PeriodIntervalSettings.JSON_PROPERTY_PERIOD_UNIT,
  PeriodIntervalSettings.JSON_PROPERTY_FREQUENCY
})

public class PeriodIntervalSettings {
  /**
   * Flag for signaling if fee amortization should be continued or finished at account reschedule/refinance
   */
  public enum FeeAmortizationUponRescheduleRefinanceOptionEnum {
    END_AMORTIZATION_ON_THE_ORIGINAL_ACCOUNT("END_AMORTIZATION_ON_THE_ORIGINAL_ACCOUNT"),
    
    CONTINUE_AMORTIZATION_ON_THE_RESCHEDULED_REFINANCED_ACCOUNT("CONTINUE_AMORTIZATION_ON_THE_RESCHEDULED_REFINANCED_ACCOUNT");

    private String value;

    FeeAmortizationUponRescheduleRefinanceOptionEnum(String value) {
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
    public static FeeAmortizationUponRescheduleRefinanceOptionEnum fromValue(String value) {
      for (FeeAmortizationUponRescheduleRefinanceOptionEnum b : FeeAmortizationUponRescheduleRefinanceOptionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FEE_AMORTIZATION_UPON_RESCHEDULE_REFINANCE_OPTION = "feeAmortizationUponRescheduleRefinanceOption";
  private FeeAmortizationUponRescheduleRefinanceOptionEnum feeAmortizationUponRescheduleRefinanceOption;

  /**
   * Defines the options for an interval
   */
  public enum IntervalTypeEnum {
    PREDEFINED_INTERVALS("PREDEFINED_INTERVALS"),
    
    FULL_TERM("FULL_TERM");

    private String value;

    IntervalTypeEnum(String value) {
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
    public static IntervalTypeEnum fromValue(String value) {
      for (IntervalTypeEnum b : IntervalTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTERVAL_TYPE = "intervalType";
  private IntervalTypeEnum intervalType;

  public static final String JSON_PROPERTY_PERIOD_COUNT = "periodCount";
  private Integer periodCount;

  public static final String JSON_PROPERTY_INTERVAL_COUNT = "intervalCount";
  private Integer intervalCount;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  /**
   * Type of amortization profile used for fee
   */
  public enum AmortizationProfileEnum {
    NONE("NONE"),
    
    SUM_OF_YEARS_DIGITS("SUM_OF_YEARS_DIGITS"),
    
    STRAIGHT_LINE("STRAIGHT_LINE"),
    
    EFFECTIVE_INTEREST_RATE("EFFECTIVE_INTEREST_RATE");

    private String value;

    AmortizationProfileEnum(String value) {
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
    public static AmortizationProfileEnum fromValue(String value) {
      for (AmortizationProfileEnum b : AmortizationProfileEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AMORTIZATION_PROFILE = "amortizationProfile";
  private AmortizationProfileEnum amortizationProfile;

  /**
   * Amortization unit to determine the interval between amortizations
   */
  public enum PeriodUnitEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS");

    private String value;

    PeriodUnitEnum(String value) {
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
    public static PeriodUnitEnum fromValue(String value) {
      for (PeriodUnitEnum b : PeriodUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERIOD_UNIT = "periodUnit";
  private PeriodUnitEnum periodUnit;

  /**
   * Frequency settings of the fee amortization
   */
  public enum FrequencyEnum {
    ACCOUNT_INSTALLMENTS_DUE_DATES("ACCOUNT_INSTALLMENTS_DUE_DATES"),
    
    ACCOUNT_INSTALLMENTS_DUE_DATES_DAILY_BOOKING("ACCOUNT_INSTALLMENTS_DUE_DATES_DAILY_BOOKING"),
    
    CUSTOM_INTERVAL("CUSTOM_INTERVAL");

    private String value;

    FrequencyEnum(String value) {
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
    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private FrequencyEnum frequency;


  public PeriodIntervalSettings feeAmortizationUponRescheduleRefinanceOption(FeeAmortizationUponRescheduleRefinanceOptionEnum feeAmortizationUponRescheduleRefinanceOption) {
    
    this.feeAmortizationUponRescheduleRefinanceOption = feeAmortizationUponRescheduleRefinanceOption;
    return this;
  }

   /**
   * Flag for signaling if fee amortization should be continued or finished at account reschedule/refinance
   * @return feeAmortizationUponRescheduleRefinanceOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag for signaling if fee amortization should be continued or finished at account reschedule/refinance")
  @JsonProperty(JSON_PROPERTY_FEE_AMORTIZATION_UPON_RESCHEDULE_REFINANCE_OPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeeAmortizationUponRescheduleRefinanceOptionEnum getFeeAmortizationUponRescheduleRefinanceOption() {
    return feeAmortizationUponRescheduleRefinanceOption;
  }


  public void setFeeAmortizationUponRescheduleRefinanceOption(FeeAmortizationUponRescheduleRefinanceOptionEnum feeAmortizationUponRescheduleRefinanceOption) {
    this.feeAmortizationUponRescheduleRefinanceOption = feeAmortizationUponRescheduleRefinanceOption;
  }


  public PeriodIntervalSettings intervalType(IntervalTypeEnum intervalType) {
    
    this.intervalType = intervalType;
    return this;
  }

   /**
   * Defines the options for an interval
   * @return intervalType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the options for an interval")
  @JsonProperty(JSON_PROPERTY_INTERVAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IntervalTypeEnum getIntervalType() {
    return intervalType;
  }


  public void setIntervalType(IntervalTypeEnum intervalType) {
    this.intervalType = intervalType;
  }


  public PeriodIntervalSettings periodCount(Integer periodCount) {
    
    this.periodCount = periodCount;
    return this;
  }

   /**
   * Period count used in conjunction with periodUnit to determine the next date of the interval
   * @return periodCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Period count used in conjunction with periodUnit to determine the next date of the interval")
  @JsonProperty(JSON_PROPERTY_PERIOD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeriodCount() {
    return periodCount;
  }


  public void setPeriodCount(Integer periodCount) {
    this.periodCount = periodCount;
  }


  public PeriodIntervalSettings intervalCount(Integer intervalCount) {
    
    this.intervalCount = intervalCount;
    return this;
  }

   /**
   * Total number of intervals
   * @return intervalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of intervals")
  @JsonProperty(JSON_PROPERTY_INTERVAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIntervalCount() {
    return intervalCount;
  }


  public void setIntervalCount(Integer intervalCount) {
    this.intervalCount = intervalCount;
  }


   /**
   * The encoded key of the period interval settings, auto generated, unique.
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded key of the period interval settings, auto generated, unique.")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public PeriodIntervalSettings amortizationProfile(AmortizationProfileEnum amortizationProfile) {
    
    this.amortizationProfile = amortizationProfile;
    return this;
  }

   /**
   * Type of amortization profile used for fee
   * @return amortizationProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of amortization profile used for fee")
  @JsonProperty(JSON_PROPERTY_AMORTIZATION_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AmortizationProfileEnum getAmortizationProfile() {
    return amortizationProfile;
  }


  public void setAmortizationProfile(AmortizationProfileEnum amortizationProfile) {
    this.amortizationProfile = amortizationProfile;
  }


  public PeriodIntervalSettings periodUnit(PeriodUnitEnum periodUnit) {
    
    this.periodUnit = periodUnit;
    return this;
  }

   /**
   * Amortization unit to determine the interval between amortizations
   * @return periodUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amortization unit to determine the interval between amortizations")
  @JsonProperty(JSON_PROPERTY_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodUnitEnum getPeriodUnit() {
    return periodUnit;
  }


  public void setPeriodUnit(PeriodUnitEnum periodUnit) {
    this.periodUnit = periodUnit;
  }


  public PeriodIntervalSettings frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency settings of the fee amortization
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Frequency settings of the fee amortization")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodIntervalSettings periodIntervalSettings = (PeriodIntervalSettings) o;
    return Objects.equals(this.feeAmortizationUponRescheduleRefinanceOption, periodIntervalSettings.feeAmortizationUponRescheduleRefinanceOption) &&
        Objects.equals(this.intervalType, periodIntervalSettings.intervalType) &&
        Objects.equals(this.periodCount, periodIntervalSettings.periodCount) &&
        Objects.equals(this.intervalCount, periodIntervalSettings.intervalCount) &&
        Objects.equals(this.encodedKey, periodIntervalSettings.encodedKey) &&
        Objects.equals(this.amortizationProfile, periodIntervalSettings.amortizationProfile) &&
        Objects.equals(this.periodUnit, periodIntervalSettings.periodUnit) &&
        Objects.equals(this.frequency, periodIntervalSettings.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeAmortizationUponRescheduleRefinanceOption, intervalType, periodCount, intervalCount, encodedKey, amortizationProfile, periodUnit, frequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodIntervalSettings {\n");
    sb.append("    feeAmortizationUponRescheduleRefinanceOption: ").append(toIndentedString(feeAmortizationUponRescheduleRefinanceOption)).append("\n");
    sb.append("    intervalType: ").append(toIndentedString(intervalType)).append("\n");
    sb.append("    periodCount: ").append(toIndentedString(periodCount)).append("\n");
    sb.append("    intervalCount: ").append(toIndentedString(intervalCount)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    amortizationProfile: ").append(toIndentedString(amortizationProfile)).append("\n");
    sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

