# CredentialsIssuanceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**issuanceCredentialCredentialIdDelete**](CredentialsIssuanceApi.md#issuanceCredentialCredentialIdDelete) | **DELETE** /credentials-issuance/{issuanceId} | Delete the specified credential issuance
[**issuanceCredentialCredentialIdGet**](CredentialsIssuanceApi.md#issuanceCredentialCredentialIdGet) | **GET** /credentials-issuance/{issuanceId} | Get the specified credential issuance
[**issuanceCredentialPost**](CredentialsIssuanceApi.md#issuanceCredentialPost) | **POST** /credentials-issuance | Issue new credentials
[**issuanceCredentialsGet**](CredentialsIssuanceApi.md#issuanceCredentialsGet) | **GET** /credentials-issuance | List all credential issuance


<a name="issuanceCredentialCredentialIdDelete"></a>
# **issuanceCredentialCredentialIdDelete**
> issuanceCredentialCredentialIdDelete(X_ORGANIZATION_ID, issuanceId)

Delete the specified credential issuance

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String issuanceId = "issuanceId_example"; // String | An credential issuance ID.
    try {
      apiInstance.issuanceCredentialCredentialIdDelete(X_ORGANIZATION_ID, issuanceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#issuanceCredentialCredentialIdDelete");
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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="issuanceCredentialCredentialIdGet"></a>
# **issuanceCredentialCredentialIdGet**
> CredentialIssuance issuanceCredentialCredentialIdGet(X_ORGANIZATION_ID, issuanceId)

Get the specified credential issuance

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String issuanceId = "issuanceId_example"; // String | An credential issuance ID.
    try {
      CredentialIssuance result = apiInstance.issuanceCredentialCredentialIdGet(X_ORGANIZATION_ID, issuanceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#issuanceCredentialCredentialIdGet");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="issuanceCredentialPost"></a>
# **issuanceCredentialPost**
> CredentialIssuance issuanceCredentialPost(X_ORGANIZATION_ID, credentialCreate)

Issue new credentials

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialCreate credentialCreate = new CredentialCreate(); // CredentialCreate | 
    try {
      CredentialIssuance result = apiInstance.issuanceCredentialPost(X_ORGANIZATION_ID, credentialCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#issuanceCredentialPost");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="issuanceCredentialsGet"></a>
# **issuanceCredentialsGet**
> List&lt;CredentialIssuance&gt; issuanceCredentialsGet(X_ORGANIZATION_ID)

List all credential issuance

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsIssuanceApi apiInstance = new CredentialsIssuanceApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialIssuance> result = apiInstance.issuanceCredentialsGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsIssuanceApi#issuanceCredentialsGet");
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
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

