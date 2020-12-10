# ConnectionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**connectionOrganizationIdConnectionIdDelete**](ConnectionsApi.md#connectionOrganizationIdConnectionIdDelete) | **DELETE** /connections/{connectionId} | Delete connection
[**connectionOrganizationIdConnectionIdGet**](ConnectionsApi.md#connectionOrganizationIdConnectionIdGet) | **GET** /connections/{connectionId} | Get connection
[**connectionsInvitationPost**](ConnectionsApi.md#connectionsInvitationPost) | **POST** /connections/invitation | Create a new connection invitation
[**connectionsOrganizationIdGet**](ConnectionsApi.md#connectionsOrganizationIdGet) | **GET** /connections | List all connections
[**connectionsReceptionPost**](ConnectionsApi.md#connectionsReceptionPost) | **POST** /connections/reception | Receive a new connection invitation


<a name="connectionOrganizationIdConnectionIdDelete"></a>
# **connectionOrganizationIdConnectionIdDelete**
> connectionOrganizationIdConnectionIdDelete(X_ORGANIZATION_ID, connectionId)

Delete connection

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = 3fa85f64-5717-4562-b3fc-2c963f66afa6; // String | A connection ID.
    try {
      apiInstance.connectionOrganizationIdConnectionIdDelete(X_ORGANIZATION_ID, connectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#connectionOrganizationIdConnectionIdDelete");
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
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="connectionOrganizationIdConnectionIdGet"></a>
# **connectionOrganizationIdConnectionIdGet**
> Connection connectionOrganizationIdConnectionIdGet(X_ORGANIZATION_ID, connectionId)

Get connection

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = 3fa85f64-5717-4562-b3fc-2c963f66afa6; // String | A connection ID.
    try {
      Connection result = apiInstance.connectionOrganizationIdConnectionIdGet(X_ORGANIZATION_ID, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#connectionOrganizationIdConnectionIdGet");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="connectionsInvitationPost"></a>
# **connectionsInvitationPost**
> ConnectionInvitationCreationResult connectionsInvitationPost(X_ORGANIZATION_ID, connectionInvitationCreate)

Create a new connection invitation

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    ConnectionInvitationCreate connectionInvitationCreate = new ConnectionInvitationCreate(); // ConnectionInvitationCreate | 
    try {
      ConnectionInvitationCreationResult result = apiInstance.connectionsInvitationPost(X_ORGANIZATION_ID, connectionInvitationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#connectionsInvitationPost");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="connectionsOrganizationIdGet"></a>
# **connectionsOrganizationIdGet**
> List&lt;Connection&gt; connectionsOrganizationIdGet(X_ORGANIZATION_ID, state)

List all connections

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String state = "state_example"; // String | Filter result by connection state.
    try {
      List<Connection> result = apiInstance.connectionsOrganizationIdGet(X_ORGANIZATION_ID, state);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#connectionsOrganizationIdGet");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="connectionsReceptionPost"></a>
# **connectionsReceptionPost**
> Connection connectionsReceptionPost(X_ORGANIZATION_ID, connectionInvitationReception)

Receive a new connection invitation

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
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    ConnectionsApi apiInstance = new ConnectionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    ConnectionInvitationReception connectionInvitationReception = new ConnectionInvitationReception(); // ConnectionInvitationReception | 
    try {
      Connection result = apiInstance.connectionsReceptionPost(X_ORGANIZATION_ID, connectionInvitationReception);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectionsApi#connectionsReceptionPost");
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
 **connectionInvitationReception** | [**ConnectionInvitationReception**](ConnectionInvitationReception.md)|  |

### Return type

[**Connection**](Connection.md)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

