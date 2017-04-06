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
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.PropertyDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * BehaviorDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-05T23:12:58.689-04:00")
public class BehaviorDefinitionResource {
  @SerializedName("description")
  private String description = null;

  @SerializedName("prerequisite_behaviors")
  private List<Behavior> prerequisiteBehaviors = new ArrayList<Behavior>();

  @SerializedName("properties")
  private List<PropertyDefinitionResource> properties = new ArrayList<PropertyDefinitionResource>();

  @SerializedName("type_hint")
  private String typeHint = null;

  public BehaviorDefinitionResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the behavior
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Description of the behavior")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BehaviorDefinitionResource prerequisiteBehaviors(List<Behavior> prerequisiteBehaviors) {
    this.prerequisiteBehaviors = prerequisiteBehaviors;
    return this;
  }

  public BehaviorDefinitionResource addPrerequisiteBehaviorsItem(Behavior prerequisiteBehaviorsItem) {
    this.prerequisiteBehaviors.add(prerequisiteBehaviorsItem);
    return this;
  }

   /**
   * Pre-requisite behaviors that an item must have in order to also have this behavior
   * @return prerequisiteBehaviors
  **/
  @ApiModelProperty(example = "null", value = "Pre-requisite behaviors that an item must have in order to also have this behavior")
  public List<Behavior> getPrerequisiteBehaviors() {
    return prerequisiteBehaviors;
  }

  public void setPrerequisiteBehaviors(List<Behavior> prerequisiteBehaviors) {
    this.prerequisiteBehaviors = prerequisiteBehaviors;
  }

  public BehaviorDefinitionResource properties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
    return this;
  }

  public BehaviorDefinitionResource addPropertiesItem(PropertyDefinitionResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Configurable properties of the behavior
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "Configurable properties of the behavior")
  public List<PropertyDefinitionResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyDefinitionResource> properties) {
    this.properties = properties;
  }

  public BehaviorDefinitionResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The behavior type
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "The behavior type")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BehaviorDefinitionResource behaviorDefinitionResource = (BehaviorDefinitionResource) o;
    return Objects.equals(this.description, behaviorDefinitionResource.description) &&
        Objects.equals(this.prerequisiteBehaviors, behaviorDefinitionResource.prerequisiteBehaviors) &&
        Objects.equals(this.properties, behaviorDefinitionResource.properties) &&
        Objects.equals(this.typeHint, behaviorDefinitionResource.typeHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, prerequisiteBehaviors, properties, typeHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BehaviorDefinitionResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    prerequisiteBehaviors: ").append(toIndentedString(prerequisiteBehaviors)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
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

