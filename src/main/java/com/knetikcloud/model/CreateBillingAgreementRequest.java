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
 * CreateBillingAgreementRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class CreateBillingAgreementRequest {
  @JsonProperty("cancel_url")
  private String cancelUrl = null;

  @JsonProperty("return_url")
  private String returnUrl = null;

  @JsonProperty("user_id")
  private Integer userId = null;

  public CreateBillingAgreementRequest cancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user if they cancel (do not accept) the agreement
   * @return cancelUrl
  **/
  @ApiModelProperty(required = true, value = "The endpoint URL to which PayPal should forward the user if they cancel (do not accept) the agreement")
  public String getCancelUrl() {
    return cancelUrl;
  }

  public void setCancelUrl(String cancelUrl) {
    this.cancelUrl = cancelUrl;
  }

  public CreateBillingAgreementRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

   /**
   * The endpoint URL to which PayPal should forward the user after they accept the agreement. This endpoint will receive information needed for the next step
   * @return returnUrl
  **/
  @ApiModelProperty(required = true, value = "The endpoint URL to which PayPal should forward the user after they accept the agreement. This endpoint will receive information needed for the next step")
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  public CreateBillingAgreementRequest userId(Integer userId) {
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
    CreateBillingAgreementRequest createBillingAgreementRequest = (CreateBillingAgreementRequest) o;
    return Objects.equals(this.cancelUrl, createBillingAgreementRequest.cancelUrl) &&
        Objects.equals(this.returnUrl, createBillingAgreementRequest.returnUrl) &&
        Objects.equals(this.userId, createBillingAgreementRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelUrl, returnUrl, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBillingAgreementRequest {\n");
    
    sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

