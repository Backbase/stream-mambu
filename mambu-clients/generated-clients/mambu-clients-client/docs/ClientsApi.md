# ClientsApi

All URIs are relative to *https://localhost:8889/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](ClientsApi.md#create) | **POST** /clients | Create a new client
[**delete**](ClientsApi.md#delete) | **DELETE** /clients/{clientId} | Delete a client
[**getAll**](ClientsApi.md#getAll) | **GET** /clients | Allows retrieval of clients using various query parameters
[**getById**](ClientsApi.md#getById) | **GET** /clients/{clientId} | Allows retrieval of a single client via id or encoded key
[**getRoleByClientId**](ClientsApi.md#getRoleByClientId) | **GET** /clients/{clientId}/role | Allows to retrieve the client role for a client
[**patch**](ClientsApi.md#patch) | **PATCH** /clients/{clientId} | Partially update an existing client
[**search**](ClientsApi.md#search) | **POST** /clients:search | Allows you to search clients by various criteria
[**update**](ClientsApi.md#update) | **PUT** /clients/{clientId} | Update an existing client



## create

> Client create(body, idempotencyKey)

Create a new client

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        Client body = new Client(); // Client | Client to be created
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            Client result = apiInstance.create(body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#create");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Client**](Client.md)| Client to be created |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**Client**](Client.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **201** | Client created |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## delete

> delete(clientId)

Delete a client

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String clientId = "clientId_example"; // String | The id or encoded key of the client to be deleted
        try {
            apiInstance.delete(clientId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#delete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The id or encoded key of the client to be deleted |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Client deleted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Client not found |  -  |


## getAll

> List&lt;Client&gt; getAll(offset, limit, paginationDetails, detailsLevel, firstName, lastName, idNumber, branchId, centreId, creditOfficerUsername, state, birthDate, sortBy)

Allows retrieval of clients using various query parameters

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
        Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
        String paginationDetails = "OFF"; // String | Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        String firstName = "firstName_example"; // String | The first name, personal name, given name or forename of the client
        String lastName = "lastName_example"; // String | The last name, surname or family name of the client
        String idNumber = "idNumber_example"; // String | The id number of the client's identification document
        String branchId = "branchId_example"; // String | The branch id/key to search for
        String centreId = "centreId_example"; // String | The centre id/key to search for
        String creditOfficerUsername = "creditOfficerUsername_example"; // String | The user name of the credit officer
        String state = "state_example"; // String | The state of the client to search for
        LocalDate birthDate = new LocalDate(); // LocalDate | The birth date of the client to search for
        String sortBy = "sortBy_example"; // String | The criteria based on which the records will be sorted. Expected format is <field:order>, eg sortBy = field1:ASC,field2:DESC.<br/>Only the following fields can be used: firstName, lastName, creationDate, lastModifiedDate<br/>Default sorting is done by  lastModifiedDate:DESC
        try {
            List<Client> result = apiInstance.getAll(offset, limit, paginationDetails, detailsLevel, firstName, lastName, idNumber, branchId, centreId, creditOfficerUsername, state, birthDate, sortBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#getAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results | [optional]
 **limit** | **Integer**| Pagination, the number of elements to retrieve, used in combination with offset to paginate results | [optional]
 **paginationDetails** | **String**| Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs | [optional] [default to OFF] [enum: ON, OFF]
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]
 **firstName** | **String**| The first name, personal name, given name or forename of the client | [optional]
 **lastName** | **String**| The last name, surname or family name of the client | [optional]
 **idNumber** | **String**| The id number of the client&#39;s identification document | [optional]
 **branchId** | **String**| The branch id/key to search for | [optional]
 **centreId** | **String**| The centre id/key to search for | [optional]
 **creditOfficerUsername** | **String**| The user name of the credit officer | [optional]
 **state** | **String**| The state of the client to search for | [optional] [enum: PENDING_APPROVAL, INACTIVE, ACTIVE, EXITED, BLACKLISTED, REJECTED]
 **birthDate** | **LocalDate**| The birth date of the client to search for | [optional]
 **sortBy** | **String**| The criteria based on which the records will be sorted. Expected format is &lt;field:order&gt;, eg sortBy &#x3D; field1:ASC,field2:DESC.&lt;br/&gt;Only the following fields can be used: firstName, lastName, creationDate, lastModifiedDate&lt;br/&gt;Default sorting is done by  lastModifiedDate:DESC | [optional]

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Clients list retrieved |  * Items-Offset - Pagination details, the index of the first returned item <br>  * Items-Limit - Pagination details, the requested page size <br>  * Items-Total - Pagination details, the total available items <br>  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## getById

> Client getById(clientId, detailsLevel)

Allows retrieval of a single client via id or encoded key

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String clientId = "clientId_example"; // String | The id or encoded key of the client to be retrieved
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        try {
            Client result = apiInstance.getById(clientId, detailsLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#getById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The id or encoded key of the client to be retrieved |
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**Client**](Client.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Client retrieved |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Client not found |  -  |


## getRoleByClientId

> ClientRole getRoleByClientId(clientId)

Allows to retrieve the client role for a client

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String clientId = "clientId_example"; // String | The id or encoded key of the client to be retrieved
        try {
            ClientRole result = apiInstance.getRoleByClientId(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#getRoleByClientId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The id or encoded key of the client to be retrieved |

### Return type

[**ClientRole**](ClientRole.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Client role retrieved |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Client not found |  -  |


## patch

> patch(clientId, body)

Partially update an existing client

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String clientId = "clientId_example"; // String | The id or encoded key of the client to be updated
        List<PatchOperation> body = Arrays.asList(); // List<PatchOperation> | Patch operations to be applied to a resource
        try {
            apiInstance.patch(clientId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#patch");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The id or encoded key of the client to be updated |
 **body** | [**List&lt;PatchOperation&gt;**](PatchOperation.md)| Patch operations to be applied to a resource |

### Return type

null (empty response body)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Client updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Client not found |  -  |


## search

> List&lt;Client&gt; search(body, offset, limit, paginationDetails, detailsLevel)

Allows you to search clients by various criteria

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        ClientSearchCriteria body = new ClientSearchCriteria(); // ClientSearchCriteria | Criteria to be used to search the clients
        Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
        Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
        String paginationDetails = "OFF"; // String | Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        try {
            List<Client> result = apiInstance.search(body, offset, limit, paginationDetails, detailsLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#search");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientSearchCriteria**](ClientSearchCriteria.md)| Criteria to be used to search the clients |
 **offset** | **Integer**| Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results | [optional]
 **limit** | **Integer**| Pagination, the number of elements to retrieve, used in combination with offset to paginate results | [optional]
 **paginationDetails** | **String**| Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs | [optional] [default to OFF] [enum: ON, OFF]
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**List&lt;Client&gt;**](Client.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Result of client search |  * Items-Offset - Pagination details, the index of the first returned item <br>  * Items-Limit - Pagination details, the requested page size <br>  * Items-Total - Pagination details, the total available items <br>  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## update

> Client update(clientId, body)

Update an existing client

### Example

```java
// Import classes:
import com.backbase.mambu.clients.ApiClient;
import com.backbase.mambu.clients.ApiException;
import com.backbase.mambu.clients.Configuration;
import com.backbase.mambu.clients.auth.*;
import com.backbase.mambu.clients.models.*;
import com.backbase.mambu.clients.api.ClientsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ClientsApi apiInstance = new ClientsApi(defaultClient);
        String clientId = "clientId_example"; // String | The id or encoded key of the client to be updated
        Client body = new Client(); // Client | Client to be updated
        try {
            Client result = apiInstance.update(clientId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientsApi#update");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| The id or encoded key of the client to be updated |
 **body** | [**Client**](Client.md)| Client to be updated |

### Return type

[**Client**](Client.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Client updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Client not found |  -  |

