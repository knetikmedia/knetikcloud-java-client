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
import io.swagger.client.model.Cart;
import io.swagger.client.model.CartItemRequest;
import io.swagger.client.model.CartShippableResponse;
import io.swagger.client.model.CartShippingAddressRequest;
import io.swagger.client.model.CouponDefinition;
import io.swagger.client.model.PageResourceCartSummary;
import io.swagger.client.model.Result;
import io.swagger.client.model.SampleCountriesResponse;
import io.swagger.client.model.SkuRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StoreShoppingCartsApi
 */
@Ignore
public class StoreShoppingCartsApiTest {

    private final StoreShoppingCartsApi api = new StoreShoppingCartsApi();

    
    /**
     * Adds a custom discount to the cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCustomDiscountTest() throws ApiException {
        String id = null;
        CouponDefinition customDiscount = null;
        api.addCustomDiscount(id, customDiscount);

        // TODO: test validations
    }
    
    /**
     * Adds a discount coupon to the cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDiscountToCartTest() throws ApiException {
        String id = null;
        SkuRequest skuRequest = null;
        api.addDiscountToCart(id, skuRequest);

        // TODO: test validations
    }
    
    /**
     * Add an item to the cart
     *
     * Currently, carts cannot contain virtual and real currency items at the same time. Furthermore, the API only support a single virtual item at the moment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addItemToCartTest() throws ApiException {
        String id = null;
        CartItemRequest cartItemRequest = null;
        api.addItemToCart(id, cartItemRequest);

        // TODO: test validations
    }
    
    /**
     * Create a cart
     *
     * You don&#39;t have to have a user to create a cart but the API requires authentication to checkout
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCartTest() throws ApiException {
        Integer owner = null;
        String currencyCode = null;
        String response = api.createCart(owner, currencyCode);

        // TODO: test validations
    }
    
    /**
     * Returns the cart with the given GUID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartTest() throws ApiException {
        String id = null;
        Cart response = api.getCart(id);

        // TODO: test validations
    }
    
    /**
     * Get a list of carts
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCartsTest() throws ApiException {
        Integer filterOwnerId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceCartSummary response = api.getCarts(filterOwnerId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Returns whether a cart requires shipping
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippableTest() throws ApiException {
        String id = null;
        CartShippableResponse response = api.getShippable(id);

        // TODO: test validations
    }
    
    /**
     * Get the list of available shipping countries per vendor
     *
     * Since a cart can have multiple vendors with different shipping options, the countries are broken down by vendors. Please see notes about the response object as the fields are variable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getShippingCountriesTest() throws ApiException {
        String id = null;
        SampleCountriesResponse response = api.getShippingCountries(id);

        // TODO: test validations
    }
    
    /**
     * Removes a discount coupon from the cart
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDiscountFromCartTest() throws ApiException {
        String id = null;
        String code = null;
        api.removeDiscountFromCart(id, code);

        // TODO: test validations
    }
    
    /**
     * Sets the currency to use for the cart
     *
     * May be disallowed by site settings.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setCartCurrencyTest() throws ApiException {
        String id = null;
        String currencyCode = null;
        api.setCartCurrency(id, currencyCode);

        // TODO: test validations
    }
    
    /**
     * Sets the owner of a cart if none is set already
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setCartOwnerTest() throws ApiException {
        String id = null;
        Integer userId = null;
        api.setCartOwner(id, userId);

        // TODO: test validations
    }
    
    /**
     * Changes the quantity of an item already in the cart
     *
     * A quantity of zero will remove the item from the cart altogether.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateItemInCartTest() throws ApiException {
        String id = null;
        CartItemRequest cartItemRequest = null;
        api.updateItemInCart(id, cartItemRequest);

        // TODO: test validations
    }
    
    /**
     * Modifies or sets the order shipping address
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateShippingAddressTest() throws ApiException {
        String id = null;
        CartShippingAddressRequest cartShippingAddressRequest = null;
        api.updateShippingAddress(id, cartShippingAddressRequest);

        // TODO: test validations
    }
    
}
