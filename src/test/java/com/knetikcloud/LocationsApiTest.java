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


package com.knetikcloud;

import com.ApiException;
import io.swagger.client.model.CountryResource;
import io.swagger.client.model.CurrencyResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.StateResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
@Ignore
public class LocationsApiTest {

    private final LocationsApi api = new LocationsApi();

    
    /**
     * Get a list of countries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountriesTest() throws ApiException {
        List<CountryResource> response = api.getCountries();

        // TODO: test validations
    }
    
    /**
     * Get the iso3 code of your country
     *
     * Determined by geo ip location
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountryByGeoLocationTest() throws ApiException {
        String response = api.getCountryByGeoLocation();

        // TODO: test validations
    }
    
    /**
     * Get a list of a country&#39;s states
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountryStatesTest() throws ApiException {
        String countryCodeIso3 = null;
        List<StateResource> response = api.getCountryStates(countryCodeIso3);

        // TODO: test validations
    }
    
    /**
     * Get the currency information of your country
     *
     * Determined by geo ip location, currency to country mapping and a fallback setting
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyByGeoLocationTest() throws ApiException {
        CurrencyResource response = api.getCurrencyByGeoLocation();

        // TODO: test validations
    }
    
}
