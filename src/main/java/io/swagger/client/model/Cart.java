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
import io.swagger.client.model.CartLineItem;
import io.swagger.client.model.CartShippingAddressRequest;
import io.swagger.client.model.CartShippingOption;
import io.swagger.client.model.CouponDefinition;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Cart
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:33:34.950-05:00")
public class Cart {
  @SerializedName("country_tax")
  private Double countryTax = null;

  @SerializedName("coupons")
  private List<CouponDefinition> coupons = new ArrayList<CouponDefinition>();

  @SerializedName("created")
  private Long created = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("discount_total")
  private Double discountTotal = null;

  @SerializedName("error_code")
  private Integer errorCode = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("grand_total")
  private Double grandTotal = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("invoice_id")
  private Double invoiceId = null;

  @SerializedName("items")
  private List<CartLineItem> items = new ArrayList<CartLineItem>();

  @SerializedName("owner")
  private Integer owner = null;

  @SerializedName("selected_shipping_options")
  private List<CartShippingOption> selectedShippingOptions = new ArrayList<CartShippingOption>();

  @SerializedName("shippable")
  private Boolean shippable = null;

  @SerializedName("shipping_address")
  private CartShippingAddressRequest shippingAddress = null;

  @SerializedName("shipping_cost")
  private Double shippingCost = null;

  @SerializedName("shipping_options")
  private Map<String, Set> shippingOptions = new HashMap<String, Set>();

  @SerializedName("state_tax")
  private Double stateTax = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("active")
    ACTIVE("active"),
    
    @SerializedName("processing")
    PROCESSING("processing"),
    
    @SerializedName("closed")
    CLOSED("closed"),
    
    @SerializedName("onhold")
    ONHOLD("onhold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("subtotal")
  private Double subtotal = null;

  @SerializedName("updated")
  private Long updated = null;

  public Cart countryTax(Double countryTax) {
    this.countryTax = countryTax;
    return this;
  }

   /**
   * Get countryTax
   * @return countryTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCountryTax() {
    return countryTax;
  }

  public void setCountryTax(Double countryTax) {
    this.countryTax = countryTax;
  }

  public Cart coupons(List<CouponDefinition> coupons) {
    this.coupons = coupons;
    return this;
  }

  public Cart addCouponsItem(CouponDefinition couponsItem) {
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * Get coupons
   * @return coupons
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CouponDefinition> getCoupons() {
    return coupons;
  }

  public void setCoupons(List<CouponDefinition> coupons) {
    this.coupons = coupons;
  }

  public Cart created(Long created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }

  public Cart currencyCode(String currencyCode) {
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

  public Cart discountTotal(Double discountTotal) {
    this.discountTotal = discountTotal;
    return this;
  }

   /**
   * Get discountTotal
   * @return discountTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDiscountTotal() {
    return discountTotal;
  }

  public void setDiscountTotal(Double discountTotal) {
    this.discountTotal = discountTotal;
  }

  public Cart errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public Cart errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Cart grandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

   /**
   * Get grandTotal
   * @return grandTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(Double grandTotal) {
    this.grandTotal = grandTotal;
  }

  public Cart id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Cart invoiceId(Double invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Get invoiceId
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Double invoiceId) {
    this.invoiceId = invoiceId;
  }

  public Cart items(List<CartLineItem> items) {
    this.items = items;
    return this;
  }

  public Cart addItemsItem(CartLineItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CartLineItem> getItems() {
    return items;
  }

  public void setItems(List<CartLineItem> items) {
    this.items = items;
  }

  public Cart owner(Integer owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getOwner() {
    return owner;
  }

  public void setOwner(Integer owner) {
    this.owner = owner;
  }

  public Cart selectedShippingOptions(List<CartShippingOption> selectedShippingOptions) {
    this.selectedShippingOptions = selectedShippingOptions;
    return this;
  }

  public Cart addSelectedShippingOptionsItem(CartShippingOption selectedShippingOptionsItem) {
    this.selectedShippingOptions.add(selectedShippingOptionsItem);
    return this;
  }

   /**
   * Get selectedShippingOptions
   * @return selectedShippingOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CartShippingOption> getSelectedShippingOptions() {
    return selectedShippingOptions;
  }

  public void setSelectedShippingOptions(List<CartShippingOption> selectedShippingOptions) {
    this.selectedShippingOptions = selectedShippingOptions;
  }

  public Cart shippable(Boolean shippable) {
    this.shippable = shippable;
    return this;
  }

   /**
   * Get shippable
   * @return shippable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShippable() {
    return shippable;
  }

  public void setShippable(Boolean shippable) {
    this.shippable = shippable;
  }

  public Cart shippingAddress(CartShippingAddressRequest shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public CartShippingAddressRequest getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(CartShippingAddressRequest shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public Cart shippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

   /**
   * Get shippingCost
   * @return shippingCost
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getShippingCost() {
    return shippingCost;
  }

  public void setShippingCost(Double shippingCost) {
    this.shippingCost = shippingCost;
  }

  public Cart shippingOptions(Map<String, Set> shippingOptions) {
    this.shippingOptions = shippingOptions;
    return this;
  }

  public Cart putShippingOptionsItem(String key, Set shippingOptionsItem) {
    this.shippingOptions.put(key, shippingOptionsItem);
    return this;
  }

   /**
   * Get shippingOptions
   * @return shippingOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Set> getShippingOptions() {
    return shippingOptions;
  }

  public void setShippingOptions(Map<String, Set> shippingOptions) {
    this.shippingOptions = shippingOptions;
  }

  public Cart stateTax(Double stateTax) {
    this.stateTax = stateTax;
    return this;
  }

   /**
   * Get stateTax
   * @return stateTax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getStateTax() {
    return stateTax;
  }

  public void setStateTax(Double stateTax) {
    this.stateTax = stateTax;
  }

  public Cart status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Cart subtotal(Double subtotal) {
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Get subtotal
   * @return subtotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(Double subtotal) {
    this.subtotal = subtotal;
  }

  public Cart updated(Long updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUpdated() {
    return updated;
  }

  public void setUpdated(Long updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cart cart = (Cart) o;
    return Objects.equals(this.countryTax, cart.countryTax) &&
        Objects.equals(this.coupons, cart.coupons) &&
        Objects.equals(this.created, cart.created) &&
        Objects.equals(this.currencyCode, cart.currencyCode) &&
        Objects.equals(this.discountTotal, cart.discountTotal) &&
        Objects.equals(this.errorCode, cart.errorCode) &&
        Objects.equals(this.errorMessage, cart.errorMessage) &&
        Objects.equals(this.grandTotal, cart.grandTotal) &&
        Objects.equals(this.id, cart.id) &&
        Objects.equals(this.invoiceId, cart.invoiceId) &&
        Objects.equals(this.items, cart.items) &&
        Objects.equals(this.owner, cart.owner) &&
        Objects.equals(this.selectedShippingOptions, cart.selectedShippingOptions) &&
        Objects.equals(this.shippable, cart.shippable) &&
        Objects.equals(this.shippingAddress, cart.shippingAddress) &&
        Objects.equals(this.shippingCost, cart.shippingCost) &&
        Objects.equals(this.shippingOptions, cart.shippingOptions) &&
        Objects.equals(this.stateTax, cart.stateTax) &&
        Objects.equals(this.status, cart.status) &&
        Objects.equals(this.subtotal, cart.subtotal) &&
        Objects.equals(this.updated, cart.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryTax, coupons, created, currencyCode, discountTotal, errorCode, errorMessage, grandTotal, id, invoiceId, items, owner, selectedShippingOptions, shippable, shippingAddress, shippingCost, shippingOptions, stateTax, status, subtotal, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cart {\n");
    
    sb.append("    countryTax: ").append(toIndentedString(countryTax)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    discountTotal: ").append(toIndentedString(discountTotal)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    selectedShippingOptions: ").append(toIndentedString(selectedShippingOptions)).append("\n");
    sb.append("    shippable: ").append(toIndentedString(shippable)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    shippingCost: ").append(toIndentedString(shippingCost)).append("\n");
    sb.append("    shippingOptions: ").append(toIndentedString(shippingOptions)).append("\n");
    sb.append("    stateTax: ").append(toIndentedString(stateTax)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
