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


package com.knetikcloud.api;

import com.knetikcloud.ApiException;
import io.swagger.client.model.ArticleResource;
import io.swagger.client.model.PageResourceArticleResource;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContentArticlesApi
 */
@Ignore
public class ContentArticlesApiTest {

    private final ContentArticlesApi api = new ContentArticlesApi();

    
    /**
     * Create a new article
     *
     * Articles are blobs of text with titles, a category and assets. Formatting and display of the text is in the hands of the front end.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createArticleTest() throws ApiException {
        ArticleResource articleResource = null;
        ArticleResource response = api.createArticle(articleResource);

        // TODO: test validations
    }
    
    /**
     * Create an article template
     *
     * Article Templates define a type of article and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createArticleTemplateTest() throws ApiException {
        TemplateResource articleTemplateResource = null;
        TemplateResource response = api.createArticleTemplate(articleTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete an existing article
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArticleTest() throws ApiException {
        String id = null;
        api.deleteArticle(id);

        // TODO: test validations
    }
    
    /**
     * Delete an article template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteArticleTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteArticleTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single article
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArticleTest() throws ApiException {
        String id = null;
        ArticleResource response = api.getArticle(id);

        // TODO: test validations
    }
    
    /**
     * Get a single article template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArticleTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getArticleTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search article templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArticleTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getArticleTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List and search articles
     *
     * Get a list of articles with optional filtering. Assets will not be filled in on the resources returned. Use &#39;Get a single article&#39; to retrieve the full resource with assets for a given item as needed.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getArticlesTest() throws ApiException {
        String filterCategory = null;
        String filterTagset = null;
        String filterTitle = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceArticleResource response = api.getArticles(filterCategory, filterTagset, filterTitle, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update an existing article
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArticleTest() throws ApiException {
        String id = null;
        ArticleResource articleResource = null;
        ArticleResource response = api.updateArticle(id, articleResource);

        // TODO: test validations
    }
    
    /**
     * Update an article template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateArticleTemplateTest() throws ApiException {
        String id = null;
        TemplateResource articleTemplateResource = null;
        TemplateResource response = api.updateArticleTemplate(id, articleTemplateResource);

        // TODO: test validations
    }
    
}
