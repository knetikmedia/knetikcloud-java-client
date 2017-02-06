# BRERuleEngineVariablesApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBREVariableTypes**](BRERuleEngineVariablesApi.md#getBREVariableTypes) | **GET** /bre/variable-types | Get a list of variable types available


<a name="getBREVariableTypes"></a>
# **getBREVariableTypes**
> List&lt;VariableTypeResource&gt; getBREVariableTypes()

Get a list of variable types available

Types include integer, string, user and invoice. These are used to qualify trigger parameters and action variables with strong typing.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BRERuleEngineVariablesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

BRERuleEngineVariablesApi apiInstance = new BRERuleEngineVariablesApi();
try {
    List<VariableTypeResource> result = apiInstance.getBREVariableTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BRERuleEngineVariablesApi#getBREVariableTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;VariableTypeResource&gt;**](VariableTypeResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

