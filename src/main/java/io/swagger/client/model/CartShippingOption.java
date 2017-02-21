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
 * CartShippingOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:56:46.799-05:00")
public class CartShippingOption {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("original_price")
  private Double originalPrice = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("shipping_item_id")
  private Integer shippingItemId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  @SerializedName("vendor_name")
  private String vendorName = null;

  public CartShippingOption currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Get currencyCode
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CartShippingOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CartShippingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CartShippingOption originalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
    return this;
  }

   /**
   * Get originalPrice
   * @return originalPrice
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(Double originalPrice) {
    this.originalPrice = originalPrice;
  }

  public CartShippingOption price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public CartShippingOption shippingItemId(Integer shippingItemId) {
    this.shippingItemId = shippingItemId;
    return this;
  }

   /**
   * Get shippingItemId
   * @return shippingItemId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getShippingItemId() {
    return shippingItemId;
  }

  public void setShippingItemId(Integer shippingItemId) {
    this.shippingItemId = shippingItemId;
  }

  public CartShippingOption sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public CartShippingOption taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Get taxable
   * @return taxable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public CartShippingOption vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public CartShippingOption vendorName(String vendorName) {
    this.vendorName = vendorName;
    return this;
  }

   /**
   * Get vendorName
   * @return vendorName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getVendorName() {
    return vendorName;
  }

  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartShippingOption cartShippingOption = (CartShippingOption) o;
    return Objects.equals(this.currencyCode, cartShippingOption.currencyCode) &&
        Objects.equals(this.description, cartShippingOption.description) &&
        Objects.equals(this.name, cartShippingOption.name) &&
        Objects.equals(this.originalPrice, cartShippingOption.originalPrice) &&
        Objects.equals(this.price, cartShippingOption.price) &&
        Objects.equals(this.shippingItemId, cartShippingOption.shippingItemId) &&
        Objects.equals(this.sku, cartShippingOption.sku) &&
        Objects.equals(this.taxable, cartShippingOption.taxable) &&
        Objects.equals(this.vendorId, cartShippingOption.vendorId) &&
        Objects.equals(this.vendorName, cartShippingOption.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, description, name, originalPrice, price, shippingItemId, sku, taxable, vendorId, vendorName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartShippingOption {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalPrice: ").append(toIndentedString(originalPrice)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    shippingItemId: ").append(toIndentedString(shippingItemId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

