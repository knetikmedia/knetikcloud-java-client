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
import io.swagger.client.model.RewardCurrencyResource;
import io.swagger.client.model.RewardItemResource;
import io.swagger.client.model.SimpleUserResource;
import java.util.ArrayList;
import java.util.List;

/**
 * UserActivityResultsResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:45:55.188-05:00")
public class UserActivityResultsResource {
  @SerializedName("currency_rewards")
  private List<RewardCurrencyResource> currencyRewards = new ArrayList<RewardCurrencyResource>();

  @SerializedName("item_rewards")
  private List<RewardItemResource> itemRewards = new ArrayList<RewardItemResource>();

  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("score")
  private Long score = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("ties")
  private Integer ties = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public UserActivityResultsResource currencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
    return this;
  }

  public UserActivityResultsResource addCurrencyRewardsItem(RewardCurrencyResource currencyRewardsItem) {
    this.currencyRewards.add(currencyRewardsItem);
    return this;
  }

   /**
   * Any currency rewarded to this user
   * @return currencyRewards
  **/
  @ApiModelProperty(example = "null", value = "Any currency rewarded to this user")
  public List<RewardCurrencyResource> getCurrencyRewards() {
    return currencyRewards;
  }

  public void setCurrencyRewards(List<RewardCurrencyResource> currencyRewards) {
    this.currencyRewards = currencyRewards;
  }

  public UserActivityResultsResource itemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
    return this;
  }

  public UserActivityResultsResource addItemRewardsItem(RewardItemResource itemRewardsItem) {
    this.itemRewards.add(itemRewardsItem);
    return this;
  }

   /**
   * Any items rewarded to this user
   * @return itemRewards
  **/
  @ApiModelProperty(example = "null", value = "Any items rewarded to this user")
  public List<RewardItemResource> getItemRewards() {
    return itemRewards;
  }

  public void setItemRewards(List<RewardItemResource> itemRewards) {
    this.itemRewards = itemRewards;
  }

  public UserActivityResultsResource rank(Long rank) {
    this.rank = rank;
    return this;
  }

   /**
   * The position of the user in the leaderboard. Null means non-compete or disqualification
   * @return rank
  **/
  @ApiModelProperty(example = "null", value = "The position of the user in the leaderboard. Null means non-compete or disqualification")
  public Long getRank() {
    return rank;
  }

  public void setRank(Long rank) {
    this.rank = rank;
  }

  public UserActivityResultsResource score(Long score) {
    this.score = score;
    return this;
  }

   /**
   * The raw score in this leaderboard. Null means non-compete or disqualification
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "The raw score in this leaderboard. Null means non-compete or disqualification")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public UserActivityResultsResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserActivityResultsResource addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 5 tags and 50 characters each")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

   /**
   * The number of users tied at this rank, including this user. 1 means no tie
   * @return ties
  **/
  @ApiModelProperty(example = "null", value = "The number of users tied at this rank, including this user. 1 means no tie")
  public Integer getTies() {
    return ties;
  }

  public UserActivityResultsResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The player for this entry
   * @return user
  **/
  @ApiModelProperty(example = "null", required = true, value = "The player for this entry")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
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
    UserActivityResultsResource userActivityResultsResource = (UserActivityResultsResource) o;
    return Objects.equals(this.currencyRewards, userActivityResultsResource.currencyRewards) &&
        Objects.equals(this.itemRewards, userActivityResultsResource.itemRewards) &&
        Objects.equals(this.rank, userActivityResultsResource.rank) &&
        Objects.equals(this.score, userActivityResultsResource.score) &&
        Objects.equals(this.tags, userActivityResultsResource.tags) &&
        Objects.equals(this.ties, userActivityResultsResource.ties) &&
        Objects.equals(this.user, userActivityResultsResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyRewards, itemRewards, rank, score, tags, ties, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityResultsResource {\n");
    
    sb.append("    currencyRewards: ").append(toIndentedString(currencyRewards)).append("\n");
    sb.append("    itemRewards: ").append(toIndentedString(itemRewards)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
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

