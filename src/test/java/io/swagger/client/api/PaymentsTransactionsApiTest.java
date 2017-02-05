/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.PageResourceTransactionResource;
import io.swagger.client.model.RefundRequest;
import io.swagger.client.model.RefundResource;
import io.swagger.client.model.TransactionResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentsTransactionsApi
 */
@Ignore
public class PaymentsTransactionsApiTest {

    private final PaymentsTransactionsApi api = new PaymentsTransactionsApi();

    
    /**
     * Get the details for a single transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionUsingGETTest() throws ApiException {
        Integer id = null;
        TransactionResource response = api.getTransactionUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search transactions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionsUsingGETTest() throws ApiException {
        Integer filterInvoice = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTransactionResource response = api.getTransactionsUsingGET(filterInvoice, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Refund a payment transaction, in full or in part
     *
     * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void refundTransactionUsingPOSTTest() throws ApiException {
        Integer id = null;
        RefundRequest request = null;
        RefundResource response = api.refundTransactionUsingPOST(id, request);

        // TODO: test validations
    }
    
}
