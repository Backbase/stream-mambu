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
import com.backbase.mambu.loans.model.PeriodicPayment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The schedule settings, holds all schedule properties.
 */
@ApiModel(description = "The schedule settings, holds all schedule properties.")
@JsonPropertyOrder({
  ScheduleSettings.JSON_PROPERTY_GRACE_PERIOD,
  ScheduleSettings.JSON_PROPERTY_PERIODIC_PAYMENT,
  ScheduleSettings.JSON_PROPERTY_REPAYMENT_SCHEDULE_METHOD,
  ScheduleSettings.JSON_PROPERTY_PAYMENT_PLAN,
  ScheduleSettings.JSON_PROPERTY_SHORT_MONTH_HANDLING_METHOD,
  ScheduleSettings.JSON_PROPERTY_REPAYMENT_INSTALLMENTS,
  ScheduleSettings.JSON_PROPERTY_GRACE_PERIOD_TYPE,
  ScheduleSettings.JSON_PROPERTY_PRINCIPAL_REPAYMENT_INTERVAL,
  ScheduleSettings.JSON_PROPERTY_HAS_CUSTOM_SCHEDULE,
  ScheduleSettings.JSON_PROPERTY_REPAYMENT_PERIOD_UNIT,
  ScheduleSettings.JSON_PROPERTY_FIXED_DAYS_OF_MONTH,
  ScheduleSettings.JSON_PROPERTY_SCHEDULE_DUE_DATES_METHOD,
  ScheduleSettings.JSON_PROPERTY_REPAYMENT_PERIOD_COUNT,
  ScheduleSettings.JSON_PROPERTY_DEFAULT_FIRST_REPAYMENT_DUE_DATE_OFFSET
})

public class ScheduleSettings {
  public static final String JSON_PROPERTY_GRACE_PERIOD = "gracePeriod";
  private Integer gracePeriod;

  public static final String JSON_PROPERTY_PERIODIC_PAYMENT = "periodicPayment";
  private BigDecimal periodicPayment;

  /**
   * The repayment schedule method. Represents the method that determines whether the schedule will be fixed all over the loan account&#39;s life cycle or will be dynamically recomputed when required.
   */
  public enum RepaymentScheduleMethodEnum {
    NONE("NONE"),
    
    FIXED("FIXED"),
    
    DYNAMIC("DYNAMIC");

    private String value;

    RepaymentScheduleMethodEnum(String value) {
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
    public static RepaymentScheduleMethodEnum fromValue(String value) {
      for (RepaymentScheduleMethodEnum b : RepaymentScheduleMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPAYMENT_SCHEDULE_METHOD = "repaymentScheduleMethod";
  private RepaymentScheduleMethodEnum repaymentScheduleMethod;

  public static final String JSON_PROPERTY_PAYMENT_PLAN = "paymentPlan";
  private List<PeriodicPayment> paymentPlan = null;

  /**
   * The short handling method. Determines how to handle the short months, if they select a fixed day of month &gt; 28. Will be null if no such date is selected and also for the Interval methodology. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH.
   */
  public enum ShortMonthHandlingMethodEnum {
    LAST_DAY_IN_MONTH("LAST_DAY_IN_MONTH"),
    
    FIRST_DAY_OF_NEXT_MONTH("FIRST_DAY_OF_NEXT_MONTH");

    private String value;

    ShortMonthHandlingMethodEnum(String value) {
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
    public static ShortMonthHandlingMethodEnum fromValue(String value) {
      for (ShortMonthHandlingMethodEnum b : ShortMonthHandlingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SHORT_MONTH_HANDLING_METHOD = "shortMonthHandlingMethod";
  private ShortMonthHandlingMethodEnum shortMonthHandlingMethod;

  public static final String JSON_PROPERTY_REPAYMENT_INSTALLMENTS = "repaymentInstallments";
  private Integer repaymentInstallments;

  /**
   * The grace period type. Representing the type of grace period which is possible for a loan account.
   */
  public enum GracePeriodTypeEnum {
    NONE("NONE"),
    
    PAY_INTEREST_ONLY("PAY_INTEREST_ONLY"),
    
    INTEREST_FORGIVENESS("INTEREST_FORGIVENESS");

    private String value;

    GracePeriodTypeEnum(String value) {
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
    public static GracePeriodTypeEnum fromValue(String value) {
      for (GracePeriodTypeEnum b : GracePeriodTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_GRACE_PERIOD_TYPE = "gracePeriodType";
  private GracePeriodTypeEnum gracePeriodType;

  public static final String JSON_PROPERTY_PRINCIPAL_REPAYMENT_INTERVAL = "principalRepaymentInterval";
  private Integer principalRepaymentInterval;

  public static final String JSON_PROPERTY_HAS_CUSTOM_SCHEDULE = "hasCustomSchedule";
  private Boolean hasCustomSchedule;

  /**
   * The repayment period unit. Represents the frequency of loan repayment.
   */
  public enum RepaymentPeriodUnitEnum {
    DAYS("DAYS"),
    
    WEEKS("WEEKS"),
    
    MONTHS("MONTHS"),
    
    YEARS("YEARS");

    private String value;

    RepaymentPeriodUnitEnum(String value) {
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
    public static RepaymentPeriodUnitEnum fromValue(String value) {
      for (RepaymentPeriodUnitEnum b : RepaymentPeriodUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_REPAYMENT_PERIOD_UNIT = "repaymentPeriodUnit";
  private RepaymentPeriodUnitEnum repaymentPeriodUnit;

  public static final String JSON_PROPERTY_FIXED_DAYS_OF_MONTH = "fixedDaysOfMonth";
  private List<Integer> fixedDaysOfMonth = null;

  /**
   * The schedule due dates method. Represents the methodology used by this account to compute the due dates of the repayments.
   */
  public enum ScheduleDueDatesMethodEnum {
    INTERVAL("INTERVAL"),
    
    FIXED_DAYS_OF_MONTH("FIXED_DAYS_OF_MONTH");

    private String value;

    ScheduleDueDatesMethodEnum(String value) {
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
    public static ScheduleDueDatesMethodEnum fromValue(String value) {
      for (ScheduleDueDatesMethodEnum b : ScheduleDueDatesMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SCHEDULE_DUE_DATES_METHOD = "scheduleDueDatesMethod";
  private ScheduleDueDatesMethodEnum scheduleDueDatesMethod;

  public static final String JSON_PROPERTY_REPAYMENT_PERIOD_COUNT = "repaymentPeriodCount";
  private Integer repaymentPeriodCount;

  public static final String JSON_PROPERTY_DEFAULT_FIRST_REPAYMENT_DUE_DATE_OFFSET = "defaultFirstRepaymentDueDateOffset";
  private Integer defaultFirstRepaymentDueDateOffset;


  public ScheduleSettings gracePeriod(Integer gracePeriod) {
    
    this.gracePeriod = gracePeriod;
    return this;
  }

   /**
   * The grace period. Represents the grace period for loan repayment - in number of installments.
   * @return gracePeriod
  **/
  @ApiModelProperty(required = true, value = "The grace period. Represents the grace period for loan repayment - in number of installments.")
  @JsonProperty(JSON_PROPERTY_GRACE_PERIOD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getGracePeriod() {
    return gracePeriod;
  }


  public void setGracePeriod(Integer gracePeriod) {
    this.gracePeriod = gracePeriod;
  }


  public ScheduleSettings periodicPayment(BigDecimal periodicPayment) {
    
    this.periodicPayment = periodicPayment;
    return this;
  }

   /**
   * The periodic payment amount for the accounts which have balloon payments or Reduce Number of Installments and Optimized Payments
   * @return periodicPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The periodic payment amount for the accounts which have balloon payments or Reduce Number of Installments and Optimized Payments")
  @JsonProperty(JSON_PROPERTY_PERIODIC_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPeriodicPayment() {
    return periodicPayment;
  }


  public void setPeriodicPayment(BigDecimal periodicPayment) {
    this.periodicPayment = periodicPayment;
  }


  public ScheduleSettings repaymentScheduleMethod(RepaymentScheduleMethodEnum repaymentScheduleMethod) {
    
    this.repaymentScheduleMethod = repaymentScheduleMethod;
    return this;
  }

   /**
   * The repayment schedule method. Represents the method that determines whether the schedule will be fixed all over the loan account&#39;s life cycle or will be dynamically recomputed when required.
   * @return repaymentScheduleMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The repayment schedule method. Represents the method that determines whether the schedule will be fixed all over the loan account's life cycle or will be dynamically recomputed when required.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_SCHEDULE_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepaymentScheduleMethodEnum getRepaymentScheduleMethod() {
    return repaymentScheduleMethod;
  }


  public void setRepaymentScheduleMethod(RepaymentScheduleMethodEnum repaymentScheduleMethod) {
    this.repaymentScheduleMethod = repaymentScheduleMethod;
  }


  public ScheduleSettings paymentPlan(List<PeriodicPayment> paymentPlan) {
    
    this.paymentPlan = paymentPlan;
    return this;
  }

  public ScheduleSettings addPaymentPlanItem(PeriodicPayment paymentPlanItem) {
    if (this.paymentPlan == null) {
      this.paymentPlan = new ArrayList<>();
    }
    this.paymentPlan.add(paymentPlanItem);
    return this;
  }

   /**
   * A list of periodic payments for the current loan account.
   * @return paymentPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of periodic payments for the current loan account.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PeriodicPayment> getPaymentPlan() {
    return paymentPlan;
  }


  public void setPaymentPlan(List<PeriodicPayment> paymentPlan) {
    this.paymentPlan = paymentPlan;
  }


  public ScheduleSettings shortMonthHandlingMethod(ShortMonthHandlingMethodEnum shortMonthHandlingMethod) {
    
    this.shortMonthHandlingMethod = shortMonthHandlingMethod;
    return this;
  }

   /**
   * The short handling method. Determines how to handle the short months, if they select a fixed day of month &gt; 28. Will be null if no such date is selected and also for the Interval methodology. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH.
   * @return shortMonthHandlingMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The short handling method. Determines how to handle the short months, if they select a fixed day of month > 28. Will be null if no such date is selected and also for the Interval methodology. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH.")
  @JsonProperty(JSON_PROPERTY_SHORT_MONTH_HANDLING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShortMonthHandlingMethodEnum getShortMonthHandlingMethod() {
    return shortMonthHandlingMethod;
  }


  public void setShortMonthHandlingMethod(ShortMonthHandlingMethodEnum shortMonthHandlingMethod) {
    this.shortMonthHandlingMethod = shortMonthHandlingMethod;
  }


  public ScheduleSettings repaymentInstallments(Integer repaymentInstallments) {
    
    this.repaymentInstallments = repaymentInstallments;
    return this;
  }

   /**
   * The repayment installments. Represents how many installments are required to pay back the loan.
   * @return repaymentInstallments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The repayment installments. Represents how many installments are required to pay back the loan.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_INSTALLMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepaymentInstallments() {
    return repaymentInstallments;
  }


  public void setRepaymentInstallments(Integer repaymentInstallments) {
    this.repaymentInstallments = repaymentInstallments;
  }


  public ScheduleSettings gracePeriodType(GracePeriodTypeEnum gracePeriodType) {
    
    this.gracePeriodType = gracePeriodType;
    return this;
  }

   /**
   * The grace period type. Representing the type of grace period which is possible for a loan account.
   * @return gracePeriodType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The grace period type. Representing the type of grace period which is possible for a loan account.")
  @JsonProperty(JSON_PROPERTY_GRACE_PERIOD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GracePeriodTypeEnum getGracePeriodType() {
    return gracePeriodType;
  }


  public void setGracePeriodType(GracePeriodTypeEnum gracePeriodType) {
    this.gracePeriodType = gracePeriodType;
  }


  public ScheduleSettings principalRepaymentInterval(Integer principalRepaymentInterval) {
    
    this.principalRepaymentInterval = principalRepaymentInterval;
    return this;
  }

   /**
   * The principal repayment interval. Indicates the interval of repayments that the principal has to be paid.
   * @return principalRepaymentInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The principal repayment interval. Indicates the interval of repayments that the principal has to be paid.")
  @JsonProperty(JSON_PROPERTY_PRINCIPAL_REPAYMENT_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPrincipalRepaymentInterval() {
    return principalRepaymentInterval;
  }


  public void setPrincipalRepaymentInterval(Integer principalRepaymentInterval) {
    this.principalRepaymentInterval = principalRepaymentInterval;
  }


  public ScheduleSettings hasCustomSchedule(Boolean hasCustomSchedule) {
    
    this.hasCustomSchedule = hasCustomSchedule;
    return this;
  }

   /**
   * Flag used when the repayments schedule for the current account was determined by the user, by editing the due dates or the principal due
   * @return hasCustomSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag used when the repayments schedule for the current account was determined by the user, by editing the due dates or the principal due")
  @JsonProperty(JSON_PROPERTY_HAS_CUSTOM_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasCustomSchedule() {
    return hasCustomSchedule;
  }


  public void setHasCustomSchedule(Boolean hasCustomSchedule) {
    this.hasCustomSchedule = hasCustomSchedule;
  }


  public ScheduleSettings repaymentPeriodUnit(RepaymentPeriodUnitEnum repaymentPeriodUnit) {
    
    this.repaymentPeriodUnit = repaymentPeriodUnit;
    return this;
  }

   /**
   * The repayment period unit. Represents the frequency of loan repayment.
   * @return repaymentPeriodUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The repayment period unit. Represents the frequency of loan repayment.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_PERIOD_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RepaymentPeriodUnitEnum getRepaymentPeriodUnit() {
    return repaymentPeriodUnit;
  }


  public void setRepaymentPeriodUnit(RepaymentPeriodUnitEnum repaymentPeriodUnit) {
    this.repaymentPeriodUnit = repaymentPeriodUnit;
  }


  public ScheduleSettings fixedDaysOfMonth(List<Integer> fixedDaysOfMonth) {
    
    this.fixedDaysOfMonth = fixedDaysOfMonth;
    return this;
  }

  public ScheduleSettings addFixedDaysOfMonthItem(Integer fixedDaysOfMonthItem) {
    if (this.fixedDaysOfMonth == null) {
      this.fixedDaysOfMonth = new ArrayList<>();
    }
    this.fixedDaysOfMonth.add(fixedDaysOfMonthItem);
    return this;
  }

   /**
   * Specifies the days of the month when the repayment due dates should be. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH.
   * @return fixedDaysOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the days of the month when the repayment due dates should be. Only available if the Repayment Methodology is FIXED_DAYS_OF_MONTH.")
  @JsonProperty(JSON_PROPERTY_FIXED_DAYS_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getFixedDaysOfMonth() {
    return fixedDaysOfMonth;
  }


  public void setFixedDaysOfMonth(List<Integer> fixedDaysOfMonth) {
    this.fixedDaysOfMonth = fixedDaysOfMonth;
  }


  public ScheduleSettings scheduleDueDatesMethod(ScheduleDueDatesMethodEnum scheduleDueDatesMethod) {
    
    this.scheduleDueDatesMethod = scheduleDueDatesMethod;
    return this;
  }

   /**
   * The schedule due dates method. Represents the methodology used by this account to compute the due dates of the repayments.
   * @return scheduleDueDatesMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schedule due dates method. Represents the methodology used by this account to compute the due dates of the repayments.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_DUE_DATES_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleDueDatesMethodEnum getScheduleDueDatesMethod() {
    return scheduleDueDatesMethod;
  }


  public void setScheduleDueDatesMethod(ScheduleDueDatesMethodEnum scheduleDueDatesMethod) {
    this.scheduleDueDatesMethod = scheduleDueDatesMethod;
  }


  public ScheduleSettings repaymentPeriodCount(Integer repaymentPeriodCount) {
    
    this.repaymentPeriodCount = repaymentPeriodCount;
    return this;
  }

   /**
   * The repayment period count. Represents how often the loan is to be repaid: stored based on the type repayment option.
   * @return repaymentPeriodCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The repayment period count. Represents how often the loan is to be repaid: stored based on the type repayment option.")
  @JsonProperty(JSON_PROPERTY_REPAYMENT_PERIOD_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRepaymentPeriodCount() {
    return repaymentPeriodCount;
  }


  public void setRepaymentPeriodCount(Integer repaymentPeriodCount) {
    this.repaymentPeriodCount = repaymentPeriodCount;
  }


  public ScheduleSettings defaultFirstRepaymentDueDateOffset(Integer defaultFirstRepaymentDueDateOffset) {
    
    this.defaultFirstRepaymentDueDateOffset = defaultFirstRepaymentDueDateOffset;
    return this;
  }

   /**
   * The default first repayment due date offset, indicates how many days the first repayment due date should be extended(all other due dates from the schedule are relative to first repayment due date - they will also be affected by the offset)
   * @return defaultFirstRepaymentDueDateOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default first repayment due date offset, indicates how many days the first repayment due date should be extended(all other due dates from the schedule are relative to first repayment due date - they will also be affected by the offset)")
  @JsonProperty(JSON_PROPERTY_DEFAULT_FIRST_REPAYMENT_DUE_DATE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultFirstRepaymentDueDateOffset() {
    return defaultFirstRepaymentDueDateOffset;
  }


  public void setDefaultFirstRepaymentDueDateOffset(Integer defaultFirstRepaymentDueDateOffset) {
    this.defaultFirstRepaymentDueDateOffset = defaultFirstRepaymentDueDateOffset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleSettings scheduleSettings = (ScheduleSettings) o;
    return Objects.equals(this.gracePeriod, scheduleSettings.gracePeriod) &&
        Objects.equals(this.periodicPayment, scheduleSettings.periodicPayment) &&
        Objects.equals(this.repaymentScheduleMethod, scheduleSettings.repaymentScheduleMethod) &&
        Objects.equals(this.paymentPlan, scheduleSettings.paymentPlan) &&
        Objects.equals(this.shortMonthHandlingMethod, scheduleSettings.shortMonthHandlingMethod) &&
        Objects.equals(this.repaymentInstallments, scheduleSettings.repaymentInstallments) &&
        Objects.equals(this.gracePeriodType, scheduleSettings.gracePeriodType) &&
        Objects.equals(this.principalRepaymentInterval, scheduleSettings.principalRepaymentInterval) &&
        Objects.equals(this.hasCustomSchedule, scheduleSettings.hasCustomSchedule) &&
        Objects.equals(this.repaymentPeriodUnit, scheduleSettings.repaymentPeriodUnit) &&
        Objects.equals(this.fixedDaysOfMonth, scheduleSettings.fixedDaysOfMonth) &&
        Objects.equals(this.scheduleDueDatesMethod, scheduleSettings.scheduleDueDatesMethod) &&
        Objects.equals(this.repaymentPeriodCount, scheduleSettings.repaymentPeriodCount) &&
        Objects.equals(this.defaultFirstRepaymentDueDateOffset, scheduleSettings.defaultFirstRepaymentDueDateOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gracePeriod, periodicPayment, repaymentScheduleMethod, paymentPlan, shortMonthHandlingMethod, repaymentInstallments, gracePeriodType, principalRepaymentInterval, hasCustomSchedule, repaymentPeriodUnit, fixedDaysOfMonth, scheduleDueDatesMethod, repaymentPeriodCount, defaultFirstRepaymentDueDateOffset);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleSettings {\n");
    sb.append("    gracePeriod: ").append(toIndentedString(gracePeriod)).append("\n");
    sb.append("    periodicPayment: ").append(toIndentedString(periodicPayment)).append("\n");
    sb.append("    repaymentScheduleMethod: ").append(toIndentedString(repaymentScheduleMethod)).append("\n");
    sb.append("    paymentPlan: ").append(toIndentedString(paymentPlan)).append("\n");
    sb.append("    shortMonthHandlingMethod: ").append(toIndentedString(shortMonthHandlingMethod)).append("\n");
    sb.append("    repaymentInstallments: ").append(toIndentedString(repaymentInstallments)).append("\n");
    sb.append("    gracePeriodType: ").append(toIndentedString(gracePeriodType)).append("\n");
    sb.append("    principalRepaymentInterval: ").append(toIndentedString(principalRepaymentInterval)).append("\n");
    sb.append("    hasCustomSchedule: ").append(toIndentedString(hasCustomSchedule)).append("\n");
    sb.append("    repaymentPeriodUnit: ").append(toIndentedString(repaymentPeriodUnit)).append("\n");
    sb.append("    fixedDaysOfMonth: ").append(toIndentedString(fixedDaysOfMonth)).append("\n");
    sb.append("    scheduleDueDatesMethod: ").append(toIndentedString(scheduleDueDatesMethod)).append("\n");
    sb.append("    repaymentPeriodCount: ").append(toIndentedString(repaymentPeriodCount)).append("\n");
    sb.append("    defaultFirstRepaymentDueDateOffset: ").append(toIndentedString(defaultFirstRepaymentDueDateOffset)).append("\n");
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

