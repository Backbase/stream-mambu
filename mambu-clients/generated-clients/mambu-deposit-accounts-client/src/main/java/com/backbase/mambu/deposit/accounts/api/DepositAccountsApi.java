package com.backbase.mambu.deposit.accounts.api;

import com.backbase.mambu.deposit.accounts.ApiClient;

import com.backbase.mambu.deposit.accounts.model.ApplyInterestInput;
import com.backbase.mambu.deposit.accounts.model.AuthorizationHold;
import com.backbase.mambu.deposit.accounts.model.Card;
import com.backbase.mambu.deposit.accounts.model.DepositAccount;
import com.backbase.mambu.deposit.accounts.model.DepositAccountAction;
import com.backbase.mambu.deposit.accounts.model.ErrorResponse;
import com.backbase.mambu.deposit.accounts.model.PatchOperation;
import com.backbase.mambu.deposit.accounts.model.StartMaturityAction;

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


public class DepositAccountsApi {
    private ApiClient apiClient;

    public DepositAccountsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DepositAccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply accrued interest
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Interest applied
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit to which the interest will be applied
     * @param body Input details for apply accrued interest action
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> applyInterest(String depositAccountId, ApplyInterestInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling applyInterest");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling applyInterest");
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}:applyInterest", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows posting an action such as approve deposit account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>200</b> - Deposit account action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param body Allows specifying the action details for a deposit account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositAccount> changeState(String depositAccountId, DepositAccountAction body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling changeState");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling changeState");
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

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}:changeState", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new deposit account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Deposit account created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Deposit account to be created
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositAccount> create(DepositAccount body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling create");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeAPI("/deposits", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create and associate a new card to the provided account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Card was created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param body Card to be created
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> createCard(String depositAccountId, Card body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling createCard");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createCard");
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/cards", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete an inactive deposit account via id or encoded key
     * 
     * <p><b>204</b> - Deposit account deleted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> delete(String depositAccountId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling delete");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a card associated to the provided account via its reference token
     * 
     * <p><b>204</b> - Card deleted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param cardReferenceToken Reference token of the card to be retrieved
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCard(String depositAccountId, String cardReferenceToken) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling deleteCard");
        }
        // verify the required parameter 'cardReferenceToken' is set
        if (cardReferenceToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cardReferenceToken' when calling deleteCard");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);
        pathParams.put("cardReferenceToken", cardReferenceToken);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}/cards/{cardReferenceToken}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of deposit accounts using various query parameters. It&#39;s possible to look up deposits by their state, branch, centre or by a credit officer to which the deposits are assigned.
     * 
     * <p><b>200</b> - Deposit accounts list retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @param creditOfficerUsername The username of the credit officer to whom the deposit accounts are assigned to
     * @param branchId The id/encodedKey of the branch to which the deposit accounts are assigned to
     * @param centreId The id/encodedKey of the centre to which the deposit accounts are assigned to
     * @param accountState The state of the deposit accounts to filter on
     * @param accountHolderType The type of the account holder: CLIENT/GROUP
     * @param accountHolderId The id of the account holder
     * @return List&lt;DepositAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<DepositAccount> getAll(Integer offset, Integer limit, String paginationDetails, String detailsLevel, String creditOfficerUsername, String branchId, String centreId, String accountState, String accountHolderType, String accountHolderId) throws RestClientException {
        Object postBody = null;
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditOfficerUsername", creditOfficerUsername));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "branchId", branchId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "centreId", centreId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountState", accountState));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountHolderType", accountHolderType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountHolderId", accountHolderId));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeFluxAPI("/deposits", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Retrieves authorization holds related to a deposit account, ordered from newest to oldest by creation date
     * 
     * <p><b>200</b> - The list of authorization holds retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param depositAccountId The id or encoded key of the deposit account
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param status The status of the authorization holds to filter on
     * @return List&lt;AuthorizationHold&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<AuthorizationHold> getAllAuthorizationHolds(String depositAccountId, Integer offset, Integer limit, String paginationDetails, String status) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling getAllAuthorizationHolds");
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<AuthorizationHold> localVarReturnType = new ParameterizedTypeReference<AuthorizationHold>() {};
        return apiClient.invokeFluxAPI("/deposits/{depositAccountId}/authorizationholds", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of all cards associated with the account
     * 
     * <p><b>200</b> - Account cards list retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @return List&lt;Card&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Card> getAllCards(String depositAccountId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling getAllCards");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Card> localVarReturnType = new ParameterizedTypeReference<Card>() {};
        return apiClient.invokeFluxAPI("/deposits/{depositAccountId}/cards", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of a single deposit account via id or encoded key
     * 
     * <p><b>200</b> - Deposit account retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return DepositAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositAccount> getById(String depositAccountId, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling getById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

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

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Partially update a deposit account
     * 
     * <p><b>204</b> - Deposit account updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param body Patch operations to be applied to a resource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> patch(String depositAccountId, List<PatchOperation> body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling patch");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patch");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Starts the maturity period for the specified deposit account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>200</b> - Start maturity action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param body Allows specifying the details for an action to start the maturity period for a deposit account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositAccount> startMaturity(String depositAccountId, StartMaturityAction body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling startMaturity");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling startMaturity");
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

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}:startMaturity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Undo the maturity period for the specified deposit account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Undo maturity action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> undoMaturity(String depositAccountId, String idempotencyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling undoMaturity");
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}:undoMaturity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update an existing deposit account
     * 
     * <p><b>200</b> - Deposit account updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit account not found
     * @param depositAccountId The id or encoded key of the deposit account
     * @param body The body parameter
     * @return DepositAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositAccount> update(String depositAccountId, DepositAccount body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositAccountId' is set
        if (depositAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositAccountId' when calling update");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositAccountId", depositAccountId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<DepositAccount> localVarReturnType = new ParameterizedTypeReference<DepositAccount>() {};
        return apiClient.invokeAPI("/deposits/{depositAccountId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
