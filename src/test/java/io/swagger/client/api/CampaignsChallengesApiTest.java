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
import io.swagger.client.model.ChallengeActivityResource;
import io.swagger.client.model.ChallengeEventResource;
import io.swagger.client.model.ChallengeResource;
import io.swagger.client.model.PageResourceBareChallengeActivityResource;
import io.swagger.client.model.PageResourceChallengeEventResource;
import io.swagger.client.model.PageResourceChallengeResource;
import io.swagger.client.model.PageResourceTemplateResource;
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
     * Create a challenge
     *
     * Challenges do not run on their own.  They must be added to a campaign before events will spawn.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeTest() throws ApiException {
        ChallengeResource challengeResource = null;
        ChallengeResource response = api.createChallenge(challengeResource);

        // TODO: test validations
    }
    
    /**
     * Create a challenge activity
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeActivityTest() throws ApiException {
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        Boolean validateSettings = null;
        ChallengeActivityResource response = api.createChallengeActivity(challengeId, challengeActivityResource, validateSettings);

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
    public void createChallengeTemplateTest() throws ApiException {
        TemplateResource challengeTemplateResource = null;
        TemplateResource response = api.createChallengeTemplate(challengeTemplateResource);

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
    public void deleteChallengeTest() throws ApiException {
        Long id = null;
        api.deleteChallenge(id);

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
    public void deleteChallengeActivityTest() throws ApiException {
        Long activityId = null;
        Long challengeId = null;
        api.deleteChallengeActivity(activityId, challengeId);

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
    public void deleteChallengeEventTest() throws ApiException {
        Long id = null;
        api.deleteChallengeEvent(id);

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
    public void deleteChallengeTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteChallengeTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Retrieve a challenge
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeTest() throws ApiException {
        Long id = null;
        ChallengeResource response = api.getChallenge(id);

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
    public void getChallengeActivitiesTest() throws ApiException {
        Long challengeId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceBareChallengeActivityResource response = api.getChallengeActivities(challengeId, size, page, order);

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
    public void getChallengeActivityTest() throws ApiException {
        Long activityId = null;
        ChallengeActivityResource response = api.getChallengeActivity(activityId);

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
    public void getChallengeEventTest() throws ApiException {
        Long id = null;
        ChallengeEventResource response = api.getChallengeEvent(id);

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
    public void getChallengeEventsTest() throws ApiException {
        String filterStartDate = null;
        String filterEndDate = null;
        Boolean filterCampaigns = null;
        Long filterChallenge = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceChallengeEventResource response = api.getChallengeEvents(filterStartDate, filterEndDate, filterCampaigns, filterChallenge, size, page, order);

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
    public void getChallengeTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getChallengeTemplate(id);

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
    public void getChallengeTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getChallengeTemplates(size, page, order);

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
    public void getChallengesTest() throws ApiException {
        Boolean filterTemplate = null;
        Boolean filterActiveCampaign = null;
        PageResourceChallengeResource response = api.getChallenges(filterTemplate, filterActiveCampaign);

        // TODO: test validations
    }
    
    /**
     * Update a challenge
     *
     * If the challenge is a copy, changes will propagate to all the related challenges
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeTest() throws ApiException {
        Long id = null;
        ChallengeResource challengeResource = null;
        ChallengeResource response = api.updateChallenge(id, challengeResource);

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
    public void updateChallengeActivityTest() throws ApiException {
        Long activityId = null;
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        api.updateChallengeActivity(activityId, challengeId, challengeActivityResource);

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
    public void updateChallengeTemplateTest() throws ApiException {
        String id = null;
        TemplateResource challengeTemplateResource = null;
        api.updateChallengeTemplate(id, challengeTemplateResource);

        // TODO: test validations
    }
    
}
