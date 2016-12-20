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
 * FinalizePayPalPaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T17:13:25.977-05:00")
public class FinalizePayPalPaymentRequest {
  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("payer_id")
  private String payerId = null;

  @SerializedName("token")
  private String token = null;

  public FinalizePayPalPaymentRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of the invoice that is being paid. Must match the invoice sent in originally
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ID of the invoice that is being paid. Must match the invoice sent in originally")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public FinalizePayPalPaymentRequest payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

   /**
   * The ID of the payer that PayPal returned with the user at the return URL
   * @return payerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ID of the payer that PayPal returned with the user at the return URL")
  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public FinalizePayPalPaymentRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token that PayPal returned with the user in the return URL
   * @return token
  **/
  @ApiModelProperty(example = "null", required = true, value = "The token that PayPal returned with the user in the return URL")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizePayPalPaymentRequest finalizePayPalPaymentRequest = (FinalizePayPalPaymentRequest) o;
    return Objects.equals(this.invoiceId, finalizePayPalPaymentRequest.invoiceId) &&
        Objects.equals(this.payerId, finalizePayPalPaymentRequest.payerId) &&
        Objects.equals(this.token, finalizePayPalPaymentRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, payerId, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizePayPalPaymentRequest {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

