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
import java.util.ArrayList;
import java.util.List;

/**
 * CouponDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-08T00:18:40.653-05:00")
public class CouponDefinition {
  @SerializedName("code")
  private String code = null;

  @SerializedName("description")
  private String description = null;

  /**
   * The type of discount in terms of how it deducts price.
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

  @SerializedName("exclusive")
  private Boolean exclusive = null;

  @SerializedName("max_discount")
  private Double maxDiscount = null;

  @SerializedName("max_quantity")
  private Integer maxQuantity = null;

  @SerializedName("min_cart_total")
  private Double minCartTotal = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("self_exclusive")
  private Boolean selfExclusive = null;

  @SerializedName("target_item_id")
  private Integer targetItemId = null;

  /**
   * The type of discount in terms of what it applies to. coupon_cart applies to the cart as a whole, other types apply to specific items based on different criteria.
   */
  public enum TypeEnum {
    @SerializedName("coupon_cart")
    CART("coupon_cart"),
    
    @SerializedName("coupon_single_item")
    SINGLE_ITEM("coupon_single_item"),
    
    @SerializedName("coupon_voucher")
    VOUCHER("coupon_voucher"),
    
    @SerializedName("coupon_vendor")
    VENDOR("coupon_vendor"),
    
    @SerializedName("coupon_tag")
    TAG("coupon_tag");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("valid_for_tags")
  private List<String> validForTags = new ArrayList<String>();

  @SerializedName("value")
  private Double value = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public CouponDefinition code(String code) {
    this.code = code;
    return this;
  }

   /**
   * A unique identifier for the discount. Can be used to remove the discount, and uniqueness within the cart will be enforced.
   * @return code
  **/
  @ApiModelProperty(example = "null", required = true, value = "A unique identifier for the discount. Can be used to remove the discount, and uniqueness within the cart will be enforced.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CouponDefinition description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description for the discount.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description for the discount.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CouponDefinition discountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
    return this;
  }

   /**
   * The type of discount in terms of how it deducts price.
   * @return discountType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of discount in terms of how it deducts price.")
  public DiscountTypeEnum getDiscountType() {
    return discountType;
  }

  public void setDiscountType(DiscountTypeEnum discountType) {
    this.discountType = discountType;
  }

  public CouponDefinition exclusive(Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

   /**
   * Whether this discount is exclusive and cannot be used in conjunction with other discounts/coupons. default=false
   * @return exclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this discount is exclusive and cannot be used in conjunction with other discounts/coupons. default=false")
  public Boolean getExclusive() {
    return exclusive;
  }

  public void setExclusive(Boolean exclusive) {
    this.exclusive = exclusive;
  }

  public CouponDefinition maxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
    return this;
  }

   /**
   * For coupon_cart, a minimum total price that the cart must meet to be valid.
   * @return maxDiscount
  **/
  @ApiModelProperty(example = "null", value = "For coupon_cart, a minimum total price that the cart must meet to be valid.")
  public Double getMaxDiscount() {
    return maxDiscount;
  }

  public void setMaxDiscount(Double maxDiscount) {
    this.maxDiscount = maxDiscount;
  }

  public CouponDefinition maxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
    return this;
  }

   /**
   * The maximum number of items to count this discount for (not for cart_coupon).
   * @return maxQuantity
  **/
  @ApiModelProperty(example = "null", value = "The maximum number of items to count this discount for (not for cart_coupon).")
  public Integer getMaxQuantity() {
    return maxQuantity;
  }

  public void setMaxQuantity(Integer maxQuantity) {
    this.maxQuantity = maxQuantity;
  }

  public CouponDefinition minCartTotal(Double minCartTotal) {
    this.minCartTotal = minCartTotal;
    return this;
  }

   /**
   * For coupon_cart, a minimum total price that the cart must meet to be valid.
   * @return minCartTotal
  **/
  @ApiModelProperty(example = "null", value = "For coupon_cart, a minimum total price that the cart must meet to be valid.")
  public Double getMinCartTotal() {
    return minCartTotal;
  }

  public void setMinCartTotal(Double minCartTotal) {
    this.minCartTotal = minCartTotal;
  }

  public CouponDefinition name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A name for the discount.
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "A name for the discount.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CouponDefinition selfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
    return this;
  }

   /**
   * Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false
   * @return selfExclusive
  **/
  @ApiModelProperty(example = "false", value = "Whether this coupon is exclusive to itself or not (true means cannot add two of this same coupon to the same cart).  Default = false")
  public Boolean getSelfExclusive() {
    return selfExclusive;
  }

  public void setSelfExclusive(Boolean selfExclusive) {
    this.selfExclusive = selfExclusive;
  }

  public CouponDefinition targetItemId(Integer targetItemId) {
    this.targetItemId = targetItemId;
    return this;
  }

   /**
   * The id of the item this discount applies to, which must be present in the cart. Applies if coupon_type_hint is coupon_single_item or coupon_voucher.
   * @return targetItemId
  **/
  @ApiModelProperty(example = "null", value = "The id of the item this discount applies to, which must be present in the cart. Applies if coupon_type_hint is coupon_single_item or coupon_voucher.")
  public Integer getTargetItemId() {
    return targetItemId;
  }

  public void setTargetItemId(Integer targetItemId) {
    this.targetItemId = targetItemId;
  }

  public CouponDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of discount in terms of what it applies to. coupon_cart applies to the cart as a whole, other types apply to specific items based on different criteria.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of discount in terms of what it applies to. coupon_cart applies to the cart as a whole, other types apply to specific items based on different criteria.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CouponDefinition validForTags(List<String> validForTags) {
    this.validForTags = validForTags;
    return this;
  }

  public CouponDefinition addValidForTagsItem(String validForTagsItem) {
    this.validForTags.add(validForTagsItem);
    return this;
  }

   /**
   * Which tags this applies for (item must have at least one of them), if coupon_type is coupon_tag.
   * @return validForTags
  **/
  @ApiModelProperty(example = "null", value = "Which tags this applies for (item must have at least one of them), if coupon_type is coupon_tag.")
  public List<String> getValidForTags() {
    return validForTags;
  }

  public void setValidForTags(List<String> validForTags) {
    this.validForTags = validForTags;
  }

  public CouponDefinition value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The amount of the discount. If discount_type is value then this is the raw currency amount to remove. If discount_type is percentage then this will be multiplied by the cart total or item price to get the discount amount (0.5 is half price).
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount of the discount. If discount_type is value then this is the raw currency amount to remove. If discount_type is percentage then this will be multiplied by the cart total or item price to get the discount amount (0.5 is half price).")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public CouponDefinition vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Which vendor this applies for, if coupon_type is coupon_vendor.
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", value = "Which vendor this applies for, if coupon_type is coupon_vendor.")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponDefinition couponDefinition = (CouponDefinition) o;
    return Objects.equals(this.code, couponDefinition.code) &&
        Objects.equals(this.description, couponDefinition.description) &&
        Objects.equals(this.discountType, couponDefinition.discountType) &&
        Objects.equals(this.exclusive, couponDefinition.exclusive) &&
        Objects.equals(this.maxDiscount, couponDefinition.maxDiscount) &&
        Objects.equals(this.maxQuantity, couponDefinition.maxQuantity) &&
        Objects.equals(this.minCartTotal, couponDefinition.minCartTotal) &&
        Objects.equals(this.name, couponDefinition.name) &&
        Objects.equals(this.selfExclusive, couponDefinition.selfExclusive) &&
        Objects.equals(this.targetItemId, couponDefinition.targetItemId) &&
        Objects.equals(this.type, couponDefinition.type) &&
        Objects.equals(this.validForTags, couponDefinition.validForTags) &&
        Objects.equals(this.value, couponDefinition.value) &&
        Objects.equals(this.vendorId, couponDefinition.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, discountType, exclusive, maxDiscount, maxQuantity, minCartTotal, name, selfExclusive, targetItemId, type, validForTags, value, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponDefinition {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
    sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
    sb.append("    maxDiscount: ").append(toIndentedString(maxDiscount)).append("\n");
    sb.append("    maxQuantity: ").append(toIndentedString(maxQuantity)).append("\n");
    sb.append("    minCartTotal: ").append(toIndentedString(minCartTotal)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    selfExclusive: ").append(toIndentedString(selfExclusive)).append("\n");
    sb.append("    targetItemId: ").append(toIndentedString(targetItemId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validForTags: ").append(toIndentedString(validForTags)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

