

# Client

A person that uses the services of the bank. Clients may have associated information such as their address, custom fields or identification documents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastName** | **String** | The last name, surname or family name of the client | 
**migrationEventKey** | **String** | The migration event encoded key associated with this client. |  [optional] [readonly]
**preferredLanguage** | [**PreferredLanguageEnum**](#PreferredLanguageEnum) | The client&#39;s language of use in Mambu |  [optional]
**addresses** | [**List&lt;Address&gt;**](Address.md) | The addresses associated with this client information like street, city etc. |  [optional]
**notes** | **String** | Extra notes about this client |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | Gender of the person, male or female |  [optional]
**groupKeys** | **List&lt;String&gt;** | The groups to which this client belongs |  [optional]
**groupLoanCycle** | **Integer** | Number of paid and closed (with &#39;obligations met&#39;) accounts for this client&#39;s group, when the closing operation is reverted, this is reduced |  [optional] [readonly]
**portalSettings** | [**PortalSettings**](PortalSettings.md) |  |  [optional]
**assignedBranchKey** | **String** | Encoded key of the branch this client is assigned to |  [optional]
**loanCycle** | **Integer** | Number of paid and closed (with &#39;obligations met&#39;) accounts for this client, when the closing operation is reverted, this is reduced |  [optional] [readonly]
**emailAddress** | **String** | The client&#39;s email address |  [optional]
**encodedKey** | **String** | The encoded key of the client, auto generated, unique |  [optional] [readonly]
**id** | **String** | The id of the client, can be generated and customized, unique |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of a client shows his workflow status, if he is waiting approval or is rejected or blacklisted |  [optional]
**assignedUserKey** | **String** | Encoded key of the user this client is assigned to |  [optional]
**clientRoleKey** | **String** | A role which describes the intended use of a client in the system |  [optional]
**lastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last date this client was modified |  [optional] [readonly]
**homePhone** | **String** | The client&#39;s home phone number |  [optional]
**creationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date this client was created |  [optional] [readonly]
**birthDate** | [**LocalDate**](LocalDate.md) | The date when this client was born |  [optional]
**assignedCentreKey** | **String** | Encoded key of the centre this client is assigned to |  [optional]
**approvedDate** | [**OffsetDateTime**](OffsetDateTime.md) | date when client was approved |  [optional] [readonly]
**firstName** | **String** | The first name, personal name, given name or forename of the client | 
**idDocuments** | [**List&lt;IdentificationDocument&gt;**](IdentificationDocument.md) | The identification documents of this person |  [optional]
**profilePictureKey** | **String** | Encoded key of this clients profile picture |  [optional] [readonly]
**profileSignatureKey** | **String** | Encoded key of the users profile signature |  [optional] [readonly]
**mobilePhone** | **String** | The client&#39;s mobile phone number |  [optional]
**closedDate** | [**OffsetDateTime**](OffsetDateTime.md) | date when client was closed |  [optional] [readonly]
**middleName** | **String** | The middle name of the client, if she/he has one |  [optional]
**activationDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date when client was set as active for the first time |  [optional] [readonly]



## Enum: PreferredLanguageEnum

Name | Value
---- | -----
ENGLISH | &quot;ENGLISH&quot;
PORTUGESE | &quot;PORTUGESE&quot;
SPANISH | &quot;SPANISH&quot;
RUSSIAN | &quot;RUSSIAN&quot;
FRENCH | &quot;FRENCH&quot;
GEORGIAN | &quot;GEORGIAN&quot;
CHINESE | &quot;CHINESE&quot;
INDONESIAN | &quot;INDONESIAN&quot;
ROMANIAN | &quot;ROMANIAN&quot;
BURMESE | &quot;BURMESE&quot;
GERMAN | &quot;GERMAN&quot;
PHRASE | &quot;PHRASE&quot;



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;MALE&quot;
FEMALE | &quot;FEMALE&quot;



## Enum: StateEnum

Name | Value
---- | -----
PENDING_APPROVAL | &quot;PENDING_APPROVAL&quot;
INACTIVE | &quot;INACTIVE&quot;
ACTIVE | &quot;ACTIVE&quot;
EXITED | &quot;EXITED&quot;
BLACKLISTED | &quot;BLACKLISTED&quot;
REJECTED | &quot;REJECTED&quot;



