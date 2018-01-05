package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PaymentMethodResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.StripeCreatePaymentMethod;
import com.knetikcloud.model.StripePaymentRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T09:36:00.854-05:00")
public class PaymentsStripeApi {
  private ApiClient apiClient;

  public PaymentsStripeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PaymentsStripeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a Stripe payment method for a user
   * Obtain a token from Stripe, following their examples and documentation. Stores customer information and creates a payment method that can be used to pay invoices through the payments endpoints. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid.
   * @param request The request to create a Stripe customer with payment info (optional)
   * @return PaymentMethodResource
   * @throws ApiException if fails to make API call
   */
  public PaymentMethodResource createStripePaymentMethod(StripeCreatePaymentMethod request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/payment/provider/stripe/payment-methods";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PaymentMethodResource> localVarReturnType = new GenericType<PaymentMethodResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Pay with a single use token
   * Obtain a token from Stripe, following their examples and documentation. Pays an invoice without creating a payment method. Ensure that Stripe itself has been configured with the webhook so that invoices are marked paid.
   * @param request The request to pay an invoice (optional)
   * @throws ApiException if fails to make API call
   */
  public void payStripeInvoice(StripePaymentRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // create path and map variables
    String localVarPath = "/payment/provider/stripe/payments";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
