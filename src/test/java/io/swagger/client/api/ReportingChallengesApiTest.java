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
import io.swagger.client.model.PageChallengeEventParticipantResource;
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
    public void getChallengeEventLeaderboardUsingGETTest() throws ApiException {
        Long filterEvent = null;
        PageChallengeEventParticipantResource response = api.getChallengeEventLeaderboardUsingGET(filterEvent);

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
    public void getChallengeEventParticipantsUsingGETTest() throws ApiException {
        Long filterEvent = null;
        PageChallengeEventParticipantResource response = api.getChallengeEventParticipantsUsingGET(filterEvent);

        // TODO: test validations
    }
    
}