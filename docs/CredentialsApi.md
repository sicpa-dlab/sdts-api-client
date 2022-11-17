# CredentialsApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCredential**](CredentialsApi.md#deleteCredential) | **DELETE** /credentials/{credentialId} | Delete a credential
[**getCredentialById**](CredentialsApi.md#getCredentialById) | **GET** /credentials/{credentialId} | Get a credential
[**listCredentials**](CredentialsApi.md#listCredentials) | **GET** /credentials | List credentials


<a name="deleteCredential"></a>
# **deleteCredential**
> deleteCredential(X_ORGANIZATION_ID, credentialId)

Delete a credential

Delete a credential from the organization&#39;s wallet.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | A credential ID.
    try {
      apiInstance.deleteCredential(X_ORGANIZATION_ID, credentialId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#deleteCredential");
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
 **credentialId** | **String**| A credential ID. |

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
**204** | No Content |  -  |

<a name="getCredentialById"></a>
# **getCredentialById**
> Credential getCredentialById(X_ORGANIZATION_ID, credentialId)

Get a credential

Get a single credential from the organization&#39;s wallet.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | A credential ID.
    try {
      Credential result = apiInstance.getCredentialById(X_ORGANIZATION_ID, credentialId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#getCredentialById");
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
 **credentialId** | **String**| A credential ID. |

### Return type

[**Credential**](Credential.md)

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

<a name="listCredentials"></a>
# **listCredentials**
> List&lt;Credential&gt; listCredentials(X_ORGANIZATION_ID)

List credentials

List all credentials in the organization&#39;s wallet.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<Credential> result = apiInstance.listCredentials(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#listCredentials");
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

[**List&lt;Credential&gt;**](Credential.md)

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

