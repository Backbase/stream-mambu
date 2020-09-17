

# Address

Address Data Transfer Object
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **String** | The country |  [optional]
**parentKey** | **String** | Address parent key, the object owning this address, client, centre, branch |  [optional] [readonly]
**city** | **String** | The city for this address |  [optional]
**latitude** | [**BigDecimal**](BigDecimal.md) | The GPS latitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -90 to +90 |  [optional]
**postcode** | **String** | The post code |  [optional]
**indexInList** | **Integer** | Index of this address in the list of addresses |  [optional]
**encodedKey** | **String** | Address encoded key, unique, generated |  [optional] [readonly]
**region** | **String** | The region that is part of the address |  [optional]
**line2** | **String** | The second line for the address, in case the first one doesn&#39;t fit the information, this is completely optional |  [optional]
**line1** | **String** | The first line of the address |  [optional]
**longitude** | [**BigDecimal**](BigDecimal.md) | The GPS longitude of this address in signed degrees format (DDD.dddd) with 6 decimal positions, ranging from -180 to +180 |  [optional]



