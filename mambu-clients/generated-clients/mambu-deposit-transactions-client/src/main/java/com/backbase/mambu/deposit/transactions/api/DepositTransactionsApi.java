package com.backbase.mambu.deposit.transactions.api;

import com.backbase.mambu.deposit.transactions.ApiClient;

import com.backbase.mambu.deposit.transactions.model.DepositTransaction;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionAdjustmentDetails;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionInput;
import com.backbase.mambu.deposit.transactions.model.DepositTransactionSearchCriteria;
import com.backbase.mambu.deposit.transactions.model.ErrorResponse;
import com.backbase.mambu.deposit.transactions.model.FeeAppliedDepositTransactionInput;
import com.backbase.mambu.deposit.transactions.model.TransferDepositTransactionInput;
import com.backbase.mambu.deposit.transactions.model.WithdrawalDepositTransactionInput;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;


public class DepositTransactionsApi {
    private ApiClient apiClient;

    public DepositTransactionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DepositTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Allows the adjustment of a deposit transaction. The adjustment of a single transaction may bulk adjust multiple transactions
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>200</b> - Deposit transaction adjusted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit transaction not found
     * @param depositTransactionId The id or encoded key of the deposit transaction
     * @param body Details of the adjustment action
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> adjust(String depositTransactionId, DepositTransactionAdjustmentDetails body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositTransactionId' is set
        if (depositTransactionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositTransactionId' when calling adjust");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling adjust");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositTransactionId", depositTransactionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        headerParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));
        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/transactions/{depositTransactionId}:adjust", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Apply a fee on deposit account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Fee applied transaction created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit that the transaction will be created for
     * @param body Represents the request payload for creating a transaction of type FEE_APPLIED on a deposit
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> applyFee(String depositAccountId, FeeAppliedDepositTransactionInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling applyFee");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling applyFee");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        headerParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));
        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/fee-transactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of all transactions for a deposit account via id or encoded key
     * 
     * <p><b>200</b> - Deposit transactions list retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param depositAccountId The id or encoded key of the deposit account used to retrieve all its transactions
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return List&lt;DepositTransaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<DepositTransaction> getAll(String depositAccountId, Integer offset, Integer limit, String paginationDetails, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling getAll");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginationDetails", paginationDetails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detailsLevel", detailsLevel));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeFluxAPI("/deposits/{depositAccountId}/transactions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of a single deposit transaction via id or encoded key
     * 
     * <p><b>200</b> - Deposit transaction retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit transaction not found
     * @param depositTransactionId The id or encoded key of the deposit transaction
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> getById(String depositTransactionId, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositTransactionId' is set
        if (depositTransactionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositTransactionId' when calling getById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositTransactionId", depositTransactionId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detailsLevel", detailsLevel));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/transactions/{depositTransactionId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create new deposit transaction for account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Deposit transaction created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit that the transaction will be created for
     * @param body The input details needed to create a deposit transaction
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> makeDeposit(String depositAccountId, DepositTransactionInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling makeDeposit");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling makeDeposit");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        headerParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));
        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/deposit-transactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a new transfer transaction
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Transfer transaction created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit that the transaction will be created for
     * @param body Input details for transfer transaction
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> makeTransfer(String depositAccountId, TransferDepositTransactionInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling makeTransfer");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling makeTransfer");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        headerParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));
        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/transfer-transactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a new withdrawal transaction
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Withdrawal transaction created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit that the transaction will be created for
     * @param body Input details for withdrawal transaction
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositTransaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositTransaction> makeWithdrawal(String depositAccountId, WithdrawalDepositTransactionInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling makeWithdrawal");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling makeWithdrawal");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        headerParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));
        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/withdrawal-transactions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Client Directed Query. Allows you to search deposit transactions for deposit accounts by various criteria
     * 
     * <p><b>200</b> - Result of deposit transaction search
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Criteria to be used to search the deposit transactions
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return List&lt;DepositTransaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<DepositTransaction> search(DepositTransactionSearchCriteria body, Integer offset, Integer limit, String paginationDetails, String detailsLevel) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling search");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "paginationDetails", paginationDetails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "detailsLevel", detailsLevel));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositTransaction> localVarReturnType = new ParameterizedTypeReference<DepositTransaction>() {};
        return apiClient.invokeFluxAPI("/deposits/transactions:search", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
