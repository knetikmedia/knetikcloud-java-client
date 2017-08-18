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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SubscriptionPriceOverrideRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-17T22:17:10.473-04:00")
public class SubscriptionPriceOverrideRequest {
  @JsonProperty("new_price")
  private Double newPrice = null;

  @JsonProperty("reason")
  private String reason = null;

  public SubscriptionPriceOverrideRequest newPrice(Double newPrice) {
    this.newPrice = newPrice;
    return this;
  }

   /**
   * The recurring price that has been set to override the base price. Null if not overriding
   * @return newPrice
  **/
  @ApiModelProperty(value = "The recurring price that has been set to override the base price. Null if not overriding")
  public Double getNewPrice() {
    return newPrice;
  }

  public void setNewPrice(Double newPrice) {
    this.newPrice = newPrice;
  }

  public SubscriptionPriceOverrideRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * An explanation for the reason the price is being overridden
   * @return reason
  **/
  @ApiModelProperty(value = "An explanation for the reason the price is being overridden")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPriceOverrideRequest subscriptionPriceOverrideRequest = (SubscriptionPriceOverrideRequest) o;
    return Objects.equals(this.newPrice, subscriptionPriceOverrideRequest.newPrice) &&
        Objects.equals(this.reason, subscriptionPriceOverrideRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newPrice, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPriceOverrideRequest {\n");
    
    sb.append("    newPrice: ").append(toIndentedString(newPrice)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

