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

import com.knetikcloud.ApiCallback;
import com.knetikcloud.ApiClient;
import com.knetikcloud.ApiException;
import com.knetikcloud.ApiResponse;
import com.knetikcloud.Configuration;
import com.knetikcloud.Pair;
import com.knetikcloud.ProgressRequestBody;
import com.knetikcloud.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.PageResourceAggregateCountResource;
import io.swagger.client.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportingUsersApi {
    private ApiClient apiClient;

    public ReportingUsersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportingUsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getUserRegistrations */
    private com.squareup.okhttp.Call getUserRegistrationsCall(String granularity, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/users/registrations".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (granularity != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date", endDate));

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
    private com.squareup.okhttp.Call getUserRegistrationsValidateBeforeCall(String granularity, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getUserRegistrationsCall(granularity, startDate, endDate, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get user registration info
     * Get user registration counts grouped by time range
     * @param granularity The time duration to aggregate by (optional, default to day)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return PageResourceAggregateCountResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceAggregateCountResource getUserRegistrations(String granularity, Long startDate, Long endDate) throws ApiException {
        ApiResponse<PageResourceAggregateCountResource> resp = getUserRegistrationsWithHttpInfo(granularity, startDate, endDate);
        return resp.getData();
    }

    /**
     * Get user registration info
     * Get user registration counts grouped by time range
     * @param granularity The time duration to aggregate by (optional, default to day)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return ApiResponse&lt;PageResourceAggregateCountResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceAggregateCountResource> getUserRegistrationsWithHttpInfo(String granularity, Long startDate, Long endDate) throws ApiException {
        com.squareup.okhttp.Call call = getUserRegistrationsValidateBeforeCall(granularity, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<PageResourceAggregateCountResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get user registration info (asynchronously)
     * Get user registration counts grouped by time range
     * @param granularity The time duration to aggregate by (optional, default to day)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUserRegistrationsAsync(String granularity, Long startDate, Long endDate, final ApiCallback<PageResourceAggregateCountResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getUserRegistrationsValidateBeforeCall(granularity, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceAggregateCountResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}