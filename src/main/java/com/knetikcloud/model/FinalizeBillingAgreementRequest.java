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
 * FinalizeBillingAgreementRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-05T16:57:32.093-05:00")
public class FinalizeBillingAgreementRequest {
  @JsonProperty("invoice_id")
  private Integer invoiceId = null;

  @JsonProperty("new_default")
  private Boolean newDefault = null;

  @JsonProperty("payer_id")
  private String payerId = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  public FinalizeBillingAgreementRequest invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The ID of the invoice being paid along with the creation of this agreement
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The ID of the invoice being paid along with the creation of this agreement")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public FinalizeBillingAgreementRequest newDefault(Boolean newDefault) {
    this.newDefault = newDefault;
    return this;
  }

   /**
   * Whether the new payment method created should be the user&#39;s default
   * @return newDefault
  **/
  @ApiModelProperty(example = "false", value = "Whether the new payment method created should be the user's default")
  public Boolean isNewDefault() {
    return newDefault;
  }

  public void setNewDefault(Boolean newDefault) {
    this.newDefault = newDefault;
  }

  public FinalizeBillingAgreementRequest payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

   /**
   * The payer ID from PayPal (passed as a parameter in the return URL). Only required if an invoice ID was included
   * @return payerId
  **/
  @ApiModelProperty(value = "The payer ID from PayPal (passed as a parameter in the return URL). Only required if an invoice ID was included")
  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  public FinalizeBillingAgreementRequest token(String token) {
    this.token = token;
    return this;
  }

   /**
   * The token from PayPal (passed as a parameter in the return URL)
   * @return token
  **/
  @ApiModelProperty(required = true, value = "The token from PayPal (passed as a parameter in the return URL)")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public FinalizeBillingAgreementRequest userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The ID of the user. Defaults to the logged in user
   * @return userId
  **/
  @ApiModelProperty(value = "The ID of the user. Defaults to the logged in user")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinalizeBillingAgreementRequest finalizeBillingAgreementRequest = (FinalizeBillingAgreementRequest) o;
    return Objects.equals(this.invoiceId, finalizeBillingAgreementRequest.invoiceId) &&
        Objects.equals(this.newDefault, finalizeBillingAgreementRequest.newDefault) &&
        Objects.equals(this.payerId, finalizeBillingAgreementRequest.payerId) &&
        Objects.equals(this.token, finalizeBillingAgreementRequest.token) &&
        Objects.equals(this.userId, finalizeBillingAgreementRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceId, newDefault, payerId, token, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinalizeBillingAgreementRequest {\n");
    
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    newDefault: ").append(toIndentedString(newDefault)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

