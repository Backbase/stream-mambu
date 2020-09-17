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
import com.backbase.mambu.loans.model.CardAcceptor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An authorization hold entry as a result of a hold action performed by a card acceptor.
 */
@ApiModel(description = "An authorization hold entry as a result of a hold action performed by a card acceptor.")
@JsonPropertyOrder({
  AuthorizationHold.JSON_PROPERTY_AMOUNT,
  AuthorizationHold.JSON_PROPERTY_ADVICE,
  AuthorizationHold.JSON_PROPERTY_CARD_ACCEPTOR,
  AuthorizationHold.JSON_PROPERTY_CARD_TOKEN,
  AuthorizationHold.JSON_PROPERTY_EXTERNAL_REFERENCE_ID,
  AuthorizationHold.JSON_PROPERTY_ORIGINAL_AMOUNT,
  AuthorizationHold.JSON_PROPERTY_EXCHANGE_RATE,
  AuthorizationHold.JSON_PROPERTY_ENCODED_KEY,
  AuthorizationHold.JSON_PROPERTY_USER_TRANSACTION_TIME,
  AuthorizationHold.JSON_PROPERTY_ORIGINAL_CURRENCY,
  AuthorizationHold.JSON_PROPERTY_CURRENCY_CODE,
  AuthorizationHold.JSON_PROPERTY_STATUS
})

public class AuthorizationHold {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private BigDecimal amount;

  public static final String JSON_PROPERTY_ADVICE = "advice";
  private Boolean advice;

  public static final String JSON_PROPERTY_CARD_ACCEPTOR = "cardAcceptor";
  private CardAcceptor cardAcceptor;

  public static final String JSON_PROPERTY_CARD_TOKEN = "cardToken";
  private String cardToken;

  public static final String JSON_PROPERTY_EXTERNAL_REFERENCE_ID = "externalReferenceId";
  private String externalReferenceId;

  public static final String JSON_PROPERTY_ORIGINAL_AMOUNT = "originalAmount";
  private BigDecimal originalAmount;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
  private BigDecimal exchangeRate;

  public static final String JSON_PROPERTY_ENCODED_KEY = "encodedKey";
  private String encodedKey;

  public static final String JSON_PROPERTY_USER_TRANSACTION_TIME = "userTransactionTime";
  private String userTransactionTime;

  public static final String JSON_PROPERTY_ORIGINAL_CURRENCY = "originalCurrency";
  private String originalCurrency;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "currencyCode";
  private String currencyCode;

  /**
   * The authorization hold status.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    REVERSED("REVERSED"),
    
    SETTLED("SETTLED"),
    
    EXPIRED("EXPIRED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public AuthorizationHold amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of money to be held as a result of the authorization hold request.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of money to be held as a result of the authorization hold request.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public AuthorizationHold advice(Boolean advice) {
    
    this.advice = advice;
    return this;
  }

   /**
   * Whether the given request should be accepted without balance validations.
   * @return advice
  **/
  @ApiModelProperty(required = true, value = "Whether the given request should be accepted without balance validations.")
  @JsonProperty(JSON_PROPERTY_ADVICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAdvice() {
    return advice;
  }


  public void setAdvice(Boolean advice) {
    this.advice = advice;
  }


  public AuthorizationHold cardAcceptor(CardAcceptor cardAcceptor) {
    
    this.cardAcceptor = cardAcceptor;
    return this;
  }

   /**
   * Get cardAcceptor
   * @return cardAcceptor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CARD_ACCEPTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CardAcceptor getCardAcceptor() {
    return cardAcceptor;
  }


  public void setCardAcceptor(CardAcceptor cardAcceptor) {
    this.cardAcceptor = cardAcceptor;
  }


   /**
   * The reference token of the card.
   * @return cardToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference token of the card.")
  @JsonProperty(JSON_PROPERTY_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCardToken() {
    return cardToken;
  }




  public AuthorizationHold externalReferenceId(String externalReferenceId) {
    
    this.externalReferenceId = externalReferenceId;
    return this;
  }

   /**
   * The external reference ID to be used to reference the account hold in subsequent requests.
   * @return externalReferenceId
  **/
  @ApiModelProperty(required = true, value = "The external reference ID to be used to reference the account hold in subsequent requests.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalReferenceId() {
    return externalReferenceId;
  }


  public void setExternalReferenceId(String externalReferenceId) {
    this.externalReferenceId = externalReferenceId;
  }


  public AuthorizationHold originalAmount(BigDecimal originalAmount) {
    
    this.originalAmount = originalAmount;
    return this;
  }

   /**
   * The original amount of money to be held as a result of the authorization hold request.
   * @return originalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original amount of money to be held as a result of the authorization hold request.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOriginalAmount() {
    return originalAmount;
  }


  public void setOriginalAmount(BigDecimal originalAmount) {
    this.originalAmount = originalAmount;
  }


  public AuthorizationHold exchangeRate(BigDecimal exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * The exchange rate for the original currency.
   * @return exchangeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exchange rate for the original currency.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getExchangeRate() {
    return exchangeRate;
  }


  public void setExchangeRate(BigDecimal exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


   /**
   * The internal ID of the authorization hold, auto generated, unique.
   * @return encodedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The internal ID of the authorization hold, auto generated, unique.")
  @JsonProperty(JSON_PROPERTY_ENCODED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncodedKey() {
    return encodedKey;
  }




  public AuthorizationHold userTransactionTime(String userTransactionTime) {
    
    this.userTransactionTime = userTransactionTime;
    return this;
  }

   /**
   * The formatted time at which the user made this authorization hold.
   * @return userTransactionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The formatted time at which the user made this authorization hold.")
  @JsonProperty(JSON_PROPERTY_USER_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserTransactionTime() {
    return userTransactionTime;
  }


  public void setUserTransactionTime(String userTransactionTime) {
    this.userTransactionTime = userTransactionTime;
  }


  public AuthorizationHold originalCurrency(String originalCurrency) {
    
    this.originalCurrency = originalCurrency;
    return this;
  }

   /**
   * The original currency in which the hold was created.
   * @return originalCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original currency in which the hold was created.")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginalCurrency() {
    return originalCurrency;
  }


  public void setOriginalCurrency(String originalCurrency) {
    this.originalCurrency = originalCurrency;
  }


  public AuthorizationHold currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The ISO currency code in which the hold was created. The amounts are stored in the base currency, but the user could have enter it in a foreign currency.
   * @return currencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ISO currency code in which the hold was created. The amounts are stored in the base currency, but the user could have enter it in a foreign currency.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


   /**
   * The authorization hold status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The authorization hold status.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationHold authorizationHold = (AuthorizationHold) o;
    return Objects.equals(this.amount, authorizationHold.amount) &&
        Objects.equals(this.advice, authorizationHold.advice) &&
        Objects.equals(this.cardAcceptor, authorizationHold.cardAcceptor) &&
        Objects.equals(this.cardToken, authorizationHold.cardToken) &&
        Objects.equals(this.externalReferenceId, authorizationHold.externalReferenceId) &&
        Objects.equals(this.originalAmount, authorizationHold.originalAmount) &&
        Objects.equals(this.exchangeRate, authorizationHold.exchangeRate) &&
        Objects.equals(this.encodedKey, authorizationHold.encodedKey) &&
        Objects.equals(this.userTransactionTime, authorizationHold.userTransactionTime) &&
        Objects.equals(this.originalCurrency, authorizationHold.originalCurrency) &&
        Objects.equals(this.currencyCode, authorizationHold.currencyCode) &&
        Objects.equals(this.status, authorizationHold.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, advice, cardAcceptor, cardToken, externalReferenceId, originalAmount, exchangeRate, encodedKey, userTransactionTime, originalCurrency, currencyCode, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationHold {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    advice: ").append(toIndentedString(advice)).append("\n");
    sb.append("    cardAcceptor: ").append(toIndentedString(cardAcceptor)).append("\n");
    sb.append("    cardToken: ").append(toIndentedString(cardToken)).append("\n");
    sb.append("    externalReferenceId: ").append(toIndentedString(externalReferenceId)).append("\n");
    sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    encodedKey: ").append(toIndentedString(encodedKey)).append("\n");
    sb.append("    userTransactionTime: ").append(toIndentedString(userTransactionTime)).append("\n");
    sb.append("    originalCurrency: ").append(toIndentedString(originalCurrency)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

