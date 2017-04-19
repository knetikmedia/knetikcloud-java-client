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


package com.knetikcloud.api;

import com.knetikcloud.client.ApiCallback;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiResponse;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;
import com.knetikcloud.client.ProgressRequestBody;
import com.knetikcloud.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.knetikcloud.model.ActionResource;
import com.knetikcloud.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BRERuleEngineActionsApi {
    private ApiClient apiClient;

    public BRERuleEngineActionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BRERuleEngineActionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getBREActions */
    private com.squareup.okhttp.Call getBREActionsCall(String filterCategory, String filterName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/bre/actions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterCategory != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_category", filterCategory));
        if (filterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getBREActionsValidateBeforeCall(String filterCategory, String filterName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getBREActionsCall(filterCategory, filterName, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of available actions
     * 
     * @param filterCategory Filter for actions that are within a specific category (optional)
     * @param filterName Filter for actions that have names containing the given string (optional)
     * @return List&lt;ActionResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ActionResource> getBREActions(String filterCategory, String filterName) throws ApiException {
        ApiResponse<List<ActionResource>> resp = getBREActionsWithHttpInfo(filterCategory, filterName);
        return resp.getData();
    }

    /**
     * Get a list of available actions
     * 
     * @param filterCategory Filter for actions that are within a specific category (optional)
     * @param filterName Filter for actions that have names containing the given string (optional)
     * @return ApiResponse&lt;List&lt;ActionResource&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ActionResource>> getBREActionsWithHttpInfo(String filterCategory, String filterName) throws ApiException {
        com.squareup.okhttp.Call call = getBREActionsValidateBeforeCall(filterCategory, filterName, null, null);
        Type localVarReturnType = new TypeToken<List<ActionResource>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of available actions (asynchronously)
     * 
     * @param filterCategory Filter for actions that are within a specific category (optional)
     * @param filterName Filter for actions that have names containing the given string (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getBREActionsAsync(String filterCategory, String filterName, final ApiCallback<List<ActionResource>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getBREActionsValidateBeforeCall(filterCategory, filterName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ActionResource>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
