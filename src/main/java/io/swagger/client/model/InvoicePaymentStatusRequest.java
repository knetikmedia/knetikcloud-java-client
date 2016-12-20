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
 * InvoicePaymentStatusRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T17:13:25.977-05:00")
public class InvoicePaymentStatusRequest {
  @SerializedName("payment_method_id")
  private Integer paymentMethodId = null;

  @SerializedName("status")
  private String status = null;

  public InvoicePaymentStatusRequest paymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * If included, will set the payment method used on the invoice
   * @return paymentMethodId
  **/
  @ApiModelProperty(example = "null", value = "If included, will set the payment method used on the invoice")
  public Integer getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(Integer paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public InvoicePaymentStatusRequest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund'
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "The new status for the invoice. Additional options may be available based on configuration.  Allowable values: 'new', 'paid', 'hold', 'canceled', 'payment failed', 'partial refund', 'refund'")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePaymentStatusRequest invoicePaymentStatusRequest = (InvoicePaymentStatusRequest) o;
    return Objects.equals(this.paymentMethodId, invoicePaymentStatusRequest.paymentMethodId) &&
        Objects.equals(this.status, invoicePaymentStatusRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethodId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePaymentStatusRequest {\n");
    
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
