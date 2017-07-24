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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LookupTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T11:06:44.887-04:00")
public class LookupTypeResource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("key_type")
  private String keyType = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value_type")
  private String valueType = null;

  public LookupTypeResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the expression type
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the expression type")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LookupTypeResource keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * The variable type the key expression must be, or null if it&#39;s dependent (see description for explanation in this case)
   * @return keyType
  **/
  @ApiModelProperty(required = true, value = "The variable type the key expression must be, or null if it's dependent (see description for explanation in this case)")
  public String getKeyType() {
    return keyType;
  }

  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  public LookupTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the expression type
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the expression type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LookupTypeResource valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * The variable type of the value this expression returns, or null if it&#39;s dependent (see description for explanation in this case)
   * @return valueType
  **/
  @ApiModelProperty(required = true, value = "The variable type of the value this expression returns, or null if it's dependent (see description for explanation in this case)")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LookupTypeResource lookupTypeResource = (LookupTypeResource) o;
    return Objects.equals(this.description, lookupTypeResource.description) &&
        Objects.equals(this.keyType, lookupTypeResource.keyType) &&
        Objects.equals(this.name, lookupTypeResource.name) &&
        Objects.equals(this.valueType, lookupTypeResource.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, keyType, name, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LookupTypeResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

