# ConnectionsApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInvitation**](ConnectionsApi.md#createInvitation) | **POST** /connections | Create a new connection invitation
[**deleteConnection**](ConnectionsApi.md#deleteConnection) | **DELETE** /connections/{connectionId} | Delete connection
[**getConnectionById**](ConnectionsApi.md#getConnectionById) | **GET** /connections/{connectionId} | Get connection
[**listConnections**](ConnectionsApi.md#listConnections) | **GET** /connections | List connections
[**receiveInvitation**](ConnectionsApi.md#receiveInvitation) | **POST** /connections/invitation | Receive and accept a new connection invitation


<a name="createInvitation"></a>
# **createInvitation**
> ConnectionInvitationCreationResult createInvitation(X_ORGANIZATION_ID, connectionInvitationCreate)

Create a new connection invitation

Creates a new connection invitation to be consumed by external agents.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    ConnectionInvitationCreate connectionInvitationCreate = new ConnectionInvitationCreate(); // ConnectionInvitationCreate | 
    try {
      ConnectionInvitationCreationResult result = apiInstance.createInvitation(X_ORGANIZATION_ID, connectionInvitationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#createInvitation");
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
 **X_ORGANIZATION_ID** | **Integer**|  |
 **connectionInvitationCreate** | [**ConnectionInvitationCreate**](ConnectionInvitationCreate.md)|  |

### Return type

[**ConnectionInvitationCreationResult**](ConnectionInvitationCreationResult.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="deleteConnection"></a>
# **deleteConnection**
> deleteConnection(X_ORGANIZATION_ID, connectionId)

Delete connection

Delete a connection from the organization&#39;s wallet.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | A connection ID.
    try {
      apiInstance.deleteConnection(X_ORGANIZATION_ID, connectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#deleteConnection");
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
 **X_ORGANIZATION_ID** | **Integer**|  |
 **connectionId** | **String**| A connection ID. |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="getConnectionById"></a>
# **getConnectionById**
> Connection getConnectionById(X_ORGANIZATION_ID, connectionId)

Get connection

Retrieve a connection record from the organization&#39;s wallet

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | A connection ID.
    try {
      Connection result = apiInstance.getConnectionById(X_ORGANIZATION_ID, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#getConnectionById");
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
 **X_ORGANIZATION_ID** | **Integer**|  |
 **connectionId** | **String**| A connection ID. |

### Return type

[**Connection**](Connection.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="listConnections"></a>
# **listConnections**
> List&lt;Connection&gt; listConnections(X_ORGANIZATION_ID, state)

List connections

List all connection records from the organization&#39;s wallet.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String state = "INIT"; // String | Filter result by connection state.
    try {
      List<Connection> result = apiInstance.listConnections(X_ORGANIZATION_ID, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#listConnections");
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
 **X_ORGANIZATION_ID** | **Integer**|  |
 **state** | **String**| Filter result by connection state. | [optional] [enum: INIT, INVITATION, REQUEST, RESPONSE, ACTIVE, ERROR, INACTIVE]

### Return type

[**List&lt;Connection&gt;**](Connection.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="receiveInvitation"></a>
# **receiveInvitation**
> Connection receiveInvitation(X_ORGANIZATION_ID, connectionInvitation)

Receive and accept a new connection invitation

(ASYNC) Consume a connection invitation and established. Establishing connection is asynchronous. Usewebhooks or check the connection status from the API to follow the connection process.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.ConnectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    ConnectionInvitation connectionInvitation = new ConnectionInvitation(); // ConnectionInvitation | 
    try {
      Connection result = apiInstance.receiveInvitation(X_ORGANIZATION_ID, connectionInvitation);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#receiveInvitation");
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
 **X_ORGANIZATION_ID** | **Integer**|  |
 **connectionInvitation** | [**ConnectionInvitation**](ConnectionInvitation.md)|  |

### Return type

[**Connection**](Connection.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

