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
import io.swagger.client.model.CatalogSale;
import io.swagger.client.model.PageResourceCatalogSale;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreSalesApi
 */
@Ignore
public class StoreSalesApiTest {

    private final StoreSalesApi api = new StoreSalesApi();

    
    /**
     * Create a sale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCatalogSaleUsingPOSTTest() throws ApiException {
        CatalogSale catalogSale = null;
        CatalogSale response = api.createCatalogSaleUsingPOST(catalogSale);

        // TODO: test validations
    }
    
    /**
     * Delete a sale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCatalogSaleUsingDELETETest() throws ApiException {
        Integer id = null;
        api.deleteCatalogSaleUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Get a single sale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCatalogSaleUsingGETTest() throws ApiException {
        Integer id = null;
        CatalogSale response = api.getCatalogSaleUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search sales
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCatalogSalesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCatalogSale response = api.getCatalogSalesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a sale
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCatalogSaleUsingPUTTest() throws ApiException {
        Integer id = null;
        CatalogSale catalogSale = null;
        api.updateCatalogSaleUsingPUT(id, catalogSale);

        // TODO: test validations
    }
    
}
