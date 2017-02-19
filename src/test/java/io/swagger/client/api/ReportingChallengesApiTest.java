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
import io.swagger.client.model.PageResourceChallengeEventParticipantResource;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingChallengesApi
 */
@Ignore
public class ReportingChallengesApiTest {

    private final ReportingChallengesApi api = new ReportingChallengesApi();

    
    /**
     * Retrieve a challenge event leaderboard details
     *
     * Lists all leaderboard entries with additional user details
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeEventLeaderboardTest() throws ApiException {
        Long filterEvent = null;
        PageResourceChallengeEventParticipantResource response = api.getChallengeEventLeaderboard(filterEvent);

        // TODO: test validations
    }
    
    /**
     * Retrieve a challenge event participant details
     *
     * Lists all user submitted scores sorted by value, including those that do not apear in the leaderboard due to value or aggregation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeEventParticipantsTest() throws ApiException {
        Long filterEvent = null;
        PageResourceChallengeEventParticipantResource response = api.getChallengeEventParticipants(filterEvent);

        // TODO: test validations
    }
    
}
