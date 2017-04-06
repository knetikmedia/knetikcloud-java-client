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
 * BreTriggerParameterDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-05T23:12:58.689-04:00")
public class BreTriggerParameterDefinition {
  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public BreTriggerParameterDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the parameter. This is used as the unique identifier of this parameter
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the parameter. This is used as the unique identifier of this parameter")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreTriggerParameterDefinition type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The variable type of this parameter. See Bre Variables endpoint for list
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The variable type of this parameter. See Bre Variables endpoint for list")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreTriggerParameterDefinition breTriggerParameterDefinition = (BreTriggerParameterDefinition) o;
    return Objects.equals(this.name, breTriggerParameterDefinition.name) &&
        Objects.equals(this.type, breTriggerParameterDefinition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreTriggerParameterDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

