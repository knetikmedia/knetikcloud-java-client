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
 * InvoiceCreateRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-05T03:17:56.208-05:00")
public class InvoiceCreateRequest   {
  @SerializedName("cart_guid")
  private String cartGuid = null;

  public InvoiceCreateRequest cartGuid(String cartGuid) {
    this.cartGuid = cartGuid;
    return this;
  }

   /**
   * The guid of a cart to create a new invoice for
   * @return cartGuid
  **/
  @ApiModelProperty(example = "null", required = true, value = "The guid of a cart to create a new invoice for")
  public String getCartGuid() {
    return cartGuid;
  }

  public void setCartGuid(String cartGuid) {
    this.cartGuid = cartGuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceCreateRequest invoiceCreateRequest = (InvoiceCreateRequest) o;
    return Objects.equals(this.cartGuid, invoiceCreateRequest.cartGuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartGuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceCreateRequest {\n");
    
    sb.append("    cartGuid: ").append(toIndentedString(cartGuid)).append("\n");
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

