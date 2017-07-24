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
 * GooglePaymentRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-24T12:10:58.935-04:00")
public class GooglePaymentRequest {
  @JsonProperty("json_payload")
  private String jsonPayload = null;

  @JsonProperty("signature")
  private String signature = null;

  public GooglePaymentRequest jsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
    return this;
  }

   /**
   * The json payload exactly as sent from Google
   * @return jsonPayload
  **/
  @ApiModelProperty(required = true, value = "The json payload exactly as sent from Google")
  public String getJsonPayload() {
    return jsonPayload;
  }

  public void setJsonPayload(String jsonPayload) {
    this.jsonPayload = jsonPayload;
  }

  public GooglePaymentRequest signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The signature from Google to verify the payload
   * @return signature
  **/
  @ApiModelProperty(required = true, value = "The signature from Google to verify the payload")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglePaymentRequest googlePaymentRequest = (GooglePaymentRequest) o;
    return Objects.equals(this.jsonPayload, googlePaymentRequest.jsonPayload) &&
        Objects.equals(this.signature, googlePaymentRequest.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonPayload, signature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglePaymentRequest {\n");
    
    sb.append("    jsonPayload: ").append(toIndentedString(jsonPayload)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

