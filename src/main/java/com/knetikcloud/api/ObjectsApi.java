package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.ItemTemplateResource;
import com.knetikcloud.model.ObjectResource;
import com.knetikcloud.model.PageResourceItemTemplateResource;
import com.knetikcloud.model.PageResourceObjectResource;
import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class ObjectsApi {
  private ApiClient apiClient;

  public ObjectsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ObjectsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is to be part of (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @return ObjectResource
   * @throws ApiException if fails to make API call
   */
  public ObjectResource createObjectItem(String templateId, Boolean cascade, ObjectResource objectItem) throws ApiException {
    Object localVarPostBody = objectItem;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling createObjectItem");
    }
    
    // create path and map variables
    String localVarPath = "/objects/{template_id}"
      .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };

    GenericType<ObjectResource> localVarReturnType = new GenericType<ObjectResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create an object template
   * Object templates define a type of entitlement and the properties they have. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param template The entitlement template to be created (optional)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource createObjectTemplate(ItemTemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // create path and map variables
    String localVarPath = "/objects/templates";

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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteObjectItem(String templateId, Integer objectId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling deleteObjectItem");
    }
    
    // verify the required parameter 'objectId' is set
    if (objectId == null) {
      throw new ApiException(400, "Missing the required parameter 'objectId' when calling deleteObjectItem");
    }
    
    // create path and map variables
    String localVarPath = "/objects/{template_id}/{object_id}"
      .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "object_id" + "\\}", apiClient.escapeString(objectId.toString()));

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
   * Delete an entitlement template
   * If cascade &#x3D; &#39;detach&#39;, it will force delete the template even if it&#39;s attached to other objects. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param cascade The value needed to delete used templates (optional)
   * @throws ApiException if fails to make API call
   */
  public void deleteObjectTemplate(String id, String cascade) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteObjectTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/objects/templates/{id}"
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
   * Get a single object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @return ObjectResource
   * @throws ApiException if fails to make API call
   */
  public ObjectResource getObjectItem(String templateId, Integer objectId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getObjectItem");
    }
    
    // verify the required parameter 'objectId' is set
    if (objectId == null) {
      throw new ApiException(400, "Missing the required parameter 'objectId' when calling getObjectItem");
    }
    
    // create path and map variables
    String localVarPath = "/objects/{template_id}/{object_id}"
      .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "object_id" + "\\}", apiClient.escapeString(objectId.toString()));

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

    GenericType<ObjectResource> localVarReturnType = new GenericType<ObjectResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search objects
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; ANY
   * @param templateId The id of the template to get objects for (required)
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceObjectResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceObjectResource getObjectItems(String templateId, Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling getObjectItems");
    }
    
    // create path and map variables
    String localVarPath = "/objects/{template_id}"
      .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()));

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

    GenericType<PageResourceObjectResource> localVarReturnType = new GenericType<PageResourceObjectResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a single entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param id The id of the template (required)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource getObjectTemplate(String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getObjectTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/objects/templates/{id}"
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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List and search entitlement templates
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN or ACHIEVEMENTS_ADMIN
   * @param size The number of objects returned per page (optional, default to 25)
   * @param page The number of the page returned, starting with 1 (optional, default to 1)
   * @param order A comma separated list of sorting requirements in priority order, each entry matching PROPERTY_NAME:[ASC|DESC] (optional, default to id:ASC)
   * @return PageResourceItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public PageResourceItemTemplateResource getObjectTemplates(Integer size, Integer page, String order) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/objects/templates";

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

    GenericType<PageResourceItemTemplateResource> localVarReturnType = new GenericType<PageResourceItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update an object
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; INVENTORY_ADMIN
   * @param templateId The id of the template this object is part of (required)
   * @param objectId The id of the object (required)
   * @param cascade Whether to cascade group changes, such as in the limited gettable behavior. A 400 error will return otherwise if the group is already in use with different values. (optional, default to false)
   * @param objectItem The object item object (optional)
   * @throws ApiException if fails to make API call
   */
  public void updateObjectItem(String templateId, Integer objectId, Boolean cascade, ObjectResource objectItem) throws ApiException {
    Object localVarPostBody = objectItem;
    
    // verify the required parameter 'templateId' is set
    if (templateId == null) {
      throw new ApiException(400, "Missing the required parameter 'templateId' when calling updateObjectItem");
    }
    
    // verify the required parameter 'objectId' is set
    if (objectId == null) {
      throw new ApiException(400, "Missing the required parameter 'objectId' when calling updateObjectItem");
    }
    
    // create path and map variables
    String localVarPath = "/objects/{template_id}/{object_id}"
      .replaceAll("\\{" + "template_id" + "\\}", apiClient.escapeString(templateId.toString()))
      .replaceAll("\\{" + "object_id" + "\\}", apiClient.escapeString(objectId.toString()));

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
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2_client_credentials_grant", "oauth2_password_grant" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Update an entitlement template
   * &lt;b&gt;Permissions Needed:&lt;/b&gt; TEMPLATE_ADMIN
   * @param id The id of the template (required)
   * @param template The updated template (optional)
   * @return ItemTemplateResource
   * @throws ApiException if fails to make API call
   */
  public ItemTemplateResource updateObjectTemplate(String id, ItemTemplateResource template) throws ApiException {
    Object localVarPostBody = template;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateObjectTemplate");
    }
    
    // create path and map variables
    String localVarPath = "/objects/templates/{id}"
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

    GenericType<ItemTemplateResource> localVarReturnType = new GenericType<ItemTemplateResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
