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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CommentSearch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:45:55.188-05:00")
public class CommentSearch {
  @SerializedName("content")
  private String content = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("context_id")
  private Integer contextId = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("owner_username")
  private String ownerUsername = null;

  public CommentSearch content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public CommentSearch context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public CommentSearch contextId(Integer contextId) {
    this.contextId = contextId;
    return this;
  }

   /**
   * Get contextId
   * @return contextId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContextId() {
    return contextId;
  }

  public void setContextId(Integer contextId) {
    this.contextId = contextId;
  }

  public CommentSearch id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CommentSearch ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public CommentSearch ownerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

   /**
   * Get ownerUsername
   * @return ownerUsername
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOwnerUsername() {
    return ownerUsername;
  }

  public void setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentSearch commentSearch = (CommentSearch) o;
    return Objects.equals(this.content, commentSearch.content) &&
        Objects.equals(this.context, commentSearch.context) &&
        Objects.equals(this.contextId, commentSearch.contextId) &&
        Objects.equals(this.id, commentSearch.id) &&
        Objects.equals(this.ownerId, commentSearch.ownerId) &&
        Objects.equals(this.ownerUsername, commentSearch.ownerUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, context, contextId, id, ownerId, ownerUsername);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentSearch {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerUsername: ").append(toIndentedString(ownerUsername)).append("\n");
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

