/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CityResource;
import io.swagger.client.model.CountryResource;
import io.swagger.client.model.CurrencyResource;
import io.swagger.client.model.StateResource;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocationsApi
 */
public class LocationsApiTest {

    private final LocationsApi api = new LocationsApi();

    
    /**
     * Get a list of a state&#39;s cities
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void citiesUsingGETTest() throws ApiException {
        String countryCodeIso3 = null;
        String stateCode = null;
        // List<CityResource> response = api.citiesUsingGET(countryCodeIso3, stateCode);

        // TODO: test validations
    }
    
    /**
     * Get a list of countries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countriesUsingGETTest() throws ApiException {
        // List<CountryResource> response = api.countriesUsingGET();

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
    public void getCurrencyByGeoLocationUsingGETTest() throws ApiException {
        // CurrencyResource response = api.getCurrencyByGeoLocationUsingGET();

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
    public void getGeoLocationCountryUsingGETTest() throws ApiException {
        // String response = api.getGeoLocationCountryUsingGET();

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
    public void statesUsingGETTest() throws ApiException {
        String countryCodeIso3 = null;
        // List<StateResource> response = api.statesUsingGET(countryCodeIso3);

        // TODO: test validations
    }
    
}
