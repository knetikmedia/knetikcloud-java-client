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

/**
 * EntitlementGrantRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:56:46.799-05:00")
public class EntitlementGrantRequest {
  @SerializedName("entitlement_id")
  private Integer entitlementId = null;

  public EntitlementGrantRequest entitlementId(Integer entitlementId) {
    this.entitlementId = entitlementId;
    return this;
  }

   /**
   * The ID of the entitlement item to grant
   * @return entitlementId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ID of the entitlement item to grant")
  public Integer getEntitlementId() {
    return entitlementId;
  }

  public void setEntitlementId(Integer entitlementId) {
    this.entitlementId = entitlementId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementGrantRequest entitlementGrantRequest = (EntitlementGrantRequest) o;
    return Objects.equals(this.entitlementId, entitlementGrantRequest.entitlementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitlementId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementGrantRequest {\n");
    
    sb.append("    entitlementId: ").append(toIndentedString(entitlementId)).append("\n");
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

