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
import com.knetikcloud.model.BreTriggerResource;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.LevelingResource;
import com.knetikcloud.model.PageResourceLevelingResource;
import com.knetikcloud.model.PageResourceUserLevelingResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.UserLevelingResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLevelingApi
 */
@Ignore
public class GamificationLevelingApiTest {

    private final GamificationLevelingApi api = new GamificationLevelingApi();

    
    /**
     * Create a level schema
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLevelTest() throws ApiException {
        LevelingResource level = null;
        LevelingResource response = api.createLevel(level);

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
    public void deleteLevelTest() throws ApiException {
        String name = null;
        api.deleteLevel(name);

        // TODO: test validations
    }
    
    /**
     * Retrieve a level
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLevelTest() throws ApiException {
        String name = null;
        LevelingResource response = api.getLevel(name);

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
    public void getLevelTriggersTest() throws ApiException {
        List<BreTriggerResource> response = api.getLevelTriggers();

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
    public void getLevelsTest() throws ApiException {
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceLevelingResource response = api.getLevels(filterName, size, page, order);

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
    public void getUserLevelTest() throws ApiException {
        String userId = null;
        String name = null;
        UserLevelingResource response = api.getUserLevel(userId, name);

        // TODO: test validations
    }
    
    /**
     * Get a user&#39;s progress for all level schemas
     *
     * Filtering and sorting is based on the LevelingResource object, not the UserLevelingResource that is returned here.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLevelsTest() throws ApiException {
        String userId = null;
        String filterName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceUserLevelingResource response = api.getUserLevels(userId, filterName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update or create a leveling progress record for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise the provided value will be added to it. May be negative. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void incrementProgressTest() throws ApiException {
        Integer userId = null;
        String name = null;
        IntWrapper progress = null;
        api.incrementProgress(userId, name, progress);

        // TODO: test validations
    }
    
    /**
     * Set leveling progress for a user
     *
     * If no progress record yet exists for the user, it will be created. Otherwise it will be updated to the provided value. If progress meets or exceeds the level&#39;s max_value it will be marked as earned and a BRE event will be triggered for the &lt;code&gt;BreAchievementEarnedTrigger&lt;/code&gt;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setProgressTest() throws ApiException {
        Integer userId = null;
        String name = null;
        IntWrapper progress = null;
        api.setProgress(userId, name, progress);

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
    public void updateLevelTest() throws ApiException {
        String name = null;
        LevelingResource newLevel = null;
        LevelingResource response = api.updateLevel(name, newLevel);

        // TODO: test validations
    }
    
}
