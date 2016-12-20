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


import io.swagger.client.model.PageResourceVendorResource;
import io.swagger.client.model.VendorResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreVendorsApi {
    private ApiClient apiClient;

    public StoreVendorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StoreVendorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createVendorUsingPOST */
    private com.squareup.okhttp.Call createVendorUsingPOSTCall(VendorResource vendor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = vendor;
        
        // create path and map variables
        String localVarPath = "/vendors".replaceAll("\\{format\\}","json");

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createVendorUsingPOSTValidateBeforeCall(VendorResource vendor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = createVendorUsingPOSTCall(vendor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a vendor
     * 
     * @param vendor The vendor (optional)
     * @return VendorResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VendorResource createVendorUsingPOST(VendorResource vendor) throws ApiException {
        ApiResponse<VendorResource> resp = createVendorUsingPOSTWithHttpInfo(vendor);
        return resp.getData();
    }

    /**
     * Create a vendor
     * 
     * @param vendor The vendor (optional)
     * @return ApiResponse&lt;VendorResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VendorResource> createVendorUsingPOSTWithHttpInfo(VendorResource vendor) throws ApiException {
        com.squareup.okhttp.Call call = createVendorUsingPOSTValidateBeforeCall(vendor, null, null);
        Type localVarReturnType = new TypeToken<VendorResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a vendor (asynchronously)
     * 
     * @param vendor The vendor (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createVendorUsingPOSTAsync(VendorResource vendor, final ApiCallback<VendorResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createVendorUsingPOSTValidateBeforeCall(vendor, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VendorResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteVendorUsingDELETE */
    private com.squareup.okhttp.Call deleteVendorUsingDELETECall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendors/{id}".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteVendorUsingDELETEValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteVendorUsingDELETE(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteVendorUsingDELETECall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a vendor
     * 
     * @param id The id of the vendor (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteVendorUsingDELETE(Integer id) throws ApiException {
        deleteVendorUsingDELETEWithHttpInfo(id);
    }

    /**
     * Delete a vendor
     * 
     * @param id The id of the vendor (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteVendorUsingDELETEWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = deleteVendorUsingDELETEValidateBeforeCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a vendor (asynchronously)
     * 
     * @param id The id of the vendor (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteVendorUsingDELETEAsync(Integer id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteVendorUsingDELETEValidateBeforeCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getVendorUsingGET */
    private com.squareup.okhttp.Call getVendorUsingGETCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendors/{id}".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call getVendorUsingGETValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getVendorUsingGET(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getVendorUsingGETCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single vendor
     * 
     * @param id The id of the vendor (required)
     * @return VendorResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public VendorResource getVendorUsingGET(Integer id) throws ApiException {
        ApiResponse<VendorResource> resp = getVendorUsingGETWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get a single vendor
     * 
     * @param id The id of the vendor (required)
     * @return ApiResponse&lt;VendorResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<VendorResource> getVendorUsingGETWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = getVendorUsingGETValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<VendorResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single vendor (asynchronously)
     * 
     * @param id The id of the vendor (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVendorUsingGETAsync(Integer id, final ApiCallback<VendorResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVendorUsingGETValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<VendorResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getVendorsUsingGET */
    private com.squareup.okhttp.Call getVendorsUsingGETCall(String filterName, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/vendors".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
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
    private com.squareup.okhttp.Call getVendorsUsingGETValidateBeforeCall(String filterName, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getVendorsUsingGETCall(filterName, size, page, order, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List and search vendors
     * 
     * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return PageResourceVendorResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceVendorResource getVendorsUsingGET(String filterName, Integer size, Integer page, String order) throws ApiException {
        ApiResponse<PageResourceVendorResource> resp = getVendorsUsingGETWithHttpInfo(filterName, size, page, order);
        return resp.getData();
    }

    /**
     * List and search vendors
     * 
     * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return ApiResponse&lt;PageResourceVendorResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceVendorResource> getVendorsUsingGETWithHttpInfo(String filterName, Integer size, Integer page, String order) throws ApiException {
        com.squareup.okhttp.Call call = getVendorsUsingGETValidateBeforeCall(filterName, size, page, order, null, null);
        Type localVarReturnType = new TypeToken<PageResourceVendorResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List and search vendors (asynchronously)
     * 
     * @param filterName Filters vendors by name starting with the text provided in the filter (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getVendorsUsingGETAsync(String filterName, Integer size, Integer page, String order, final ApiCallback<PageResourceVendorResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getVendorsUsingGETValidateBeforeCall(filterName, size, page, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceVendorResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateVendorUsingPUT */
    private com.squareup.okhttp.Call updateVendorUsingPUTCall(Integer id, VendorResource vendor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = vendor;
        
        // create path and map variables
        String localVarPath = "/vendors/{id}".replaceAll("\\{format\\}","json")
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
    private com.squareup.okhttp.Call updateVendorUsingPUTValidateBeforeCall(Integer id, VendorResource vendor, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateVendorUsingPUT(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateVendorUsingPUTCall(id, vendor, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a vendor
     * 
     * @param id The id of the vendor (required)
     * @param vendor The vendor (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateVendorUsingPUT(Integer id, VendorResource vendor) throws ApiException {
        updateVendorUsingPUTWithHttpInfo(id, vendor);
    }

    /**
     * Update a vendor
     * 
     * @param id The id of the vendor (required)
     * @param vendor The vendor (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateVendorUsingPUTWithHttpInfo(Integer id, VendorResource vendor) throws ApiException {
        com.squareup.okhttp.Call call = updateVendorUsingPUTValidateBeforeCall(id, vendor, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update a vendor (asynchronously)
     * 
     * @param id The id of the vendor (required)
     * @param vendor The vendor (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateVendorUsingPUTAsync(Integer id, VendorResource vendor, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateVendorUsingPUTValidateBeforeCall(id, vendor, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
