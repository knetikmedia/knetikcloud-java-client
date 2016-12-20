/*
 * Knetik Platform API Documentation Latest
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://demo.sandbox.knetikcloud.com
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
 * StateTaxResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T17:13:25.977-05:00")
public class StateTaxResource {
  @SerializedName("country_iso3")
  private String countryIso3 = null;

  @SerializedName("federally_exempt")
  private Boolean federallyExempt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rate")
  private Double rate = null;

  @SerializedName("state_code")
  private String stateCode = null;

  @SerializedName("tax_shipping")
  private Boolean taxShipping = null;

  public StateTaxResource countryIso3(String countryIso3) {
    this.countryIso3 = countryIso3;
    return this;
  }

   /**
   * The iso3 code of the country, cannot be changed
   * @return countryIso3
  **/
  @ApiModelProperty(example = "null", required = true, value = "The iso3 code of the country, cannot be changed")
  public String getCountryIso3() {
    return countryIso3;
  }

  public void setCountryIso3(String countryIso3) {
    this.countryIso3 = countryIso3;
  }

  public StateTaxResource federallyExempt(Boolean federallyExempt) {
    this.federallyExempt = federallyExempt;
    return this;
  }

   /**
   * Whether the state is exempt from paying the country tax
   * @return federallyExempt
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the state is exempt from paying the country tax")
  public Boolean getFederallyExempt() {
    return federallyExempt;
  }

  public void setFederallyExempt(Boolean federallyExempt) {
    this.federallyExempt = federallyExempt;
  }

  public StateTaxResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the tax
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the tax")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StateTaxResource rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%)
   * @return rate
  **/
  @ApiModelProperty(example = "null", required = true, value = "The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%)")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }

  public StateTaxResource stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The code of the state, cannot be changed
   * @return stateCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The code of the state, cannot be changed")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public StateTaxResource taxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
    return this;
  }

   /**
   * Whether the tax applies to shipping costs
   * @return taxShipping
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the tax applies to shipping costs")
  public Boolean getTaxShipping() {
    return taxShipping;
  }

  public void setTaxShipping(Boolean taxShipping) {
    this.taxShipping = taxShipping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateTaxResource stateTaxResource = (StateTaxResource) o;
    return Objects.equals(this.countryIso3, stateTaxResource.countryIso3) &&
        Objects.equals(this.federallyExempt, stateTaxResource.federallyExempt) &&
        Objects.equals(this.name, stateTaxResource.name) &&
        Objects.equals(this.rate, stateTaxResource.rate) &&
        Objects.equals(this.stateCode, stateTaxResource.stateCode) &&
        Objects.equals(this.taxShipping, stateTaxResource.taxShipping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryIso3, federallyExempt, name, rate, stateCode, taxShipping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateTaxResource {\n");
    
    sb.append("    countryIso3: ").append(toIndentedString(countryIso3)).append("\n");
    sb.append("    federallyExempt: ").append(toIndentedString(federallyExempt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    taxShipping: ").append(toIndentedString(taxShipping)).append("\n");
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

