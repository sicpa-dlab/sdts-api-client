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
import com.sicpa.edison.credentialsclient.model.Connection;
import com.sicpa.edison.credentialsclient.model.ConnectionInvitation;
import com.sicpa.edison.credentialsclient.model.ConnectionInvitationCreate;
import com.sicpa.edison.credentialsclient.model.ConnectionInvitationCreationResult;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionsApi {
    private ApiClient localVarApiClient;

    public ConnectionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConnectionsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for connectionOrganizationIdConnectionIdDelete
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
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
    public okhttp3.Call connectionOrganizationIdConnectionIdDeleteCall(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connections/{connectionId}"
            .replaceAll("\\{" + "connectionId" + "\\}", localVarApiClient.escapeString(connectionId.toString()));

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
    private okhttp3.Call connectionOrganizationIdConnectionIdDeleteValidateBeforeCall(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling connectionOrganizationIdConnectionIdDelete(Async)");
        }
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new ApiException("Missing the required parameter 'connectionId' when calling connectionOrganizationIdConnectionIdDelete(Async)");
        }
        

        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdDeleteCall(X_ORGANIZATION_ID, connectionId, _callback);
        return localVarCall;

    }

    /**
     * Delete connection
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public void connectionOrganizationIdConnectionIdDelete(Integer X_ORGANIZATION_ID, String connectionId) throws ApiException {
        connectionOrganizationIdConnectionIdDeleteWithHttpInfo(X_ORGANIZATION_ID, connectionId);
    }

    /**
     * Delete connection
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> connectionOrganizationIdConnectionIdDeleteWithHttpInfo(Integer X_ORGANIZATION_ID, String connectionId) throws ApiException {
        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdDeleteValidateBeforeCall(X_ORGANIZATION_ID, connectionId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete connection (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
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
    public okhttp3.Call connectionOrganizationIdConnectionIdDeleteAsync(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdDeleteValidateBeforeCall(X_ORGANIZATION_ID, connectionId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectionOrganizationIdConnectionIdGet
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
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
    public okhttp3.Call connectionOrganizationIdConnectionIdGetCall(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connections/{connectionId}"
            .replaceAll("\\{" + "connectionId" + "\\}", localVarApiClient.escapeString(connectionId.toString()));

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
    private okhttp3.Call connectionOrganizationIdConnectionIdGetValidateBeforeCall(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling connectionOrganizationIdConnectionIdGet(Async)");
        }
        
        // verify the required parameter 'connectionId' is set
        if (connectionId == null) {
            throw new ApiException("Missing the required parameter 'connectionId' when calling connectionOrganizationIdConnectionIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdGetCall(X_ORGANIZATION_ID, connectionId, _callback);
        return localVarCall;

    }

    /**
     * Get connection
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
     * @return Connection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Connection connectionOrganizationIdConnectionIdGet(Integer X_ORGANIZATION_ID, String connectionId) throws ApiException {
        ApiResponse<Connection> localVarResp = connectionOrganizationIdConnectionIdGetWithHttpInfo(X_ORGANIZATION_ID, connectionId);
        return localVarResp.getData();
    }

    /**
     * Get connection
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
     * @return ApiResponse&lt;Connection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connection> connectionOrganizationIdConnectionIdGetWithHttpInfo(Integer X_ORGANIZATION_ID, String connectionId) throws ApiException {
        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdGetValidateBeforeCall(X_ORGANIZATION_ID, connectionId, null);
        Type localVarReturnType = new TypeToken<Connection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get connection (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionId A connection ID. (required)
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
    public okhttp3.Call connectionOrganizationIdConnectionIdGetAsync(Integer X_ORGANIZATION_ID, String connectionId, final ApiCallback<Connection> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionOrganizationIdConnectionIdGetValidateBeforeCall(X_ORGANIZATION_ID, connectionId, _callback);
        Type localVarReturnType = new TypeToken<Connection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectionsInvitationPost
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitation  (required)
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
    public okhttp3.Call connectionsInvitationPostCall(Integer X_ORGANIZATION_ID, ConnectionInvitation connectionInvitation, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = connectionInvitation;

        // create path and map variables
        String localVarPath = "/connections/invitation";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call connectionsInvitationPostValidateBeforeCall(Integer X_ORGANIZATION_ID, ConnectionInvitation connectionInvitation, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling connectionsInvitationPost(Async)");
        }
        
        // verify the required parameter 'connectionInvitation' is set
        if (connectionInvitation == null) {
            throw new ApiException("Missing the required parameter 'connectionInvitation' when calling connectionsInvitationPost(Async)");
        }
        

        okhttp3.Call localVarCall = connectionsInvitationPostCall(X_ORGANIZATION_ID, connectionInvitation, _callback);
        return localVarCall;

    }

    /**
     * Receive and accept a new connection invitation
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitation  (required)
     * @return Connection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public Connection connectionsInvitationPost(Integer X_ORGANIZATION_ID, ConnectionInvitation connectionInvitation) throws ApiException {
        ApiResponse<Connection> localVarResp = connectionsInvitationPostWithHttpInfo(X_ORGANIZATION_ID, connectionInvitation);
        return localVarResp.getData();
    }

    /**
     * Receive and accept a new connection invitation
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitation  (required)
     * @return ApiResponse&lt;Connection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Connection> connectionsInvitationPostWithHttpInfo(Integer X_ORGANIZATION_ID, ConnectionInvitation connectionInvitation) throws ApiException {
        okhttp3.Call localVarCall = connectionsInvitationPostValidateBeforeCall(X_ORGANIZATION_ID, connectionInvitation, null);
        Type localVarReturnType = new TypeToken<Connection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Receive and accept a new connection invitation (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitation  (required)
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
    public okhttp3.Call connectionsInvitationPostAsync(Integer X_ORGANIZATION_ID, ConnectionInvitation connectionInvitation, final ApiCallback<Connection> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionsInvitationPostValidateBeforeCall(X_ORGANIZATION_ID, connectionInvitation, _callback);
        Type localVarReturnType = new TypeToken<Connection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectionsOrganizationIdGet
     * @param X_ORGANIZATION_ID  (required)
     * @param state Filter result by connection state. (optional)
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
    public okhttp3.Call connectionsOrganizationIdGetCall(Integer X_ORGANIZATION_ID, String state, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/connections";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

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
    private okhttp3.Call connectionsOrganizationIdGetValidateBeforeCall(Integer X_ORGANIZATION_ID, String state, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling connectionsOrganizationIdGet(Async)");
        }
        

        okhttp3.Call localVarCall = connectionsOrganizationIdGetCall(X_ORGANIZATION_ID, state, _callback);
        return localVarCall;

    }

    /**
     * List all connections
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param state Filter result by connection state. (optional)
     * @return List&lt;Connection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<Connection> connectionsOrganizationIdGet(Integer X_ORGANIZATION_ID, String state) throws ApiException {
        ApiResponse<List<Connection>> localVarResp = connectionsOrganizationIdGetWithHttpInfo(X_ORGANIZATION_ID, state);
        return localVarResp.getData();
    }

    /**
     * List all connections
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param state Filter result by connection state. (optional)
     * @return ApiResponse&lt;List&lt;Connection&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Connection>> connectionsOrganizationIdGetWithHttpInfo(Integer X_ORGANIZATION_ID, String state) throws ApiException {
        okhttp3.Call localVarCall = connectionsOrganizationIdGetValidateBeforeCall(X_ORGANIZATION_ID, state, null);
        Type localVarReturnType = new TypeToken<List<Connection>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List all connections (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param state Filter result by connection state. (optional)
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
    public okhttp3.Call connectionsOrganizationIdGetAsync(Integer X_ORGANIZATION_ID, String state, final ApiCallback<List<Connection>> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionsOrganizationIdGetValidateBeforeCall(X_ORGANIZATION_ID, state, _callback);
        Type localVarReturnType = new TypeToken<List<Connection>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for connectionsPost
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitationCreate  (required)
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
    public okhttp3.Call connectionsPostCall(Integer X_ORGANIZATION_ID, ConnectionInvitationCreate connectionInvitationCreate, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = connectionInvitationCreate;

        // create path and map variables
        String localVarPath = "/connections";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call connectionsPostValidateBeforeCall(Integer X_ORGANIZATION_ID, ConnectionInvitationCreate connectionInvitationCreate, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'X_ORGANIZATION_ID' is set
        if (X_ORGANIZATION_ID == null) {
            throw new ApiException("Missing the required parameter 'X_ORGANIZATION_ID' when calling connectionsPost(Async)");
        }
        
        // verify the required parameter 'connectionInvitationCreate' is set
        if (connectionInvitationCreate == null) {
            throw new ApiException("Missing the required parameter 'connectionInvitationCreate' when calling connectionsPost(Async)");
        }
        

        okhttp3.Call localVarCall = connectionsPostCall(X_ORGANIZATION_ID, connectionInvitationCreate, _callback);
        return localVarCall;

    }

    /**
     * Create a new connection invitation
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitationCreate  (required)
     * @return ConnectionInvitationCreationResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ConnectionInvitationCreationResult connectionsPost(Integer X_ORGANIZATION_ID, ConnectionInvitationCreate connectionInvitationCreate) throws ApiException {
        ApiResponse<ConnectionInvitationCreationResult> localVarResp = connectionsPostWithHttpInfo(X_ORGANIZATION_ID, connectionInvitationCreate);
        return localVarResp.getData();
    }

    /**
     * Create a new connection invitation
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitationCreate  (required)
     * @return ApiResponse&lt;ConnectionInvitationCreationResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectionInvitationCreationResult> connectionsPostWithHttpInfo(Integer X_ORGANIZATION_ID, ConnectionInvitationCreate connectionInvitationCreate) throws ApiException {
        okhttp3.Call localVarCall = connectionsPostValidateBeforeCall(X_ORGANIZATION_ID, connectionInvitationCreate, null);
        Type localVarReturnType = new TypeToken<ConnectionInvitationCreationResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new connection invitation (asynchronously)
     * 
     * @param X_ORGANIZATION_ID  (required)
     * @param connectionInvitationCreate  (required)
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
    public okhttp3.Call connectionsPostAsync(Integer X_ORGANIZATION_ID, ConnectionInvitationCreate connectionInvitationCreate, final ApiCallback<ConnectionInvitationCreationResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = connectionsPostValidateBeforeCall(X_ORGANIZATION_ID, connectionInvitationCreate, _callback);
        Type localVarReturnType = new TypeToken<ConnectionInvitationCreationResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
