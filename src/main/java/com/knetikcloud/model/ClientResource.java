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
import java.util.ArrayList;
import java.util.List;

/**
 * ClientResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-26T11:50:12.891-04:00")
public class ClientResource {
  @JsonProperty("access_token_validity_seconds")
  private Integer accessTokenValiditySeconds = null;

  @JsonProperty("client_key")
  private String clientKey = null;

  @JsonProperty("grant_types")
  private List<String> grantTypes = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("is_public")
  private Boolean isPublic = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("redirect_uris")
  private List<String> redirectUris = null;

  @JsonProperty("refresh_token_validity_seconds")
  private Integer refreshTokenValiditySeconds = null;

  @JsonProperty("secret")
  private String secret = null;

  public ClientResource accessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    return this;
  }

   /**
   * The expiration time of an initial oauth token in seconds
   * @return accessTokenValiditySeconds
  **/
  @ApiModelProperty(value = "The expiration time of an initial oauth token in seconds")
  public Integer getAccessTokenValiditySeconds() {
    return accessTokenValiditySeconds;
  }

  public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
    this.accessTokenValiditySeconds = accessTokenValiditySeconds;
  }

  public ClientResource clientKey(String clientKey) {
    this.clientKey = clientKey;
    return this;
  }

   /**
   * The client_id field of the oauth token request
   * @return clientKey
  **/
  @ApiModelProperty(required = true, value = "The client_id field of the oauth token request")
  public String getClientKey() {
    return clientKey;
  }

  public void setClientKey(String clientKey) {
    this.clientKey = clientKey;
  }

  public ClientResource grantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
    return this;
  }

  public ClientResource addGrantTypesItem(String grantTypesItem) {
    if (this.grantTypes == null) {
      this.grantTypes = new ArrayList<String>();
    }
    this.grantTypes.add(grantTypesItem);
    return this;
  }

   /**
   * The oauth grant type as in: password (username/password auth), client_credentials (server-to-server, private clients), refresh_token (to allow clients to refresh their initial token), facebook, google, etc) See documentation for a complete list. Use dedicated endpoint PUT /grant-types to edit this list
   * @return grantTypes
  **/
  @ApiModelProperty(value = "The oauth grant type as in: password (username/password auth), client_credentials (server-to-server, private clients), refresh_token (to allow clients to refresh their initial token), facebook, google, etc) See documentation for a complete list. Use dedicated endpoint PUT /grant-types to edit this list")
  public List<String> getGrantTypes() {
    return grantTypes;
  }

  public void setGrantTypes(List<String> grantTypes) {
    this.grantTypes = grantTypes;
  }

   /**
   * Generated unique ID for the client
   * @return id
  **/
  @ApiModelProperty(value = "Generated unique ID for the client")
  public Integer getId() {
    return id;
  }

  public ClientResource isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Set to true if the client is public i.e the secret key can be secured
   * @return isPublic
  **/
  @ApiModelProperty(example = "false", value = "Set to true if the client is public i.e the secret key can be secured")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public ClientResource locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Used to flag system clients that are not meant to be tinkered with
   * @return locked
  **/
  @ApiModelProperty(example = "false", value = "Used to flag system clients that are not meant to be tinkered with")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public ClientResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The friendly name of the client
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The friendly name of the client")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClientResource redirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  public ClientResource addRedirectUrisItem(String redirectUrisItem) {
    if (this.redirectUris == null) {
      this.redirectUris = new ArrayList<String>();
    }
    this.redirectUris.add(redirectUrisItem);
    return this;
  }

   /**
   * A redirection URL to use when granting access to third-parties (seldomly used)
   * @return redirectUris
  **/
  @ApiModelProperty(value = "A redirection URL to use when granting access to third-parties (seldomly used)")
  public List<String> getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(List<String> redirectUris) {
    this.redirectUris = redirectUris;
  }

  public ClientResource refreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
    return this;
  }

   /**
   * The expiration time of a refresh oauth token in seconds
   * @return refreshTokenValiditySeconds
  **/
  @ApiModelProperty(value = "The expiration time of a refresh oauth token in seconds")
  public Integer getRefreshTokenValiditySeconds() {
    return refreshTokenValiditySeconds;
  }

  public void setRefreshTokenValiditySeconds(Integer refreshTokenValiditySeconds) {
    this.refreshTokenValiditySeconds = refreshTokenValiditySeconds;
  }

  public ClientResource secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * The client-secret field of the oauth request when creating a private client
   * @return secret
  **/
  @ApiModelProperty(required = true, value = "The client-secret field of the oauth request when creating a private client")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientResource clientResource = (ClientResource) o;
    return Objects.equals(this.accessTokenValiditySeconds, clientResource.accessTokenValiditySeconds) &&
        Objects.equals(this.clientKey, clientResource.clientKey) &&
        Objects.equals(this.grantTypes, clientResource.grantTypes) &&
        Objects.equals(this.id, clientResource.id) &&
        Objects.equals(this.isPublic, clientResource.isPublic) &&
        Objects.equals(this.locked, clientResource.locked) &&
        Objects.equals(this.name, clientResource.name) &&
        Objects.equals(this.redirectUris, clientResource.redirectUris) &&
        Objects.equals(this.refreshTokenValiditySeconds, clientResource.refreshTokenValiditySeconds) &&
        Objects.equals(this.secret, clientResource.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessTokenValiditySeconds, clientKey, grantTypes, id, isPublic, locked, name, redirectUris, refreshTokenValiditySeconds, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientResource {\n");
    
    sb.append("    accessTokenValiditySeconds: ").append(toIndentedString(accessTokenValiditySeconds)).append("\n");
    sb.append("    clientKey: ").append(toIndentedString(clientKey)).append("\n");
    sb.append("    grantTypes: ").append(toIndentedString(grantTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    refreshTokenValiditySeconds: ").append(toIndentedString(refreshTokenValiditySeconds)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

