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
import io.swagger.client.model.MetricResource;
import io.swagger.client.model.Result;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GamificationMetricsApi
 */
@Ignore
public class GamificationMetricsApiTest {

    private final GamificationMetricsApi api = new GamificationMetricsApi();

    
    /**
     * Add a metric
     *
     * Post a new score/stat for an activity occurrence without ending the occurrence itself
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMetricTest() throws ApiException {
        MetricResource metric = null;
        api.addMetric(metric);

        // TODO: test validations
    }
    
}
