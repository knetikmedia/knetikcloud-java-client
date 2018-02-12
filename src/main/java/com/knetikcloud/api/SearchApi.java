package com.knetikcloud.api;

import com.knetikcloud.client.ApiException;
import com.knetikcloud.client.ApiClient;
import com.knetikcloud.client.Configuration;
import com.knetikcloud.client.Pair;

import javax.ws.rs.core.GenericType;

import com.knetikcloud.model.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-12T10:38:25.443-05:00")
public class SearchApi {
  private ApiClient apiClient;

  public SearchApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Count matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchCountGET(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchCountGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/count/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Count matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchCountPOST(String type, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchCountPOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/count/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Count matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchCountWithTemplateGET(String type, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchCountWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchCountWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/count/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Count matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _count.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchCountWithTemplatePOST(String type, String template, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchCountWithTemplatePOST");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchCountWithTemplatePOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/count/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get document with no template
   * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchDocumentGET(String type, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchDocumentGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchDocumentGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/documents/{type}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get document with a template
   * This is a 1 to 1 mapping of a ElasticSearch call.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchDocumentWithTemplateGET(String type, String id, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchDocumentWithTemplateGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchDocumentWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchDocumentWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/documents/{type}/{template}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Explain matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchExplainGET(String type, String id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchExplainGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchExplainGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/explain/{type}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Explain matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchExplainPOST(String type, String id, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchExplainPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchExplainPOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/explain/{type}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Explain matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchExplainWithTemplateGET(String type, String id, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchExplainWithTemplateGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchExplainWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchExplainWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/explain/{type}/{template}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Explain matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _explain.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-count.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param id The index id (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchExplainWithTemplatePOST(String type, String id, String template, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchExplainWithTemplatePOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling searchExplainWithTemplatePOST");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchExplainWithTemplatePOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/explain/{type}/{template}/{id}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search an index with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchIndex(String type, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchIndex");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search an index with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchIndexGET(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchIndexGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search an index with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchIndexWithTemplateGET(String type, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchIndexWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchIndexWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Search an index with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _search.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchIndexWithTemplatePOST(String type, String template, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchIndexWithTemplatePOST");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchIndexWithTemplatePOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/index/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get indices
   * This is a 1 to 1 mapping of a ElasticSearch call to _cat/indices for indices.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchIndicesGET() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/search/indices";

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get mapping with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchMappingsGET(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchMappingsGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/mappings/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get mapping with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _mapping.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/indices-get-mapping.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchMappingsWithTemplateGET(String type, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchMappingsWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchMappingsWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/mappings/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchValidateGET(String type) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchValidateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/validate/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate matches with no template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchValidatePOST(String type, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchValidatePOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/validate/{type}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchValidateWithTemplateGET(String type, String template) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchValidateWithTemplateGET");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchValidateWithTemplateGET");
    }
    
    // create path and map variables
    String localVarPath = "/search/validate/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Validate matches with a template
   * This is a 1 to 1 mapping of a ElasticSearch call to _validate/query.  Further information can be found at their &lt;a href&#x3D;&#39;https://www.elastic.co/guide/en/elasticsearch/reference/current/search-validate.html&#39;&gt;API guide&lt;/a&gt;. &lt;br&gt;&lt;br&gt;&lt;b&gt;Permissions Needed:&lt;/b&gt; SEARCH_ADMIN
   * @param type The index type (required)
   * @param template The index template (required)
   * @param query The query to be used for the search (optional)
   * @return Object
   * @throws ApiException if fails to make API call
   */
  public Object searchValidateWithTemplatePOST(String type, String template, Object query) throws ApiException {
    Object localVarPostBody = query;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling searchValidateWithTemplatePOST");
    }
    
    // verify the required parameter 'template' is set
    if (template == null) {
      throw new ApiException(400, "Missing the required parameter 'template' when calling searchValidateWithTemplatePOST");
    }
    
    // create path and map variables
    String localVarPath = "/search/validate/{type}/{template}"
      .replaceAll("\\{" + "type" + "\\}", apiClient.escapeString(type.toString()))
      .replaceAll("\\{" + "template" + "\\}", apiClient.escapeString(template.toString()));

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
