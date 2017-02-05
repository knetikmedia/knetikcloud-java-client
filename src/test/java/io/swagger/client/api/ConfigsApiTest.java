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
import io.swagger.client.model.Config;
import io.swagger.client.model.PageResourceConfig;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigsApi
 */
@Ignore
public class ConfigsApiTest {

    private final ConfigsApi api = new ConfigsApi();

    
    /**
     * Create a new config
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConfigUsingPOSTTest() throws ApiException {
        Config config = null;
        Config response = api.createConfigUsingPOST(config);

        // TODO: test validations
    }
    
    /**
     * Delete an existing config
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConfigUsingDELETETest() throws ApiException {
        String name = null;
        api.deleteConfigUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * Get a single config
     *
     * Only configs that are public readable will be shown without admin access
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigUsingGETTest() throws ApiException {
        String name = null;
        Config response = api.getConfigUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * List and search configs
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConfigsUsingGETTest() throws ApiException {
        String filterSearch = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceConfig response = api.getConfigsUsingGET(filterSearch, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update an existing config
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConfigUsingPUTTest() throws ApiException {
        String name = null;
        Config config = null;
        api.updateConfigUsingPUT(name, config);

        // TODO: test validations
    }
    
}
