

# CardTransaction

A card transaction entry which will have a corresponding a financial transaction performed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalReferenceId** | **String** | The external reference ID to be used to reference the card transaction in subsequent requests. | 
**amount** | [**BigDecimal**](BigDecimal.md) | The amount of money to be withdrawn in the financial transaction. | 
**advice** | **Boolean** | Whether the given request should be accepted without balance validations. | 
**externalAuthorizationReferenceId** | **String** | The external authorization hold reference ID, which relates this card transaction to a previous authorization hold. |  [optional]
**cardAcceptor** | [**CardAcceptor**](CardAcceptor.md) |  |  [optional]
**encodedKey** | **String** | The encoded key of the entity, generated, globally unique |  [optional] [readonly]
**userTransactionTime** | **String** | The formatted time at which the user made this card transaction. |  [optional]
**currencyCode** | **String** | The ISO currency code in which the card reversal transaction is posted. The amounts are stored in the base currency, but the transaction can be created with a foreign currency. |  [optional]
**cardToken** | **String** | The reference token of the card. |  [optional] [readonly]



