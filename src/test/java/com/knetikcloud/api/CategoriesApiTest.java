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
import com.knetikcloud.model.CategoryResource;
import com.knetikcloud.model.PageResourceCategoryResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.PageResourcestring;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CategoriesApi
 */
@Ignore
public class CategoriesApiTest {

    private final CategoriesApi api = new CategoriesApi();

    
    /**
     * Create a new category
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCategoryTest() throws ApiException {
        CategoryResource category = null;
        CategoryResource response = api.createCategory(category);

        // TODO: test validations
    }
    
    /**
     * Create a category template
     *
     * Templates define a type of category and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCategoryTemplateTest() throws ApiException {
        TemplateResource template = null;
        TemplateResource response = api.createCategoryTemplate(template);

        // TODO: test validations
    }
    
    /**
     * Delete an existing category
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTest() throws ApiException {
        String id = null;
        api.deleteCategory(id);

        // TODO: test validations
    }
    
    /**
     * Delete a category template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCategoryTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteCategoryTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * List and search categories with optional filters
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoriesTest() throws ApiException {
        String filterSearch = null;
        Boolean filterActive = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCategoryResource response = api.getCategories(filterSearch, filterActive, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get a single category
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryTest() throws ApiException {
        String id = null;
        CategoryResource response = api.getCategory(id);

        // TODO: test validations
    }
    
    /**
     * Get a single category template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CATEGORIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryTemplateTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getCategoryTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search category templates
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or CATEGORIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getCategoryTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * List all trivia tags in the system
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        PageResourcestring response = api.getTags(size, page);

        // TODO: test validations
    }
    
    /**
     * Update an existing category
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; CATEGORIES_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTest() throws ApiException {
        String id = null;
        CategoryResource category = null;
        CategoryResource response = api.updateCategory(id, category);

        // TODO: test validations
    }
    
    /**
     * Update a category template
     *
     * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryTemplateTest() throws ApiException {
        String id = null;
        TemplateResource template = null;
        TemplateResource response = api.updateCategoryTemplate(id, template);

        // TODO: test validations
    }
    
}
