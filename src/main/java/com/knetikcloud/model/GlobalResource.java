/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GlobalResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T11:06:44.887-04:00")
public class GlobalResource {
  @JsonProperty("global_def_id")
  private String globalDefId = null;

  @JsonProperty("scopes")
  private Map<String, ExpressionResource> scopes = null;

  @JsonProperty("type")
  private String type = null;

  public GlobalResource globalDefId(String globalDefId) {
    this.globalDefId = globalDefId;
    return this;
  }

   /**
   * Get globalDefId
   * @return globalDefId
  **/
  @ApiModelProperty(value = "")
  public String getGlobalDefId() {
    return globalDefId;
  }

  public void setGlobalDefId(String globalDefId) {
    this.globalDefId = globalDefId;
  }

  public GlobalResource scopes(Map<String, ExpressionResource> scopes) {
    this.scopes = scopes;
    return this;
  }

  public GlobalResource putScopesItem(String key, ExpressionResource scopesItem) {
    if (this.scopes == null) {
      this.scopes = new HashMap<String, ExpressionResource>();
    }
    this.scopes.put(key, scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public Map<String, ExpressionResource> getScopes() {
    return scopes;
  }

  public void setScopes(Map<String, ExpressionResource> scopes) {
    this.scopes = scopes;
  }

  public GlobalResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalResource globalResource = (GlobalResource) o;
    return Objects.equals(this.globalDefId, globalResource.globalDefId) &&
        Objects.equals(this.scopes, globalResource.scopes) &&
        Objects.equals(this.type, globalResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalDefId, scopes, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalResource {\n");
    
    sb.append("    globalDefId: ").append(toIndentedString(globalDefId)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

