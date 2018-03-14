package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ActivityOccurrenceCreationFailure;
import com.knetikcloud.model.ActivityOccurrenceJoinResult;
import com.knetikcloud.model.ActivityOccurrenceResource;
import com.knetikcloud.model.ActivityOccurrenceResults;
import com.knetikcloud.model.ActivityOccurrenceResultsResource;
import com.knetikcloud.model.ActivityOccurrenceSettingsResource;
import com.knetikcloud.model.ActivityOccurrenceStatusWrapper;
import com.knetikcloud.model.ActivityResource;
import com.knetikcloud.model.ActivityUserResource;
import com.knetikcloud.model.ActivityUserStatusWrapper;
import com.knetikcloud.model.CreateActivityOccurrenceRequest;
import com.knetikcloud.model.IntWrapper;
import com.knetikcloud.model.PageResourceActivityOccurrenceResource;
import com.knetikcloud.model.PageResourceBareActivityResource;
import com.knetikcloud.model.PageResourceTemplateResource;
import com.knetikcloud.model.Result;
import com.knetikcloud.model.TemplateResource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class ActivitiesApi {
  private ApiClient apiClient;

  public ActivitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActivitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add a user to an occurrence
   * If called with no body, defaults to the user making the call.
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param test if true, indicates that the user should NOT be added. This can be used to test for eligibility (optional, default to false)
   * @param bypassRestrictions if true, indicates that restrictions such as max player count should be ignored. Can only be used with ACTIVITIES_ADMIN (optional, default to false)
   * @param userId The id of the user, or null for &#39;caller&#39; (optional)
   * @return ActivityOccurrenceResource
   * @throws ApiException if fails to make API call
   */
  public ActivityOccurrenceResource addUser(Long activityOccurrenceId, Boolean test, Boolean bypassRestrictions, IntWrapper userId) throws ApiException {
    Object localVarPostBody = userId;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling addUser");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/users"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "test", test));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_restrictions", bypassRestrictions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<ActivityOccurrenceResource> localVarReturnType = new GenericType<ActivityOccurrenceResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param activityResource The activity resource object (optional)
   * @return ActivityResource
   * @throws ApiException if fails to make API call
   */
  public ActivityResource createActivity(ActivityResource activityResource) throws ApiException {
    Object localVarPostBody = activityResource;
    
    // create path and map variables
    String localVarPath = "/activities";

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

    GenericType<ActivityResource> localVarReturnType = new GenericType<ActivityResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a new activity occurrence. Ex: start a game
   * Has to enforce extra rules if not used as an admin. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param test if true, indicates that the occurrence should NOT be created. This can be used to test for eligibility and valid settings (optional, default to false)
   * @param activityOccurrenceResource The activity occurrence object (optional)
   * @return ActivityOccurrenceResource
   * @throws ApiException if fails to make API call
   */
  public ActivityOccurrenceResource createActivityOccurrence(Boolean test, CreateActivityOccurrenceRequest activityOccurrenceResource) throws ApiException {
    Object localVarPostBody = activityOccurrenceResource;
    
    // create path and map variables
    String localVarPath = "/activity-occurrences";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "test", test));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<ActivityOccurrenceResource> localVarReturnType = new GenericType<ActivityOccurrenceResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a activity template
   * Activity Templates define a type of activity and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param activityTemplateResource The activity template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource createActivityTemplate(TemplateResource activityTemplateResource) throws ApiException {
    Object localVarPostBody = activityTemplateResource;
    
    // create path and map variables
    String localVarPath = "/activities/templates";

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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param id The id of the activity (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteActivity(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActivity");
    }
    
    // create path and map variables
    String localVarPath = "/activities/{id}"
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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Delete a activity template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteActivityTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteActivityTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/activities/templates/{id}"
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cascade", cascade));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * List activity definitions
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param filterTemplate Filter for activities that are templates, or specifically not if false (optional)
   * @param filterName Filter for activities that have a name starting with specified string (optional)
   * @param filterId Filter for activities with an id in the given comma separated list of ids (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceBareActivityResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceBareActivityResource getActivities(Boolean filterTemplate, String filterName, String filterId, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/activities";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_template", filterTemplate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_name", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_id", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceBareActivityResource> localVarReturnType = new GenericType<PageResourceBareActivityResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param id The id of the activity (required)
   * @return ActivityResource
   * @throws ApiException if fails to make API call
   */
  public ActivityResource getActivity(Long id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getActivity");
    }
    
    // create path and map variables
    String localVarPath = "/activities/{id}"
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

    GenericType<ActivityResource> localVarReturnType = new GenericType<ActivityResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Load a single activity occurrence details
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @return ActivityOccurrenceResource
   * @throws ApiException if fails to make API call
   */
  public ActivityOccurrenceResource getActivityOccurrenceDetails(Long activityOccurrenceId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling getActivityOccurrenceDetails");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()));

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

    GenericType<ActivityOccurrenceResource> localVarReturnType = new GenericType<ActivityOccurrenceResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
   * @param id The id of the template (required)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource getActivityTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getActivityTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/activities/templates/{id}"
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

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search activity templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACTIVITIES_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceTemplateResource getActivityTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/activities/templates";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceTemplateResource> localVarReturnType = new GenericType<PageResourceTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List activity occurrences
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param filterActivity Filter for occurrences of the given activity ID (optional)
   * @param filterStatus Filter for occurrences in the given status (optional)
   * @param filterEvent Filter for occurrences played during the given event (optional)
   * @param filterChallenge Filter for occurrences played within the given challenge (optional)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceActivityOccurrenceResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceActivityOccurrenceResource listActivityOccurrences(String filterActivity, String filterStatus, Integer filterEvent, Integer filterChallenge, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/activity-occurrences";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_activity", filterActivity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_status", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_event", filterEvent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter_challenge", filterChallenge));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<PageResourceActivityOccurrenceResource> localVarReturnType = new GenericType<PageResourceActivityOccurrenceResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Remove a user from an occurrence
   * 
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param userId The id of the user, or &#39;me&#39; (required)
   * @param ban if true, indicates that the user should not be allowed to re-join. Can only be set by host or admin (optional, default to false)
   * @param bypassRestrictions if true, indicates that restrictions such as current status should be ignored. Can only be used with ACTIVITIES_ADMIN (optional, default to false)
   * @throws ApiException if fails to make API call
   */
  public void removeUser(Long activityOccurrenceId, String userId, Boolean ban, Boolean bypassRestrictions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling removeUser");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling removeUser");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/users/{user_id}"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()))
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ban", ban));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bypass_restrictions", bypassRestrictions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Sets the status of an activity occurrence to FINISHED and logs metrics
   * In addition to user permissions requirements there is security based on the core_settings.results_trust setting. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param activityOccurrenceResults The activity occurrence object (optional)
   * @return ActivityOccurrenceResults
   * @throws ApiException if fails to make API call
   */
  public ActivityOccurrenceResults setActivityOccurrenceResults(Long activityOccurrenceId, ActivityOccurrenceResultsResource activityOccurrenceResults) throws ApiException {
    Object localVarPostBody = activityOccurrenceResults;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling setActivityOccurrenceResults");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/results"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()));

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

    GenericType<ActivityOccurrenceResults> localVarReturnType = new GenericType<ActivityOccurrenceResults>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sets the settings of an activity occurrence
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param settings The new settings (optional)
   * @return ActivityOccurrenceResource
   * @throws ApiException if fails to make API call
   */
  public ActivityOccurrenceResource setActivityOccurrenceSettings(Long activityOccurrenceId, ActivityOccurrenceSettingsResource settings) throws ApiException {
    Object localVarPostBody = settings;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling setActivityOccurrenceSettings");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/settings"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()));

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

    GenericType<ActivityOccurrenceResource> localVarReturnType = new GenericType<ActivityOccurrenceResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set a user&#39;s status within an occurrence
   * 
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param userId The id of the user (required)
   * @param status The new status (optional)
   * @return ActivityUserResource
   * @throws ApiException if fails to make API call
   */
  public ActivityUserResource setUserStatus(Long activityOccurrenceId, String userId, ActivityUserStatusWrapper status) throws ApiException {
    Object localVarPostBody = status;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling setUserStatus");
    }
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling setUserStatus");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/users/{user_id}/status"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()))
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

    GenericType<ActivityUserResource> localVarReturnType = new GenericType<ActivityUserResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an activity
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_ADMIN
   * @param id The id of the activity (required)
   * @param activityResource The activity resource object (optional)
   * @return ActivityResource
   * @throws ApiException if fails to make API call
   */
  public ActivityResource updateActivity(Long id, ActivityResource activityResource) throws ApiException {
    Object localVarPostBody = activityResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateActivity");
    }
    
    // create path and map variables
    String localVarPath = "/activities/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<ActivityResource> localVarReturnType = new GenericType<ActivityResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update the status of an activity occurrence
   * If setting to &#39;FINISHED&#39; reward will be run based on current metrics that have been recorded already. Alternatively, see results endpoint to finish and record all metrics at once. Can be called by non-host participants if non_host_status_control is true. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; ACTIVITIES_USER and host or ACTIVITIES_ADMIN
   * @param activityOccurrenceId The id of the activity occurrence (required)
   * @param activityOccurrenceStatus The activity occurrence status object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateActivityOccurrenceStatus(Long activityOccurrenceId, ActivityOccurrenceStatusWrapper activityOccurrenceStatus) throws ApiException {
    Object localVarPostBody = activityOccurrenceStatus;
    
    // verify the required parameter 'activityOccurrenceId' is set
    if (activityOccurrenceId == null) {
      throw new ApiException(400, "Missing the required parameter 'activityOccurrenceId' when calling updateActivityOccurrenceStatus");
    }
    
    // create path and map variables
    String localVarPath = "/activity-occurrences/{activity_occurrence_id}/status"
      .replaceAll("\\{" + "activity_occurrence_id" + "\\}", apiClient.escapeString(activityOccurrenceId.toString()));

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
   * Update an activity template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param activityTemplateResource The activity template resource object (optional)
   * @return TemplateResource
   * @throws ApiException if fails to make API call
   */
  public TemplateResource updateActivityTemplate(String id, TemplateResource activityTemplateResource) throws ApiException {
    Object localVarPostBody = activityTemplateResource;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateActivityTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/activities/templates/{id}"
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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<TemplateResource> localVarReturnType = new GenericType<TemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
