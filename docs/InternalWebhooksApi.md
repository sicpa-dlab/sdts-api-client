# InternalWebhooksApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhooksGet**](InternalWebhooksApi.md#webhooksGet) | **GET** /internal/webhooks | List an organization&#39;s active webhooks with given type 


<a name="webhooksGet"></a>
# **webhooksGet**
> List&lt;Webhook&gt; webhooksGet(organizationId, acaPyTopic, acaPyFilter)

List an organization&#39;s active webhooks with given type 

### Example
```java
// Import classes:
import com.sicpa.edison.credentialsclient.client.ApiClient;
import com.sicpa.edison.credentialsclient.client.ApiException;
import com.sicpa.edison.credentialsclient.client.Configuration;
import com.sicpa.edison.credentialsclient.client.models.*;
import com.sicpa.edison.credentialsclient.api.InternalWebhooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    InternalWebhooksApi apiInstance = new InternalWebhooksApi(defaultClient);
    Integer organizationId = 56; // Integer | 
    String acaPyTopic = "acaPyTopic_example"; // String | 
    String acaPyFilter = "acaPyFilter_example"; // String | 
    try {
      List<Webhook> result = apiInstance.webhooksGet(organizationId, acaPyTopic, acaPyFilter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InternalWebhooksApi#webhooksGet");
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
 **organizationId** | **Integer**|  |
 **acaPyTopic** | **String**|  |
 **acaPyFilter** | **String**|  |

### Return type

[**List&lt;Webhook&gt;**](Webhook.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**500** | Internal Server Error |  -  |
