

# PeriodicPayment

For fixed term loans there is the possibility to define a payment plan. A payment plan consists of multiple periodic payments. This class holds information about a periodic payment.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toInstallment** | **Integer** | The installment&#39;s position up to which the PMT will be used | 
**encodedKey** | **String** | The encoded key of the periodic payment, auto generated, unique. |  [optional] [readonly]
**amount** | [**BigDecimal**](BigDecimal.md) | The PMT value used in periodic payment | 



