# VerificationsApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**verificationDelete**](VerificationsApi.md#verificationDelete) | **DELETE** /verifications/{verificationId} | Delete verification
[**verificationGet**](VerificationsApi.md#verificationGet) | **GET** /verifications/{verificationId} | Get verification
[**verificationTemplateDelete**](VerificationsApi.md#verificationTemplateDelete) | **DELETE** /verification-templates/{verificationTemplateId} | Delete verification request
[**verificationTemplateGet**](VerificationsApi.md#verificationTemplateGet) | **GET** /verification-templates/{verificationTemplateId} | Get verification template
[**verificationTemplatePut**](VerificationsApi.md#verificationTemplatePut) | **PUT** /verification-templates/{verificationTemplateId} | Update verification template
[**verificationTemplatesGet**](VerificationsApi.md#verificationTemplatesGet) | **GET** /verification-templates | List all verification templates
[**verificationTemplatesPost**](VerificationsApi.md#verificationTemplatesPost) | **POST** /verification-templates | Create a new Verification Template
[**verificationsGet**](VerificationsApi.md#verificationsGet) | **GET** /verifications | List all verifications
[**verificationsPost**](VerificationsApi.md#verificationsPost) | **POST** /verifications | Create a new Verification


<a name="verificationDelete"></a>
# **verificationDelete**
> verificationDelete(X_ORGANIZATION_ID, verificationId)

Delete verification

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String verificationId = "verificationId_example"; // String | A verification ID.
    try {
      apiInstance.verificationDelete(X_ORGANIZATION_ID, verificationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationDelete");
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
 **verificationId** | **String**| A verification ID. |

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

<a name="verificationGet"></a>
# **verificationGet**
> Verification verificationGet(X_ORGANIZATION_ID, verificationId)

Get verification

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String verificationId = "verificationId_example"; // String | A verification ID.
    try {
      Verification result = apiInstance.verificationGet(X_ORGANIZATION_ID, verificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationGet");
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
 **verificationId** | **String**| A verification ID. |

### Return type

[**Verification**](Verification.md)

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

<a name="verificationTemplateDelete"></a>
# **verificationTemplateDelete**
> verificationTemplateDelete(X_ORGANIZATION_ID, verificationTemplateId)

Delete verification request

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    try {
      apiInstance.verificationTemplateDelete(X_ORGANIZATION_ID, verificationTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationTemplateDelete");
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
 **verificationTemplateId** | **Integer**| A verification template ID. |

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

<a name="verificationTemplateGet"></a>
# **verificationTemplateGet**
> VerificationTemplate verificationTemplateGet(X_ORGANIZATION_ID, verificationTemplateId)

Get verification template

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    try {
      VerificationTemplate result = apiInstance.verificationTemplateGet(X_ORGANIZATION_ID, verificationTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationTemplateGet");
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
 **verificationTemplateId** | **Integer**| A verification template ID. |

### Return type

[**VerificationTemplate**](VerificationTemplate.md)

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

<a name="verificationTemplatePut"></a>
# **verificationTemplatePut**
> VerificationTemplate verificationTemplatePut(X_ORGANIZATION_ID, verificationTemplateId, verificationTemplateParam)

Update verification template

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    VerificationTemplateParam verificationTemplateParam = new VerificationTemplateParam(); // VerificationTemplateParam | 
    try {
      VerificationTemplate result = apiInstance.verificationTemplatePut(X_ORGANIZATION_ID, verificationTemplateId, verificationTemplateParam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationTemplatePut");
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
 **verificationTemplateId** | **Integer**| A verification template ID. |
 **verificationTemplateParam** | [**VerificationTemplateParam**](VerificationTemplateParam.md)|  |

### Return type

[**VerificationTemplate**](VerificationTemplate.md)

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

<a name="verificationTemplatesGet"></a>
# **verificationTemplatesGet**
> List&lt;VerificationTemplateSummary&gt; verificationTemplatesGet(X_ORGANIZATION_ID)

List all verification templates

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<VerificationTemplateSummary> result = apiInstance.verificationTemplatesGet(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationTemplatesGet");
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

[**List&lt;VerificationTemplateSummary&gt;**](VerificationTemplateSummary.md)

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

<a name="verificationTemplatesPost"></a>
# **verificationTemplatesPost**
> VerificationTemplate verificationTemplatesPost(X_ORGANIZATION_ID, verificationTemplateParam)

Create a new Verification Template

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    VerificationTemplateParam verificationTemplateParam = new VerificationTemplateParam(); // VerificationTemplateParam | 
    try {
      VerificationTemplate result = apiInstance.verificationTemplatesPost(X_ORGANIZATION_ID, verificationTemplateParam);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationTemplatesPost");
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
 **verificationTemplateParam** | [**VerificationTemplateParam**](VerificationTemplateParam.md)|  |

### Return type

[**VerificationTemplate**](VerificationTemplate.md)

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

<a name="verificationsGet"></a>
# **verificationsGet**
> List&lt;VerificationSummary&gt; verificationsGet(X_ORGANIZATION_ID, connectionId)

List all verifications

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = 3fa85f64-5717-4562-b3fc-2c963f66afa6; // String | A connection ID.
    try {
      List<VerificationSummary> result = apiInstance.verificationsGet(X_ORGANIZATION_ID, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsGet");
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
 **connectionId** | **String**| A connection ID. | [optional]

### Return type

[**List&lt;VerificationSummary&gt;**](VerificationSummary.md)

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

<a name="verificationsPost"></a>
# **verificationsPost**
> Verification verificationsPost(X_ORGANIZATION_ID, verificationCreate)

Create a new Verification

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.VerificationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    VerificationCreate verificationCreate = new VerificationCreate(); // VerificationCreate | 
    try {
      Verification result = apiInstance.verificationsPost(X_ORGANIZATION_ID, verificationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#verificationsPost");
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
 **verificationCreate** | [**VerificationCreate**](VerificationCreate.md)|  |

### Return type

[**Verification**](Verification.md)

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

