# PaymentsStripeApi

All URIs are relative to *https://localhost:8080/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStripePaymentMethod**](PaymentsStripeApi.md#createStripePaymentMethod) | **POST** /payment/provider/stripe/payment-methods | Create a Stripe payment method for a user
[**payStripeInvoice**](PaymentsStripeApi.md#payStripeInvoice) | **POST** /payment/provider/stripe/payments | Pay with a single use token


<a name="createStripePaymentMethod"></a>
# **createStripePaymentMethod**
> PaymentMethodResource createStripePaymentMethod(request)

Create a Stripe payment method for a user

Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PaymentsStripeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: knetik_oauth
OAuth knetik_oauth = (OAuth) defaultClient.getAuthentication("knetik_oauth");
knetik_oauth.setAccessToken("YOUR ACCESS TOKEN");

PaymentsStripeApi apiInstance = new PaymentsStripeApi();
StripeCreatePaymentMethod request = new StripeCreatePaymentMethod(); // StripeCreatePaymentMethod | The request to create a Stripe customer with payment info
try {
    PaymentMethodResource result = apiInstance.createStripePaymentMethod(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsStripeApi#createStripePaymentMethod");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StripeCreatePaymentMethod**](StripeCreatePaymentMethod.md)| The request to create a Stripe customer with payment info | [optional]

### Return type

[**PaymentMethodResource**](PaymentMethodResource.md)

### Authorization

[knetik_oauth](../README.md#knetik_oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="payStripeInvoice"></a>
# **payStripeInvoice**
> payStripeInvoice(request)

Pay with a single use token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PaymentsStripeApi;


PaymentsStripeApi apiInstance = new PaymentsStripeApi();
StripePaymentRequest request = new StripePaymentRequest(); // StripePaymentRequest | The request to pay an invoice
try {
    apiInstance.payStripeInvoice(request);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsStripeApi#payStripeInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**StripePaymentRequest**](StripePaymentRequest.md)| The request to pay an invoice | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

