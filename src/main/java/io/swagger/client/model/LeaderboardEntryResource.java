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
import io.swagger.client.model.SimpleUserResource;

/**
 * LeaderboardEntryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:31:46.412-05:00")
public class LeaderboardEntryResource {
  @SerializedName("rank")
  private Long rank = null;

  @SerializedName("score")
  private Long score = null;

  @SerializedName("user")
  private SimpleUserResource user = null;

  public LeaderboardEntryResource rank(Long rank) {
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

  public LeaderboardEntryResource score(Long score) {
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

  public LeaderboardEntryResource user(SimpleUserResource user) {
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
    LeaderboardEntryResource leaderboardEntryResource = (LeaderboardEntryResource) o;
    return Objects.equals(this.rank, leaderboardEntryResource.rank) &&
        Objects.equals(this.score, leaderboardEntryResource.score) &&
        Objects.equals(this.user, leaderboardEntryResource.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, score, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardEntryResource {\n");
    
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

