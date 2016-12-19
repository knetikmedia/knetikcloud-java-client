/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
import io.swagger.client.model.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AchievementDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:05:42.900-05:00")
public class AchievementDefinitionResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("required_progress")
  private Integer requiredProgress = null;

  @SerializedName("rule_id")
  private String ruleId = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("trigger_event_name")
  private String triggerEventName = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public AchievementDefinitionResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public AchievementDefinitionResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this resource type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

  public AchievementDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the achievement. Must be at least 2 characters in length.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the achievement. Must be at least 2 characters in length.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AchievementDefinitionResource hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Whether the achievement is hidden from the user
   * @return hidden
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the achievement is hidden from the user")
  public Boolean getHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public AchievementDefinitionResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the achievement. Must be at least 6 characters in length. IMMUTABLE
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the achievement. Must be at least 6 characters in length. IMMUTABLE")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AchievementDefinitionResource requiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
    return this;
  }

   /**
   * The required progress for the achievement definition
   * @return requiredProgress
  **/
  @ApiModelProperty(example = "null", required = true, value = "The required progress for the achievement definition")
  public Integer getRequiredProgress() {
    return requiredProgress;
  }

  public void setRequiredProgress(Integer requiredProgress) {
    this.requiredProgress = requiredProgress;
  }

   /**
   * The id of the rule generated for this achievement
   * @return ruleId
  **/
  @ApiModelProperty(example = "null", value = "The id of the rule generated for this achievement")
  public String getRuleId() {
    return ruleId;
  }

  public AchievementDefinitionResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public AchievementDefinitionResource addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags for the achievement definition
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "The tags for the achievement definition")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public AchievementDefinitionResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An achievement template this achievement is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public AchievementDefinitionResource triggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
    return this;
  }

   /**
   * The name of the trigger event associated with this achievement
   * @return triggerEventName
  **/
  @ApiModelProperty(example = "null", value = "The name of the trigger event associated with this achievement")
  public String getTriggerEventName() {
    return triggerEventName;
  }

  public void setTriggerEventName(String triggerEventName) {
    this.triggerEventName = triggerEventName;
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
    AchievementDefinitionResource achievementDefinitionResource = (AchievementDefinitionResource) o;
    return Objects.equals(this.additionalProperties, achievementDefinitionResource.additionalProperties) &&
        Objects.equals(this.createdDate, achievementDefinitionResource.createdDate) &&
        Objects.equals(this.description, achievementDefinitionResource.description) &&
        Objects.equals(this.hidden, achievementDefinitionResource.hidden) &&
        Objects.equals(this.name, achievementDefinitionResource.name) &&
        Objects.equals(this.requiredProgress, achievementDefinitionResource.requiredProgress) &&
        Objects.equals(this.ruleId, achievementDefinitionResource.ruleId) &&
        Objects.equals(this.tags, achievementDefinitionResource.tags) &&
        Objects.equals(this.template, achievementDefinitionResource.template) &&
        Objects.equals(this.triggerEventName, achievementDefinitionResource.triggerEventName) &&
        Objects.equals(this.updatedDate, achievementDefinitionResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, createdDate, description, hidden, name, requiredProgress, ruleId, tags, template, triggerEventName, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AchievementDefinitionResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requiredProgress: ").append(toIndentedString(requiredProgress)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    triggerEventName: ").append(toIndentedString(triggerEventName)).append("\n");
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
