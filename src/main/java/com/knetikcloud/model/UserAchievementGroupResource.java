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


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.knetikcloud.model.UserAchievementResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * UserAchievementGroupResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-19T17:16:24.601-04:00")
public class UserAchievementGroupResource {
  @SerializedName("achievements")
  private List<UserAchievementResource> achievements = new ArrayList<UserAchievementResource>();

  @SerializedName("group_name")
  private String groupName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("progress")
  private Integer progress = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public UserAchievementGroupResource achievements(List<UserAchievementResource> achievements) {
    this.achievements = achievements;
    return this;
  }

  public UserAchievementGroupResource addAchievementsItem(UserAchievementResource achievementsItem) {
    this.achievements.add(achievementsItem);
    return this;
  }

   /**
   * The list of achievements associated with the group
   * @return achievements
  **/
  @ApiModelProperty(example = "null", required = true, value = "The list of achievements associated with the group")
  public List<UserAchievementResource> getAchievements() {
    return achievements;
  }

  public void setAchievements(List<UserAchievementResource> achievements) {
    this.achievements = achievements;
  }

  public UserAchievementGroupResource groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * The name of the group.  If used by Leveling, this will represent the level name
   * @return groupName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the group.  If used by Leveling, this will represent the level name")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

   /**
   * The id of the achievement progress
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the achievement progress")
  public String getId() {
    return id;
  }

  public UserAchievementGroupResource progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * The current progress of the user on the group
   * @return progress
  **/
  @ApiModelProperty(example = "null", required = true, value = "The current progress of the user on the group")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public UserAchievementGroupResource userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user whose progress is being tracked
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the user whose progress is being tracked")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAchievementGroupResource userAchievementGroupResource = (UserAchievementGroupResource) o;
    return Objects.equals(this.achievements, userAchievementGroupResource.achievements) &&
        Objects.equals(this.groupName, userAchievementGroupResource.groupName) &&
        Objects.equals(this.id, userAchievementGroupResource.id) &&
        Objects.equals(this.progress, userAchievementGroupResource.progress) &&
        Objects.equals(this.userId, userAchievementGroupResource.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(achievements, groupName, id, progress, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAchievementGroupResource {\n");
    
    sb.append("    achievements: ").append(toIndentedString(achievements)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

