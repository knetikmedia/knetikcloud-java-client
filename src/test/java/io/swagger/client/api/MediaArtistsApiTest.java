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
import io.swagger.client.model.ArtistResource;
import io.swagger.client.model.PageArtistResource;
import io.swagger.client.model.PageTemplateResource;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MediaArtistsApi
 */
@Ignore
public class MediaArtistsApiTest {

    private final MediaArtistsApi api = new MediaArtistsApi();

    
    /**
     * Adds a new artist in the system
     *
     * Adds a new artist in the system. Use specific media contributions endpoint to add contributions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addArtistUsingPOSTTest() throws ApiException {
        ArtistResource artistResource = null;
        ArtistResource response = api.addArtistUsingPOST(artistResource);

        // TODO: test validations
    }
    
    /**
     * Create an artist template
     *
     * Artist Templates define a type of artist and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createArtistTemplateUsingPOSTTest() throws ApiException {
        TemplateResource artistTemplateResource = null;
        TemplateResource response = api.createArtistTemplateUsingPOST(artistTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete an artist template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArtistTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteArtistTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Removes an artist from the system IF no resources are attached to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArtistUsingDELETETest() throws ApiException {
        Long id = null;
        api.deleteArtistUsingDELETE(id);

        // TODO: test validations
    }
    
    /**
     * Get a single artist template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getArtistTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search artist templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageTemplateResource response = api.getArtistTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Loads a specific artist details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArtistUsingGETTest() throws ApiException {
        Long id = null;
        Integer showContributions = null;
        ArtistResource response = api.getArtistUsingGET(id, showContributions);

        // TODO: test validations
    }
    
    /**
     * Search for artists
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchArtistsUsingGETTest() throws ApiException {
        String filterArtistsByName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageArtistResource response = api.searchArtistsUsingGET(filterArtistsByName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update an artist template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArtistTemplateUsingPUTTest() throws ApiException {
        String id = null;
        TemplateResource artistTemplateResource = null;
        api.updateArtistTemplateUsingPUT(id, artistTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Modifies an artist details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArtistUsingPUTTest() throws ApiException {
        Long id = null;
        ArtistResource artistResource = null;
        api.updateArtistUsingPUT(id, artistResource);

        // TODO: test validations
    }
    
}