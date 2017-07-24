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
import com.knetikcloud.model.ExpressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * VendorEmailLookupResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T12:10:58.935-04:00")
public class VendorEmailLookupResource {
  @JsonProperty("lookup_key")
  private ExpressionResource lookupKey = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("value_type")
  private String valueType = null;

  public VendorEmailLookupResource lookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
    return this;
  }

   /**
   * Get lookupKey
   * @return lookupKey
  **/
  @ApiModelProperty(value = "")
  public ExpressionResource getLookupKey() {
    return lookupKey;
  }

  public void setLookupKey(ExpressionResource lookupKey) {
    this.lookupKey = lookupKey;
  }

  public VendorEmailLookupResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public VendorEmailLookupResource valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @ApiModelProperty(value = "")
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
    VendorEmailLookupResource vendorEmailLookupResource = (VendorEmailLookupResource) o;
    return Objects.equals(this.lookupKey, vendorEmailLookupResource.lookupKey) &&
        Objects.equals(this.type, vendorEmailLookupResource.type) &&
        Objects.equals(this.valueType, vendorEmailLookupResource.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookupKey, type, valueType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorEmailLookupResource {\n");
    
    sb.append("    lookupKey: ").append(toIndentedString(lookupKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

