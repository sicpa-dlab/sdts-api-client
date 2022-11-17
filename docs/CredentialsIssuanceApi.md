# CredentialsIssuanceApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCredentialIssuance**](CredentialsIssuanceApi.md#deleteCredentialIssuance) | **DELETE** /credentials-issuance/{issuanceId} | Delete a credential issuance record
[**getCredentialIssuanceById**](CredentialsIssuanceApi.md#getCredentialIssuanceById) | **GET** /credentials-issuance/{issuanceId} | Get a credential issuance
[**issueCredential**](CredentialsIssuanceApi.md#issueCredential) | **POST** /credentials-issuance | Issue a new credential
[**listCredentialIssuances**](CredentialsIssuanceApi.md#listCredentialIssuances) | **GET** /credentials-issuance | List all credentials


<a name="deleteCredentialIssuance"></a>
# **deleteCredentialIssuance**
> deleteCredentialIssuance(X_ORGANIZATION_ID, issuanceId)

Delete a credential issuance record

Delete the specified credential issuance record (this does not delete the credential from a remote wallet).

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsIssuanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String issuanceId = "issuanceId_example"; // String | An credential issuance ID.
    try {
      apiInstance.deleteCredentialIssuance(X_ORGANIZATION_ID, issuanceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#deleteCredentialIssuance");
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
 **issuanceId** | **String**| An credential issuance ID. |

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

<a name="getCredentialIssuanceById"></a>
# **getCredentialIssuanceById**
> CredentialIssuance getCredentialIssuanceById(X_ORGANIZATION_ID, issuanceId)

Get a credential issuance

Get the specified credential issuance. Can be used to check on the issuance state.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsIssuanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String issuanceId = "issuanceId_example"; // String | An credential issuance ID.
    try {
      CredentialIssuance result = apiInstance.getCredentialIssuanceById(X_ORGANIZATION_ID, issuanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#getCredentialIssuanceById");
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
 **issuanceId** | **String**| An credential issuance ID. |

### Return type

[**CredentialIssuance**](CredentialIssuance.md)

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

<a name="issueCredential"></a>
# **issueCredential**
> CredentialIssuance issueCredential(X_ORGANIZATION_ID, credentialCreate)

Issue a new credential

(ASYNC) Issue a new credential to an existing established connection. This operation is asynchronous, to follow the progress of the issuance, use webhooks or check the issuance status using the API.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsIssuanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialCreate credentialCreate = new CredentialCreate(); // CredentialCreate | 
    try {
      CredentialIssuance result = apiInstance.issueCredential(X_ORGANIZATION_ID, credentialCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#issueCredential");
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

[**CredentialIssuance**](CredentialIssuance.md)

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

<a name="listCredentialIssuances"></a>
# **listCredentialIssuances**
> List&lt;CredentialIssuance&gt; listCredentialIssuances(X_ORGANIZATION_ID)

List all credentials

List all credentials issued by an organization

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialsIssuanceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialIssuance> result = apiInstance.listCredentialIssuances(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#listCredentialIssuances");
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

[**List&lt;CredentialIssuance&gt;**](CredentialIssuance.md)

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

