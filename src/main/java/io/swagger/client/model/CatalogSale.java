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
 * CatalogSale
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-27T16:50:51.510-04:00")
public class CatalogSale {
  @SerializedName("currency_code")
  private String currencyCode = null;

  /**
   * The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%)
   */
  public enum DiscountTypeEnum {
    @SerializedName("value")
    VALUE("value"),
    
    @SerializedName("percentage")
    PERCENTAGE("percentage");

    private String value;

    DiscountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("discount_type")
  private DiscountTypeEnum discountType = null;

  @SerializedName("discount_value")
  private Double discountValue = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("item")
  private Integer item = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sale_end_date")
  private Long saleEndDate = null;

  @SerializedName("sale_start_date")
  private Long saleStartDate = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("vendor")
  private Integer vendor = null;

  public CatalogSale currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The iso3 code for the currency for this discountValue.  The sku purchased will have to match for it this sale to apply")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public CatalogSale discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%)
   * @return discountType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The way in which the price is reduced. 'value' means subtracting directly, 'percentage' means subtracting by the price times the discountValue (1.0 == 100%)")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CatalogSale discountValue(Double discountValue) {
    this.discountValue = discountValue;
    return this;
  }

   /**
   * The amount deducted from the price, in the same currencyCode as the item
   * @return discountValue
  **/
  @ApiModelProperty(example = "null", value = "The amount deducted from the price, in the same currencyCode as the item")
  public Double getDiscountValue() {
    return discountValue;
  }

  public void setDiscountValue(Double discountValue) {
    this.discountValue = discountValue;
  }

   /**
   * The id of the sale
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the sale")
  public Integer getId() {
    return id;
  }

  public CatalogSale item(Integer item) {
    this.item = item;
    return this;
  }

   /**
   * The id of the item this sale applies to.  Leave null to use other filters
   * @return item
  **/
  @ApiModelProperty(example = "null", value = "The id of the item this sale applies to.  Leave null to use other filters")
  public Integer getItem() {
    return item;
  }

  public void setItem(Integer item) {
    this.item = item;
  }

  public CatalogSale longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * The long description of the sale
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "The long description of the sale")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public CatalogSale name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the sale.  Max 40 characters
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the sale.  Max 40 characters")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogSale saleEndDate(Long saleEndDate) {
    this.saleEndDate = saleEndDate;
    return this;
  }

   /**
   * The date the sale ends, null for never.  Unix timestamp in seconds
   * @return saleEndDate
  **/
  @ApiModelProperty(example = "null", value = "The date the sale ends, null for never.  Unix timestamp in seconds")
  public Long getSaleEndDate() {
    return saleEndDate;
  }

  public void setSaleEndDate(Long saleEndDate) {
    this.saleEndDate = saleEndDate;
  }

  public CatalogSale saleStartDate(Long saleStartDate) {
    this.saleStartDate = saleStartDate;
    return this;
  }

   /**
   * The date the sale begins.  Unix timestamp in seconds
   * @return saleStartDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The date the sale begins.  Unix timestamp in seconds")
  public Long getSaleStartDate() {
    return saleStartDate;
  }

  public void setSaleStartDate(Long saleStartDate) {
    this.saleStartDate = saleStartDate;
  }

  public CatalogSale shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * The short description of the sale.  Max 140 characters
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "The short description of the sale.  Max 140 characters")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public CatalogSale tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * The tag this sale applies to.  Leave null to skip this filter (applies to all tags)
   * @return tag
  **/
  @ApiModelProperty(example = "null", value = "The tag this sale applies to.  Leave null to skip this filter (applies to all tags)")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public CatalogSale vendor(Integer vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors)
   * @return vendor
  **/
  @ApiModelProperty(example = "null", value = "The id of the vendor this sale applies to.  Leave null to skip this filter (applies to all vendors)")
  public Integer getVendor() {
    return vendor;
  }

  public void setVendor(Integer vendor) {
    this.vendor = vendor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogSale catalogSale = (CatalogSale) o;
    return Objects.equals(this.currencyCode, catalogSale.currencyCode) &&
        Objects.equals(this.discountType, catalogSale.discountType) &&
        Objects.equals(this.discountValue, catalogSale.discountValue) &&
        Objects.equals(this.id, catalogSale.id) &&
        Objects.equals(this.item, catalogSale.item) &&
        Objects.equals(this.longDescription, catalogSale.longDescription) &&
        Objects.equals(this.name, catalogSale.name) &&
        Objects.equals(this.saleEndDate, catalogSale.saleEndDate) &&
        Objects.equals(this.saleStartDate, catalogSale.saleStartDate) &&
        Objects.equals(this.shortDescription, catalogSale.shortDescription) &&
        Objects.equals(this.tag, catalogSale.tag) &&
        Objects.equals(this.vendor, catalogSale.vendor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, discountType, discountValue, id, item, longDescription, name, saleEndDate, saleStartDate, shortDescription, tag, vendor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogSale {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    discountValue: ").append(toIndentedString(discountValue)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    saleEndDate: ").append(toIndentedString(saleEndDate)).append("\n");
    sb.append("    saleStartDate: ").append(toIndentedString(saleStartDate)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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

