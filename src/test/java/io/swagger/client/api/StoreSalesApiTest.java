/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CatalogSale;
import io.swagger.client.model.PageCatalogSale;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreSalesApi
 */
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
        // CatalogSale response = api.createCatalogSaleUsingPOST(catalogSale);

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
        // api.deleteCatalogSaleUsingDELETE(id);

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
        // CatalogSale response = api.getCatalogSaleUsingGET(id);

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
        // PageCatalogSale response = api.getCatalogSalesUsingGET(size, page, order);

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
        // api.updateCatalogSaleUsingPUT(id, catalogSale);

        // TODO: test validations
    }
    
}
