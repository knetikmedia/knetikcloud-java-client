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
import com.knetikcloud.model.ActivityEntitlementResource;
import com.knetikcloud.model.ActivityUserResource;
import com.knetikcloud.model.CoreActivityOccurrenceSettings;
import com.knetikcloud.model.SelectedSettingResource;
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * A occurrence of an activity (the actual game for example). Used to track scores, participants, and provide settings
 */
@ApiModel(description = "A occurrence of an activity (the actual game for example). Used to track scores, participants, and provide settings")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class ActivityOccurrenceResource {
  @JsonProperty("activity_id")
  private Long activityId = null;

  @JsonProperty("bans")
  private List<Integer> bans = null;

  @JsonProperty("challenge_activity_id")
  private Long challengeActivityId = null;

  @JsonProperty("core_settings")
  private CoreActivityOccurrenceSettings coreSettings = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("entitlement")
  private ActivityEntitlementResource entitlement = null;

  @JsonProperty("event_id")
  private Long eventId = null;

  @JsonProperty("host")
  private SimpleUserResource host = null;

  @JsonProperty("id")
  private Long id = null;

  /**
   * Indicate if the rewards have been given out already
   */
  public enum RewardStatusEnum {
    PENDING("pending"),
    
    FAILED("failed"),
    
    COMPLETE("complete"),
    
    PARTIAL("partial");

    private String value;

    RewardStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RewardStatusEnum fromValue(String text) {
      for (RewardStatusEnum b : RewardStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("reward_status")
  private RewardStatusEnum rewardStatus = null;

  @JsonProperty("settings")
  private List<SelectedSettingResource> settings = null;

  @JsonProperty("simulated")
  private Boolean simulated = null;

  @JsonProperty("start_date")
  private Long startDate = null;

  /**
   * The current status of the occurrence (default: OPEN)
   */
  public enum StatusEnum {
    SETUP("SETUP"),
    
    OPEN("OPEN"),
    
    LAUNCHING("LAUNCHING"),
    
    PLAYING("PLAYING"),
    
    FINISHED("FINISHED"),
    
    ABANDONED("ABANDONED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  @JsonProperty("users")
  private List<ActivityUserResource> users = null;

  public ActivityOccurrenceResource activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity
   * @return activityId
  **/
  @ApiModelProperty(required = true, value = "The id of the activity")
  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public ActivityOccurrenceResource bans(List<Integer> bans) {
    this.bans = bans;
    return this;
  }

  public ActivityOccurrenceResource addBansItem(Integer bansItem) {
    if (this.bans == null) {
      this.bans = new ArrayList<Integer>();
    }
    this.bans.add(bansItem);
    return this;
  }

   /**
   * The ids of banned users that cannot join the occurrence. See occurrence-user delete endpoint
   * @return bans
  **/
  @ApiModelProperty(value = "The ids of banned users that cannot join the occurrence. See occurrence-user delete endpoint")
  public List<Integer> getBans() {
    return bans;
  }

  public void setBans(List<Integer> bans) {
    this.bans = bans;
  }

  public ActivityOccurrenceResource challengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
    return this;
  }

   /**
   * The id of the challenge activity (as part of the event, required if eventId set)
   * @return challengeActivityId
  **/
  @ApiModelProperty(value = "The id of the challenge activity (as part of the event, required if eventId set)")
  public Long getChallengeActivityId() {
    return challengeActivityId;
  }

  public void setChallengeActivityId(Long challengeActivityId) {
    this.challengeActivityId = challengeActivityId;
  }

  public ActivityOccurrenceResource coreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
    return this;
  }

   /**
   * Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity.
   * @return coreSettings
  **/
  @ApiModelProperty(value = "Defines core settings about the activity occurrence that affect how it behaves in the system. Validated against core settings in activity/challenge-activity.")
  public CoreActivityOccurrenceSettings getCoreSettings() {
    return coreSettings;
  }

  public void setCoreSettings(CoreActivityOccurrenceSettings coreSettings) {
    this.coreSettings = coreSettings;
  }

   /**
   * The date this occurrence was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date this occurrence was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public ActivityOccurrenceResource entitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
    return this;
  }

   /**
   * The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity
   * @return entitlement
  **/
  @ApiModelProperty(value = "The entitlement item required to enter the occurrence. Required if not part of an event. Must come from the set of entitlement items listed in the activity")
  public ActivityEntitlementResource getEntitlement() {
    return entitlement;
  }

  public void setEntitlement(ActivityEntitlementResource entitlement) {
    this.entitlement = entitlement;
  }

  public ActivityOccurrenceResource eventId(Long eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The id of the event
   * @return eventId
  **/
  @ApiModelProperty(value = "The id of the event")
  public Long getEventId() {
    return eventId;
  }

  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }

  public ActivityOccurrenceResource host(SimpleUserResource host) {
    this.host = host;
    return this;
  }

   /**
   * The host of the occurrence, if not a participant (will be left out of users array). Must be the caller that creates the occurrence unless admin. Requires activity/challenge to allow host_option of &#39;non_player&#39; if not admin as well
   * @return host
  **/
  @ApiModelProperty(value = "The host of the occurrence, if not a participant (will be left out of users array). Must be the caller that creates the occurrence unless admin. Requires activity/challenge to allow host_option of 'non_player' if not admin as well")
  public SimpleUserResource getHost() {
    return host;
  }

  public void setHost(SimpleUserResource host) {
    this.host = host;
  }

   /**
   * The id of the activity occurrence
   * @return id
  **/
  @ApiModelProperty(value = "The id of the activity occurrence")
  public Long getId() {
    return id;
  }

   /**
   * Indicate if the rewards have been given out already
   * @return rewardStatus
  **/
  @ApiModelProperty(value = "Indicate if the rewards have been given out already")
  public RewardStatusEnum getRewardStatus() {
    return rewardStatus;
  }

  public ActivityOccurrenceResource settings(List<SelectedSettingResource> settings) {
    this.settings = settings;
    return this;
  }

  public ActivityOccurrenceResource addSettingsItem(SelectedSettingResource settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<SelectedSettingResource>();
    }
    this.settings.add(settingsItem);
    return this;
  }

   /**
   * The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.
   * @return settings
  **/
  @ApiModelProperty(value = "The values selected from the available settings defined for the activity. Ex: difficulty: hard. Can be left out if the activity is played during an event and the settings are already set at the event level. Ex: every monday, difficulty: hard, number of questions: 10, category: sport. Otherwise, the set must exactly match those of the activity.")
  public List<SelectedSettingResource> getSettings() {
    return settings;
  }

  public void setSettings(List<SelectedSettingResource> settings) {
    this.settings = settings;
  }

  public ActivityOccurrenceResource simulated(Boolean simulated) {
    this.simulated = simulated;
    return this;
  }

   /**
   * Whether this occurrence will be ran as a simulation. Simulations will not be rewarded. Useful for bot play or trials
   * @return simulated
  **/
  @ApiModelProperty(example = "false", value = "Whether this occurrence will be ran as a simulation. Simulations will not be rewarded. Useful for bot play or trials")
  public Boolean isSimulated() {
    return simulated;
  }

  public void setSimulated(Boolean simulated) {
    this.simulated = simulated;
  }

   /**
   * The date this occurrence was started, unix timestamp in seconds. null if not yet started
   * @return startDate
  **/
  @ApiModelProperty(value = "The date this occurrence was started, unix timestamp in seconds. null if not yet started")
  public Long getStartDate() {
    return startDate;
  }

  public ActivityOccurrenceResource status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The current status of the occurrence (default: OPEN)
   * @return status
  **/
  @ApiModelProperty(value = "The current status of the occurrence (default: OPEN)")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

   /**
   * The date this occurrence was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date this occurrence was last updated, unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public ActivityOccurrenceResource users(List<ActivityUserResource> users) {
    this.users = users;
    return this;
  }

  public ActivityOccurrenceResource addUsersItem(ActivityUserResource usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<ActivityUserResource>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * The list of users participating in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission
   * @return users
  **/
  @ApiModelProperty(value = "The list of users participating in this occurrence. Can only be set directly with ACTIVITIES_ADMIN permission")
  public List<ActivityUserResource> getUsers() {
    return users;
  }

  public void setUsers(List<ActivityUserResource> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityOccurrenceResource activityOccurrenceResource = (ActivityOccurrenceResource) o;
    return Objects.equals(this.activityId, activityOccurrenceResource.activityId) &&
        Objects.equals(this.bans, activityOccurrenceResource.bans) &&
        Objects.equals(this.challengeActivityId, activityOccurrenceResource.challengeActivityId) &&
        Objects.equals(this.coreSettings, activityOccurrenceResource.coreSettings) &&
        Objects.equals(this.createdDate, activityOccurrenceResource.createdDate) &&
        Objects.equals(this.entitlement, activityOccurrenceResource.entitlement) &&
        Objects.equals(this.eventId, activityOccurrenceResource.eventId) &&
        Objects.equals(this.host, activityOccurrenceResource.host) &&
        Objects.equals(this.id, activityOccurrenceResource.id) &&
        Objects.equals(this.rewardStatus, activityOccurrenceResource.rewardStatus) &&
        Objects.equals(this.settings, activityOccurrenceResource.settings) &&
        Objects.equals(this.simulated, activityOccurrenceResource.simulated) &&
        Objects.equals(this.startDate, activityOccurrenceResource.startDate) &&
        Objects.equals(this.status, activityOccurrenceResource.status) &&
        Objects.equals(this.updatedDate, activityOccurrenceResource.updatedDate) &&
        Objects.equals(this.users, activityOccurrenceResource.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, bans, challengeActivityId, coreSettings, createdDate, entitlement, eventId, host, id, rewardStatus, settings, simulated, startDate, status, updatedDate, users);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityOccurrenceResource {\n");
    
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    bans: ").append(toIndentedString(bans)).append("\n");
    sb.append("    challengeActivityId: ").append(toIndentedString(challengeActivityId)).append("\n");
    sb.append("    coreSettings: ").append(toIndentedString(coreSettings)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    entitlement: ").append(toIndentedString(entitlement)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardStatus: ").append(toIndentedString(rewardStatus)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    simulated: ").append(toIndentedString(simulated)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

