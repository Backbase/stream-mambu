# mambu-deposit-accounts-client

deposits

- API version: v2

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.backbase.mambu</groupId>
  <artifactId>mambu-deposit-accounts-client</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.backbase.mambu:mambu-deposit-accounts-client:1.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/mambu-deposit-accounts-client-1.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.backbase.mambu.deposit.accounts.*;
import com.backbase.mambu.deposit.accounts.auth.*;
import com.backbase.mambu.deposit.accounts.model.*;
import com.backbase.mambu.deposit.accounts.api.DepositAccountsApi;

public class DepositAccountsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositAccountsApi apiInstance = new DepositAccountsApi(defaultClient);
        String depositAccountId = "depositAccountId_example"; // String | The id or encoded key of the deposit to which the interest will be applied
        ApplyInterestInput body = new ApplyInterestInput(); // ApplyInterestInput | Input details for apply accrued interest action
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            apiInstance.applyInterest(depositAccountId, body, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositAccountsApi#applyInterest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8889/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DepositAccountsApi* | [**applyInterest**](docs/DepositAccountsApi.md#applyInterest) | **POST** /deposits/{depositAccountId}:applyInterest | Apply accrued interest
*DepositAccountsApi* | [**changeState**](docs/DepositAccountsApi.md#changeState) | **POST** /deposits/{depositAccountId}:changeState | Allows posting an action such as approve deposit account
*DepositAccountsApi* | [**create**](docs/DepositAccountsApi.md#create) | **POST** /deposits | Creates a new deposit account
*DepositAccountsApi* | [**createCard**](docs/DepositAccountsApi.md#createCard) | **POST** /deposits/{depositAccountId}/cards | Create and associate a new card to the provided account
*DepositAccountsApi* | [**delete**](docs/DepositAccountsApi.md#delete) | **DELETE** /deposits/{depositAccountId} | Delete an inactive deposit account via id or encoded key
*DepositAccountsApi* | [**deleteCard**](docs/DepositAccountsApi.md#deleteCard) | **DELETE** /deposits/{depositAccountId}/cards/{cardReferenceToken} | Delete a card associated to the provided account via its reference token
*DepositAccountsApi* | [**getAll**](docs/DepositAccountsApi.md#getAll) | **GET** /deposits | Allows retrieval of deposit accounts using various query parameters. It&#39;s possible to look up deposits by their state, branch, centre or by a credit officer to which the deposits are assigned.
*DepositAccountsApi* | [**getAllAuthorizationHolds**](docs/DepositAccountsApi.md#getAllAuthorizationHolds) | **GET** /deposits/{depositAccountId}/authorizationholds | Retrieves authorization holds related to a deposit account, ordered from newest to oldest by creation date
*DepositAccountsApi* | [**getAllCards**](docs/DepositAccountsApi.md#getAllCards) | **GET** /deposits/{depositAccountId}/cards | Allows retrieval of all cards associated with the account
*DepositAccountsApi* | [**getById**](docs/DepositAccountsApi.md#getById) | **GET** /deposits/{depositAccountId} | Allows retrieval of a single deposit account via id or encoded key
*DepositAccountsApi* | [**patch**](docs/DepositAccountsApi.md#patch) | **PATCH** /deposits/{depositAccountId} | Partially update a deposit account
*DepositAccountsApi* | [**startMaturity**](docs/DepositAccountsApi.md#startMaturity) | **POST** /deposits/{depositAccountId}:startMaturity | Starts the maturity period for the specified deposit account
*DepositAccountsApi* | [**undoMaturity**](docs/DepositAccountsApi.md#undoMaturity) | **POST** /deposits/{depositAccountId}:undoMaturity | Undo the maturity period for the specified deposit account
*DepositAccountsApi* | [**update**](docs/DepositAccountsApi.md#update) | **PUT** /deposits/{depositAccountId} | Update an existing deposit account


## Documentation for Models

 - [ApplyInterestInput](docs/ApplyInterestInput.md)
 - [AuthorizationHold](docs/AuthorizationHold.md)
 - [Card](docs/Card.md)
 - [CardAcceptor](docs/CardAcceptor.md)
 - [DepositAccount](docs/DepositAccount.md)
 - [DepositAccountAccruedAmounts](docs/DepositAccountAccruedAmounts.md)
 - [DepositAccountAction](docs/DepositAccountAction.md)
 - [DepositAccountBalances](docs/DepositAccountBalances.md)
 - [DepositAccountIBAN](docs/DepositAccountIBAN.md)
 - [DepositAccountInterestPaymentSettings](docs/DepositAccountInterestPaymentSettings.md)
 - [DepositAccountInterestRateSettings](docs/DepositAccountInterestRateSettings.md)
 - [DepositAccountInterestRateTier](docs/DepositAccountInterestRateTier.md)
 - [DepositAccountInterestSettings](docs/DepositAccountInterestSettings.md)
 - [DepositAccountInternalControls](docs/DepositAccountInternalControls.md)
 - [DepositAccountOverdraftInterestRateSettings](docs/DepositAccountOverdraftInterestRateSettings.md)
 - [DepositAccountOverdraftInterestSettings](docs/DepositAccountOverdraftInterestSettings.md)
 - [DepositAccountOverdraftSettings](docs/DepositAccountOverdraftSettings.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [MonthAndDay](docs/MonthAndDay.md)
 - [PatchOperation](docs/PatchOperation.md)
 - [RestError](docs/RestError.md)
 - [StartMaturityAction](docs/StartMaturityAction.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basic


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


