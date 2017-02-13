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
import io.swagger.client.model.Property;
import io.swagger.client.model.RewardSetResource;
import io.swagger.client.model.Schedule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChallengeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-13T10:30:34.175-05:00")
public class ChallengeResource {
  @SerializedName("activities")
  private Integer activities = null;

  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("copy_of")
  private Long copyOf = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("leaderboard_strategy")
  private String leaderboardStrategy = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("next_event_date")
  private Long nextEventDate = null;

  @SerializedName("reward_lag_minutes")
  private Integer rewardLagMinutes = null;

  @SerializedName("reward_set")
  private RewardSetResource rewardSet = null;

  @SerializedName("schedule")
  private Schedule schedule = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("start_date")
  private Long startDate = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

   /**
   * The number of activities allowed to this challenge
   * @return activities
  **/
  @ApiModelProperty(example = "null", value = "The number of activities allowed to this challenge")
  public Integer getActivities() {
    return activities;
  }

  public ChallengeResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public ChallengeResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public ChallengeResource campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * The id of the campaign this challenge is a part of. The challenge must be tied to an active campaign before it will spawn events
   * @return campaignId
  **/
  @ApiModelProperty(example = "null", value = "The id of the campaign this challenge is a part of. The challenge must be tied to an active campaign before it will spawn events")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public ChallengeResource copyOf(Long copyOf) {
    this.copyOf = copyOf;
    return this;
  }

   /**
   * The ID of the original challenge it was copied from
   * @return copyOf
  **/
  @ApiModelProperty(example = "null", value = "The ID of the original challenge it was copied from")
  public Long getCopyOf() {
    return copyOf;
  }

  public void setCopyOf(Long copyOf) {
    this.copyOf = copyOf;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ChallengeResource endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of this challenge in seconds since epoch. required if part of a campaign
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The end date of this challenge in seconds since epoch. required if part of a campaign")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

   /**
   * The unique ID for that resource
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for that resource")
  public Long getId() {
    return id;
  }

  public ChallengeResource leaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
    return this;
  }

   /**
   * The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service.
   * @return leaderboardStrategy
  **/
  @ApiModelProperty(example = "null", value = "The strategy for calculating the leaderboard. Defaults to highest score. Value MUST come from the list of available strategies from the Leaderboard Service.")
  public String getLeaderboardStrategy() {
    return leaderboardStrategy;
  }

  public void setLeaderboardStrategy(String leaderboardStrategy) {
    this.leaderboardStrategy = leaderboardStrategy;
  }

  public ChallengeResource longDescription(String longDescription) {
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

  public ChallengeResource name(String name) {
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

   /**
   * The next date this challenge will be occur in seconds since epoch
   * @return nextEventDate
  **/
  @ApiModelProperty(example = "null", value = "The next date this challenge will be occur in seconds since epoch")
  public Long getNextEventDate() {
    return nextEventDate;
  }

  public ChallengeResource rewardLagMinutes(Integer rewardLagMinutes) {
    this.rewardLagMinutes = rewardLagMinutes;
    return this;
  }

   /**
   * The number of minutes minimum to wait at the end of this challenge before running rewards, to allow activities to complete
   * @return rewardLagMinutes
  **/
  @ApiModelProperty(example = "null", value = "The number of minutes minimum to wait at the end of this challenge before running rewards, to allow activities to complete")
  public Integer getRewardLagMinutes() {
    return rewardLagMinutes;
  }

  public void setRewardLagMinutes(Integer rewardLagMinutes) {
    this.rewardLagMinutes = rewardLagMinutes;
  }

  public ChallengeResource rewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
    return this;
  }

   /**
   * The rewards to give at the end of the challenge. When creating/updating only id is used. Reward set must be pre-existing
   * @return rewardSet
  **/
  @ApiModelProperty(example = "null", value = "The rewards to give at the end of the challenge. When creating/updating only id is used. Reward set must be pre-existing")
  public RewardSetResource getRewardSet() {
    return rewardSet;
  }

  public void setRewardSet(RewardSetResource rewardSet) {
    this.rewardSet = rewardSet;
  }

  public ChallengeResource schedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The repeat schedule for the challenge
   * @return schedule
  **/
  @ApiModelProperty(example = "null", value = "The repeat schedule for the challenge")
  public Schedule getSchedule() {
    return schedule;
  }

  public void setSchedule(Schedule schedule) {
    this.schedule = schedule;
  }

  public ChallengeResource shortDescription(String shortDescription) {
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

  public ChallengeResource startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of this challenge in seconds since epoch. required if part of a campaign
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "The start date of this challenge in seconds since epoch. required if part of a campaign")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public ChallengeResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A challenge template this challenge is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "A challenge template this challenge is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
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
    ChallengeResource challengeResource = (ChallengeResource) o;
    return Objects.equals(this.activities, challengeResource.activities) &&
        Objects.equals(this.additionalProperties, challengeResource.additionalProperties) &&
        Objects.equals(this.campaignId, challengeResource.campaignId) &&
        Objects.equals(this.copyOf, challengeResource.copyOf) &&
        Objects.equals(this.createdDate, challengeResource.createdDate) &&
        Objects.equals(this.endDate, challengeResource.endDate) &&
        Objects.equals(this.id, challengeResource.id) &&
        Objects.equals(this.leaderboardStrategy, challengeResource.leaderboardStrategy) &&
        Objects.equals(this.longDescription, challengeResource.longDescription) &&
        Objects.equals(this.name, challengeResource.name) &&
        Objects.equals(this.nextEventDate, challengeResource.nextEventDate) &&
        Objects.equals(this.rewardLagMinutes, challengeResource.rewardLagMinutes) &&
        Objects.equals(this.rewardSet, challengeResource.rewardSet) &&
        Objects.equals(this.schedule, challengeResource.schedule) &&
        Objects.equals(this.shortDescription, challengeResource.shortDescription) &&
        Objects.equals(this.startDate, challengeResource.startDate) &&
        Objects.equals(this.template, challengeResource.template) &&
        Objects.equals(this.updatedDate, challengeResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, additionalProperties, campaignId, copyOf, createdDate, endDate, id, leaderboardStrategy, longDescription, name, nextEventDate, rewardLagMinutes, rewardSet, schedule, shortDescription, startDate, template, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeResource {\n");
    
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    copyOf: ").append(toIndentedString(copyOf)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    leaderboardStrategy: ").append(toIndentedString(leaderboardStrategy)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextEventDate: ").append(toIndentedString(nextEventDate)).append("\n");
    sb.append("    rewardLagMinutes: ").append(toIndentedString(rewardLagMinutes)).append("\n");
    sb.append("    rewardSet: ").append(toIndentedString(rewardSet)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

