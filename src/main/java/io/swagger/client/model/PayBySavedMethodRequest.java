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
 * PayBySavedMethodRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-21T16:56:46.799-05:00")
public class PayBySavedMethodRequest {
  @SerializedName("payment_method")
  private Integer paymentMethod = null;

  public PayBySavedMethodRequest paymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * The id of the payment method to use. Must belong to the caller, be public or have PAYMENTS_ADMIN permission
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", required = true, value = "The id of the payment method to use. Must belong to the caller, be public or have PAYMENTS_ADMIN permission")
  public Integer getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayBySavedMethodRequest payBySavedMethodRequest = (PayBySavedMethodRequest) o;
    return Objects.equals(this.paymentMethod, payBySavedMethodRequest.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayBySavedMethodRequest {\n");
    
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

