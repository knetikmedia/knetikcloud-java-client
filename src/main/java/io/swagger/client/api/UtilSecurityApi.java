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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.PageResourceLocationLogResource;
import io.swagger.client.model.TokenDetailsResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilSecurityApi {
    private ApiClient apiClient;

    public UtilSecurityApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilSecurityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getUserLocationLogUsingGET */
    private com.squareup.okhttp.Call getUserLocationLogUsingGETCall(Integer userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/security/country-log".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (userId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUserLocationLogUsingGETValidateBeforeCall(Integer userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUserLocationLogUsingGETCall(userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns the authentication log for a user
     * A log entry is recorded everytime a user requests a new token. Standard pagination available
     * @param userId The user id (optional)
     * @return PageResourceLocationLogResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceLocationLogResource getUserLocationLogUsingGET(Integer userId) throws ApiException {
        ApiResponse<PageResourceLocationLogResource> resp = getUserLocationLogUsingGETWithHttpInfo(userId);
        return resp.getData();
    }

    /**
     * Returns the authentication log for a user
     * A log entry is recorded everytime a user requests a new token. Standard pagination available
     * @param userId The user id (optional)
     * @return ApiResponse&lt;PageResourceLocationLogResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceLocationLogResource> getUserLocationLogUsingGETWithHttpInfo(Integer userId) throws ApiException {
        com.squareup.okhttp.Call call = getUserLocationLogUsingGETValidateBeforeCall(userId, null, null);
        Type localVarReturnType = new TypeToken<PageResourceLocationLogResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the authentication log for a user (asynchronously)
     * A log entry is recorded everytime a user requests a new token. Standard pagination available
     * @param userId The user id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserLocationLogUsingGETAsync(Integer userId, final ApiCallback<PageResourceLocationLogResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUserLocationLogUsingGETValidateBeforeCall(userId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceLocationLogResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for userUsingGET */
    private com.squareup.okhttp.Call userUsingGETCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/me".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call userUsingGETValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = userUsingGETCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
     * 
     * @return TokenDetailsResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TokenDetailsResource userUsingGET() throws ApiException {
        ApiResponse<TokenDetailsResource> resp = userUsingGETWithHttpInfo();
        return resp.getData();
    }

    /**
     * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info
     * 
     * @return ApiResponse&lt;TokenDetailsResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TokenDetailsResource> userUsingGETWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = userUsingGETValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<TokenDetailsResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the authentication token details. Use /users endpoint for detailed user&#39;s info (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call userUsingGETAsync(final ApiCallback<TokenDetailsResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = userUsingGETValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TokenDetailsResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
