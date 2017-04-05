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


package com.knetikcloud.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WalletTotalResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-05T15:45:46.506-04:00")
public class WalletTotalResponse {
  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("total")
  private Double total = null;

  public WalletTotalResponse currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The currency code
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "The currency code")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public WalletTotalResponse total(Double total) {
    this.total = total;
    return this;
  }

   /**
   * The sum of all wallets in the system for this currency
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "The sum of all wallets in the system for this currency")
  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTotalResponse walletTotalResponse = (WalletTotalResponse) o;
    return Objects.equals(this.currencyCode, walletTotalResponse.currencyCode) &&
        Objects.equals(this.total, walletTotalResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTotalResponse {\n");
    
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
