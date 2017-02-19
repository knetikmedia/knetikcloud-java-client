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
 * RewardCurrencyResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:24:50.691-05:00")
public class RewardCurrencyResource {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("currency_name")
  private String currencyName = null;

  @SerializedName("max_rank")
  private Integer maxRank = null;

  @SerializedName("min_rank")
  private Integer minRank = null;

  @SerializedName("percent")
  private Boolean percent = null;

  @SerializedName("value")
  private Double value = null;

  public RewardCurrencyResource currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The code of the currency type to give
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The code of the currency type to give")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

   /**
   * The name of the currency reward to give.  Set by currency_code)
   * @return currencyName
  **/
  @ApiModelProperty(example = "null", value = "The name of the currency reward to give.  Set by currency_code)")
  public String getCurrencyName() {
    return currencyName;
  }

  public RewardCurrencyResource maxRank(Integer maxRank) {
    this.maxRank = maxRank;
    return this;
  }

   /**
   * The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank
   * @return maxRank
  **/
  @ApiModelProperty(example = "null", required = true, value = "The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank")
  public Integer getMaxRank() {
    return maxRank;
  }

  public void setMaxRank(Integer maxRank) {
    this.maxRank = maxRank;
  }

  public RewardCurrencyResource minRank(Integer minRank) {
    this.minRank = minRank;
    return this;
  }

   /**
   * The lowest number (best) rank to give the reward to. Must be greater than zero
   * @return minRank
  **/
  @ApiModelProperty(example = "null", required = true, value = "The lowest number (best) rank to give the reward to. Must be greater than zero")
  public Integer getMinRank() {
    return minRank;
  }

  public void setMinRank(Integer minRank) {
    this.minRank = minRank;
  }

  public RewardCurrencyResource percent(Boolean percent) {
    this.percent = percent;
    return this;
  }

   /**
   * True if the value is actually a percentage of the intake
   * @return percent
  **/
  @ApiModelProperty(example = "false", required = true, value = "True if the value is actually a percentage of the intake")
  public Boolean getPercent() {
    return percent;
  }

  public void setPercent(Boolean percent) {
    this.percent = percent;
  }

  public RewardCurrencyResource value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The amount of currency to give. For percentage values, 0.5 is 50%
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount of currency to give. For percentage values, 0.5 is 50%")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewardCurrencyResource rewardCurrencyResource = (RewardCurrencyResource) o;
    return Objects.equals(this.currencyCode, rewardCurrencyResource.currencyCode) &&
        Objects.equals(this.currencyName, rewardCurrencyResource.currencyName) &&
        Objects.equals(this.maxRank, rewardCurrencyResource.maxRank) &&
        Objects.equals(this.minRank, rewardCurrencyResource.minRank) &&
        Objects.equals(this.percent, rewardCurrencyResource.percent) &&
        Objects.equals(this.value, rewardCurrencyResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, currencyName, maxRank, minRank, percent, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewardCurrencyResource {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currencyName: ").append(toIndentedString(currencyName)).append("\n");
    sb.append("    maxRank: ").append(toIndentedString(maxRank)).append("\n");
    sb.append("    minRank: ").append(toIndentedString(minRank)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

