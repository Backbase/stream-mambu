# DepositProductsApi

All URIs are relative to *https://localhost:8889/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchUpdate**](DepositProductsApi.md#batchUpdate) | **POST** /depositproducts/{depositProductId}:batchUpdate | Perform batch update action for the specified deposit product
[**create**](DepositProductsApi.md#create) | **POST** /depositproducts | Create a new deposit product
[**delete**](DepositProductsApi.md#delete) | **DELETE** /depositproducts/{depositProductId} | Delete a deposit product
[**getById**](DepositProductsApi.md#getById) | **GET** /depositproducts/{depositProductId} | Allows retrieval of a single deposit product via id or encoded key
[**patch**](DepositProductsApi.md#patch) | **PATCH** /depositproducts/{depositProductId} | Partially update an existing deposit product
[**update**](DepositProductsApi.md#update) | **PUT** /depositproducts/{depositProductId} | Update an existing deposit product



## batchUpdate

> DepositProductActionResponse batchUpdate(depositProductId, body, idempotencyKey)

Perform batch update action for the specified deposit product

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        String depositProductId = "depositProductId_example"; // String | The id or encoded key of the deposit product to perform batch update action
        DepositProductAction body = new DepositProductAction(); // DepositProductAction | Allows specifying the batch update action details for a deposit product
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            DepositProductActionResponse result = apiInstance.batchUpdate(depositProductId, body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#batchUpdate");
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
 **depositProductId** | **String**| The id or encoded key of the deposit product to perform batch update action |
 **body** | [**DepositProductAction**](DepositProductAction.md)| Allows specifying the batch update action details for a deposit product |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositProductActionResponse**](DepositProductActionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **202** | Batch update action accepted for the specified deposit product |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Deposit product not found |  -  |


## create

> DepositProduct create(body, idempotencyKey)

Create a new deposit product

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        DepositProduct body = new DepositProduct(); // DepositProduct | Deposit product to be created
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            DepositProduct result = apiInstance.create(body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#create");
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
 **body** | [**DepositProduct**](DepositProduct.md)| Deposit product to be created |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**DepositProduct**](DepositProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **201** | Deposit product created |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## delete

> delete(depositProductId)

Delete a deposit product

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        String depositProductId = "depositProductId_example"; // String | The id or encoded key of the deposit product to be deleted
        try {
            apiInstance.delete(depositProductId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#delete");
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
 **depositProductId** | **String**| The id or encoded key of the deposit product to be deleted |

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
| **204** | Deposit product deleted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Deposit product not found |  -  |


## getById

> DepositProduct getById(depositProductId, detailsLevel)

Allows retrieval of a single deposit product via id or encoded key

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        String depositProductId = "depositProductId_example"; // String | The id or encoded key of the deposit product to be retrieved
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        try {
            DepositProduct result = apiInstance.getById(depositProductId, detailsLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#getById");
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
 **depositProductId** | **String**| The id or encoded key of the deposit product to be retrieved |
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**DepositProduct**](DepositProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit product retrieved |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Deposit product not found |  -  |


## patch

> patch(depositProductId, body)

Partially update an existing deposit product

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        String depositProductId = "depositProductId_example"; // String | The id or encoded key of the deposit product to be updated
        List<PatchOperation> body = Arrays.asList(); // List<PatchOperation> | Patch operations to be applied to a resource
        try {
            apiInstance.patch(depositProductId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#patch");
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
 **depositProductId** | **String**| The id or encoded key of the deposit product to be updated |
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
| **204** | Deposit product updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Deposit product not found |  -  |


## update

> DepositProduct update(depositProductId, body)

Update an existing deposit product

### Example

```java
// Import classes:
import com.backbase.mambu.deposit.products.ApiClient;
import com.backbase.mambu.deposit.products.ApiException;
import com.backbase.mambu.deposit.products.Configuration;
import com.backbase.mambu.deposit.products.auth.*;
import com.backbase.mambu.deposit.products.models.*;
import com.backbase.mambu.deposit.products.api.DepositProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        DepositProductsApi apiInstance = new DepositProductsApi(defaultClient);
        String depositProductId = "depositProductId_example"; // String | The id or encoded key of the deposit product to be updated
        DepositProduct body = new DepositProduct(); // DepositProduct | Deposit product to be updated
        try {
            DepositProduct result = apiInstance.update(depositProductId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DepositProductsApi#update");
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
 **depositProductId** | **String**| The id or encoded key of the deposit product to be updated |
 **body** | [**DepositProduct**](DepositProduct.md)| Deposit product to be updated |

### Return type

[**DepositProduct**](DepositProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Deposit product updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Deposit product not found |  -  |

