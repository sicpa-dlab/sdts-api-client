# MessagesApi

All URIs are relative to *http://localhost/edison-credentials-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /messages | Sends a message


<a name="sendMessage"></a>
# **sendMessage**
> sendMessage(X_ORGANIZATION_ID, message)

Sends a message

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.auth.*;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/edison-credentials-api");
    
    // Configure OAuth2 access token for authorization: auth
    OAuth auth = (OAuth) defaultClient.getAuthentication("auth");
    auth.setAccessToken("YOUR ACCESS TOKEN");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Integer X_ORGANIZATION_ID = 56; // Integer | 
    Message message = new Message(); // Message | 
    try {
      apiInstance.sendMessage(X_ORGANIZATION_ID, message);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendMessage");
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
 **message** | [**Message**](Message.md)|  |

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
**500** | Internal Server Error |  -  |
**400** | Bad Request |  -  |
**204** | No Content |  -  |

