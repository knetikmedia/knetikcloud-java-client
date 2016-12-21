# AWSSApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preSignUrlUsingGET**](AWSSApi.md#preSignUrlUsingGET) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL


<a name="preSignUrlUsingGET"></a>
# **preSignUrlUsingGET**
> AmazonS3Activity preSignUrlUsingGET(filename, contentType)

Get a signed S3 URL

Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AWSSApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

AWSSApi apiInstance = new AWSSApi();
String filename = "filename_example"; // String | The file name
String contentType = "contentType_example"; // String | The content type
try {
    AmazonS3Activity result = apiInstance.preSignUrlUsingGET(filename, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AWSSApi#preSignUrlUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filename** | **String**| The file name | [optional]
 **contentType** | **String**| The content type | [optional]

### Return type

[**AmazonS3Activity**](AmazonS3Activity.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

