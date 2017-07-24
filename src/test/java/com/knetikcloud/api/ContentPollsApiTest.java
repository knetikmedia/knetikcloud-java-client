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
import com.knetikcloud.model.PageResourcePollResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PollResource;
import com.knetikcloud.model.PollResponseResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentPollsApi
 */
@Ignore
public class ContentPollsApiTest {

    private final ContentPollsApi api = new ContentPollsApi();

    
    /**
     * Add your vote to a poll
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void answerPollTest() throws ApiException {
        String id = null;
        String answerKey = null;
        PollResponseResource response = api.answerPoll(id, answerKey);

        // TODO: test validations
    }
    
    /**
     * Create a new poll
     *
     * Polls are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPollTest() throws ApiException {
        PollResource pollResource = null;
        PollResource response = api.createPoll(pollResource);

        // TODO: test validations
    }
    
    /**
     * Create a poll template
     *
     * Poll templates define a type of poll and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPollTemplateTest() throws ApiException {
        TemplateResource pollTemplateResource = null;
        TemplateResource response = api.createPollTemplate(pollTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete an existing poll
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePollTest() throws ApiException {
        String id = null;
        api.deletePoll(id);

        // TODO: test validations
    }
    
    /**
     * Delete a poll template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePollTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deletePollTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single poll
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPollTest() throws ApiException {
        String id = null;
        PollResource response = api.getPoll(id);

        // TODO: test validations
    }
    
    /**
     * Get poll answer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPollAnswerTest() throws ApiException {
        String id = null;
        PollResponseResource response = api.getPollAnswer(id);

        // TODO: test validations
    }
    
    /**
     * Get a single poll template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPollTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getPollTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search poll templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPollTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getPollTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search polls
     *
     * Get a list of polls with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single poll&#39; to retrieve the full resource with assets for a given item as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPollsTest() throws ApiException {
        String filterCategory = null;
        String filterTagset = null;
        String filterText = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourcePollResource response = api.getPolls(filterCategory, filterTagset, filterText, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update an existing poll
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePollTest() throws ApiException {
        String id = null;
        PollResource pollResource = null;
        PollResource response = api.updatePoll(id, pollResource);

        // TODO: test validations
    }
    
    /**
     * Update a poll template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePollTemplateTest() throws ApiException {
        String id = null;
        TemplateResource pollTemplateResource = null;
        TemplateResource response = api.updatePollTemplate(id, pollTemplateResource);

        // TODO: test validations
    }
    
}
