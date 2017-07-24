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
 * GrantTypeResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T11:06:44.887-04:00")
public class GrantTypeResource {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  public GrantTypeResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the grant type
   * @return description
  **/
  @ApiModelProperty(value = "The description of the grant type")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GrantTypeResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the grant type
   * @return name
  **/
  @ApiModelProperty(value = "The name of the grant type")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrantTypeResource grantTypeResource = (GrantTypeResource) o;
    return Objects.equals(this.description, grantTypeResource.description) &&
        Objects.equals(this.name, grantTypeResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrantTypeResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

