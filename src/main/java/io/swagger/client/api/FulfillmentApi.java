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


import io.swagger.client.model.FulfillmentType;
import io.swagger.client.model.PageResourceFulfillmentType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulfillmentApi {
    private ApiClient apiClient;

    public FulfillmentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FulfillmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createFulfillmentTypeUsingPOST */
    private com.squareup.okhttp.Call createFulfillmentTypeUsingPOSTCall(FulfillmentType type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = type;
        
        // create path and map variables
        String localVarPath = "/store/fulfillment/types".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createFulfillmentTypeUsingPOSTValidateBeforeCall(FulfillmentType type, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = createFulfillmentTypeUsingPOSTCall(type, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a fulfillment type
     * 
     * @param type The fulfillment type (optional)
     * @return FulfillmentType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FulfillmentType createFulfillmentTypeUsingPOST(FulfillmentType type) throws ApiException {
        ApiResponse<FulfillmentType> resp = createFulfillmentTypeUsingPOSTWithHttpInfo(type);
        return resp.getData();
    }

    /**
     * Create a fulfillment type
     * 
     * @param type The fulfillment type (optional)
     * @return ApiResponse&lt;FulfillmentType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FulfillmentType> createFulfillmentTypeUsingPOSTWithHttpInfo(FulfillmentType type) throws ApiException {
        com.squareup.okhttp.Call call = createFulfillmentTypeUsingPOSTValidateBeforeCall(type, null, null);
        Type localVarReturnType = new TypeToken<FulfillmentType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a fulfillment type (asynchronously)
     * 
     * @param type The fulfillment type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createFulfillmentTypeUsingPOSTAsync(FulfillmentType type, final ApiCallback<FulfillmentType> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createFulfillmentTypeUsingPOSTValidateBeforeCall(type, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FulfillmentType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteFulfillmentTypeUsingDELETE */
    private com.squareup.okhttp.Call deleteFulfillmentTypeUsingDELETECall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/store/fulfillment/types/{id}".replaceAll("\\{format\\}","json")
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFulfillmentTypeUsingDELETEValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteFulfillmentTypeUsingDELETE(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteFulfillmentTypeUsingDELETECall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a fulfillment type
     * 
     * @param id The id (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFulfillmentTypeUsingDELETE(Integer id) throws ApiException {
        deleteFulfillmentTypeUsingDELETEWithHttpInfo(id);
    }

    /**
     * Delete a fulfillment type
     * 
     * @param id The id (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFulfillmentTypeUsingDELETEWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = deleteFulfillmentTypeUsingDELETEValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a fulfillment type (asynchronously)
     * 
     * @param id The id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFulfillmentTypeUsingDELETEAsync(Integer id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFulfillmentTypeUsingDELETEValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getFulfillmentTypeUsingGET */
    private com.squareup.okhttp.Call getFulfillmentTypeUsingGETCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/store/fulfillment/types/{id}".replaceAll("\\{format\\}","json")
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFulfillmentTypeUsingGETValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFulfillmentTypeUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getFulfillmentTypeUsingGETCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single fulfillment type
     * 
     * @param id The id (required)
     * @return FulfillmentType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FulfillmentType getFulfillmentTypeUsingGET(Integer id) throws ApiException {
        ApiResponse<FulfillmentType> resp = getFulfillmentTypeUsingGETWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a single fulfillment type
     * 
     * @param id The id (required)
     * @return ApiResponse&lt;FulfillmentType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FulfillmentType> getFulfillmentTypeUsingGETWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = getFulfillmentTypeUsingGETValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<FulfillmentType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single fulfillment type (asynchronously)
     * 
     * @param id The id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentTypeUsingGETAsync(Integer id, final ApiCallback<FulfillmentType> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFulfillmentTypeUsingGETValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FulfillmentType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getFulfillmentsUsingGET */
    private com.squareup.okhttp.Call getFulfillmentsUsingGETCall(Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/store/fulfillment/types".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (order != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFulfillmentsUsingGETValidateBeforeCall(Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getFulfillmentsUsingGETCall(size, page, order, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List and search fulfillment types
     * 
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return PageResourceFulfillmentType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceFulfillmentType getFulfillmentsUsingGET(Integer size, Integer page, String order) throws ApiException {
        ApiResponse<PageResourceFulfillmentType> resp = getFulfillmentsUsingGETWithHttpInfo(size, page, order);
        return resp.getData();
    }

    /**
     * List and search fulfillment types
     * 
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return ApiResponse&lt;PageResourceFulfillmentType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceFulfillmentType> getFulfillmentsUsingGETWithHttpInfo(Integer size, Integer page, String order) throws ApiException {
        com.squareup.okhttp.Call call = getFulfillmentsUsingGETValidateBeforeCall(size, page, order, null, null);
        Type localVarReturnType = new TypeToken<PageResourceFulfillmentType>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List and search fulfillment types (asynchronously)
     * 
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFulfillmentsUsingGETAsync(Integer size, Integer page, String order, final ApiCallback<PageResourceFulfillmentType> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFulfillmentsUsingGETValidateBeforeCall(size, page, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceFulfillmentType>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateFulfillmentTypeUsingPUT */
    private com.squareup.okhttp.Call updateFulfillmentTypeUsingPUTCall(Integer id, FulfillmentType fulfillmentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fulfillmentType;
        
        // create path and map variables
        String localVarPath = "/store/fulfillment/types/{id}".replaceAll("\\{format\\}","json")
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

        String[] localVarAuthNames = new String[] { "knetik_oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateFulfillmentTypeUsingPUTValidateBeforeCall(Integer id, FulfillmentType fulfillmentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateFulfillmentTypeUsingPUT(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateFulfillmentTypeUsingPUTCall(id, fulfillmentType, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a fulfillment type
     * 
     * @param id The id (required)
     * @param fulfillmentType The fulfillment type (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateFulfillmentTypeUsingPUT(Integer id, FulfillmentType fulfillmentType) throws ApiException {
        updateFulfillmentTypeUsingPUTWithHttpInfo(id, fulfillmentType);
    }

    /**
     * Update a fulfillment type
     * 
     * @param id The id (required)
     * @param fulfillmentType The fulfillment type (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateFulfillmentTypeUsingPUTWithHttpInfo(Integer id, FulfillmentType fulfillmentType) throws ApiException {
        com.squareup.okhttp.Call call = updateFulfillmentTypeUsingPUTValidateBeforeCall(id, fulfillmentType, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update a fulfillment type (asynchronously)
     * 
     * @param id The id (required)
     * @param fulfillmentType The fulfillment type (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFulfillmentTypeUsingPUTAsync(Integer id, FulfillmentType fulfillmentType, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateFulfillmentTypeUsingPUTValidateBeforeCall(id, fulfillmentType, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
