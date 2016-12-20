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
import io.swagger.client.model.LeaderboardEntryResource;
import java.util.ArrayList;
import java.util.List;

/**
 * LeaderboardResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T17:13:25.977-05:00")
public class LeaderboardResource {
  @SerializedName("entries")
  private List<LeaderboardEntryResource> entries = new ArrayList<LeaderboardEntryResource>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("strategy")
  private String strategy = null;

  public LeaderboardResource entries(List<LeaderboardEntryResource> entries) {
    this.entries = entries;
    return this;
  }

  public LeaderboardResource addEntriesItem(LeaderboardEntryResource entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The paginated list of user results, in order from best to worst
   * @return entries
  **/
  @ApiModelProperty(example = "null", value = "The paginated list of user results, in order from best to worst")
  public List<LeaderboardEntryResource> getEntries() {
    return entries;
  }

  public void setEntries(List<LeaderboardEntryResource> entries) {
    this.entries = entries;
  }

   /**
   * The id of the leaderboard
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the leaderboard")
  public Long getId() {
    return id;
  }

  public LeaderboardResource strategy(String strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * The name of the strategy that defines how entries are stored and compared
   * @return strategy
  **/
  @ApiModelProperty(example = "null", value = "The name of the strategy that defines how entries are stored and compared")
  public String getStrategy() {
    return strategy;
  }

  public void setStrategy(String strategy) {
    this.strategy = strategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeaderboardResource leaderboardResource = (LeaderboardResource) o;
    return Objects.equals(this.entries, leaderboardResource.entries) &&
        Objects.equals(this.id, leaderboardResource.id) &&
        Objects.equals(this.strategy, leaderboardResource.strategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, strategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeaderboardResource {\n");
    
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
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

