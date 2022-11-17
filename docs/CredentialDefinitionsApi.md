# CredentialDefinitionsApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCredentialDefinition**](CredentialDefinitionsApi.md#createCredentialDefinition) | **POST** /credential-definitions | Create a new credential definition
[**getCredentialDefinitionById**](CredentialDefinitionsApi.md#getCredentialDefinitionById) | **GET** /credential-definitions/{credentialDefinitionId} | Get a single credential definition
[**listCredentialDefinitions**](CredentialDefinitionsApi.md#listCredentialDefinitions) | **GET** /credential-definitions/created | List all created credential definitions


<a name="createCredentialDefinition"></a>
# **createCredentialDefinition**
> CredentialDefinitionSummary createCredentialDefinition(X_ORGANIZATION_ID, credentialDefinitionCreate)

Create a new credential definition

(ASYNC) create and anchor a new schema on the ledger. This is an asynchronous operation, to follow anchoring progress, use webhooks or check the schema&#39;s status from the API.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialDefinitionCreate credentialDefinitionCreate = new CredentialDefinitionCreate(); // CredentialDefinitionCreate | 
    try {
      CredentialDefinitionSummary result = apiInstance.createCredentialDefinition(X_ORGANIZATION_ID, credentialDefinitionCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#createCredentialDefinition");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="getCredentialDefinitionById"></a>
# **getCredentialDefinitionById**
> CredentialDefinition getCredentialDefinitionById(X_ORGANIZATION_ID, credentialDefinitionId)

Get a single credential definition

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialDefinitionId = "0"; // String | A credentialDefinition ID.
    try {
      CredentialDefinition result = apiInstance.getCredentialDefinitionById(X_ORGANIZATION_ID, credentialDefinitionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#getCredentialDefinitionById");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="listCredentialDefinitions"></a>
# **listCredentialDefinitions**
> List&lt;CredentialDefinitionSummary&gt; listCredentialDefinitions(X_ORGANIZATION_ID)

List all created credential definitions

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    CredentialDefinitionsApi apiInstance = new CredentialDefinitionsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialDefinitionSummary> result = apiInstance.listCredentialDefinitions(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialDefinitionsApi#listCredentialDefinitions");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

