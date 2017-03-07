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
import io.swagger.client.model.ApplyPaymentRequest;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsAppleApi
 */
@Ignore
public class PaymentsAppleApiTest {

    private final PaymentsAppleApi api = new PaymentsAppleApi();

    
    /**
     * Pay invoice with Apple receipt
     *
     * Mark an invoice paid using Apple payment receipt. A receipt will only be accepted once and the details of the transaction must match the invoice, including the product_id matching the sku text of the item in the invoice. Returns the transaction ID if successful.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void verifyAppleReceiptTest() throws ApiException {
        ApplyPaymentRequest request = null;
        String response = api.verifyAppleReceipt(request);

        // TODO: test validations
    }
    
}
