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
 * UserInventoryAddRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-19T02:58:28.257-05:00")
public class UserInventoryAddRequest {
  @SerializedName("note")
  private String note = null;

  @SerializedName("overrides")
  private List<String> overrides = new ArrayList<String>();

  @SerializedName("skip_invoice")
  private Boolean skipInvoice = null;

  @SerializedName("sku")
  private String sku = null;

  public UserInventoryAddRequest note(String note) {
    this.note = note;
    return this;
  }

   /**
   * A note to be passed to the invoice or transaction
   * @return note
  **/
  @ApiModelProperty(example = "null", required = true, value = "A note to be passed to the invoice or transaction")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public UserInventoryAddRequest overrides(List<String> overrides) {
    this.overrides = overrides;
    return this;
  }

  public UserInventoryAddRequest addOverridesItem(String overridesItem) {
    this.overrides.add(overridesItem);
    return this;
  }

   /**
   * A list of behaviors to ignore explicitely.  Ex: 'limited_gettable'
   * @return overrides
  **/
  @ApiModelProperty(example = "null", value = "A list of behaviors to ignore explicitely.  Ex: 'limited_gettable'")
  public List<String> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<String> overrides) {
    this.overrides = overrides;
  }

  public UserInventoryAddRequest skipInvoice(Boolean skipInvoice) {
    this.skipInvoice = skipInvoice;
    return this;
  }

   /**
   * If set to true will cause the endpoint to skip creation of cart and invoice to track the inventory change
   * @return skipInvoice
  **/
  @ApiModelProperty(example = "false", required = true, value = "If set to true will cause the endpoint to skip creation of cart and invoice to track the inventory change")
  public Boolean getSkipInvoice() {
    return skipInvoice;
  }

  public void setSkipInvoice(Boolean skipInvoice) {
    this.skipInvoice = skipInvoice;
  }

  public UserInventoryAddRequest sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * The specific SKU of the item to be added to the inventory
   * @return sku
  **/
  @ApiModelProperty(example = "null", required = true, value = "The specific SKU of the item to be added to the inventory")
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
    UserInventoryAddRequest userInventoryAddRequest = (UserInventoryAddRequest) o;
    return Objects.equals(this.note, userInventoryAddRequest.note) &&
        Objects.equals(this.overrides, userInventoryAddRequest.overrides) &&
        Objects.equals(this.skipInvoice, userInventoryAddRequest.skipInvoice) &&
        Objects.equals(this.sku, userInventoryAddRequest.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(note, overrides, skipInvoice, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInventoryAddRequest {\n");
    
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
    sb.append("    skipInvoice: ").append(toIndentedString(skipInvoice)).append("\n");
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

