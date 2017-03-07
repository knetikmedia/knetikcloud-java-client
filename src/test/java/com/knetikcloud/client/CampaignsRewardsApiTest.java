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


package com.knetikcloud.client;

import com.knetikcloud.ApiException;
import io.swagger.client.model.PageResourceRewardSetResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.RewardSetResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsRewardsApi
 */
@Ignore
public class CampaignsRewardsApiTest {

    private final CampaignsRewardsApi api = new CampaignsRewardsApi();

    
    /**
     * Create a reward set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRewardSetTest() throws ApiException {
        RewardSetResource rewardSetResource = null;
        RewardSetResource response = api.createRewardSet(rewardSetResource);

        // TODO: test validations
    }
    
    /**
     * Delete a reward set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRewardSetTest() throws ApiException {
        Integer id = null;
        api.deleteRewardSet(id);

        // TODO: test validations
    }
    
    /**
     * Get a single reward set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRewardSetTest() throws ApiException {
        Integer id = null;
        RewardSetResource response = api.getRewardSet(id);

        // TODO: test validations
    }
    
    /**
     * List and search reward sets
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRewardSetsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceRewardSetResource response = api.getRewardSets(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a reward set
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRewardSetTest() throws ApiException {
        Integer id = null;
        RewardSetResource rewardSetResource = null;
        RewardSetResource response = api.updateRewardSet(id, rewardSetResource);

        // TODO: test validations
    }
    
}
