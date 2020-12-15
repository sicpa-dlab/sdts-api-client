# SchemasApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemaPost**](SchemasApi.md#schemaPost) | **POST** /schemas | Create a new schema
[**schemaSchemaIdGet**](SchemasApi.md#schemaSchemaIdGet) | **GET** /schemas/{schemaId} | Get schema
[**schemasCreatedGet**](SchemasApi.md#schemasCreatedGet) | **GET** /schemas/created | Get created schemas


<a name="schemaPost"></a>
# **schemaPost**
> SchemaSummary schemaPost(X_ORGANIZATION_ID, schemaCreate)

Create a new schema

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    SchemaCreate schemaCreate = new SchemaCreate(); // SchemaCreate | 
    try {
      SchemaSummary result = apiInstance.schemaPost(X_ORGANIZATION_ID, schemaCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#schemaPost");
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
 **schemaCreate** | [**SchemaCreate**](SchemaCreate.md)|  |

### Return type

[**SchemaSummary**](SchemaSummary.md)

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

<a name="schemaSchemaIdGet"></a>
# **schemaSchemaIdGet**
> Schema schemaSchemaIdGet(X_ORGANIZATION_ID, schemaId)

Get schema

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String schemaId = 0; // String | A schema ID.
    try {
      Schema result = apiInstance.schemaSchemaIdGet(X_ORGANIZATION_ID, schemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#schemaSchemaIdGet");
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
 **schemaId** | **String**| A schema ID. |

### Return type

[**Schema**](Schema.md)

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

<a name="schemasCreatedGet"></a>
# **schemasCreatedGet**
> List&lt;SchemaSummary&gt; schemasCreatedGet(X_ORGANIZATION_ID)

Get created schemas

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.SchemasApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure API key authorization: auth
    ApiKeyAuth auth = (ApiKeyAuth) defaultClient.getAuthentication("auth");
    auth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //auth.setApiKeyPrefix("Token");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<SchemaSummary> result = apiInstance.schemasCreatedGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#schemasCreatedGet");
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

[**List&lt;SchemaSummary&gt;**](SchemaSummary.md)

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

