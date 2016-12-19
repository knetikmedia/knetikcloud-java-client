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
import io.swagger.client.model.ChallengeActivityResource;
import io.swagger.client.model.ChallengeEventResource;
import io.swagger.client.model.ChallengeResource;
import io.swagger.client.model.PageBareChallengeActivityResource;
import io.swagger.client.model.PageChallengeEventResource;
import io.swagger.client.model.PageChallengeResource;
import io.swagger.client.model.PageTemplateResource;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CampaignsChallengesApi
 */
@Ignore
public class CampaignsChallengesApiTest {

    private final CampaignsChallengesApi api = new CampaignsChallengesApi();

    
    /**
     * Create a challenge activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeActivityUsingPOSTTest() throws ApiException {
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        Boolean validateSettings = null;
        ChallengeActivityResource response = api.createChallengeActivityUsingPOST(challengeId, challengeActivityResource, validateSettings);

        // TODO: test validations
    }
    
    /**
     * Create a challenge template
     *
     * Challenge Templates define a type of challenge and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeTemplateUsingPOSTTest() throws ApiException {
        TemplateResource challengeTemplateResource = null;
        TemplateResource response = api.createChallengeTemplateUsingPOST(challengeTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Create a challenge
     *
     * Challenges do not run on their own.  They must be added to a campaign before events will spawn.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeUsingPOSTTest() throws ApiException {
        ChallengeResource challengeResource = null;
        ChallengeResource response = api.createChallengeUsingPOST(challengeResource);

        // TODO: test validations
    }
    
    /**
     * Delete a challenge activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeActivityUsingDELETETest() throws ApiException {
        Long activityId = null;
        Long challengeId = null;
        api.deleteChallengeActivityUsingDELETE(activityId, challengeId);

        // TODO: test validations
    }
    
    /**
     * Delete a challenge event
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeEventUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteChallengeEventUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Delete a challenge template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteChallengeTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Delete a challenge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteChallengeUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * List and search challenge activities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getActivitiesUsingGET1Test() throws ApiException {
        Long challengeId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageBareChallengeActivityResource response = api.getActivitiesUsingGET1(challengeId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single challenge activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeActivityUsingGETTest() throws ApiException {
        Long activityId = null;
        ChallengeActivityResource response = api.getChallengeActivityUsingGET(activityId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a single challenge event details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeEventUsingGETTest() throws ApiException {
        Long id = null;
        ChallengeEventResource response = api.getChallengeEventUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of challenge events
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeEventssUsingGETTest() throws ApiException {
        String filterStartDate = null;
        String filterEndDate = null;
        Boolean filterCampaigns = null;
        Long filterChallenge = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageChallengeEventResource response = api.getChallengeEventssUsingGET(filterStartDate, filterEndDate, filterCampaigns, filterChallenge, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single challenge template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getChallengeTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search challenge templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageTemplateResource response = api.getChallengeTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Retrieve a single challenge details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeUsingGETTest() throws ApiException {
        Long id = null;
        ChallengeResource response = api.getChallengeUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of challenges
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengesUsingGET1Test() throws ApiException {
        Boolean filterTemplate = null;
        Boolean filterActiveCampaign = null;
        PageChallengeResource response = api.getChallengesUsingGET1(filterTemplate, filterActiveCampaign);

        // TODO: test validations
    }
    
    /**
     * Update a challenge activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeActivityUsingPUTTest() throws ApiException {
        Long activityId = null;
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        api.updateChallengeActivityUsingPUT(activityId, challengeId, challengeActivityResource);

        // TODO: test validations
    }
    
    /**
     * Update a challenge template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeTemplateUsingPUTTest() throws ApiException {
        String id = null;
        TemplateResource challengeTemplateResource = null;
        api.updateChallengeTemplateUsingPUT(id, challengeTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Update a challenge&#39;s information
     *
     * If the challenge is a copy, changes will propagate to all the related challenges
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeUsingPUTTest() throws ApiException {
        Long id = null;
        ChallengeResource challengeResource = null;
        ChallengeResource response = api.updateChallengeUsingPUT(id, challengeResource);

        // TODO: test validations
    }
    
}