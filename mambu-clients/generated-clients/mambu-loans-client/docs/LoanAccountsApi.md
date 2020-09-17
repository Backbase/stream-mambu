# LoanAccountsApi

All URIs are relative to *https://localhost:8889/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeInterestRate**](LoanAccountsApi.md#changeInterestRate) | **POST** /loans/{loanAccountId}:changeInterestRate | Allows to change the interest rate for a loan account
[**changeState**](LoanAccountsApi.md#changeState) | **POST** /loans/{loanAccountId}:changeState | Allows posting an action such as approve/reject/withdraw/close loan account
[**create**](LoanAccountsApi.md#create) | **POST** /loans | Creates a new loan account
[**delete**](LoanAccountsApi.md#delete) | **DELETE** /loans/{loanAccountId} | Delete a loan account
[**getAll**](LoanAccountsApi.md#getAll) | **GET** /loans | Allows retrieval of loan accounts using various query parameters. It&#39;s possible to look up loans by their state, branch, centre or by a credit officer to which the loans are assigned.
[**getById**](LoanAccountsApi.md#getById) | **GET** /loans/{loanAccountId} | Allows retrieval of a single loan account via id or encoded key
[**patch**](LoanAccountsApi.md#patch) | **PATCH** /loans/{loanAccountId} | Partially update an existing loan account
[**payOff**](LoanAccountsApi.md#payOff) | **POST** /loans/{loanAccountId}:payOff | Allows to pay off a loan account
[**undoRefinance**](LoanAccountsApi.md#undoRefinance) | **POST** /loans/{loanAccountId}:undoRefinance | Allows to undo refinance a loan account
[**undoReschedule**](LoanAccountsApi.md#undoReschedule) | **POST** /loans/{loanAccountId}:undoReschedule | Allows to undo reschedule a loan account
[**update**](LoanAccountsApi.md#update) | **PUT** /loans/{loanAccountId} | Update an existing loan account



## changeInterestRate

> changeInterestRate(loanAccountId, idempotencyKey, body)

Allows to change the interest rate for a loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        ChangeInterestRateLoanAccountInput body = new ChangeInterestRateLoanAccountInput(); // ChangeInterestRateLoanAccountInput | Allows specifying the action details for a loan account
        try {
            apiInstance.changeInterestRate(loanAccountId, idempotencyKey, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#changeInterestRate");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]
 **body** | [**ChangeInterestRateLoanAccountInput**](ChangeInterestRateLoanAccountInput.md)| Allows specifying the action details for a loan account | [optional]

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
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **204** | Change interest rate action posted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## changeState

> LoanAccount changeState(loanAccountId, body, idempotencyKey)

Allows posting an action such as approve/reject/withdraw/close loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        LoanAccountAction body = new LoanAccountAction(); // LoanAccountAction | Allows specifying the action details for a loan account
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            LoanAccount result = apiInstance.changeState(loanAccountId, body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#changeState");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **body** | [**LoanAccountAction**](LoanAccountAction.md)| Allows specifying the action details for a loan account |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**LoanAccount**](LoanAccount.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **200** | Loan account action posted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## create

> LoanAccount create(body, idempotencyKey)

Creates a new loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        LoanAccount body = new LoanAccount(); // LoanAccount | Loan account to be created
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            LoanAccount result = apiInstance.create(body, idempotencyKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#create");
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
 **body** | [**LoanAccount**](LoanAccount.md)| Loan account to be created |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

### Return type

[**LoanAccount**](LoanAccount.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **201** | Loan account created |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## delete

> delete(loanAccountId)

Delete a loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        try {
            apiInstance.delete(loanAccountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#delete");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |

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
| **204** | Loan account deleted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## getAll

> List&lt;LoanAccount&gt; getAll(offset, limit, paginationDetails, detailsLevel, creditOfficerUsername, branchId, centreId, accountState, accountHolderType, accountHolderId)

Allows retrieval of loan accounts using various query parameters. It&#39;s possible to look up loans by their state, branch, centre or by a credit officer to which the loans are assigned.

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        Integer offset = 56; // Integer | Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
        Integer limit = 56; // Integer | Pagination, the number of elements to retrieve, used in combination with offset to paginate results
        String paginationDetails = "OFF"; // String | Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        String creditOfficerUsername = "creditOfficerUsername_example"; // String | The username of the credit officer to whom the entities are assigned to
        String branchId = "branchId_example"; // String | The id/encodedKey of the branch to which the entities are assigned to
        String centreId = "centreId_example"; // String | The id/encodedKey of the centre to which the entities are assigned to
        String accountState = "accountState_example"; // String | The state of the loan account to search for
        String accountHolderType = "accountHolderType_example"; // String | The type of the account holder: CLIENT/GROUP
        String accountHolderId = "accountHolderId_example"; // String | The id of the account holder
        try {
            List<LoanAccount> result = apiInstance.getAll(offset, limit, paginationDetails, detailsLevel, creditOfficerUsername, branchId, centreId, accountState, accountHolderType, accountHolderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#getAll");
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
 **creditOfficerUsername** | **String**| The username of the credit officer to whom the entities are assigned to | [optional]
 **branchId** | **String**| The id/encodedKey of the branch to which the entities are assigned to | [optional]
 **centreId** | **String**| The id/encodedKey of the centre to which the entities are assigned to | [optional]
 **accountState** | **String**| The state of the loan account to search for | [optional] [enum: PARTIAL_APPLICATION, PENDING_APPROVAL, APPROVED, ACTIVE, ACTIVE_IN_ARREARS, CLOSED]
 **accountHolderType** | **String**| The type of the account holder: CLIENT/GROUP | [optional] [enum: CLIENT, GROUP]
 **accountHolderId** | **String**| The id of the account holder | [optional]

### Return type

[**List&lt;LoanAccount&gt;**](LoanAccount.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan accounts list retrieved |  * Items-Offset - Pagination details, the index of the first returned item <br>  * Items-Limit - Pagination details, the requested page size <br>  * Items-Total - Pagination details, the total available items <br>  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |


## getById

> LoanAccount getById(loanAccountId, detailsLevel)

Allows retrieval of a single loan account via id or encoded key

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        String detailsLevel = "detailsLevel_example"; // String | The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
        try {
            LoanAccount result = apiInstance.getById(loanAccountId, detailsLevel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#getById");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **detailsLevel** | **String**| The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object | [optional] [enum: BASIC, FULL]

### Return type

[**LoanAccount**](LoanAccount.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan account retrieved |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## patch

> patch(loanAccountId, body)

Partially update an existing loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        List<PatchOperation> body = Arrays.asList(); // List<PatchOperation> | Patch operations to be applied to a resource
        try {
            apiInstance.patch(loanAccountId, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#patch");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
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
| **204** | Loan account updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## payOff

> payOff(loanAccountId, body, idempotencyKey)

Allows to pay off a loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        LoanAccountPayOffInput body = new LoanAccountPayOffInput(); // LoanAccountPayOffInput | Allows specifying the input for loan account pay off
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        try {
            apiInstance.payOff(loanAccountId, body, idempotencyKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#payOff");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **body** | [**LoanAccountPayOffInput**](LoanAccountPayOffInput.md)| Allows specifying the input for loan account pay off |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]

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
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **204** | Pay off action posted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## undoRefinance

> undoRefinance(loanAccountId, idempotencyKey, body)

Allows to undo refinance a loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        LoanActionDetails body = new LoanActionDetails(); // LoanActionDetails | Allows specifying the action details for a loan account
        try {
            apiInstance.undoRefinance(loanAccountId, idempotencyKey, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#undoRefinance");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]
 **body** | [**LoanActionDetails**](LoanActionDetails.md)| Allows specifying the action details for a loan account | [optional]

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
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **204** | Undo refinance action posted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## undoReschedule

> undoReschedule(loanAccountId, idempotencyKey, body)

Allows to undo reschedule a loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        String idempotencyKey = "idempotencyKey_example"; // String | Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
        LoanActionDetails body = new LoanActionDetails(); // LoanActionDetails | Allows specifying the action details for a loan account
        try {
            apiInstance.undoReschedule(loanAccountId, idempotencyKey, body);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#undoReschedule");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **idempotencyKey** | **String**| Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting. | [optional]
 **body** | [**LoanActionDetails**](LoanActionDetails.md)| Allows specifying the action details for a loan account | [optional]

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
| **102** | Your idempotent request was already submitted and is currently being processed, try again later. |  -  |
| **204** | Undo reschedule action posted |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |


## update

> LoanAccount update(loanAccountId, body)

Update an existing loan account

### Example

```java
// Import classes:
import com.backbase.mambu.loans.ApiClient;
import com.backbase.mambu.loans.ApiException;
import com.backbase.mambu.loans.Configuration;
import com.backbase.mambu.loans.auth.*;
import com.backbase.mambu.loans.models.*;
import com.backbase.mambu.loans.api.LoanAccountsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8889/api");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        LoanAccountsApi apiInstance = new LoanAccountsApi(defaultClient);
        String loanAccountId = "loanAccountId_example"; // String | The id or encoded key of the loan account
        LoanAccount body = new LoanAccount(); // LoanAccount | Loan account to be updated
        try {
            LoanAccount result = apiInstance.update(loanAccountId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanAccountsApi#update");
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
 **loanAccountId** | **String**| The id or encoded key of the loan account |
 **body** | [**LoanAccount**](LoanAccount.md)| Loan account to be updated |

### Return type

[**LoanAccount**](LoanAccount.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.mambu.v2+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Loan account updated |  -  |
| **400** | A Validation error occurred |  -  |
| **401** | UNAUTHORIZED |  -  |
| **403** | Forbidden |  -  |
| **404** | Loan account not found |  -  |

