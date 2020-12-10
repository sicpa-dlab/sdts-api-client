# CredentialsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credentialCredentialIdDelete**](CredentialsApi.md#credentialCredentialIdDelete) | **DELETE** /credentials/{credentialId} | Delete the specified credential
[**credentialCredentialIdGet**](CredentialsApi.md#credentialCredentialIdGet) | **GET** /credentials/{credentialId} | Get the specified credential
[**credentialPost**](CredentialsApi.md#credentialPost) | **POST** /credentials | Issue new credentials
[**credentialsGet**](CredentialsApi.md#credentialsGet) | **GET** /credentials | List all credentials


<a name="credentialCredentialIdDelete"></a>
# **credentialCredentialIdDelete**
> credentialCredentialIdDelete(X_ORGANIZATION_ID, credentialId)

Delete the specified credential

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | An credential exchange ID.
    try {
      apiInstance.credentialCredentialIdDelete(X_ORGANIZATION_ID, credentialId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#credentialCredentialIdDelete");
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
 **credentialId** | **String**| An credential exchange ID. |

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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="credentialCredentialIdGet"></a>
# **credentialCredentialIdGet**
> CredentialExchange credentialCredentialIdGet(X_ORGANIZATION_ID, credentialId)

Get the specified credential

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | An credential exchange ID.
    try {
      CredentialExchange result = apiInstance.credentialCredentialIdGet(X_ORGANIZATION_ID, credentialId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#credentialCredentialIdGet");
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
 **credentialId** | **String**| An credential exchange ID. |

### Return type

[**CredentialExchange**](CredentialExchange.md)

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

<a name="credentialPost"></a>
# **credentialPost**
> CredentialExchange credentialPost(X_ORGANIZATION_ID, credentialCreate)

Issue new credentials

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialCreate credentialCreate = new CredentialCreate(); // CredentialCreate | 
    try {
      CredentialExchange result = apiInstance.credentialPost(X_ORGANIZATION_ID, credentialCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#credentialPost");
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
 **credentialCreate** | [**CredentialCreate**](CredentialCreate.md)|  |

### Return type

[**CredentialExchange**](CredentialExchange.md)

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

<a name="credentialsGet"></a>
# **credentialsGet**
> List&lt;CredentialExchange&gt; credentialsGet(X_ORGANIZATION_ID)

List all credentials

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialExchange> result = apiInstance.credentialsGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#credentialsGet");
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

### Return type

[**List&lt;CredentialExchange&gt;**](CredentialExchange.md)

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

