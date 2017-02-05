# AWSSApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**preSignedURL**](AWSSApi.md#preSignedURL) | **GET** /amazon/s3/signedposturl | Get a signed S3 URL


<a name="preSignedURL"></a>
# **preSignedURL**
> AmazonS3Activity preSignedURL(filename, contentType)

Get a signed S3 URL

Requires the file name and file content type (i.e., &#39;video/mpeg&#39;)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AWSSApi;


AWSSApi apiInstance = new AWSSApi();
String filename = "filename_example"; // String | The file name
String contentType = "contentType_example"; // String | The content type
try {
    AmazonS3Activity result = apiInstance.preSignedURL(filename, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AWSSApi#preSignedURL");
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: *_/_*

