# LoanProductsApi

All URIs are relative to *https://localhost:8889/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](LoanProductsApi.md#create) | **POST** /loanproducts | Create a new loan product
[**delete**](LoanProductsApi.md#delete) | **DELETE** /loanproducts/{loanProductId} | Delete a loan product
[**getAll**](LoanProductsApi.md#getAll) | **GET** /loanproducts | Allows retrieval of all loan products in paginated or non-paginated manner
[**getById**](LoanProductsApi.md#getById) | **GET** /loanproducts/{loanProductId} | Allows retrieval of a single loan product via id or encoded key
[**patch**](LoanProductsApi.md#patch) | **PATCH** /loanproducts/{loanProductId} | Partially update an existing loan product
[**update**](LoanProductsApi.md#update) | **PUT** /loanproducts/{loanProductId} | Update an existing loan product



## create

> LoanProduct create(body, idempotencyKey)

Create a new loan product

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        LoanProduct body = new LoanProduct(); // LoanProduct | Loan product to be created
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            LoanProduct result = apiInstance.create(body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#create");
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
 **body** | [**LoanProduct**](LoanProduct.md)| Loan product to be created |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**LoanProduct**](LoanProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **201** | Loan product created |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## delete

> delete(loanProductId)

Delete a loan product

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        String loanProductId = "loanProductId_example"; // String | The id or encoded key of the loan product to be deleted
        try {
            apiInstance.delete(loanProductId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#delete");
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
 **loanProductId** | **String**| The id or encoded key of the loan product to be deleted |

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
| **204** | Loan product deleted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan product not found |  -  |


## getAll

> List&lt;LoanProduct&gt; getAll(offset, limit, paginationDetails, sortBy)

Allows retrieval of all loan products in paginated or non-paginated manner

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
        Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
        String paginationDetails = "OFF"; // String | Flag specifying whether the pagination  details should be provided in response headers. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
        String sortBy = "sortBy_example"; // String | The criteria based on which the records will be sorted. Expected format is <field:order>, eg sortBy = field1:ASC,field2:DESC.<br/>Only the following fields can be used: id, productName, creationDate, lastModifiedDate<br/>Default sorting is done by creationDate:DESC
        try {
            List<LoanProduct> result = apiInstance.getAll(offset, limit, paginationDetails, sortBy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#getAll");
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
 **paginationDetails** | **String**| Flag specifying whether the pagination  details should be provided in response headers. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs | [optional] [default to OFF] [enum: ON, OFF]
 **sortBy** | **String**| The criteria based on which the records will be sorted. Expected format is &lt;field:order&gt;, eg sortBy &#x3D; field1:ASC,field2:DESC.&lt;br/&gt;Only the following fields can be used: id, productName, creationDate, lastModifiedDate&lt;br/&gt;Default sorting is done by creationDate:DESC | [optional]

### Return type

[**List&lt;LoanProduct&gt;**](LoanProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan products retrieved |  * Items-Offset - Pagination details, the index of the first returned item <br>  * Items-Limit - Pagination details, the requested page size <br>  * Items-Total - Pagination details, the total available items <br>  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## getById

> LoanProduct getById(loanProductId, detailsLevel)

Allows retrieval of a single loan product via id or encoded key

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        String loanProductId = "loanProductId_example"; // String | The id or encoded key of the loan product to be retrieved
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        try {
            LoanProduct result = apiInstance.getById(loanProductId, detailsLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#getById");
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
 **loanProductId** | **String**| The id or encoded key of the loan product to be retrieved |
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**LoanProduct**](LoanProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan product retrieved |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan product not found |  -  |


## patch

> patch(loanProductId, body)

Partially update an existing loan product

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        String loanProductId = "loanProductId_example"; // String | The id or encoded key of the loan product to be updated
        List<PatchOperation> body = Arrays.asList(); // List<PatchOperation> | Patch operations to be applied to a resource
        try {
            apiInstance.patch(loanProductId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#patch");
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
 **loanProductId** | **String**| The id or encoded key of the loan product to be updated |
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
| **204** | Loan product updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan product not found |  -  |


## update

> LoanProduct update(loanProductId, body)

Update an existing loan product

### Example

```java
// Import classes:
import com.backbase.mambu.loan.products.ApiClient;
import com.backbase.mambu.loan.products.ApiException;
import com.backbase.mambu.loan.products.Configuration;
import com.backbase.mambu.loan.products.auth.*;
import com.backbase.mambu.loan.products.models.*;
import com.backbase.mambu.loan.products.api.LoanProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanProductsApi apiInstance = new LoanProductsApi(defaultClient);
        String loanProductId = "loanProductId_example"; // String | The id or encoded key of the loan product to be updated
        LoanProduct body = new LoanProduct(); // LoanProduct | Loan product to be updated
        try {
            LoanProduct result = apiInstance.update(loanProductId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanProductsApi#update");
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
 **loanProductId** | **String**| The id or encoded key of the loan product to be updated |
 **body** | [**LoanProduct**](LoanProduct.md)| Loan product to be updated |

### Return type

[**LoanProduct**](LoanProduct.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan product updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan product not found |  -  |

