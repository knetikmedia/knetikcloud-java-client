/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud;

import com.ApiException;
import io.swagger.client.model.CreateBillingAgreementRequest;
import io.swagger.client.model.CreatePayPalPaymentRequest;
import io.swagger.client.model.FinalizeBillingAgreementRequest;
import io.swagger.client.model.FinalizePayPalPaymentRequest;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsPayPalClassicApi
 */
@Ignore
public class PaymentsPayPalClassicApiTest {

    private final PaymentsPayPalClassicApi api = new PaymentsPayPalClassicApi();

    
    /**
     * Create a PayPal Classic billing agreement for the user
     *
     * Returns the token that should be used to forward the user to PayPal so they can accept the agreement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPayPalBillingAgreementUrlTest() throws ApiException {
        CreateBillingAgreementRequest request = null;
        String response = api.createPayPalBillingAgreementUrl(request);

        // TODO: test validations
    }
    
    /**
     * Create a payment token for PayPal express checkout
     *
     * Returns the token that should be used to forward the user to PayPal so they can complete the checkout.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPayPalExpressCheckoutTest() throws ApiException {
        CreatePayPalPaymentRequest request = null;
        String response = api.createPayPalExpressCheckout(request);

        // TODO: test validations
    }
    
    /**
     * Finalizes a billing agreement after the user has accepted through PayPal
     *
     * Returns the ID of the new payment method created for the user for the billing agreement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void finalizePayPalBillingAgreementTest() throws ApiException {
        FinalizeBillingAgreementRequest request = null;
        Integer response = api.finalizePayPalBillingAgreement(request);

        // TODO: test validations
    }
    
    /**
     * Finalizes a payment after the user has completed checkout with PayPal
     *
     * The invoice will be marked paid/failed by asynchronous IPN callback.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void finalizePayPalCheckoutTest() throws ApiException {
        FinalizePayPalPaymentRequest request = null;
        api.finalizePayPalCheckout(request);

        // TODO: test validations
    }
    
}
