package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.PageResourceTopicResource;
import com.knetikcloud.model.PageResourceTopicSubscriberResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TopicSubscriberResource;
import com.knetikcloud.model.ValueWrapperboolean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class MessagingTopicsApi {
  private ApiClient apiClient;

  public MessagingTopicsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MessagingTopicsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Enable or disable messages for a user
   * Useful for opt-out options on a single topic. Consider multiple topics for multiple opt-out options.
   * @param id The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @param disabled disabled (required)
   * @throws ApiException if fails to make API call
   */
  public void disableTopicSubscriber(String id, String userId, ValueWrapperboolean disabled) throws ApiException {
    Object localVarPostBody = disabled;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling disableTopicSubscriber");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling disableTopicSubscriber");
    }
    
    // verify the required parameter 'disabled' is set
    if (disabled == null) {
      throw new ApiException(400, "Missing the required parameter 'disabled' when calling disableTopicSubscriber");
    }
    
    // create path and map variables
    String localVarPath = "/messaging/topics/{id}/subscribers/{user_id}/disabled"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a subscriber to a topic
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN
   * @param id The id of the topic (required)
   * @param userId The id of the subscriber or &#39;me&#39; (required)
   * @return TopicSubscriberResource
   * @throws ApiException if fails to make API call
   */
  public TopicSubscriberResource getTopicSubscriber(String id, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTopicSubscriber");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling getTopicSubscriber");
    }
    
    // create path and map variables
    String localVarPath = "/messaging/topics/{id}/subscribers/{user_id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<TopicSubscriberResource> localVarReturnType = new GenericType<TopicSubscriberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all subscribers to a topic
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN
   * @param id The id of the topic (required)
   * @return PageResourceTopicSubscriberResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTopicSubscriberResource getTopicSubscribers(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getTopicSubscribers");
    }
    
    // create path and map variables
    String localVarPath = "/messaging/topics/{id}/subscribers"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceTopicSubscriberResource> localVarReturnType = new GenericType<PageResourceTopicSubscriberResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all messaging topics for a given user
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TOPICS_ADMIN
   * @param id The id of the user or &#39;me&#39; (required)
   * @return PageResourceTopicResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTopicResource getUserTopics(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getUserTopics");
    }
    
    // create path and map variables
    String localVarPath = "/users/{id}/topics"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceTopicResource> localVarReturnType = new GenericType<PageResourceTopicResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
