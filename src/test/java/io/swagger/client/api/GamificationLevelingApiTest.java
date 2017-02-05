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
import io.swagger.client.model.LevelingResource;
import io.swagger.client.model.BreTriggerResource;
import io.swagger.client.model.PageLevelingResource;
import io.swagger.client.model.UserLevelingResource;
import io.swagger.client.model.PageUserLevelingResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLevelingApi
 */
public class GamificationLevelingApiTest {

    private final GamificationLevelingApi api = new GamificationLevelingApi();

    
    /**
     * Update or create a leveling progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void changeUserLevelExperienceUsingPUTTest() throws ApiException {
        Integer userId = null;
        String name = null;
        Integer progress = null;
        // api.changeUserLevelExperienceUsingPUT(userId, name, progress);

        // TODO: test validations
    }
    
    /**
     * Create a level schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLevelUsingPOSTTest() throws ApiException {
        LevelingResource level = null;
        // LevelingResource response = api.createLevelUsingPOST(level);

        // TODO: test validations
    }
    
    /**
     * Delete a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLevelUsingDELETETest() throws ApiException {
        String name = null;
        // api.deleteLevelUsingDELETE(name);

        // TODO: test validations
    }
    
    /**
     * Get the list of triggers that can be used to trigger a leveling progress update
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAvailableTriggersUsingGET1Test() throws ApiException {
        // List<BreTriggerResource> response = api.getAvailableTriggersUsingGET1();

        // TODO: test validations
    }
    
    /**
     * Retrieve a particular level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelUsingGETTest() throws ApiException {
        String name = null;
        // LevelingResource response = api.getLevelUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * List and search levels
     *
     * Get a list of levels schemas with optional filtering
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelsUsingGETTest() throws ApiException {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        // PageLevelingResource response = api.getLevelsUsingGET(filterName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s progress for a given level schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLevelUsingGETTest() throws ApiException {
        Integer userId = null;
        String name = null;
        // UserLevelingResource response = api.getUserLevelUsingGET(userId, name);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s progress for all level schemas
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLevelsUsingGETTest() throws ApiException {
        Integer userId = null;
        // PageUserLevelingResource response = api.getUserLevelsUsingGET(userId);

        // TODO: test validations
    }
    
    /**
     * Update a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLevelUsingPUTTest() throws ApiException {
        String name = null;
        LevelingResource newLevel = null;
        // api.updateLevelUsingPUT(name, newLevel);

        // TODO: test validations
    }
    
}
