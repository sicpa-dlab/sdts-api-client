# WebhooksApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookPost**](WebhooksApi.md#webhookPost) | **POST** /webhooks | Create a new webhook
[**webhookTypesGet**](WebhooksApi.md#webhookTypesGet) | **GET** /webhooks/types | List all webhook types and their respective filters
[**webhookWebhookIdDelete**](WebhooksApi.md#webhookWebhookIdDelete) | **DELETE** /webhooks/{webhookId} | Delete webhook
[**webhookWebhookIdGet**](WebhooksApi.md#webhookWebhookIdGet) | **GET** /webhooks/{webhookId} | Get webhook
[**webhookWebhookIdPut**](WebhooksApi.md#webhookWebhookIdPut) | **PUT** /webhooks/{webhookId} | Update a webhook
[**webhooksGet**](WebhooksApi.md#webhooksGet) | **GET** /webhooks | List all webhooks


<a name="webhookPost"></a>
# **webhookPost**
> Webhook webhookPost(X_ORGANIZATION_ID, webhookCreate)

Create a new webhook

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    WebhookCreate webhookCreate = new WebhookCreate(); // WebhookCreate | 
    try {
      Webhook result = apiInstance.webhookPost(X_ORGANIZATION_ID, webhookCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookPost");
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
 **webhookCreate** | [**WebhookCreate**](WebhookCreate.md)|  |

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhookTypesGet"></a>
# **webhookTypesGet**
> List&lt;WebhookType&gt; webhookTypesGet()

List all webhook types and their respective filters

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    try {
      List<WebhookType> result = apiInstance.webhookTypesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookTypesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WebhookType&gt;**](WebhookType.md)

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

<a name="webhookWebhookIdDelete"></a>
# **webhookWebhookIdDelete**
> webhookWebhookIdDelete(X_ORGANIZATION_ID, webhookId)

Delete webhook

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer webhookId = 56; // Integer | A webhook ID.
    try {
      apiInstance.webhookWebhookIdDelete(X_ORGANIZATION_ID, webhookId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookWebhookIdDelete");
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
 **webhookId** | **Integer**| A webhook ID. |

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

<a name="webhookWebhookIdGet"></a>
# **webhookWebhookIdGet**
> Webhook webhookWebhookIdGet(X_ORGANIZATION_ID, webhookId)

Get webhook

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer webhookId = 56; // Integer | An webhook ID.
    try {
      Webhook result = apiInstance.webhookWebhookIdGet(X_ORGANIZATION_ID, webhookId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookWebhookIdGet");
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
 **webhookId** | **Integer**| An webhook ID. |

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhookWebhookIdPut"></a>
# **webhookWebhookIdPut**
> Webhook webhookWebhookIdPut(X_ORGANIZATION_ID, webhookId, webhookUpdate)

Update a webhook

The update is done in such manner that all fields passed in the payload updates the existing entity. Null valuesin the payload will indicate that no changes will be applied to the existing entity.

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer webhookId = 56; // Integer | An webhook ID.
    WebhookUpdate webhookUpdate = new WebhookUpdate(); // WebhookUpdate | 
    try {
      Webhook result = apiInstance.webhookWebhookIdPut(X_ORGANIZATION_ID, webhookId, webhookUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhookWebhookIdPut");
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
 **webhookId** | **Integer**| An webhook ID. |
 **webhookUpdate** | [**WebhookUpdate**](WebhookUpdate.md)|  |

### Return type

[**Webhook**](Webhook.md)

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

<a name="webhooksGet"></a>
# **webhooksGet**
> List&lt;Webhook&gt; webhooksGet(X_ORGANIZATION_ID, active)

List all webhooks

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.WebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    WebhooksApi apiInstance = new WebhooksApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Boolean active = true; // Boolean | Filter active webhooks
    try {
      List<Webhook> result = apiInstance.webhooksGet(X_ORGANIZATION_ID, active);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhooksApi#webhooksGet");
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
 **active** | **Boolean**| Filter active webhooks | [optional]

### Return type

[**List&lt;Webhook&gt;**](Webhook.md)

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

