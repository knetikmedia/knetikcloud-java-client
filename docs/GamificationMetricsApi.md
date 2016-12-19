# GamificationMetricsApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetricUsingPOST**](GamificationMetricsApi.md#addMetricUsingPOST) | **POST** /metrics | Add a metric


<a name="addMetricUsingPOST"></a>
# **addMetricUsingPOST**
> addMetricUsingPOST(metric)

Add a metric

Post a new score/stat for an activity occurrence without ending the occurrence itself

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GamificationMetricsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

GamificationMetricsApi apiInstance = new GamificationMetricsApi();
MetricResource metric = new MetricResource(); // MetricResource | The new metric
try {
    apiInstance.addMetricUsingPOST(metric);
} catch (ApiException e) {
    System.err.println("Exception when calling GamificationMetricsApi#addMetricUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metric** | [**MetricResource**](MetricResource.md)| The new metric | [optional]

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*
