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
 * ChallengeEventResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:31:46.412-05:00")
public class ChallengeEventResource {
  @SerializedName("challenge_id")
  private Long challengeId = null;

  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("id")
  private Long id = null;

  /**
   * Indicate if the rewards have been given out already 
   */
  public enum RewardStatusEnum {
    @SerializedName("pending")
    PENDING("pending"),
    
    @SerializedName("failed")
    FAILED("failed"),
    
    @SerializedName("complete")
    COMPLETE("complete"),
    
    @SerializedName("partial")
    PARTIAL("partial");

    private String value;

    RewardStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("reward_status")
  private RewardStatusEnum rewardStatus = null;

  @SerializedName("start_date")
  private Long startDate = null;

  public ChallengeEventResource challengeId(Long challengeId) {
    this.challengeId = challengeId;
    return this;
  }

   /**
   * The id of the challenge
   * @return challengeId
  **/
  @ApiModelProperty(example = "null", value = "The id of the challenge")
  public Long getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(Long challengeId) {
    this.challengeId = challengeId;
  }

  public ChallengeEventResource endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date in seconds
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The end date in seconds")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public ChallengeEventResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the challenge event
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the challenge event")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

   /**
   * Indicate if the rewards have been given out already 
   * @return rewardStatus
  **/
  @ApiModelProperty(example = "null", value = "Indicate if the rewards have been given out already ")
  public RewardStatusEnum getRewardStatus() {
    return rewardStatus;
  }

  public ChallengeEventResource startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date in seconds
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "The start date in seconds")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeEventResource challengeEventResource = (ChallengeEventResource) o;
    return Objects.equals(this.challengeId, challengeEventResource.challengeId) &&
        Objects.equals(this.endDate, challengeEventResource.endDate) &&
        Objects.equals(this.id, challengeEventResource.id) &&
        Objects.equals(this.rewardStatus, challengeEventResource.rewardStatus) &&
        Objects.equals(this.startDate, challengeEventResource.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeId, endDate, id, rewardStatus, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeEventResource {\n");
    
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rewardStatus: ").append(toIndentedString(rewardStatus)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

