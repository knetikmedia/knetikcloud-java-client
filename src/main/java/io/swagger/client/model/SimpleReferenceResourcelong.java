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

/**
 * SimpleReferenceResourcelong
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T17:13:25.977-05:00")
public class SimpleReferenceResourcelong {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  public SimpleReferenceResourcelong id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the referenced object
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the referenced object")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
    SimpleReferenceResourcelong simpleReferenceResourcelong = (SimpleReferenceResourcelong) o;
    return Objects.equals(this.id, simpleReferenceResourcelong.id) &&
        Objects.equals(this.name, simpleReferenceResourcelong.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleReferenceResourcelong {\n");
    
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
