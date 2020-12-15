# CredentialDefinitionsApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clientClientIdGet1**](CredentialDefinitionsApi.md#clientClientIdGet1) | **GET** /credential-definitions/{credentialDefinitionId} | Get credentialDefinition
[**credentialDefinitionPost**](CredentialDefinitionsApi.md#credentialDefinitionPost) | **POST** /credential-definitions | Create a new credentialDefinition
[**credentialDefinitionsCreatedGet**](CredentialDefinitionsApi.md#credentialDefinitionsCreatedGet) | **GET** /credential-definitions/created | Get created credential definitions


<a name="clientClientIdGet1"></a>
# **clientClientIdGet1**
> CredentialDefinition clientClientIdGet1(X_ORGANIZATION_ID, credentialDefinitionId)

Get credentialDefinition

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialDefinitionId = 0; // String | A credentialDefinition ID.
    try {
      CredentialDefinition result = apiInstance.clientClientIdGet1(X_ORGANIZATION_ID, credentialDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#clientClientIdGet1");
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
 **credentialDefinitionId** | **String**| A credentialDefinition ID. |

### Return type

[**CredentialDefinition**](CredentialDefinition.md)

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

<a name="credentialDefinitionPost"></a>
# **credentialDefinitionPost**
> CredentialDefinitionSummary credentialDefinitionPost(X_ORGANIZATION_ID, credentialDefinitionCreate)

Create a new credentialDefinition

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialDefinitionCreate credentialDefinitionCreate = new CredentialDefinitionCreate(); // CredentialDefinitionCreate | 
    try {
      CredentialDefinitionSummary result = apiInstance.credentialDefinitionPost(X_ORGANIZATION_ID, credentialDefinitionCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#credentialDefinitionPost");
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
 **credentialDefinitionCreate** | [**CredentialDefinitionCreate**](CredentialDefinitionCreate.md)|  |

### Return type

[**CredentialDefinitionSummary**](CredentialDefinitionSummary.md)

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

<a name="credentialDefinitionsCreatedGet"></a>
# **credentialDefinitionsCreatedGet**
> List&lt;CredentialDefinitionSummary&gt; credentialDefinitionsCreatedGet(X_ORGANIZATION_ID)

Get created credential definitions

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.CredentialDefinitionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialDefinitionSummary> result = apiInstance.credentialDefinitionsCreatedGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#credentialDefinitionsCreatedGet");
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

[**List&lt;CredentialDefinitionSummary&gt;**](CredentialDefinitionSummary.md)

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

