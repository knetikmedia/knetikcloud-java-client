/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
import io.swagger.client.model.ActivityEntitlementResource;
import io.swagger.client.model.AvailableSettingResource;
import io.swagger.client.model.RewardSetResource;
import java.util.ArrayList;
import java.util.List;

/**
 * ActivityResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:20:18.274-05:00")
public class ActivityResource {
  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("entitlements")
  private List<ActivityEntitlementResource> entitlements = new ArrayList<ActivityEntitlementResource>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("launch")
  private String launch = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("reward_set")
  private RewardSetResource rewardSet = null;

  @SerializedName("settings")
  private List<AvailableSettingResource> settings = new ArrayList<AvailableSettingResource>();

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("template")
  private Boolean template = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ActivityResource entitlements(List<ActivityEntitlementResource> entitlements) {
    this.entitlements = entitlements;
    return this;
  }

  public ActivityResource addEntitlementsItem(ActivityEntitlementResource entitlementsItem) {
    this.entitlements.add(entitlementsItem);
    return this;
  }

   /**
   * The list of items that can be used for entitlement (wager amounts/etc)
   * @return entitlements
  **/
  @ApiModelProperty(example = "null", value = "The list of items that can be used for entitlement (wager amounts/etc)")
  public List<ActivityEntitlementResource> getEntitlements() {
    return entitlements;
  }

  public void setEntitlements(List<ActivityEntitlementResource> entitlements) {
    this.entitlements = entitlements;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public ActivityResource launch(String launch) {
    this.launch = launch;
    return this;
  }

   /**
   * Details about how to launch the activity
   * @return launch
  **/
  @ApiModelProperty(example = "null", value = "Details about how to launch the activity")
  public String getLaunch() {
    return launch;
  }

  public void setLaunch(String launch) {
    this.launch = launch;
  }

  public ActivityResource longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public ActivityResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The user friendly name of that resource
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user friendly name of that resource")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ActivityResource rewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
    return this;
  }

   /**
   * The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing
   * @return rewardSet
  **/
  @ApiModelProperty(example = "null", value = "The rewards to give at the end of each occurence of the activity. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }

  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

  public ActivityResource settings(List<AvailableSettingResource> settings) {
    this.settings = settings;
    return this;
  }

  public ActivityResource addSettingsItem(AvailableSettingResource settingsItem) {
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The list of settings and their options available for this activity. Not populated when getting listing
   * @return settings
  **/
  @ApiModelProperty(example = "null", value = "The list of settings and their options available for this activity. Not populated when getting listing")
  public List<AvailableSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<AvailableSettingResource> settings) {
    this.settings = settings;
  }

  public ActivityResource shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The user friendly name of that resource. Defaults to blank string
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "The user friendly name of that resource. Defaults to blank string")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ActivityResource template(Boolean template) {
    this.template = template;
    return this;
  }

   /**
   * Whether this activity is a template for other activities. Default: false
   * @return template
  **/
  @ApiModelProperty(example = "false", value = "Whether this activity is a template for other activities. Default: false")
  public Boolean getTemplate() {
    return template;
  }

  public void setTemplate(Boolean template) {
    this.template = template;
  }

  public ActivityResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the activity
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the activity")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ActivityResource uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key (for static reference in code) of the activity
   * @return uniqueKey
  **/
  @ApiModelProperty(example = "null", value = "The unique key (for static reference in code) of the activity")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was last updated in seconds since unix epoch")
  public Long getUpdatedDate() {
    return updatedDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityResource activityResource = (ActivityResource) o;
    return Objects.equals(this.createdDate, activityResource.createdDate) &&
        Objects.equals(this.entitlements, activityResource.entitlements) &&
        Objects.equals(this.id, activityResource.id) &&
        Objects.equals(this.launch, activityResource.launch) &&
        Objects.equals(this.longDescription, activityResource.longDescription) &&
        Objects.equals(this.name, activityResource.name) &&
        Objects.equals(this.rewardSet, activityResource.rewardSet) &&
        Objects.equals(this.settings, activityResource.settings) &&
        Objects.equals(this.shortDescription, activityResource.shortDescription) &&
        Objects.equals(this.template, activityResource.template) &&
        Objects.equals(this.type, activityResource.type) &&
        Objects.equals(this.uniqueKey, activityResource.uniqueKey) &&
        Objects.equals(this.updatedDate, activityResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, entitlements, id, launch, longDescription, name, rewardSet, settings, shortDescription, template, type, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityResource {\n");
    
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    launch: ").append(toIndentedString(launch)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

