# VerificationsApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVerification**](VerificationsApi.md#createVerification) | **POST** /verifications | Create a new verification
[**createVerificationTemplate**](VerificationsApi.md#createVerificationTemplate) | **POST** /verification-templates | Create a new verification template
[**deleteVerificationEntry**](VerificationsApi.md#deleteVerificationEntry) | **DELETE** /verifications/{verificationId} | Delete a verification entry
[**deleteVerificationTemplate**](VerificationsApi.md#deleteVerificationTemplate) | **DELETE** /verification-templates/{verificationTemplateId} | Delete a verification template
[**getVerificationById**](VerificationsApi.md#getVerificationById) | **GET** /verifications/{verificationId} | Get a verification entry
[**getVerificationTemplateById**](VerificationsApi.md#getVerificationTemplateById) | **GET** /verification-templates/{verificationTemplateId} | Get verification template
[**listVerificationTemplates**](VerificationsApi.md#listVerificationTemplates) | **GET** /verification-templates | List all verification templates
[**listVerifications**](VerificationsApi.md#listVerifications) | **GET** /verifications | List all verification entries
[**updateVerificationTemplate**](VerificationsApi.md#updateVerificationTemplate) | **PUT** /verification-templates/{verificationTemplateId} | Update verification template


<a name="createVerification"></a>
# **createVerification**
> Verification createVerification(X_ORGANIZATION_ID, verificationCreate)

Create a new verification

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    VerificationCreate verificationCreate = new VerificationCreate(); // VerificationCreate | 
    try {
      Verification result = apiInstance.createVerification(X_ORGANIZATION_ID, verificationCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#createVerification");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="createVerificationTemplate"></a>
# **createVerificationTemplate**
> VerificationTemplate createVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateCreate)

Create a new verification template

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    VerificationTemplateCreate verificationTemplateCreate = new VerificationTemplateCreate(); // VerificationTemplateCreate | 
    try {
      VerificationTemplate result = apiInstance.createVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#createVerificationTemplate");
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
 **verificationTemplateCreate** | [**VerificationTemplateCreate**](VerificationTemplateCreate.md)|  |

### Return type

[**VerificationTemplate**](VerificationTemplate.md)

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

<a name="deleteVerificationEntry"></a>
# **deleteVerificationEntry**
> deleteVerificationEntry(X_ORGANIZATION_ID, verificationId)

Delete a verification entry

Delete log entry for a verification, this does not cancel a verification.

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String verificationId = "verificationId_example"; // String | A verification ID.
    try {
      apiInstance.deleteVerificationEntry(X_ORGANIZATION_ID, verificationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#deleteVerificationEntry");
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
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**204** | No Content |  -  |

<a name="deleteVerificationTemplate"></a>
# **deleteVerificationTemplate**
> deleteVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateId)

Delete a verification template

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    try {
      apiInstance.deleteVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateId);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#deleteVerificationTemplate");
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
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**204** | No Content |  -  |

<a name="getVerificationById"></a>
# **getVerificationById**
> Verification getVerificationById(X_ORGANIZATION_ID, verificationId)

Get a verification entry

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String verificationId = "verificationId_example"; // String | A verification ID.
    try {
      Verification result = apiInstance.getVerificationById(X_ORGANIZATION_ID, verificationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getVerificationById");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="getVerificationTemplateById"></a>
# **getVerificationTemplateById**
> VerificationTemplate getVerificationTemplateById(X_ORGANIZATION_ID, verificationTemplateId)

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    try {
      VerificationTemplate result = apiInstance.getVerificationTemplateById(X_ORGANIZATION_ID, verificationTemplateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#getVerificationTemplateById");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="listVerificationTemplates"></a>
# **listVerificationTemplates**
> List&lt;VerificationTemplateSummary&gt; listVerificationTemplates(X_ORGANIZATION_ID)

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    try {
      List<VerificationTemplateSummary> result = apiInstance.listVerificationTemplates(X_ORGANIZATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#listVerificationTemplates");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="listVerifications"></a>
# **listVerifications**
> List&lt;VerificationSummary&gt; listVerifications(X_ORGANIZATION_ID, connectionId)

List all verification entries

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    String connectionId = "3fa85f64-5717-4562-b3fc-2c963f66afa6"; // String | A connection ID.
    try {
      List<VerificationSummary> result = apiInstance.listVerifications(X_ORGANIZATION_ID, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#listVerifications");
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
 - **Accept**: */*, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**200** | OK |  -  |

<a name="updateVerificationTemplate"></a>
# **updateVerificationTemplate**
> VerificationTemplate updateVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateId, verificationTemplateUpdate)

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
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    VerificationsApi apiInstance = new VerificationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Integer verificationTemplateId = 56; // Integer | A verification template ID.
    VerificationTemplateUpdate verificationTemplateUpdate = new VerificationTemplateUpdate(); // VerificationTemplateUpdate | 
    try {
      VerificationTemplate result = apiInstance.updateVerificationTemplate(X_ORGANIZATION_ID, verificationTemplateId, verificationTemplateUpdate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VerificationsApi#updateVerificationTemplate");
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
 **verificationTemplateUpdate** | [**VerificationTemplateUpdate**](VerificationTemplateUpdate.md)|  |

### Return type

[**VerificationTemplate**](VerificationTemplate.md)

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

