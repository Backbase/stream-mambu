package com.backbase.mambu.deposit.products.api;

import com.backbase.mambu.deposit.products.ApiClient;

import com.backbase.mambu.deposit.products.model.DepositProduct;
import com.backbase.mambu.deposit.products.model.DepositProductAction;
import com.backbase.mambu.deposit.products.model.DepositProductActionResponse;
import com.backbase.mambu.deposit.products.model.ErrorResponse;
import com.backbase.mambu.deposit.products.model.PatchOperation;

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


public class DepositProductsApi {
    private ApiClient apiClient;

    public DepositProductsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DepositProductsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Perform batch update action for the specified deposit product
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>202</b> - Batch update action accepted for the specified deposit product
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit product not found
     * @param depositProductId The id or encoded key of the deposit product to perform batch update action
     * @param body Allows specifying the batch update action details for a deposit product
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositProductActionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositProductActionResponse> batchUpdate(String depositProductId, DepositProductAction body, String idempotencyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositProductId' is set
        if (depositProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositProductId' when calling batchUpdate");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling batchUpdate");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositProductId", depositProductId);

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

        ParameterizedTypeReference<DepositProductActionResponse> localVarReturnType = new ParameterizedTypeReference<DepositProductActionResponse>() {};
        return apiClient.invokeAPI("/depositproducts/{depositProductId}:batchUpdate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create a new deposit product
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Deposit product created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Deposit product to be created
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return DepositProduct
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositProduct> create(DepositProduct body, String idempotencyKey) throws RestClientException {
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

        ParameterizedTypeReference<DepositProduct> localVarReturnType = new ParameterizedTypeReference<DepositProduct>() {};
        return apiClient.invokeAPI("/depositproducts", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a deposit product
     * 
     * <p><b>204</b> - Deposit product deleted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit product not found
     * @param depositProductId The id or encoded key of the deposit product to be deleted
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> delete(String depositProductId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositProductId' is set
        if (depositProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositProductId' when calling delete");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositProductId", depositProductId);

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
        return apiClient.invokeAPI("/depositproducts/{depositProductId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of a single deposit product via id or encoded key
     * 
     * <p><b>200</b> - Deposit product retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit product not found
     * @param depositProductId The id or encoded key of the deposit product to be retrieved
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return DepositProduct
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositProduct> getById(String depositProductId, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'depositProductId' is set
        if (depositProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositProductId' when calling getById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositProductId", depositProductId);

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

        ParameterizedTypeReference<DepositProduct> localVarReturnType = new ParameterizedTypeReference<DepositProduct>() {};
        return apiClient.invokeAPI("/depositproducts/{depositProductId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Partially update an existing deposit product
     * 
     * <p><b>204</b> - Deposit product updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit product not found
     * @param depositProductId The id or encoded key of the deposit product to be updated
     * @param body Patch operations to be applied to a resource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> patch(String depositProductId, List<PatchOperation> body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositProductId' is set
        if (depositProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositProductId' when calling patch");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patch");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositProductId", depositProductId);

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
        return apiClient.invokeAPI("/depositproducts/{depositProductId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update an existing deposit product
     * 
     * <p><b>200</b> - Deposit product updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Deposit product not found
     * @param depositProductId The id or encoded key of the deposit product to be updated
     * @param body Deposit product to be updated
     * @return DepositProduct
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<DepositProduct> update(String depositProductId, DepositProduct body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'depositProductId' is set
        if (depositProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'depositProductId' when calling update");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling update");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("depositProductId", depositProductId);

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

        ParameterizedTypeReference<DepositProduct> localVarReturnType = new ParameterizedTypeReference<DepositProduct>() {};
        return apiClient.invokeAPI("/depositproducts/{depositProductId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
