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

/**
 * SimpleReferenceResourcestring
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:07:29.280-05:00")
public class SimpleReferenceResourcestring {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public SimpleReferenceResourcestring id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the referenced object
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the referenced object")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * The name of the referenced object
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the referenced object")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleReferenceResourcestring simpleReferenceResourcestring = (SimpleReferenceResourcestring) o;
    return Objects.equals(this.id, simpleReferenceResourcestring.id) &&
        Objects.equals(this.name, simpleReferenceResourcestring.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReferenceResourcestring {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

