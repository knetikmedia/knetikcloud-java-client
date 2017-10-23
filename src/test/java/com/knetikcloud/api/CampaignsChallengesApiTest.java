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
import com.knetikcloud.model.ChallengeActivityResource;
import com.knetikcloud.model.ChallengeEventResource;
import com.knetikcloud.model.ChallengeResource;
import com.knetikcloud.model.PageResourceBareChallengeActivityResource;
import com.knetikcloud.model.PageResourceChallengeEventResource;
import com.knetikcloud.model.PageResourceChallengeResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
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
     * Create a challenge activity template
     *
     * Challenge Activity Templates define a type of challenge activity and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createChallengeActivityTemplateTest() throws ApiException {
        TemplateResource challengeActivityTemplateResource = null;
        TemplateResource response = api.createChallengeActivityTemplate(challengeActivityTemplateResource);

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
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeActivityTest() throws ApiException {
        Long id = null;
        Long challengeId = null;
        api.deleteChallengeActivity(id, challengeId);

        // TODO: test validations
    }
    
    /**
     * Delete a challenge activity template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteChallengeActivityTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteChallengeActivityTemplate(id, cascade);

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
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeActivityTest() throws ApiException {
        Long id = null;
        Long challengeId = null;
        ChallengeActivityResource response = api.getChallengeActivity(id, challengeId);

        // TODO: test validations
    }
    
    /**
     * Get a single challenge activity template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeActivityTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getChallengeActivityTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search challenge activity templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getChallengeActivityTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getChallengeActivityTemplates(size, page, order);

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
        Boolean filterActiveCampaign = null;
        String filterStartDate = null;
        String filterEndDate = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceChallengeResource response = api.getChallenges(filterActiveCampaign, filterStartDate, filterEndDate, size, page, order);

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
     * A challenge can have multiple instances of the same activity and thus the id used is of the specific entry within the challenge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeActivityTest() throws ApiException {
        Long id = null;
        Long challengeId = null;
        ChallengeActivityResource challengeActivityResource = null;
        ChallengeActivityResource response = api.updateChallengeActivity(id, challengeId, challengeActivityResource);

        // TODO: test validations
    }
    
    /**
     * Update an challenge activity template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateChallengeActivityTemplateTest() throws ApiException {
        String id = null;
        TemplateResource challengeActivityTemplateResource = null;
        TemplateResource response = api.updateChallengeActivityTemplate(id, challengeActivityTemplateResource);

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
        TemplateResource response = api.updateChallengeTemplate(id, challengeTemplateResource);

        // TODO: test validations
    }
    
}
