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
import io.swagger.client.model.PageAggregateInvoiceReportResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingOrdersApi
 */
@Ignore
public class ReportingOrdersApiTest {

    private final ReportingOrdersApi api = new ReportingOrdersApi();

    
    /**
     * Retrieve invoice counts aggregated by time ranges
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDailyInvoicesUsingGETTest() throws ApiException {
        String currencyCode = null;
        String granularity = null;
        String filterPaymentStatus = null;
        String filterFulfillmentStatus = null;
        Long startDate = null;
        Long endDate = null;
        PageAggregateInvoiceReportResource response = api.getDailyInvoicesUsingGET(currencyCode, granularity, filterPaymentStatus, filterFulfillmentStatus, startDate, endDate);

        // TODO: test validations
    }
    
}