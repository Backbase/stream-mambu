

# AuthorizationHold

An authorization hold entry as a result of a hold action performed by a card acceptor.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of money to be held as a result of the authorization hold request. | 
**advice** | **Boolean** | Whether the given request should be accepted without balance validations. | 
**cardAcceptor** | [**CardAcceptor**](CardAcceptor.md) |  |  [optional]
**cardToken** | **String** | The reference token of the card. |  [optional] [readonly]
**externalReferenceId** | **String** | The external reference ID to be used to reference the account hold in subsequent requests. | 
**originalAmount** | [**BigDecimal**](BigDecimal.md) | The original amount of money to be held as a result of the authorization hold request. |  [optional]
**exchangeRate** | [**BigDecimal**](BigDecimal.md) | The exchange rate for the original currency. |  [optional]
**encodedKey** | **String** | The internal ID of the authorization hold, auto generated, unique. |  [optional] [readonly]
**userTransactionTime** | **String** | The formatted time at which the user made this authorization hold. |  [optional]
**originalCurrency** | **String** | The original currency in which the hold was created. |  [optional]
**currencyCode** | **String** | The ISO currency code in which the hold was created. The amounts are stored in the base currency, but the user could have enter it in a foreign currency. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The authorization hold status. |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
PENDING | &quot;PENDING&quot;
REVERSED | &quot;REVERSED&quot;
SETTLED | &quot;SETTLED&quot;
EXPIRED | &quot;EXPIRED&quot;



