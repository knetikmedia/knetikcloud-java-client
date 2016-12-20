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
import io.swagger.client.model.PageResourceAggregateCountResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingUsersApi
 */
@Ignore
public class ReportingUsersApiTest {

    private final ReportingUsersApi api = new ReportingUsersApi();

    
    /**
     * Get user registration info
     *
     * Get user registration counts grouped by time range
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executiveRevenueItemSalesUsingGET1Test() throws ApiException {
        String granularity = null;
        Long startDate = null;
        Long endDate = null;
        PageResourceAggregateCountResource response = api.executiveRevenueItemSalesUsingGET1(granularity, startDate, endDate);

        // TODO: test validations
    }
    
}