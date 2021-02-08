/*
 * Edison Credentials API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sicpa.edison.credentialsclient.api;

import com.sicpa.edison.credentialsclient.client.ApiCallback;
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.ApiResponse;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.Pair;
import com.sicpa.edison.credentialsclient.client.ProgressRequestBody;
import com.sicpa.edison.credentialsclient.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sicpa.edison.credentialsclient.model.ApiError;
import com.sicpa.edison.credentialsclient.model.Credential;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CredentialsApi {
    private ApiClient localVarApiClient;

    public CredentialsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CredentialsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for credentialCredentialIdDelete
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialCredentialIdDeleteCall(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/credentials/{credentialId}"
            .replaceAll("\\{" + "credentialId" + "\\}", localVarApiClient.escapeString(credentialId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_ORGANIZATION_ID != null) {
            localVarHeaderParams.put("X-ORGANIZATION-ID", localVarApiClient.parameterToString(X_ORGANIZATION_ID));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call credentialCredentialIdDeleteValidateBeforeCall(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling credentialCredentialIdDelete(Async)");
        }
        
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new ApiException("Missing the required parameter 'credentialId' when calling credentialCredentialIdDelete(Async)");
        }
        

        okhttp3.Call localVarCall = credentialCredentialIdDeleteCall(X_ORGANIZATION_ID, credentialId, _callback);
        return localVarCall;

    }

    /**
     * Delete the specified credential
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void credentialCredentialIdDelete(Integer X_ORGANIZATION_ID, String credentialId) throws ApiException {
        credentialCredentialIdDeleteWithHttpInfo(X_ORGANIZATION_ID, credentialId);
    }

    /**
     * Delete the specified credential
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> credentialCredentialIdDeleteWithHttpInfo(Integer X_ORGANIZATION_ID, String credentialId) throws ApiException {
        okhttp3.Call localVarCall = credentialCredentialIdDeleteValidateBeforeCall(X_ORGANIZATION_ID, credentialId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete the specified credential (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialCredentialIdDeleteAsync(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = credentialCredentialIdDeleteValidateBeforeCall(X_ORGANIZATION_ID, credentialId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for credentialCredentialIdGet
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialCredentialIdGetCall(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/credentials/{credentialId}"
            .replaceAll("\\{" + "credentialId" + "\\}", localVarApiClient.escapeString(credentialId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_ORGANIZATION_ID != null) {
            localVarHeaderParams.put("X-ORGANIZATION-ID", localVarApiClient.parameterToString(X_ORGANIZATION_ID));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call credentialCredentialIdGetValidateBeforeCall(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling credentialCredentialIdGet(Async)");
        }
        
        // verify the required parameter 'credentialId' is set
        if (credentialId == null) {
            throw new ApiException("Missing the required parameter 'credentialId' when calling credentialCredentialIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = credentialCredentialIdGetCall(X_ORGANIZATION_ID, credentialId, _callback);
        return localVarCall;

    }

    /**
     * Get the specified credential
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @return Credential
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Credential credentialCredentialIdGet(Integer X_ORGANIZATION_ID, String credentialId) throws ApiException {
        ApiResponse<Credential> localVarResp = credentialCredentialIdGetWithHttpInfo(X_ORGANIZATION_ID, credentialId);
        return localVarResp.getData();
    }

    /**
     * Get the specified credential
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @return ApiResponse&lt;Credential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Credential> credentialCredentialIdGetWithHttpInfo(Integer X_ORGANIZATION_ID, String credentialId) throws ApiException {
        okhttp3.Call localVarCall = credentialCredentialIdGetValidateBeforeCall(X_ORGANIZATION_ID, credentialId, null);
        Type localVarReturnType = new TypeToken<Credential>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the specified credential (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param credentialId A credential ID. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialCredentialIdGetAsync(Integer X_ORGANIZATION_ID, String credentialId, final ApiCallback<Credential> _callback) throws ApiException {

        okhttp3.Call localVarCall = credentialCredentialIdGetValidateBeforeCall(X_ORGANIZATION_ID, credentialId, _callback);
        Type localVarReturnType = new TypeToken<Credential>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for credentialsGet
     * @param X_ORGANIZATION_ID  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialsGetCall(Integer X_ORGANIZATION_ID, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/credentials";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (X_ORGANIZATION_ID != null) {
            localVarHeaderParams.put("X-ORGANIZATION-ID", localVarApiClient.parameterToString(X_ORGANIZATION_ID));
        }

        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call credentialsGetValidateBeforeCall(Integer X_ORGANIZATION_ID, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling credentialsGet(Async)");
        }
        

        okhttp3.Call localVarCall = credentialsGetCall(X_ORGANIZATION_ID, _callback);
        return localVarCall;

    }

    /**
     * List all credentials
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @return List&lt;Credential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<Credential> credentialsGet(Integer X_ORGANIZATION_ID) throws ApiException {
        ApiResponse<List<Credential>> localVarResp = credentialsGetWithHttpInfo(X_ORGANIZATION_ID);
        return localVarResp.getData();
    }

    /**
     * List all credentials
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @return ApiResponse&lt;List&lt;Credential&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Credential>> credentialsGetWithHttpInfo(Integer X_ORGANIZATION_ID) throws ApiException {
        okhttp3.Call localVarCall = credentialsGetValidateBeforeCall(X_ORGANIZATION_ID, null);
        Type localVarReturnType = new TypeToken<List<Credential>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all credentials (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call credentialsGetAsync(Integer X_ORGANIZATION_ID, final ApiCallback<List<Credential>> _callback) throws ApiException {

        okhttp3.Call localVarCall = credentialsGetValidateBeforeCall(X_ORGANIZATION_ID, _callback);
        Type localVarReturnType = new TypeToken<List<Credential>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}