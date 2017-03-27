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


import io.swagger.client.model.PageResourceTransactionResource;
import io.swagger.client.model.RefundRequest;
import io.swagger.client.model.RefundResource;
import io.swagger.client.model.Result;
import io.swagger.client.model.TransactionResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentsTransactionsApi {
    private ApiClient apiClient;

    public PaymentsTransactionsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentsTransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getTransaction */
    private com.squareup.okhttp.Call getTransactionCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transactions/{id}"
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
    private com.squareup.okhttp.Call getTransactionValidateBeforeCall(Integer id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getTransactionCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get the details for a single transaction
     * 
     * @param id id (required)
     * @return TransactionResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TransactionResource getTransaction(Integer id) throws ApiException {
        ApiResponse<TransactionResource> resp = getTransactionWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Get the details for a single transaction
     * 
     * @param id id (required)
     * @return ApiResponse&lt;TransactionResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TransactionResource> getTransactionWithHttpInfo(Integer id) throws ApiException {
        com.squareup.okhttp.Call call = getTransactionValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<TransactionResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the details for a single transaction (asynchronously)
     * 
     * @param id id (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransactionAsync(Integer id, final ApiCallback<TransactionResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTransactionValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TransactionResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTransactions */
    private com.squareup.okhttp.Call getTransactionsCall(Integer filterInvoice, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/transactions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filterInvoice != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_invoice", filterInvoice));
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

        String[] localVarAuthNames = new String[] { "OAuth2" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getTransactionsValidateBeforeCall(Integer filterInvoice, Integer size, Integer page, String order, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getTransactionsCall(filterInvoice, size, page, order, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List and search transactions
     * 
     * @param filterInvoice Filter for transactions from a specific invoice (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return PageResourceTransactionResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageResourceTransactionResource getTransactions(Integer filterInvoice, Integer size, Integer page, String order) throws ApiException {
        ApiResponse<PageResourceTransactionResource> resp = getTransactionsWithHttpInfo(filterInvoice, size, page, order);
        return resp.getData();
    }

    /**
     * List and search transactions
     * 
     * @param filterInvoice Filter for transactions from a specific invoice (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @return ApiResponse&lt;PageResourceTransactionResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageResourceTransactionResource> getTransactionsWithHttpInfo(Integer filterInvoice, Integer size, Integer page, String order) throws ApiException {
        com.squareup.okhttp.Call call = getTransactionsValidateBeforeCall(filterInvoice, size, page, order, null, null);
        Type localVarReturnType = new TypeToken<PageResourceTransactionResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List and search transactions (asynchronously)
     * 
     * @param filterInvoice Filter for transactions from a specific invoice (optional)
     * @param size The number of objects returned per page (optional, default to 25)
     * @param page The number of the page returned, starting with 1 (optional, default to 1)
     * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransactionsAsync(Integer filterInvoice, Integer size, Integer page, String order, final ApiCallback<PageResourceTransactionResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTransactionsValidateBeforeCall(filterInvoice, size, page, order, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageResourceTransactionResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for refundTransaction */
    private com.squareup.okhttp.Call refundTransactionCall(Integer id, RefundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        
        // create path and map variables
        String localVarPath = "/transactions/{id}/refunds"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call refundTransactionValidateBeforeCall(Integer id, RefundRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling refundTransaction(Async)");
        }
        
        
        com.squareup.okhttp.Call call = refundTransactionCall(id, request, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Refund a payment transaction, in full or in part
     * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds.
     * @param id The id of the transaction to refund (required)
     * @param request Request containing refund details (optional)
     * @return RefundResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RefundResource refundTransaction(Integer id, RefundRequest request) throws ApiException {
        ApiResponse<RefundResource> resp = refundTransactionWithHttpInfo(id, request);
        return resp.getData();
    }

    /**
     * Refund a payment transaction, in full or in part
     * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds.
     * @param id The id of the transaction to refund (required)
     * @param request Request containing refund details (optional)
     * @return ApiResponse&lt;RefundResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RefundResource> refundTransactionWithHttpInfo(Integer id, RefundRequest request) throws ApiException {
        com.squareup.okhttp.Call call = refundTransactionValidateBeforeCall(id, request, null, null);
        Type localVarReturnType = new TypeToken<RefundResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Refund a payment transaction, in full or in part (asynchronously)
     * Will not allow for refunding more than the full amount even with multiple partial refunds. Money is refunded to the payment method used to make the original payment. Payment method must support refunds.
     * @param id The id of the transaction to refund (required)
     * @param request Request containing refund details (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call refundTransactionAsync(Integer id, RefundRequest request, final ApiCallback<RefundResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = refundTransactionValidateBeforeCall(id, request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RefundResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
