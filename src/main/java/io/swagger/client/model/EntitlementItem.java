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
import io.swagger.client.model.Behavior;
import io.swagger.client.model.Property;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * EntitlementItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:24:50.691-05:00")
public class EntitlementItem {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("behaviors")
  private List<Behavior> behaviors = new ArrayList<Behavior>();

  @SerializedName("category")
  private String category = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  public EntitlementItem additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public EntitlementItem putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public EntitlementItem behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public EntitlementItem addBehaviorsItem(Behavior behaviorsItem) {
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The behaviors linked to the item, describing various options and interactions. May not be included in item lists
   * @return behaviors
  **/
  @ApiModelProperty(example = "null", value = "The behaviors linked to the item, describing various options and interactions. May not be included in item lists")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  public EntitlementItem category(String category) {
    this.category = category;
    return this;
  }

   /**
   * A category for filtering items
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "A category for filtering items")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

   /**
   * The date the item was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the item
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the item")
  public Integer getId() {
    return id;
  }

  public EntitlementItem longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description of the item
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "A long description of the item")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public EntitlementItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntitlementItem shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the item, max 255 chars
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "A short description of the item, max 255 chars")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public EntitlementItem sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A number to use in sorting items.  Default 500
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "A number to use in sorting items.  Default 500")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public EntitlementItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EntitlementItem addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags used for filtering items
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "List of tags used for filtering items")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public EntitlementItem template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public EntitlementItem typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The type of the item
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the item")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public EntitlementItem uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key for the item
   * @return uniqueKey
  **/
  @ApiModelProperty(example = "null", value = "The unique key for the item")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date the item was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was last updated, unix timestamp in seconds")
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
    EntitlementItem entitlementItem = (EntitlementItem) o;
    return Objects.equals(this.additionalProperties, entitlementItem.additionalProperties) &&
        Objects.equals(this.behaviors, entitlementItem.behaviors) &&
        Objects.equals(this.category, entitlementItem.category) &&
        Objects.equals(this.createdDate, entitlementItem.createdDate) &&
        Objects.equals(this.id, entitlementItem.id) &&
        Objects.equals(this.longDescription, entitlementItem.longDescription) &&
        Objects.equals(this.name, entitlementItem.name) &&
        Objects.equals(this.shortDescription, entitlementItem.shortDescription) &&
        Objects.equals(this.sort, entitlementItem.sort) &&
        Objects.equals(this.tags, entitlementItem.tags) &&
        Objects.equals(this.template, entitlementItem.template) &&
        Objects.equals(this.typeHint, entitlementItem.typeHint) &&
        Objects.equals(this.uniqueKey, entitlementItem.uniqueKey) &&
        Objects.equals(this.updatedDate, entitlementItem.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, behaviors, category, createdDate, id, longDescription, name, shortDescription, sort, tags, template, typeHint, uniqueKey, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementItem {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
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

