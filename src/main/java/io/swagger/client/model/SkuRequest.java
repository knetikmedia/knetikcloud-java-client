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
 * SkuRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:07:29.280-05:00")
public class SkuRequest {
  @SerializedName("sku")
  private String sku = null;

  public SkuRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * SKU code of the item
   * @return sku
  **/
  @ApiModelProperty(example = "null", required = true, value = "SKU code of the item")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkuRequest skuRequest = (SkuRequest) o;
    return Objects.equals(this.sku, skuRequest.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkuRequest {\n");
    
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

