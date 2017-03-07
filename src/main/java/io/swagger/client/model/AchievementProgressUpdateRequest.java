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
 * AchievementProgressUpdateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T17:31:46.412-05:00")
public class AchievementProgressUpdateRequest {
  @SerializedName("increment_value")
  private Boolean incrementValue = null;

  @SerializedName("progress_value")
  private Integer progressValue = null;

  public AchievementProgressUpdateRequest incrementValue(Boolean incrementValue) {
    this.incrementValue = incrementValue;
    return this;
  }

   /**
   * Whether to add one to the current progress instead of setting it to progress_value. Default: false
   * @return incrementValue
  **/
  @ApiModelProperty(example = "false", value = "Whether to add one to the current progress instead of setting it to progress_value. Default: false")
  public Boolean getIncrementValue() {
    return incrementValue;
  }

  public void setIncrementValue(Boolean incrementValue) {
    this.incrementValue = incrementValue;
  }

  public AchievementProgressUpdateRequest progressValue(Integer progressValue) {
    this.progressValue = progressValue;
    return this;
  }

   /**
   * The amount of progress towards earning the achievement. The max/target depends on the achievement. Required if increment_value is false/missing.
   * @return progressValue
  **/
  @ApiModelProperty(example = "null", value = "The amount of progress towards earning the achievement. The max/target depends on the achievement. Required if increment_value is false/missing.")
  public Integer getProgressValue() {
    return progressValue;
  }

  public void setProgressValue(Integer progressValue) {
    this.progressValue = progressValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AchievementProgressUpdateRequest achievementProgressUpdateRequest = (AchievementProgressUpdateRequest) o;
    return Objects.equals(this.incrementValue, achievementProgressUpdateRequest.incrementValue) &&
        Objects.equals(this.progressValue, achievementProgressUpdateRequest.progressValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incrementValue, progressValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementProgressUpdateRequest {\n");
    
    sb.append("    incrementValue: ").append(toIndentedString(incrementValue)).append("\n");
    sb.append("    progressValue: ").append(toIndentedString(progressValue)).append("\n");
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

