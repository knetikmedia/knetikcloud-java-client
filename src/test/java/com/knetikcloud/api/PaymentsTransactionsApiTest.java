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


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PageResourceTransactionResource;
import com.knetikcloud.model.RefundRequest;
import com.knetikcloud.model.RefundResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TransactionResource;
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
    public void getTransactionTest() throws ApiException {
        Integer id = null;
        TransactionResource response = api.getTransaction(id);

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
    public void getTransactionsTest() throws ApiException {
        Integer filterInvoice = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTransactionResource response = api.getTransactions(filterInvoice, size, page, order);

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
    public void refundTransactionTest() throws ApiException {
        Integer id = null;
        RefundRequest request = null;
        RefundResource response = api.refundTransaction(id, request);

        // TODO: test validations
    }
    
}