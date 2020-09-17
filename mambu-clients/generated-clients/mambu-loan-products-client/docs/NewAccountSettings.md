

# NewAccountSettings

The new account settings, defines the settings and constraints used by new loan account created based on this product.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idGeneratorType** | [**IdGeneratorTypeEnum**](#IdGeneratorTypeEnum) | The type of generator used for IDs creation. | 
**accountInitialState** | [**AccountInitialStateEnum**](#AccountInitialStateEnum) | The initial state of the account when is created. | 
**idPattern** | **String** | The pattern that will be used for ID validation (as referred to as an input mask). | 



## Enum: IdGeneratorTypeEnum

Name | Value
---- | -----
INCREMENTAL_NUMBER | &quot;INCREMENTAL_NUMBER&quot;
RANDOM_PATTERN | &quot;RANDOM_PATTERN&quot;



## Enum: AccountInitialStateEnum

Name | Value
---- | -----
PARTIAL_APPLICATION | &quot;PARTIAL_APPLICATION&quot;
PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot;
APPROVED | &quot;APPROVED&quot;
ACTIVE | &quot;ACTIVE&quot;
ACTIVE_IN_ARREARS | &quot;ACTIVE_IN_ARREARS&quot;
CLOSED | &quot;CLOSED&quot;



