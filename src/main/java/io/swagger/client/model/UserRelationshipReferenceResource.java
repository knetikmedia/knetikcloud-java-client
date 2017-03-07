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
 * UserRelationshipReferenceResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T18:38:49.191-05:00")
public class UserRelationshipReferenceResource {
  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("relationship_id")
  private Long relationshipId = null;

  @SerializedName("username")
  private String username = null;

  public UserRelationshipReferenceResource avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The url of the user's avatar image
   * @return avatarUrl
  **/
  @ApiModelProperty(example = "null", value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public UserRelationshipReferenceResource context(String context) {
    this.context = context;
    return this;
  }

   /**
   * The context of the relationship
   * @return context
  **/
  @ApiModelProperty(example = "null", value = "The context of the relationship")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public UserRelationshipReferenceResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The public username of the user
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The public username of the user")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserRelationshipReferenceResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the user")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserRelationshipReferenceResource relationshipId(Long relationshipId) {
    this.relationshipId = relationshipId;
    return this;
  }

   /**
   * The id of the relationship
   * @return relationshipId
  **/
  @ApiModelProperty(example = "null", value = "The id of the relationship")
  public Long getRelationshipId() {
    return relationshipId;
  }

  public void setRelationshipId(Long relationshipId) {
    this.relationshipId = relationshipId;
  }

  public UserRelationshipReferenceResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username of the user
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "The username of the user")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRelationshipReferenceResource userRelationshipReferenceResource = (UserRelationshipReferenceResource) o;
    return Objects.equals(this.avatarUrl, userRelationshipReferenceResource.avatarUrl) &&
        Objects.equals(this.context, userRelationshipReferenceResource.context) &&
        Objects.equals(this.displayName, userRelationshipReferenceResource.displayName) &&
        Objects.equals(this.id, userRelationshipReferenceResource.id) &&
        Objects.equals(this.relationshipId, userRelationshipReferenceResource.relationshipId) &&
        Objects.equals(this.username, userRelationshipReferenceResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, context, displayName, id, relationshipId, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRelationshipReferenceResource {\n");
    
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relationshipId: ").append(toIndentedString(relationshipId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

