# SchemasApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSchema**](SchemasApi.md#createSchema) | **POST** /schemas | Create a new schema
[**getSchemaById**](SchemasApi.md#getSchemaById) | **GET** /schemas/{schemaId} | Get schema
[**listSchemas**](SchemasApi.md#listSchemas) | **GET** /schemas/created | List created schemas


<a name="createSchema"></a>
# **createSchema**
> SchemaSummary createSchema(X_ORGANIZATION_ID, schemaCreate)

Create a new schema

(ASYNC) create and anchor a new schema on the ledger. This is an asynchronous operation, to follow anchoring progress, use webhooks or check the schema&#39;s status from the API.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    SchemaCreate schemaCreate = new SchemaCreate(); // SchemaCreate | 
    try {
      SchemaSummary result = apiInstance.createSchema(X_ORGANIZATION_ID, schemaCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#createSchema");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="getSchemaById"></a>
# **getSchemaById**
> Schema getSchemaById(X_ORGANIZATION_ID, schemaId)

Get schema

Retrieve a schema. Anchored flag can be used to ensure the schema is ready to use.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String schemaId = "0"; // String | A schema ID.
    try {
      Schema result = apiInstance.getSchemaById(X_ORGANIZATION_ID, schemaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#getSchemaById");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="listSchemas"></a>
# **listSchemas**
> List&lt;SchemaSummary&gt; listSchemas(X_ORGANIZATION_ID)

List created schemas

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    SchemasApi apiInstance = new SchemasApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<SchemaSummary> result = apiInstance.listSchemas(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SchemasApi#listSchemas");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

