/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com.
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.knetikcloud.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.knetikcloud.model.Behavior;
import com.knetikcloud.model.Property;
import com.knetikcloud.model.Sku;
import com.knetikcloud.model.StoreItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * ShippingItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-23T15:22:27.937-04:00")
public class ShippingItem extends StoreItem {
  @JsonProperty("countries")
  private List<String> countries = null;

  @JsonProperty("max_tier_total")
  private Integer maxTierTotal = null;

  @JsonProperty("taxable")
  private Boolean taxable = null;

  public ShippingItem countries(List<String> countries) {
    this.countries = countries;
    return this;
  }

  public ShippingItem addCountriesItem(String countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<String>();
    }
    this.countries.add(countriesItem);
    return this;
  }

   /**
   * A unique list of country iso3 codes that allow the shipping option
   * @return countries
  **/
  @ApiModelProperty(value = "A unique list of country iso3 codes that allow the shipping option")
  public List<String> getCountries() {
    return countries;
  }

  public void setCountries(List<String> countries) {
    this.countries = countries;
  }

  public ShippingItem maxTierTotal(Integer maxTierTotal) {
    this.maxTierTotal = maxTierTotal;
    return this;
  }

   /**
   * An abstract max value that the values of item&#39;s shipping_tier work against to decide whether an order can be fulfilled
   * @return maxTierTotal
  **/
  @ApiModelProperty(required = true, value = "An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled")
  public Integer getMaxTierTotal() {
    return maxTierTotal;
  }

  public void setMaxTierTotal(Integer maxTierTotal) {
    this.maxTierTotal = maxTierTotal;
  }

  public ShippingItem taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Whether tax should be applied to the shipping price.  Default &#x3D; false
   * @return taxable
  **/
  @ApiModelProperty(example = "false", value = "Whether tax should be applied to the shipping price.  Default = false")
  public Boolean isTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShippingItem shippingItem = (ShippingItem) o;
    return Objects.equals(this.countries, shippingItem.countries) &&
        Objects.equals(this.maxTierTotal, shippingItem.maxTierTotal) &&
        Objects.equals(this.taxable, shippingItem.taxable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countries, maxTierTotal, taxable, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShippingItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    maxTierTotal: ").append(toIndentedString(maxTierTotal)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
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

