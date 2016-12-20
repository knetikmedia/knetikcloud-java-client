/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.BreCategoryResource;
import io.swagger.client.model.PageResourceBreCategoryResource;
import io.swagger.client.model.PageResourceTemplateResource;
import io.swagger.client.model.TemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BRERuleEngineCategoriesApi
 */
@Ignore
public class BRERuleEngineCategoriesApiTest {

    private final BRERuleEngineCategoriesApi api = new BRERuleEngineCategoriesApi();

    
    /**
     * Create a BRE category template
     *
     * Templates define a type of BRE category and the properties they have
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTemplateUsingPOST1Test() throws ApiException {
        TemplateResource template = null;
        TemplateResource response = api.createTemplateUsingPOST1(template);

        // TODO: test validations
    }
    
    /**
     * Delete a BRE category template
     *
     * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateUsingDELETETest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteTemplateUsingDELETE(id, cascade);

        // TODO: test validations
    }
    
    /**
     * List categories
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoriesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        PageResourceBreCategoryResource response = api.getCategoriesUsingGET(size, page);

        // TODO: test validations
    }
    
    /**
     * Get a single category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCategoryUsingGETTest() throws ApiException {
        String name = null;
        BreCategoryResource response = api.getCategoryUsingGET(name);

        // TODO: test validations
    }
    
    /**
     * Get a single BRE category template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateUsingGETTest() throws ApiException {
        String id = null;
        TemplateResource response = api.getTemplateUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * List and search BRE category templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplatesUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceTemplateResource response = api.getTemplatesUsingGET(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a category
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCategoryUsingPUTTest() throws ApiException {
        String name = null;
        BreCategoryResource category = null;
        api.updateCategoryUsingPUT(name, category);

        // TODO: test validations
    }
    
    /**
     * Update a BRE category template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTemplateUsingPUT1Test() throws ApiException {
        String id = null;
        TemplateResource template = null;
        api.updateTemplateUsingPUT1(id, template);

        // TODO: test validations
    }
    
}