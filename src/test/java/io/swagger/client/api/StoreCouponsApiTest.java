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
import io.swagger.client.model.CouponItem;
import io.swagger.client.model.ItemTemplateResource;
import io.swagger.client.model.PageResourceItemTemplateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreCouponsApi
 */
@Ignore
public class StoreCouponsApiTest {

    private final StoreCouponsApi api = new StoreCouponsApi();

    
    /**
     * Create a coupon item
     *
     * SKUs have to be unique in the entire store.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponItemTest() throws ApiException {
        CouponItem couponItem = null;
        CouponItem response = api.createCouponItem(couponItem);

        // TODO: test validations
    }
    
    /**
     * Create a coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCouponTemplateTest() throws ApiException {
        ItemTemplateResource couponTemplateResource = null;
        ItemTemplateResource response = api.createCouponTemplate(couponTemplateResource);

        // TODO: test validations
    }
    
    /**
     * Delete a coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponItemTest() throws ApiException {
        Integer id = null;
        api.deleteCouponItem(id);

        // TODO: test validations
    }
    
    /**
     * Delete a coupon template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCouponTemplateTest() throws ApiException {
        String id = null;
        String cascade = null;
        api.deleteCouponTemplate(id, cascade);

        // TODO: test validations
    }
    
    /**
     * Get a single coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponItemTest() throws ApiException {
        Integer id = null;
        CouponItem response = api.getCouponItem(id);

        // TODO: test validations
    }
    
    /**
     * Get a single coupon template
     *
     * Coupon Templates define a type of coupon and the properties they have.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponTemplateTest() throws ApiException {
        String id = null;
        ItemTemplateResource response = api.getCouponTemplate(id);

        // TODO: test validations
    }
    
    /**
     * List and search coupon templates
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCouponTemplatesTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceItemTemplateResource response = api.getCouponTemplates(size, page, order);

        // TODO: test validations
    }
    
    /**
     * Update a coupon item
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCouponItemTest() throws ApiException {
        Integer id = null;
        CouponItem couponItem = null;
        api.updateCouponItem(id, couponItem);

        // TODO: test validations
    }
    
    /**
     * Update a coupon template
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCouponTemplateTest() throws ApiException {
        String id = null;
        ItemTemplateResource couponTemplateResource = null;
        api.updateCouponTemplate(id, couponTemplateResource);

        // TODO: test validations
    }
    
}
