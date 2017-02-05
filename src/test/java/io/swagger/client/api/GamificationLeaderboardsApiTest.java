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
import io.swagger.client.model.LeaderboardEntryResource;
import io.swagger.client.model.LeaderboardResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationLeaderboardsApi
 */
@Ignore
public class GamificationLeaderboardsApiTest {

    private final GamificationLeaderboardsApi api = new GamificationLeaderboardsApi();

    
    /**
     * Retrieves leaderboard details and paginated entries
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeaderboardUsingGETTest() throws ApiException {
        String contextType = null;
        String contextId = null;
        Integer size = null;
        Integer page = null;
        LeaderboardResource response = api.getLeaderboardUsingGET(contextType, contextId, size, page);

        // TODO: test validations
    }
    
    /**
     * Get a list of available leaderboard strategy names
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStrategiesUsingGETTest() throws ApiException {
        List<String> response = api.getStrategiesUsingGET();

        // TODO: test validations
    }
    
    /**
     * Retrieves a specific user entry with rank
     *
     * The context type identifies the type of entity (i.e., &#39;activity&#39;) being tracked on the leaderboard. The context ID is the unique ID of the actual entity tracked by the leaderboard
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserRankUsingGETTest() throws ApiException {
        String contextType = null;
        String contextId = null;
        String id = null;
        LeaderboardEntryResource response = api.getUserRankUsingGET(contextType, contextId, id);

        // TODO: test validations
    }
    
}
