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
import io.swagger.client.model.BundleItem;
import io.swagger.client.model.ItemTemplateResource;
import io.swagger.client.model.PageResourceItemTemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreBundlesApi
 */
@Ignore
public class StoreBundlesApiTest {

    private final StoreBundlesApi api = new StoreBundlesApi();

    
    /**
     * Create a bundle item
     *
     * The SKU for the bundle itself must be unique and there can only be one SKU.  Extra notes for price_override:  The price of all the items (multiplied by the quantity) must equal the price of the bundle.  With individual prices set, items will be processed individually and can be refunded as such.  However, if all prices are set to null, the price of the bundle will be used and will be treated as one item.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBundleItemTest() throws ApiException {
        BundleItem bundleItem = null;
        BundleItem response = api.createBundleItem(bundleItem);

        // TODO: test validations
    }
    
    /**
     * Create a bundle template
     *
     * Bundle Templates define a type of bundle and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBundleTemplateTest() throws ApiException {
        ItemTemplateResource bundleTemplateResource = null;
        ItemTemplateResource response = api.createBundleTemplate(bundleTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a bundle item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBundleItemTest() throws ApiException {
        Integer id = null;
        api.deleteBundleItem(id);

        // TODO: test validations
    }
    
    /**
     * Delete a bundle template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteBundleTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteBundleTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single bundle item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBundleItemTest() throws ApiException {
        Integer id = null;
        BundleItem response = api.getBundleItem(id);

        // TODO: test validations
    }
    
    /**
     * Get a single bundle template
     *
     * Bundle Templates define a type of bundle and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBundleTemplateTest() throws ApiException {
        String id = null;
        ItemTemplateResource response = api.getBundleTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search bundle templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBundleTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceItemTemplateResource response = api.getBundleTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a bundle item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBundleItemTest() throws ApiException {
        Integer id = null;
        BundleItem bundleItem = null;
        api.updateBundleItem(id, bundleItem);

        // TODO: test validations
    }
    
    /**
     * Update a bundle template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBundleTemplateTest() throws ApiException {
        String id = null;
        ItemTemplateResource bundleTemplateResource = null;
        api.updateBundleTemplate(id, bundleTemplateResource);

        // TODO: test validations
    }
    
}
