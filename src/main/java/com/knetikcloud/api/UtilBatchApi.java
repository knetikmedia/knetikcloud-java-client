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


import com.knetikcloud.model.Batch;
import com.knetikcloud.model.BatchReturn;
import com.knetikcloud.model.Result;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilBatchApi {
    private ApiClient apiClient;

    public UtilBatchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UtilBatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for sendBatch */
    private com.squareup.okhttp.Call sendBatchCall(Batch batch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = batch;
        
        // create path and map variables
        String localVarPath = "/batch";

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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call sendBatchValidateBeforeCall(Batch batch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = sendBatchCall(batch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Request to run API call given the method, content type, path url, and body of request
     * 
     * @param batch The batch object (optional)
     * @return List&lt;BatchReturn&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<BatchReturn> sendBatch(Batch batch) throws ApiException {
        ApiResponse<List<BatchReturn>> resp = sendBatchWithHttpInfo(batch);
        return resp.getData();
    }

    /**
     * Request to run API call given the method, content type, path url, and body of request
     * 
     * @param batch The batch object (optional)
     * @return ApiResponse&lt;List&lt;BatchReturn&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<BatchReturn>> sendBatchWithHttpInfo(Batch batch) throws ApiException {
        com.squareup.okhttp.Call call = sendBatchValidateBeforeCall(batch, null, null);
        Type localVarReturnType = new TypeToken<List<BatchReturn>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Request to run API call given the method, content type, path url, and body of request (asynchronously)
     * 
     * @param batch The batch object (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call sendBatchAsync(Batch batch, final ApiCallback<List<BatchReturn>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = sendBatchValidateBeforeCall(batch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<BatchReturn>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
