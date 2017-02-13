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
 * Affiliate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-13T10:30:34.175-05:00")
public class Affiliate {
  @SerializedName("affiliate_key")
  private String affiliateKey = null;

  @SerializedName("id")
  private Integer id = null;

  public Affiliate affiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
    return this;
  }

   /**
   * Get affiliateKey
   * @return affiliateKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAffiliateKey() {
    return affiliateKey;
  }

  public void setAffiliateKey(String affiliateKey) {
    this.affiliateKey = affiliateKey;
  }

  public Affiliate id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Affiliate affiliate = (Affiliate) o;
    return Objects.equals(this.affiliateKey, affiliate.affiliateKey) &&
        Objects.equals(this.id, affiliate.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateKey, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Affiliate {\n");
    
    sb.append("    affiliateKey: ").append(toIndentedString(affiliateKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

