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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * BreRuleLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-05T15:45:46.506-04:00")
public class BreRuleLog {
  @SerializedName("ran")
  private Boolean ran = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("rule_end_date")
  private Long ruleEndDate = null;

  @SerializedName("rule_id")
  private String ruleId = null;

  @SerializedName("rule_name")
  private String ruleName = null;

  @SerializedName("rule_start_date")
  private Long ruleStartDate = null;

   /**
   * Whether the rule ran
   * @return ran
  **/
  @ApiModelProperty(example = "false", value = "Whether the rule ran")
  public Boolean getRan() {
    return ran;
  }

   /**
   * The reason for the rule
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "The reason for the rule")
  public String getReason() {
    return reason;
  }

   /**
   * The end date of the rule in seconds
   * @return ruleEndDate
  **/
  @ApiModelProperty(example = "null", value = "The end date of the rule in seconds")
  public Long getRuleEndDate() {
    return ruleEndDate;
  }

   /**
   * The id of the rule
   * @return ruleId
  **/
  @ApiModelProperty(example = "null", value = "The id of the rule")
  public String getRuleId() {
    return ruleId;
  }

   /**
   * The name of the rule
   * @return ruleName
  **/
  @ApiModelProperty(example = "null", value = "The name of the rule")
  public String getRuleName() {
    return ruleName;
  }

   /**
   * The start date of the rule in seconds
   * @return ruleStartDate
  **/
  @ApiModelProperty(example = "null", value = "The start date of the rule in seconds")
  public Long getRuleStartDate() {
    return ruleStartDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreRuleLog breRuleLog = (BreRuleLog) o;
    return Objects.equals(this.ran, breRuleLog.ran) &&
        Objects.equals(this.reason, breRuleLog.reason) &&
        Objects.equals(this.ruleEndDate, breRuleLog.ruleEndDate) &&
        Objects.equals(this.ruleId, breRuleLog.ruleId) &&
        Objects.equals(this.ruleName, breRuleLog.ruleName) &&
        Objects.equals(this.ruleStartDate, breRuleLog.ruleStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ran, reason, ruleEndDate, ruleId, ruleName, ruleStartDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreRuleLog {\n");
    
    sb.append("    ran: ").append(toIndentedString(ran)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    ruleEndDate: ").append(toIndentedString(ruleEndDate)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
    sb.append("    ruleStartDate: ").append(toIndentedString(ruleStartDate)).append("\n");
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
