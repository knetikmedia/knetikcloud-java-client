/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * EntitlementGrantRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-05T03:17:56.208-05:00")
public class EntitlementGrantRequest   {
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

