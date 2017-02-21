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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.PageResourceSavedAddressResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.SavedAddressResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersAddressesApi
 */
@Ignore
public class UsersAddressesApiTest {

    private final UsersAddressesApi api = new UsersAddressesApi();

    
    /**
     * Create a new address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddressTest() throws ApiException {
        String userId = null;
        SavedAddressResource savedAddressResource = null;
        SavedAddressResource response = api.createAddress(userId, savedAddressResource);

        // TODO: test validations
    }
    
    /**
     * Delete an address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAddressTest() throws ApiException {
        String userId = null;
        Integer id = null;
        api.deleteAddress(userId, id);

        // TODO: test validations
    }
    
    /**
     * Get a single address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressTest() throws ApiException {
        String userId = null;
        Integer id = null;
        SavedAddressResource response = api.getAddress(userId, id);

        // TODO: test validations
    }
    
    /**
     * List and search addresses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesTest() throws ApiException {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceSavedAddressResource response = api.getAddresses(userId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update an address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAddressTest() throws ApiException {
        String userId = null;
        Integer id = null;
        SavedAddressResource savedAddressResource = null;
        SavedAddressResource response = api.updateAddress(userId, id, savedAddressResource);

        // TODO: test validations
    }
    
}
