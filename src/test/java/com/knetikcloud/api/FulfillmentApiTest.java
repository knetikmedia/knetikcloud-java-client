/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
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
import com.knetikcloud.model.FulfillmentType;
import com.knetikcloud.model.PageResourceFulfillmentType;
import com.knetikcloud.model.Result;
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
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFulfillmentTypeTest() throws ApiException {
        FulfillmentType type = null;
        FulfillmentType response = api.createFulfillmentType(type);

        // TODO: test validations
    }
    
    /**
     * Delete a fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFulfillmentTypeTest() throws ApiException {
        Integer id = null;
        api.deleteFulfillmentType(id);

        // TODO: test validations
    }
    
    /**
     * Get a single fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentTypeTest() throws ApiException {
        Integer id = null;
        FulfillmentType response = api.getFulfillmentType(id);

        // TODO: test validations
    }
    
    /**
     * List and search fulfillment types
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFulfillmentTypesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceFulfillmentType response = api.getFulfillmentTypes(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a fulfillment type
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; FULFILLMENT_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFulfillmentTypeTest() throws ApiException {
        Integer id = null;
        FulfillmentType fulfillmentType = null;
        api.updateFulfillmentType(id, fulfillmentType);

        // TODO: test validations
    }
    
}
