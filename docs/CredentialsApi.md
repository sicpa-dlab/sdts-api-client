# CredentialsApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credentialCredentialIdDelete**](CredentialsApi.md#credentialCredentialIdDelete) | **DELETE** /credentials/{credentialId} | Delete the specified credential
[**credentialCredentialIdGet**](CredentialsApi.md#credentialCredentialIdGet) | **GET** /credentials/{credentialId} | Get the specified credential
[**credentialsGet**](CredentialsApi.md#credentialsGet) | **GET** /credentials | List all credentials
[**issuanceCredentialCredentialIdDelete**](CredentialsApi.md#issuanceCredentialCredentialIdDelete) | **DELETE** /credentials-issuance/{credentialExchangeId} | Delete the specified issued credential
[**issuanceCredentialCredentialIdGet**](CredentialsApi.md#issuanceCredentialCredentialIdGet) | **GET** /credentials-issuance/{credentialExchangeId} | Get the specified issued credential
[**issuanceCredentialPost**](CredentialsApi.md#issuanceCredentialPost) | **POST** /credentials-issuance | Issue new credentials
[**issuanceCredentialsGet**](CredentialsApi.md#issuanceCredentialsGet) | **GET** /credentials-issuance | List all issued credentials


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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | A credential ID.
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
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

<a name="credentialCredentialIdGet"></a>
# **credentialCredentialIdGet**
> Credential credentialCredentialIdGet(X_ORGANIZATION_ID, credentialId)

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialId = "credentialId_example"; // String | A credential ID.
    try {
      Credential result = apiInstance.credentialCredentialIdGet(X_ORGANIZATION_ID, credentialId);
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
 **credentialId** | **String**| A credential ID. |

### Return type

[**Credential**](Credential.md)

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

<a name="credentialsGet"></a>
# **credentialsGet**
> List&lt;Credential&gt; credentialsGet(X_ORGANIZATION_ID)

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<Credential> result = apiInstance.credentialsGet(X_ORGANIZATION_ID);
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

[**List&lt;Credential&gt;**](Credential.md)

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

<a name="issuanceCredentialCredentialIdDelete"></a>
# **issuanceCredentialCredentialIdDelete**
> issuanceCredentialCredentialIdDelete(X_ORGANIZATION_ID, credentialExchangeId)

Delete the specified issued credential

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialExchangeId = "credentialExchangeId_example"; // String | An credential exchange ID.
    try {
      apiInstance.issuanceCredentialCredentialIdDelete(X_ORGANIZATION_ID, credentialExchangeId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#issuanceCredentialCredentialIdDelete");
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
 **credentialExchangeId** | **String**| An credential exchange ID. |

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
> CredentialExchange issuanceCredentialCredentialIdGet(X_ORGANIZATION_ID, credentialExchangeId)

Get the specified issued credential

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String credentialExchangeId = "credentialExchangeId_example"; // String | An credential exchange ID.
    try {
      CredentialExchange result = apiInstance.issuanceCredentialCredentialIdGet(X_ORGANIZATION_ID, credentialExchangeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#issuanceCredentialCredentialIdGet");
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
 **credentialExchangeId** | **String**| An credential exchange ID. |

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

<a name="issuanceCredentialPost"></a>
# **issuanceCredentialPost**
> CredentialExchange issuanceCredentialPost(X_ORGANIZATION_ID, credentialCreate)

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    CredentialCreate credentialCreate = new CredentialCreate(); // CredentialCreate | 
    try {
      CredentialExchange result = apiInstance.issuanceCredentialPost(X_ORGANIZATION_ID, credentialCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#issuanceCredentialPost");
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

<a name="issuanceCredentialsGet"></a>
# **issuanceCredentialsGet**
> List&lt;CredentialExchange&gt; issuanceCredentialsGet(X_ORGANIZATION_ID)

List all issued credentials

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
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    CredentialsApi apiInstance = new CredentialsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<CredentialExchange> result = apiInstance.issuanceCredentialsGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CredentialsApi#issuanceCredentialsGet");
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

