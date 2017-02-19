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
import io.swagger.client.model.ActionResource;
import io.swagger.client.model.PredicateOperation;

/**
 * BreRule
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:58:28.257-05:00")
public class BreRule {
  @SerializedName("actions")
  private ActionResource actions = null;

  @SerializedName("condition")
  private PredicateOperation condition = null;

  @SerializedName("condition_text")
  private String conditionText = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("start_date")
  private Long startDate = null;

  @SerializedName("system_rule")
  private Boolean systemRule = null;

  public BreRule actions(ActionResource actions) {
    this.actions = actions;
    return this;
  }

   /**
   * A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1
   * @return actions
  **/
  @ApiModelProperty(example = "null", required = true, value = "A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1")
  public ActionResource getActions() {
    return actions;
  }

  public void setActions(ActionResource actions) {
    this.actions = actions;
  }

  public BreRule condition(PredicateOperation condition) {
    this.condition = condition;
    return this;
  }

   /**
   * A condition expression that must be met in a given event for the rule to run. Empty to always run
   * @return condition
  **/
  @ApiModelProperty(example = "null", value = "A condition expression that must be met in a given event for the rule to run. Empty to always run")
  public PredicateOperation getCondition() {
    return condition;
  }

  public void setCondition(PredicateOperation condition) {
    this.condition = condition;
  }

   /**
   * The condition as a readable string. Filled in by the system from the condition
   * @return conditionText
  **/
  @ApiModelProperty(example = "null", value = "The condition as a readable string. Filled in by the system from the condition")
  public String getConditionText() {
    return conditionText;
  }

  public BreRule description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The human readable description of the rule
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The human readable description of the rule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BreRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the rule is enabled to run (in conjunction with dates). Default true
   * @return enabled
  **/
  @ApiModelProperty(example = "false", value = "Whether the rule is enabled to run (in conjunction with dates). Default true")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BreRule endDate(Long endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The date the rule ceases to take effect, or null if never. Unix timestamp in seconds
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The date the rule ceases to take effect, or null if never. Unix timestamp in seconds")
  public Long getEndDate() {
    return endDate;
  }

  public void setEndDate(Long endDate) {
    this.endDate = endDate;
  }

  public BreRule eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name of the trigger this rule runs for. Affects which parameters are available
   * @return eventName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The event name of the trigger this rule runs for. Affects which parameters are available")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BreRule id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BreRule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The human readable name of the rule
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The human readable name of the rule")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreRule sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public BreRule startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The date the rule begins to take effect, or null if always. Unix timestamp in seconds
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "The date the rule begins to take effect, or null if always. Unix timestamp in seconds")
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

   /**
   * Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled
   * @return systemRule
  **/
  @ApiModelProperty(example = "false", value = "Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled")
  public Boolean getSystemRule() {
    return systemRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreRule breRule = (BreRule) o;
    return Objects.equals(this.actions, breRule.actions) &&
        Objects.equals(this.condition, breRule.condition) &&
        Objects.equals(this.conditionText, breRule.conditionText) &&
        Objects.equals(this.description, breRule.description) &&
        Objects.equals(this.enabled, breRule.enabled) &&
        Objects.equals(this.endDate, breRule.endDate) &&
        Objects.equals(this.eventName, breRule.eventName) &&
        Objects.equals(this.id, breRule.id) &&
        Objects.equals(this.name, breRule.name) &&
        Objects.equals(this.sort, breRule.sort) &&
        Objects.equals(this.startDate, breRule.startDate) &&
        Objects.equals(this.systemRule, breRule.systemRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, condition, conditionText, description, enabled, endDate, eventName, id, name, sort, startDate, systemRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreRule {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    conditionText: ").append(toIndentedString(conditionText)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    systemRule: ").append(toIndentedString(systemRule)).append("\n");
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

