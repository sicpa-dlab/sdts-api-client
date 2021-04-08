# RevocationsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**revocationPost**](RevocationsApi.md#revocationPost) | **POST** /revocations | Revoke credential


<a name="revocationPost"></a>
# **revocationPost**
> revocationPost(X_ORGANIZATION_ID, revocationCreate)

Revoke credential

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.RevocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure HTTP bearer authorization: auth
    HttpBearerAuth auth = (HttpBearerAuth) defaultClient.getAuthentication("auth");
    auth.setBearerToken("BEARER TOKEN");

    RevocationsApi apiInstance = new RevocationsApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    RevocationCreate revocationCreate = new RevocationCreate(); // RevocationCreate | 
    try {
      apiInstance.revocationPost(X_ORGANIZATION_ID, revocationCreate);
    } catch (ApiException e) {
      System.err.println("Exception when calling RevocationsApi#revocationPost");
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
 **revocationCreate** | [**RevocationCreate**](RevocationCreate.md)|  |

### Return type

null (empty response body)

### Authorization

[auth](../README.md#auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |

