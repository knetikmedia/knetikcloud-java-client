/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

import io.swagger.client.model.SavedAddressResource;
import io.swagger.client.model.PageSavedAddressResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersAddressesApi {
    private ApiClient apiClient;

    public UsersAddressesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UsersAddressesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createAddressUsingPOST */
    private com.squareup.okhttp.Call createAddressUsingPOSTCall(String userId, SavedAddressResource savedAddressResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = savedAddressResource;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling createAddressUsingPOST(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
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

    /**
     * Save a new address
     * 
     * @param userId The id of the user (required)
     * @param savedAddressResource The new address (optional)
     * @return SavedAddressResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SavedAddressResource createAddressUsingPOST(String userId, SavedAddressResource savedAddressResource) throws ApiException {
        ApiResponse<SavedAddressResource> resp = createAddressUsingPOSTWithHttpInfo(userId, savedAddressResource);
        return resp.getData();
    }

    /**
     * Save a new address
     * 
     * @param userId The id of the user (required)
     * @param savedAddressResource The new address (optional)
     * @return ApiResponse&lt;SavedAddressResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SavedAddressResource> createAddressUsingPOSTWithHttpInfo(String userId, SavedAddressResource savedAddressResource) throws ApiException {
        com.squareup.okhttp.Call call = createAddressUsingPOSTCall(userId, savedAddressResource, null, null);
        Type localVarReturnType = new TypeToken<SavedAddressResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Save a new address (asynchronously)
     * 
     * @param userId The id of the user (required)
     * @param savedAddressResource The new address (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAddressUsingPOSTAsync(String userId, SavedAddressResource savedAddressResource, final ApiCallback<SavedAddressResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createAddressUsingPOSTCall(userId, savedAddressResource, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SavedAddressResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteAddressUsingDELETE */
    private com.squareup.okhttp.Call deleteAddressUsingDELETECall(String userId, Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteAddressUsingDELETE(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteAddressUsingDELETE(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Delete an address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAddressUsingDELETE(String userId, Integer id) throws ApiException {
        deleteAddressUsingDELETEWithHttpInfo(userId, id);
    }

    /**
     * Delete an address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAddressUsingDELETEWithHttpInfo(String userId, Integer id) throws ApiException {
        com.squareup.okhttp.Call call = deleteAddressUsingDELETECall(userId, id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete an address (asynchronously)
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAddressUsingDELETEAsync(String userId, Integer id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAddressUsingDELETECall(userId, id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getAddressUsingGET */
    private com.squareup.okhttp.Call getAddressUsingGETCall(String userId, Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getAddressUsingGET(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAddressUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
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

    /**
     * Get a single address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @return SavedAddressResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SavedAddressResource getAddressUsingGET(String userId, Integer id) throws ApiException {
        ApiResponse<SavedAddressResource> resp = getAddressUsingGETWithHttpInfo(userId, id);
        return resp.getData();
    }

    /**
     * Get a single address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @return ApiResponse&lt;SavedAddressResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SavedAddressResource> getAddressUsingGETWithHttpInfo(String userId, Integer id) throws ApiException {
        com.squareup.okhttp.Call call = getAddressUsingGETCall(userId, id, null, null);
        Type localVarReturnType = new TypeToken<SavedAddressResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single address (asynchronously)
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressUsingGETAsync(String userId, Integer id, final ApiCallback<SavedAddressResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressUsingGETCall(userId, id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SavedAddressResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAddressesUsingGET */
    private com.squareup.okhttp.Call getAddressesUsingGETCall(String userId, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getAddressesUsingGET(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/users/{user_id}/addresses".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
            "*_/_*"
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

    /**
     * List and search addresses
     * 
     * @param userId The id of the user (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to 1)
     * @return PageSavedAddressResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageSavedAddressResource getAddressesUsingGET(String userId, Integer size, Integer page, String order) throws ApiException {
        ApiResponse<PageSavedAddressResource> resp = getAddressesUsingGETWithHttpInfo(userId, size, page, order);
        return resp.getData();
    }

    /**
     * List and search addresses
     * 
     * @param userId The id of the user (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to 1)
     * @return ApiResponse&lt;PageSavedAddressResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageSavedAddressResource> getAddressesUsingGETWithHttpInfo(String userId, Integer size, Integer page, String order) throws ApiException {
        com.squareup.okhttp.Call call = getAddressesUsingGETCall(userId, size, page, order, null, null);
        Type localVarReturnType = new TypeToken<PageSavedAddressResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List and search addresses (asynchronously)
     * 
     * @param userId The id of the user (required)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order a comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAddressesUsingGETAsync(String userId, Integer size, Integer page, String order, final ApiCallback<PageSavedAddressResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAddressesUsingGETCall(userId, size, page, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageSavedAddressResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateAddressUsingPUT */
    private com.squareup.okhttp.Call updateAddressUsingPUTCall(String userId, Integer id, SavedAddressResource savedAddressResource, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = savedAddressResource;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling updateAddressUsingPUT(Async)");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateAddressUsingPUT(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/users/{user_id}/addresses/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()))
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*_/_*"
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Update an address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @param savedAddressResource The saved address resource object (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateAddressUsingPUT(String userId, Integer id, SavedAddressResource savedAddressResource) throws ApiException {
        updateAddressUsingPUTWithHttpInfo(userId, id, savedAddressResource);
    }

    /**
     * Update an address
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @param savedAddressResource The saved address resource object (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateAddressUsingPUTWithHttpInfo(String userId, Integer id, SavedAddressResource savedAddressResource) throws ApiException {
        com.squareup.okhttp.Call call = updateAddressUsingPUTCall(userId, id, savedAddressResource, null, null);
        return apiClient.execute(call);
    }

    /**
     * Update an address (asynchronously)
     * 
     * @param userId The id of the user (required)
     * @param id The id of the address (required)
     * @param savedAddressResource The saved address resource object (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAddressUsingPUTAsync(String userId, Integer id, SavedAddressResource savedAddressResource, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAddressUsingPUTCall(userId, id, savedAddressResource, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
