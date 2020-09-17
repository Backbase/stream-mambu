package com.backbase.mambu.clients.api;

import com.backbase.mambu.clients.ApiClient;

import com.backbase.mambu.clients.model.Client;
import com.backbase.mambu.clients.model.ClientRole;
import com.backbase.mambu.clients.model.ClientSearchCriteria;
import com.backbase.mambu.clients.model.ErrorResponse;
import java.time.LocalDate;
import com.backbase.mambu.clients.model.PatchOperation;

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


public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ClientsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new client
     * 
     * <p><b>102</b> - Your idempotent request was already submitted and is currently being processed, try again later.
     * <p><b>201</b> - Client created
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Client to be created
     * @param idempotencyKey Key that can be used to support idempotency on this POST. Must be a valid UUID(version 4 is recommended) string and can only be used with the exact same request. Can be used in retry mechanisms to prevent double posting.
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Client> create(Client body, String idempotencyKey) throws RestClientException {
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

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI("/clients", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete a client
     * 
     * <p><b>204</b> - Client deleted
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Client not found
     * @param clientId The id or encoded key of the client to be deleted
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> delete(String clientId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling delete");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("clientId", clientId);

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
        return apiClient.invokeAPI("/clients/{clientId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of clients using various query parameters
     * 
     * <p><b>200</b> - Clients list retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @param firstName The first name, personal name, given name or forename of the client
     * @param lastName The last name, surname or family name of the client
     * @param idNumber The id number of the client&#39;s identification document
     * @param branchId The branch id/key to search for
     * @param centreId The centre id/key to search for
     * @param creditOfficerUsername The user name of the credit officer
     * @param state The state of the client to search for
     * @param birthDate The birth date of the client to search for
     * @param sortBy The criteria based on which the records will be sorted. Expected format is &lt;field:order&gt;, eg sortBy &#x3D; field1:ASC,field2:DESC.&lt;br/&gt;Only the following fields can be used: firstName, lastName, creationDate, lastModifiedDate&lt;br/&gt;Default sorting is done by  lastModifiedDate:DESC
     * @return List&lt;Client&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Client> getAll(Integer offset, Integer limit, String paginationDetails, String detailsLevel, String firstName, String lastName, String idNumber, String branchId, String centreId, String creditOfficerUsername, String state, LocalDate birthDate, String sortBy) throws RestClientException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "firstName", firstName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "idNumber", idNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "branchId", branchId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "centreId", centreId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "creditOfficerUsername", creditOfficerUsername));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "birthDate", birthDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));

        final String[] localVarAccepts = { 
            "application/vnd.mambu.v2+json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeFluxAPI("/clients", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows retrieval of a single client via id or encoded key
     * 
     * <p><b>200</b> - Client retrieved
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Client not found
     * @param clientId The id or encoded key of the client to be retrieved
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Client> getById(String clientId, String detailsLevel) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling getById");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("clientId", clientId);

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

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI("/clients/{clientId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows to retrieve the client role for a client
     * 
     * <p><b>200</b> - Client role retrieved
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Client not found
     * @param clientId The id or encoded key of the client to be retrieved
     * @return ClientRole
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<ClientRole> getRoleByClientId(String clientId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling getRoleByClientId");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("clientId", clientId);

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

        ParameterizedTypeReference<ClientRole> localVarReturnType = new ParameterizedTypeReference<ClientRole>() {};
        return apiClient.invokeAPI("/clients/{clientId}/role", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Partially update an existing client
     * 
     * <p><b>204</b> - Client updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Client not found
     * @param clientId The id or encoded key of the client to be updated
     * @param body Patch operations to be applied to a resource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> patch(String clientId, List<PatchOperation> body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling patch");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling patch");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("clientId", clientId);

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
        return apiClient.invokeAPI("/clients/{clientId}", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Allows you to search clients by various criteria
     * 
     * <p><b>200</b> - Result of client search
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * @param body Criteria to be used to search the clients
     * @param offset Pagination, index to start searching at when retrieving elements, used in combination with limit to paginate results
     * @param limit Pagination, the number of elements to retrieve, used in combination with offset to paginate results
     * @param paginationDetails Flag specifying whether the pagination should be enabled or not. Please note that by default it is disabled (OFF), in order to improve the performance of the APIs
     * @param detailsLevel The level of details to retrieve, FULL means the full details of the object will be retrieved (custom fields, address, contact info or any other related object), BASIC will return only the first level elements of the object
     * @return List&lt;Client&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Client> search(ClientSearchCriteria body, Integer offset, Integer limit, String paginationDetails, String detailsLevel) throws RestClientException {
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

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeFluxAPI("/clients:search", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update an existing client
     * 
     * <p><b>200</b> - Client updated
     * <p><b>400</b> - A Validation error occurred
     * <p><b>401</b> - UNAUTHORIZED
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Client not found
     * @param clientId The id or encoded key of the client to be updated
     * @param body Client to be updated
     * @return Client
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Client> update(String clientId, Client body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'clientId' is set
        if (clientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientId' when calling update");
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling update");
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("clientId", clientId);

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

        ParameterizedTypeReference<Client> localVarReturnType = new ParameterizedTypeReference<Client>() {};
        return apiClient.invokeAPI("/clients/{clientId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
