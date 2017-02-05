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
import io.swagger.client.model.SavedAddressResource;
import io.swagger.client.model.PageSavedAddressResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersAddressesApi
 */
public class UsersAddressesApiTest {

    private final UsersAddressesApi api = new UsersAddressesApi();

    
    /**
     * Save a new address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAddressUsingPOSTTest() throws ApiException {
        String userId = null;
        SavedAddressResource savedAddressResource = null;
        // SavedAddressResource response = api.createAddressUsingPOST(userId, savedAddressResource);

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
    public void deleteAddressUsingDELETETest() throws ApiException {
        String userId = null;
        Integer id = null;
        // api.deleteAddressUsingDELETE(userId, id);

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
    public void getAddressUsingGETTest() throws ApiException {
        String userId = null;
        Integer id = null;
        // SavedAddressResource response = api.getAddressUsingGET(userId, id);

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
    public void getAddressesUsingGETTest() throws ApiException {
        String userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageSavedAddressResource response = api.getAddressesUsingGET(userId, size, page, order);

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
    public void updateAddressUsingPUTTest() throws ApiException {
        String userId = null;
        Integer id = null;
        SavedAddressResource savedAddressResource = null;
        // api.updateAddressUsingPUT(userId, id, savedAddressResource);

        // TODO: test validations
    }
    
}
