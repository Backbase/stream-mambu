package com.backbase.mambu.loans.api;

import com.backbase.mambu.loans.ApiClient;

import com.backbase.mambu.loans.model.ChangeInterestRateLoanAccountInput;
import com.backbase.mambu.loans.model.ErrorResponse;
import com.backbase.mambu.loans.model.LoanAccount;
import com.backbase.mambu.loans.model.LoanAccountAction;
import com.backbase.mambu.loans.model.LoanAccountPayOffInput;
import com.backbase.mambu.loans.model.LoanActionDetails;
import com.backbase.mambu.loans.model.PatchOperation;

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


public class LoanAccountsApi {
    private ApiClient apiClient;

    public LoanAccountsApi() {
        this(new ApiClient());
    }

    @Autowired
    public LoanAccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Allows to change the interest rate for a loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Change interest rate action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @param body Allows specifying the action details for a loan account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> changeInterestRate(String loanAccountId, String idempotencyKey, ChangeInterestRateLoanAccountInput body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling changeInterestRate");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}:changeInterestRate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows posting an action such as approve/reject/withdraw/close loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>200</b> - Loan account action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param body Allows specifying the action details for a loan account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return LoanAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<LoanAccount> changeState(String loanAccountId, LoanAccountAction body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling changeState");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling changeState");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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

        ParameterizedTypeReference<LoanAccount> localVarReturnType = new ParameterizedTypeReference<LoanAccount>() {};
        return apiClient.invokeAPI("/loans/{loanAccountId}:changeState", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Creates a new loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Loan account created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Loan account to be created
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return LoanAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<LoanAccount> create(LoanAccount body, String idempotencyKey) throws RestClientException {
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

        ParameterizedTypeReference<LoanAccount> localVarReturnType = new ParameterizedTypeReference<LoanAccount>() {};
        return apiClient.invokeAPI("/loans", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a loan account
     * 
     * <p><b>204</b> - Loan account deleted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> delete(String loanAccountId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling delete");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of loan accounts using various query parameters. It&#39;s possible to look up loans by their state, branch, centre or by a credit officer to which the loans are assigned.
     * 
     * <p><b>200</b> - Loan accounts list retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @param creditOfficerUsername The username of the credit officer to whom the entities are assigned to
     * @param branchId The id/encodedKey of the branch to which the entities are assigned to
     * @param centreId The id/encodedKey of the centre to which the entities are assigned to
     * @param accountState The state of the loan account to search for
     * @param accountHolderType The type of the account holder: CLIENT/GROUP
     * @param accountHolderId The id of the account holder
     * @return List&lt;LoanAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<LoanAccount> getAll(Integer offset, Integer limit, String paginationDetails, String detailsLevel, String creditOfficerUsername, String branchId, String centreId, String accountState, String accountHolderType, String accountHolderId) throws RestClientException {
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

        ParameterizedTypeReference<LoanAccount> localVarReturnType = new ParameterizedTypeReference<LoanAccount>() {};
        return apiClient.invokeFluxAPI("/loans", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of a single loan account via id or encoded key
     * 
     * <p><b>200</b> - Loan account retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return LoanAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<LoanAccount> getById(String loanAccountId, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling getById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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

        ParameterizedTypeReference<LoanAccount> localVarReturnType = new ParameterizedTypeReference<LoanAccount>() {};
        return apiClient.invokeAPI("/loans/{loanAccountId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Partially update an existing loan account
     * 
     * <p><b>204</b> - Loan account updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param body Patch operations to be applied to a resource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> patch(String loanAccountId, List<PatchOperation> body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling patch");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patch");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows to pay off a loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Pay off action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param body Allows specifying the input for loan account pay off
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> payOff(String loanAccountId, LoanAccountPayOffInput body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling payOff");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling payOff");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}:payOff", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows to undo refinance a loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Undo refinance action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @param body Allows specifying the action details for a loan account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> undoRefinance(String loanAccountId, String idempotencyKey, LoanActionDetails body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling undoRefinance");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}:undoRefinance", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows to undo reschedule a loan account
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>204</b> - Undo reschedule action posted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @param body Allows specifying the action details for a loan account
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> undoReschedule(String loanAccountId, String idempotencyKey, LoanActionDetails body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling undoReschedule");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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
        return apiClient.invokeAPI("/loans/{loanAccountId}:undoReschedule", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update an existing loan account
     * 
     * <p><b>200</b> - Loan account updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Loan account not found
     * @param loanAccountId The id or encoded key of the loan account
     * @param body Loan account to be updated
     * @return LoanAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<LoanAccount> update(String loanAccountId, LoanAccount body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'loanAccountId' is set
        if (loanAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loanAccountId' when calling update");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling update");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("loanAccountId", loanAccountId);

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

        ParameterizedTypeReference<LoanAccount> localVarReturnType = new ParameterizedTypeReference<LoanAccount>() {};
        return apiClient.invokeAPI("/loans/{loanAccountId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
