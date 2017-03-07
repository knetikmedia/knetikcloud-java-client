# BRERuleEngineEventsApi

All URIs are relative to *https://sandbox.knetikcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendBREEvent**](BRERuleEngineEventsApi.md#sendBREEvent) | **POST** /bre/events | Fire a new event, based on an existing trigger


<a name="sendBREEvent"></a>
# **sendBREEvent**
> sendBREEvent(breEvent)

Fire a new event, based on an existing trigger

Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.

### Example
```java
// Import classes:
//import com.knetikcloud.ApiClient;
//import com.knetikcloud.ApiException;
//import com.knetikcloud.Configuration;
//import com.knetikcloud.auth.*;
//import com.knetikcloud.client.BRERuleEngineEventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

BRERuleEngineEventsApi apiInstance = new BRERuleEngineEventsApi();
BreEvent breEvent = new BreEvent(); // BreEvent | The BRE event object
try {
    apiInstance.sendBREEvent(breEvent);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineEventsApi#sendBREEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breEvent** | [**BreEvent**](BreEvent.md)| The BRE event object | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

