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
import io.swagger.client.model.InventorySubscriptionResource;
import io.swagger.client.model.InvoiceResource;
import io.swagger.client.model.ReactivateSubscriptionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersSubscriptionsApi
 */
@Ignore
public class UsersSubscriptionsApiTest {

    private final UsersSubscriptionsApi api = new UsersSubscriptionsApi();

    
    /**
     * Get details about a user&#39;s subscription
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionDetailsUsingGETTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        InventorySubscriptionResource response = api.getSubscriptionDetailsUsingGET(userId, inventoryId);

        // TODO: test validations
    }
    
    /**
     * Get details about a user&#39;s subscriptions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubscriptionDetailsUsingGET1Test() throws ApiException {
        Integer userId = null;
        List<InventorySubscriptionResource> response = api.getSubscriptionDetailsUsingGET1(userId);

        // TODO: test validations
    }
    
    /**
     * Reactivate a subscription and charge fee
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void reactivateUsingPOSTTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        ReactivateSubscriptionRequest reactivateSubscriptionRequest = null;
        InvoiceResource response = api.reactivateUsingPOST(userId, inventoryId, reactivateSubscriptionRequest);

        // TODO: test validations
    }
    
    /**
     * Set a new date to bill a subscription on
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBillDateUsingPUTTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        Long billDate = null;
        api.setBillDateUsingPUT(userId, inventoryId, billDate);

        // TODO: test validations
    }
    
    /**
     * Set the payment method to use for a subscription
     *
     * May send null to use floating default
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setPaymentMethodUsingPUTTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        Integer paymentMethodId = null;
        api.setPaymentMethodUsingPUT(userId, inventoryId, paymentMethodId);

        // TODO: test validations
    }
    
    /**
     * Set the status of a subscription
     *
     * The body is a json string (put in quotes) that should match a desired invoice status type. Note that the new status may be blocked if the system is not configured to allow the current status to be changed to the new, to enforce proper flow. The default options for statuses are shown below but may be altered for special use cases
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setStatusUsingPUTTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        String status = null;
        api.setStatusUsingPUT(userId, inventoryId, status);

        // TODO: test validations
    }
    
    /**
     * Set a new subscription plan for a user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserPlanUsingPUTTest() throws ApiException {
        Integer userId = null;
        Integer inventoryId = null;
        String planId = null;
        api.setUserPlanUsingPUT(userId, inventoryId, planId);

        // TODO: test validations
    }
    
}
