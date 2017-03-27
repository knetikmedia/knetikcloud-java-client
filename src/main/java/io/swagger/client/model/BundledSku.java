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
 * BundledSku
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T16:50:51.510-04:00")
public class BundledSku {
  @SerializedName("price_override")
  private Double priceOverride = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("sku")
  private String sku = null;

  public BundledSku priceOverride(Double priceOverride) {
    this.priceOverride = priceOverride;
    return this;
  }

   /**
   * The amount this item will cost inside the bundle instead of its regular price
   * @return priceOverride
  **/
  @ApiModelProperty(example = "null", value = "The amount this item will cost inside the bundle instead of its regular price")
  public Double getPriceOverride() {
    return priceOverride;
  }

  public void setPriceOverride(Double priceOverride) {
    this.priceOverride = priceOverride;
  }

  public BundledSku quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * The quantity of this item within the bundle
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "The quantity of this item within the bundle")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BundledSku sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The stock keeping unit (SKU) for an item included in the bundle
   * @return sku
  **/
  @ApiModelProperty(example = "null", required = true, value = "The stock keeping unit (SKU) for an item included in the bundle")
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
    BundledSku bundledSku = (BundledSku) o;
    return Objects.equals(this.priceOverride, bundledSku.priceOverride) &&
        Objects.equals(this.quantity, bundledSku.quantity) &&
        Objects.equals(this.sku, bundledSku.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceOverride, quantity, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledSku {\n");
    
    sb.append("    priceOverride: ").append(toIndentedString(priceOverride)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

