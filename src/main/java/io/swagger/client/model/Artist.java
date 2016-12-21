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
import io.swagger.client.model.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Artist
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:49:29.968-05:00")
public class Artist {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("born")
  private Long born = null;

  @SerializedName("contribution_count")
  private Integer contributionCount = null;

  @SerializedName("created")
  private Long created = null;

  @SerializedName("died")
  private Long died = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("properties_string")
  private String propertiesString = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("template")
  private String template = null;

  @SerializedName("updated")
  private Long updated = null;

  public Artist additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public Artist putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public Artist born(Long born) {
    this.born = born;
    return this;
  }

   /**
   * Get born
   * @return born
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getBorn() {
    return born;
  }

  public void setBorn(Long born) {
    this.born = born;
  }

  public Artist contributionCount(Integer contributionCount) {
    this.contributionCount = contributionCount;
    return this;
  }

   /**
   * Get contributionCount
   * @return contributionCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getContributionCount() {
    return contributionCount;
  }

  public void setContributionCount(Integer contributionCount) {
    this.contributionCount = contributionCount;
  }

  public Artist created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Artist died(Long died) {
    this.died = died;
    return this;
  }

   /**
   * Get died
   * @return died
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getDied() {
    return died;
  }

  public void setDied(Long died) {
    this.died = died;
  }

  public Artist id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Artist longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * Get longDescription
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Artist name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Artist priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Artist propertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
    return this;
  }

   /**
   * Get propertiesString
   * @return propertiesString
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPropertiesString() {
    return propertiesString;
  }

  public void setPropertiesString(String propertiesString) {
    this.propertiesString = propertiesString;
  }

  public Artist shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * Get shortDescription
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public Artist template(String template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public Artist updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Artist artist = (Artist) o;
    return Objects.equals(this.additionalProperties, artist.additionalProperties) &&
        Objects.equals(this.born, artist.born) &&
        Objects.equals(this.contributionCount, artist.contributionCount) &&
        Objects.equals(this.created, artist.created) &&
        Objects.equals(this.died, artist.died) &&
        Objects.equals(this.id, artist.id) &&
        Objects.equals(this.longDescription, artist.longDescription) &&
        Objects.equals(this.name, artist.name) &&
        Objects.equals(this.priority, artist.priority) &&
        Objects.equals(this.propertiesString, artist.propertiesString) &&
        Objects.equals(this.shortDescription, artist.shortDescription) &&
        Objects.equals(this.template, artist.template) &&
        Objects.equals(this.updated, artist.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, born, contributionCount, created, died, id, longDescription, name, priority, propertiesString, shortDescription, template, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Artist {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    born: ").append(toIndentedString(born)).append("\n");
    sb.append("    contributionCount: ").append(toIndentedString(contributionCount)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    died: ").append(toIndentedString(died)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    propertiesString: ").append(toIndentedString(propertiesString)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

