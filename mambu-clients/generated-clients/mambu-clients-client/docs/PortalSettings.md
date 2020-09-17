

# PortalSettings

Portal settings for an individual client
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the entity, generated, globally unique |  [optional] [readonly]
**portalState** | [**PortalStateEnum**](#PortalStateEnum) | State of the client&#39;s portal preferences |  [optional]
**lastLoggedInDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date the client logged in to the portal |  [optional]



## Enum: PortalStateEnum

Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;



