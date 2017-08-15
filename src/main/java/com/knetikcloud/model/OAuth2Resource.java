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
 * OAuth2Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-15T12:24:42.748-04:00")
public class OAuth2Resource {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private String expiresIn = null;

  @JsonProperty("scope")
  private String scope = null;

  @JsonProperty("token_type")
  private String tokenType = null;

   /**
   * The access token issued by the authorization server
   * @return accessToken
  **/
  @ApiModelProperty(value = "The access token issued by the authorization server")
  public String getAccessToken() {
    return accessToken;
  }

   /**
   * The lifetime in seconds of the access token
   * @return expiresIn
  **/
  @ApiModelProperty(value = "The lifetime in seconds of the access token")
  public String getExpiresIn() {
    return expiresIn;
  }

   /**
   * The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions
   * @return scope
  **/
  @ApiModelProperty(value = "The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions")
  public String getScope() {
    return scope;
  }

   /**
   * The type of the token issued
   * @return tokenType
  **/
  @ApiModelProperty(value = "The type of the token issued")
  public String getTokenType() {
    return tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2Resource oauth2Resource = (OAuth2Resource) o;
    return Objects.equals(this.accessToken, oauth2Resource.accessToken) &&
        Objects.equals(this.expiresIn, oauth2Resource.expiresIn) &&
        Objects.equals(this.scope, oauth2Resource.scope) &&
        Objects.equals(this.tokenType, oauth2Resource.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, scope, tokenType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2Resource {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

