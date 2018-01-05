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
 * RefundResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:57:32.093-05:00")
public class RefundResource {
  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("refund_transaction_id")
  private Integer refundTransactionId = null;

  @JsonProperty("transaction_id")
  private Integer transactionId = null;

  public RefundResource amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount refunded
   * @return amount
  **/
  @ApiModelProperty(value = "The amount refunded")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public RefundResource refundTransactionId(Integer refundTransactionId) {
    this.refundTransactionId = refundTransactionId;
    return this;
  }

   /**
   * The id of the refund transaction
   * @return refundTransactionId
  **/
  @ApiModelProperty(value = "The id of the refund transaction")
  public Integer getRefundTransactionId() {
    return refundTransactionId;
  }

  public void setRefundTransactionId(Integer refundTransactionId) {
    this.refundTransactionId = refundTransactionId;
  }

  public RefundResource transactionId(Integer transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of the original transaction
   * @return transactionId
  **/
  @ApiModelProperty(value = "The id of the original transaction")
  public Integer getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundResource refundResource = (RefundResource) o;
    return Objects.equals(this.amount, refundResource.amount) &&
        Objects.equals(this.refundTransactionId, refundResource.refundTransactionId) &&
        Objects.equals(this.transactionId, refundResource.transactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, refundTransactionId, transactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundResource {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    refundTransactionId: ").append(toIndentedString(refundTransactionId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

