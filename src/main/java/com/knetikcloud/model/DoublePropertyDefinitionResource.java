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
import com.knetikcloud.model.PropertyDefinitionResource;
import com.knetikcloud.model.PropertyFieldListResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DoublePropertyDefinitionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class DoublePropertyDefinitionResource extends PropertyDefinitionResource {
  @JsonProperty("max")
  private Double max = null;

  @JsonProperty("min")
  private Double min = null;

  public DoublePropertyDefinitionResource max(Double max) {
    this.max = max;
    return this;
  }

   /**
   * If provided, the maximum value
   * @return max
  **/
  @ApiModelProperty(value = "If provided, the maximum value")
  public Double getMax() {
    return max;
  }

  public void setMax(Double max) {
    this.max = max;
  }

  public DoublePropertyDefinitionResource min(Double min) {
    this.min = min;
    return this;
  }

   /**
   * If provided, the minimum value
   * @return min
  **/
  @ApiModelProperty(value = "If provided, the minimum value")
  public Double getMin() {
    return min;
  }

  public void setMin(Double min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoublePropertyDefinitionResource doublePropertyDefinitionResource = (DoublePropertyDefinitionResource) o;
    return Objects.equals(this.max, doublePropertyDefinitionResource.max) &&
        Objects.equals(this.min, doublePropertyDefinitionResource.min) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(max, min, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoublePropertyDefinitionResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

