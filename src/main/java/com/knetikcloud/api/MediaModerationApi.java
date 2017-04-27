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


import com.knetikcloud.model.FlagReportResource;
import com.knetikcloud.model.PageResourceFlagReportResource;
import com.knetikcloud.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaModerationApi {
    private ApiClient apiClient;

    public MediaModerationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MediaModerationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getModerationReport */
    private com.squareup.okhttp.Call getModerationReportCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/moderation/reports/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getModerationReportValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getModerationReport(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getModerationReportCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a flag report
     * 
     * @param id The flag report id (required)
     * @return FlagReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FlagReportResource getModerationReport(Long id) throws ApiException {
        ApiResponse<FlagReportResource> resp = getModerationReportWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a flag report
     * 
     * @param id The flag report id (required)
     * @return ApiResponse&lt;FlagReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FlagReportResource> getModerationReportWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getModerationReportValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<FlagReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a flag report (asynchronously)
     * 
     * @param id The flag report id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModerationReportAsync(Long id, final ApiCallback<FlagReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getModerationReportValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FlagReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getModerationReports */
    private com.squareup.okhttp.Call getModerationReportsCall(Boolean excludeResolved, String filterContext, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/moderation/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (excludeResolved != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "exclude_resolved", excludeResolved));
        if (filterContext != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_context", filterContext));
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

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
    private com.squareup.okhttp.Call getModerationReportsValidateBeforeCall(Boolean excludeResolved, String filterContext, Integer size, Integer page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getModerationReportsCall(excludeResolved, filterContext, size, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Returns a page of flag reports
     * Context can be either a free-form string or a pre-defined context name
     * @param excludeResolved Ignore resolved context (optional, default to true)
     * @param filterContext Filter by moderation context (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return PageResourceFlagReportResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceFlagReportResource getModerationReports(Boolean excludeResolved, String filterContext, Integer size, Integer page) throws ApiException {
        ApiResponse<PageResourceFlagReportResource> resp = getModerationReportsWithHttpInfo(excludeResolved, filterContext, size, page);
        return resp.getData();
    }

    /**
     * Returns a page of flag reports
     * Context can be either a free-form string or a pre-defined context name
     * @param excludeResolved Ignore resolved context (optional, default to true)
     * @param filterContext Filter by moderation context (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @return ApiResponse&lt;PageResourceFlagReportResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceFlagReportResource> getModerationReportsWithHttpInfo(Boolean excludeResolved, String filterContext, Integer size, Integer page) throws ApiException {
        com.squareup.okhttp.Call call = getModerationReportsValidateBeforeCall(excludeResolved, filterContext, size, page, null, null);
        Type localVarReturnType = new TypeToken<PageResourceFlagReportResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a page of flag reports (asynchronously)
     * Context can be either a free-form string or a pre-defined context name
     * @param excludeResolved Ignore resolved context (optional, default to true)
     * @param filterContext Filter by moderation context (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getModerationReportsAsync(Boolean excludeResolved, String filterContext, Integer size, Integer page, final ApiCallback<PageResourceFlagReportResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getModerationReportsValidateBeforeCall(excludeResolved, filterContext, size, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceFlagReportResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateModerationReport */
    private com.squareup.okhttp.Call updateModerationReportCall(Long id, FlagReportResource flagReportResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = flagReportResource;
        
        // create path and map variables
        String localVarPath = "/moderation/reports/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateModerationReportValidateBeforeCall(Long id, FlagReportResource flagReportResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateModerationReport(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateModerationReportCall(id, flagReportResource, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a flag report
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
     * @param id The flag report id (required)
     * @param flagReportResource The new flag report (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateModerationReport(Long id, FlagReportResource flagReportResource) throws ApiException {
        updateModerationReportWithHttpInfo(id, flagReportResource);
    }

    /**
     * Update a flag report
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
     * @param id The flag report id (required)
     * @param flagReportResource The new flag report (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateModerationReportWithHttpInfo(Long id, FlagReportResource flagReportResource) throws ApiException {
        com.squareup.okhttp.Call call = updateModerationReportValidateBeforeCall(id, flagReportResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update a flag report (asynchronously)
     * Lets you set the resolution of a report. Resolution types is {banned,ignore} in case of &#39;banned&#39; you will need to pass the reason.
     * @param id The flag report id (required)
     * @param flagReportResource The new flag report (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateModerationReportAsync(Long id, FlagReportResource flagReportResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateModerationReportValidateBeforeCall(id, flagReportResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
