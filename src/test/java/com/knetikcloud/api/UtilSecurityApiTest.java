/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.model.PageResourceLocationLogResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TokenDetailsResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UtilSecurityApi
 */
@Ignore
public class UtilSecurityApiTest {

    private final UtilSecurityApi api = new UtilSecurityApi();

    
    /**
     * Returns the authentication log for a user
     *
     * A log entry is recorded everytime a user requests a new token. Standard pagination available
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserLocationLogTest() throws ApiException {
        Integer userId = null;
        Integer size = null;
        Integer page = null;
        String order = null;
        PageResourceLocationLogResource response = api.getUserLocationLog(userId, size, page, order);

        // TODO: test validations
    }
    
    /**
     * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTokenDetailsTest() throws ApiException {
        TokenDetailsResource response = api.getUserTokenDetails();

        // TODO: test validations
    }
    
}
