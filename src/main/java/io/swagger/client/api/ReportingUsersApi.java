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

import io.swagger.client.model.PageAggregateCountResource;

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

    /* Build call for executiveRevenueItemSalesUsingGET1 */
    private com.squareup.okhttp.Call executiveRevenueItemSalesUsingGET1Call(String granularity, Long startDate, Long endDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
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
     * Get user registration info
     * Get user registration counts grouped by time range
     * @param granularity The time duration to aggregate by (optional, default to day)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return PageAggregateCountResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageAggregateCountResource executiveRevenueItemSalesUsingGET1(String granularity, Long startDate, Long endDate) throws ApiException {
        ApiResponse<PageAggregateCountResource> resp = executiveRevenueItemSalesUsingGET1WithHttpInfo(granularity, startDate, endDate);
        return resp.getData();
    }

    /**
     * Get user registration info
     * Get user registration counts grouped by time range
     * @param granularity The time duration to aggregate by (optional, default to day)
     * @param startDate The start of the time range to aggregate, unix timestamp in seconds. Default is beginning of time (optional)
     * @param endDate The end of the time range to aggregate, unix timestamp in seconds. Default is end of time (optional)
     * @return ApiResponse&lt;PageAggregateCountResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageAggregateCountResource> executiveRevenueItemSalesUsingGET1WithHttpInfo(String granularity, Long startDate, Long endDate) throws ApiException {
        com.squareup.okhttp.Call call = executiveRevenueItemSalesUsingGET1Call(granularity, startDate, endDate, null, null);
        Type localVarReturnType = new TypeToken<PageAggregateCountResource>(){}.getType();
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
    public com.squareup.okhttp.Call executiveRevenueItemSalesUsingGET1Async(String granularity, Long startDate, Long endDate, final ApiCallback<PageAggregateCountResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = executiveRevenueItemSalesUsingGET1Call(granularity, startDate, endDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageAggregateCountResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
