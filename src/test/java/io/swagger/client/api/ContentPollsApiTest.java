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
import io.swagger.client.model.PageResourcePollResource;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.PollResource;
import io.swagger.client.model.PollResponseResource;
import io.swagger.client.model.TemplateResource;
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
    public void answerPollUsingPOSTTest() throws ApiException {
        String id = null;
        String answerKey = null;
        PollResponseResource response = api.answerPollUsingPOST(id, answerKey);

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
    public void createPollTemplateUsingPOSTTest() throws ApiException {
        TemplateResource pollTemplateResource = null;
        TemplateResource response = api.createPollTemplateUsingPOST(pollTemplateResource);

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
    public void createPollUsingPOSTTest() throws ApiException {
        PollResource pollResource = null;
        PollResource response = api.createPollUsingPOST(pollResource);

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
    public void deletePollTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deletePollTemplateUsingDELETE(id, cascade);

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
    public void deletePollUsingDELETETest() throws ApiException {
        String id = null;
        api.deletePollUsingDELETE(id);

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
    public void getPollAnswerUsingGETTest() throws ApiException {
        String id = null;
        PollResponseResource response = api.getPollAnswerUsingGET(id);

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
    public void getPollTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getPollTemplateUsingGET(id);

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
    public void getPollTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getPollTemplatesUsingGET(size, page, order);

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
    public void getPollUsingGETTest() throws ApiException {
        String id = null;
        PollResource response = api.getPollUsingGET(id);

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
    public void getPollsUsingGETTest() throws ApiException {
        String filterCategory = null;
        String filterTagset = null;
        String filterText = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourcePollResource response = api.getPollsUsingGET(filterCategory, filterTagset, filterText, size, page, order);

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
    public void updatePollTemplateUsingPUTTest() throws ApiException {
        String id = null;
        TemplateResource pollTemplateResource = null;
        api.updatePollTemplateUsingPUT(id, pollTemplateResource);

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
    public void updatePollUsingPUTTest() throws ApiException {
        String id = null;
        PollResource pollResource = null;
        api.updatePollUsingPUT(id, pollResource);

        // TODO: test validations
    }
    
}
