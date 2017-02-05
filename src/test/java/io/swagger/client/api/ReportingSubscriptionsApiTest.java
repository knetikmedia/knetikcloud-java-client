/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.PageResourceBillingReport;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportingSubscriptionsApi
 */
@Ignore
public class ReportingSubscriptionsApiTest {

    private final ReportingSubscriptionsApi api = new ReportingSubscriptionsApi();

    
    /**
     * Get a list of available subscription reports in most recent first order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBillingReportsUsingGETTest() throws ApiException {
        Integer size = null;
        Integer page = null;
        PageResourceBillingReport response = api.listBillingReportsUsingGET(size, page);

        // TODO: test validations
    }
    
}
