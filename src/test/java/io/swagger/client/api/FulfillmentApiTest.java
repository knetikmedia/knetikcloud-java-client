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
import io.swagger.client.model.FulfillmentType;
import io.swagger.client.model.PageResourceFulfillmentType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FulfillmentApi
 */
@Ignore
public class FulfillmentApiTest {

    private final FulfillmentApi api = new FulfillmentApi();

    
    /**
     * Create a fulfillment type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentTypeUsingPOSTTest() throws ApiException {
        FulfillmentType type = null;
        FulfillmentType response = api.createFulfillmentTypeUsingPOST(type);

        // TODO: test validations
    }
    
    /**
     * Delete a fulfillment type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFulfillmentTypeUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteFulfillmentTypeUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Get a single fulfillment type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentTypeUsingGETTest() throws ApiException {
        Integer id = null;
        FulfillmentType response = api.getFulfillmentTypeUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search fulfillment types
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentsUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceFulfillmentType response = api.getFulfillmentsUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a fulfillment type
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFulfillmentTypeUsingPUTTest() throws ApiException {
        Integer id = null;
        FulfillmentType fulfillmentType = null;
        api.updateFulfillmentTypeUsingPUT(id, fulfillmentType);

        // TODO: test validations
    }
    
}
