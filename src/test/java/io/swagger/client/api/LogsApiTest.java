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
import io.swagger.client.model.BreEventLog;
import io.swagger.client.model.ForwardLog;
import io.swagger.client.model.PageResourceBreEventLog;
import io.swagger.client.model.PageResourceForwardLog;
import io.swagger.client.model.PageResourceUserActionLog;
import io.swagger.client.model.UserActionLog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LogsApi
 */
@Ignore
public class LogsApiTest {

    private final LogsApi api = new LogsApi();

    
    /**
     * Add a new user log entry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserLogUsingPOSTTest() throws ApiException {
        UserActionLog logEntry = null;
        api.addUserLogUsingPOST(logEntry);

        // TODO: test validations
    }
    
    /**
     * Get an existing BRE event log entry by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventLogUsingGETTest() throws ApiException {
        String id = null;
        BreEventLog response = api.getEventLogUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of BRE event log entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventsLogsUsingGETTest() throws ApiException {
        String filterStartDate = null;
        String filterEventName = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceBreEventLog response = api.getEventsLogsUsingGET(filterStartDate, filterEventName, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Get an existing forward log entry by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getForwardLogUsingGETTest() throws ApiException {
        String id = null;
        ForwardLog response = api.getForwardLogUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Returns a list of forward log entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getForwardLogsUsingGETTest() throws ApiException {
        String filterStartDate = null;
        String filterEndDate = null;
        Integer filterStatusCode = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceForwardLog response = api.getForwardLogsUsingGET(filterStartDate, filterEndDate, filterStatusCode, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Returns a user log entry by id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLogsUsingGETTest() throws ApiException {
        String id = null;
        UserActionLog response = api.getUserLogsUsingGET(id);

        // TODO: test validations
    }
    
    /**
     * Returns a page of user logs entries
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLogsUsingGET1Test() throws ApiException {
        Integer filterUser = null;
        String filterActionName = null;
        Integer size = null;
        Integer page = null;
        PageResourceUserActionLog response = api.getUserLogsUsingGET1(filterUser, filterActionName, size, page);

        // TODO: test validations
    }
    
}
