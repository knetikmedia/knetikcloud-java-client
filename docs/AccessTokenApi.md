# AccessTokenApi

All URIs are relative to *https://jsapi-integration.us-east-1.elasticbeanstalk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOAuthToken**](AccessTokenApi.md#getOAuthToken) | **POST** /oauth/token | Get access token


<a name="getOAuthToken"></a>
# **getOAuthToken**
> OAuth2Resource getOAuthToken(grantType, clientId, clientSecret, username, password, token, refreshToken)

Get access token

### Example
```java
// Import classes:
//import com.knetikcloud.client.ApiException;
//import com.knetikcloud.api.AccessTokenApi;


AccessTokenApi apiInstance = new AccessTokenApi();
String grantType = "client_credentials"; // String | Grant type
String clientId = "knetik"; // String | The id of the client
String clientSecret = "clientSecret_example"; // String | The secret key of the client.  Used only with a grant_type of client_credentials
String username = "username_example"; // String | The username of the client. Used only with a grant_type of password
String password = "password_example"; // String | The password of the client. Used only with a grant_type of password
String token = "token_example"; // String | The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins)
String refreshToken = "refreshToken_example"; // String | The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token
try {
    OAuth2Resource result = apiInstance.getOAuthToken(grantType, clientId, clientSecret, username, password, token, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokenApi#getOAuthToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grantType** | **String**| Grant type | [default to client_credentials] [enum: client_credentials, password, facebook, google, refresh_token]
 **clientId** | **String**| The id of the client | [default to knetik]
 **clientSecret** | **String**| The secret key of the client.  Used only with a grant_type of client_credentials | [optional]
 **username** | **String**| The username of the client. Used only with a grant_type of password | [optional]
 **password** | **String**| The password of the client. Used only with a grant_type of password | [optional]
 **token** | **String**| The 3rd party authentication token. Used only with a grant_type of facebook, google, etc (social plugins) | [optional]
 **refreshToken** | **String**| The refresh token obtained during prior authentication. Used only with a grant_type of refresh_token | [optional]

### Return type

[**OAuth2Resource**](OAuth2Resource.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

