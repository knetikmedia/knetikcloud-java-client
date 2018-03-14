/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.ItemBehaviorDefinitionResource;
import com.knetikcloud.model.PropertyDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemTemplateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class ItemTemplateResource {
  @JsonProperty("allow_additional")
  private Boolean allowAdditional = null;

  @JsonProperty("behaviors")
  private List<ItemBehaviorDefinitionResource> behaviors = null;

  @JsonProperty("created_date")
  private Long createdDate = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("properties")
  private List<PropertyDefinitionResource> properties = null;

  @JsonProperty("updated_date")
  private Long updatedDate = null;

  public ItemTemplateResource allowAdditional(Boolean allowAdditional) {
    this.allowAdditional = allowAdditional;
    return this;
  }

   /**
   * Whether to allow additional properties beyond those specified or not
   * @return allowAdditional
  **/
  @ApiModelProperty(example = "false", value = "Whether to allow additional properties beyond those specified or not")
  public Boolean isAllowAdditional() {
    return allowAdditional;
  }

  public void setAllowAdditional(Boolean allowAdditional) {
    this.allowAdditional = allowAdditional;
  }

  public ItemTemplateResource behaviors(List<ItemBehaviorDefinitionResource> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public ItemTemplateResource addBehaviorsItem(ItemBehaviorDefinitionResource behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<ItemBehaviorDefinitionResource>();
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The customized behaviors that are required or default for this type of item
   * @return behaviors
  **/
  @ApiModelProperty(value = "The customized behaviors that are required or default for this type of item")
  public List<ItemBehaviorDefinitionResource> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<ItemBehaviorDefinitionResource> behaviors) {
    this.behaviors = behaviors;
  }

   /**
   * The date/time this resource was created in seconds since unix epoch
   * @return createdDate
  **/
  @ApiModelProperty(value = "The date/time this resource was created in seconds since unix epoch")
  public Long getCreatedDate() {
    return createdDate;
  }

   /**
   * The id of the template
   * @return id
  **/
  @ApiModelProperty(value = "The id of the template")
  public String getId() {
    return id;
  }

  public ItemTemplateResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the template")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ItemTemplateResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public ItemTemplateResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<PropertyDefinitionResource>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * The customized properties that are present
   * @return properties
  **/
  @ApiModelProperty(value = "The customized properties that are present")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

   /**
   * The date/time this resource was last updated in seconds since unix epoch
   * @return updatedDate
  **/
  @ApiModelProperty(value = "The date/time this resource was last updated in seconds since unix epoch")
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
    ItemTemplateResource itemTemplateResource = (ItemTemplateResource) o;
    return Objects.equals(this.allowAdditional, itemTemplateResource.allowAdditional) &&
        Objects.equals(this.behaviors, itemTemplateResource.behaviors) &&
        Objects.equals(this.createdDate, itemTemplateResource.createdDate) &&
        Objects.equals(this.id, itemTemplateResource.id) &&
        Objects.equals(this.name, itemTemplateResource.name) &&
        Objects.equals(this.properties, itemTemplateResource.properties) &&
        Objects.equals(this.updatedDate, itemTemplateResource.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAdditional, behaviors, createdDate, id, name, properties, updatedDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTemplateResource {\n");
    
    sb.append("    allowAdditional: ").append(toIndentedString(allowAdditional)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

