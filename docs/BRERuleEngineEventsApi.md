# BRERuleEngineEventsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fireEventUsingPOST**](BRERuleEngineEventsApi.md#fireEventUsingPOST) | **POST** /bre/events | Fire a new event, based on an existing trigger


<a name="fireEventUsingPOST"></a>
# **fireEventUsingPOST**
> fireEventUsingPOST(breEvent, authentication)

Fire a new event, based on an existing trigger

Parameters within the event must match names and types from the trigger. Actual rule execution is asynchornous.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BRERuleEngineEventsApi;


BRERuleEngineEventsApi apiInstance = new BRERuleEngineEventsApi();
BreEvent breEvent = new BreEvent(); // BreEvent | The BRE event object
OAuth2Authentication authentication = new OAuth2Authentication(); // OAuth2Authentication | The authentication object
try {
    apiInstance.fireEventUsingPOST(breEvent, authentication);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineEventsApi#fireEventUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **breEvent** | [**BreEvent**](BreEvent.md)| The BRE event object | [optional]
 **authentication** | [**OAuth2Authentication**](OAuth2Authentication.md)| The authentication object | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

