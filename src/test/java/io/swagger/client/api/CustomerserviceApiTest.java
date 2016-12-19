/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CustomerConfig;
import io.swagger.client.model.CustomerResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerserviceApi
 */
@Ignore
public class CustomerserviceApiTest {

    private final CustomerserviceApi api = new CustomerserviceApi();

    
    /**
     * Create a customer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCustomerUsingPOSTTest() throws ApiException {
        CustomerConfig customer = null;
        api.createCustomerUsingPOST(customer);

        // TODO: test validations
    }
    
    /**
     * List and search customers
     *
     * Get a list of customers with optional filtering
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCustomersUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        List<CustomerResource> response = api.getCustomersUsingGET(size, page, order);

        // TODO: test validations
    }
    
}
