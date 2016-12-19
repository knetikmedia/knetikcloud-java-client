/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: Latest
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
import io.swagger.client.model.Group;
import io.swagger.client.model.User;

/**
 * GroupMember
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:09:14.577-05:00")
public class GroupMember {
  @SerializedName("group")
  private Group group = null;

  @SerializedName("secondary")
  private Boolean secondary = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("moderator")
    MODERATOR("moderator"),
    
    @SerializedName("member")
    MEMBER("member");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("user")
  private User user = null;

  public GroupMember group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(example = "null", value = "")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public GroupMember secondary(Boolean secondary) {
    this.secondary = secondary;
    return this;
  }

   /**
   * Get secondary
   * @return secondary
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSecondary() {
    return secondary;
  }

  public void setSecondary(Boolean secondary) {
    this.secondary = secondary;
  }

  public GroupMember status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GroupMember user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMember groupMember = (GroupMember) o;
    return Objects.equals(this.group, groupMember.group) &&
        Objects.equals(this.secondary, groupMember.secondary) &&
        Objects.equals(this.status, groupMember.status) &&
        Objects.equals(this.user, groupMember.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, secondary, status, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMember {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

