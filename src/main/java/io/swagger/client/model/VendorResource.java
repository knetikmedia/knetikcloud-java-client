/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * VendorResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:51:09.896-05:00")
public class VendorResource {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("create_date")
  private Long createDate = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("manual_approval")
  private Boolean manualApproval = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("primary_contact_email")
  private String primaryContactEmail = null;

  @SerializedName("primary_contact_name")
  private String primaryContactName = null;

  @SerializedName("primary_contact_phone")
  private String primaryContactPhone = null;

  @SerializedName("sales_email")
  private String salesEmail = null;

  @SerializedName("support_email")
  private String supportEmail = null;

  @SerializedName("update_date")
  private Long updateDate = null;

  @SerializedName("url")
  private String url = null;

  public VendorResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the vendor is active.  Default = true
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the vendor is active.  Default = true")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

   /**
   * The date the vendor was added. Unix timestamp in seconds
   * @return createDate
  **/
  @ApiModelProperty(example = "null", value = "The date the vendor was added. Unix timestamp in seconds")
  public Long getCreateDate() {
    return createDate;
  }

  public VendorResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the vendor
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A description of the vendor")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The id of the vendor
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the vendor")
  public Integer getId() {
    return id;
  }

  public VendorResource imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The url of an image for the vendor
   * @return imageUrl
  **/
  @ApiModelProperty(example = "null", value = "The url of an image for the vendor")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public VendorResource manualApproval(Boolean manualApproval) {
    this.manualApproval = manualApproval;
    return this;
  }

   /**
   * Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false
   * @return manualApproval
  **/
  @ApiModelProperty(example = "false", value = "Whether the vendor needs to manually approve invoices before they are paid.  A separate checkout flow is required in this case.  Default: false")
  public Boolean getManualApproval() {
    return manualApproval;
  }

  public void setManualApproval(Boolean manualApproval) {
    this.manualApproval = manualApproval;
  }

  public VendorResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the vendor
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the vendor")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VendorResource primaryContactEmail(String primaryContactEmail) {
    this.primaryContactEmail = primaryContactEmail;
    return this;
  }

   /**
   * The primary email address for the vendor
   * @return primaryContactEmail
  **/
  @ApiModelProperty(example = "null", value = "The primary email address for the vendor")
  public String getPrimaryContactEmail() {
    return primaryContactEmail;
  }

  public void setPrimaryContactEmail(String primaryContactEmail) {
    this.primaryContactEmail = primaryContactEmail;
  }

  public VendorResource primaryContactName(String primaryContactName) {
    this.primaryContactName = primaryContactName;
    return this;
  }

   /**
   * The name of the primary contact for the vendor
   * @return primaryContactName
  **/
  @ApiModelProperty(example = "null", value = "The name of the primary contact for the vendor")
  public String getPrimaryContactName() {
    return primaryContactName;
  }

  public void setPrimaryContactName(String primaryContactName) {
    this.primaryContactName = primaryContactName;
  }

  public VendorResource primaryContactPhone(String primaryContactPhone) {
    this.primaryContactPhone = primaryContactPhone;
    return this;
  }

   /**
   * The primary phone number for the vendor
   * @return primaryContactPhone
  **/
  @ApiModelProperty(example = "null", value = "The primary phone number for the vendor")
  public String getPrimaryContactPhone() {
    return primaryContactPhone;
  }

  public void setPrimaryContactPhone(String primaryContactPhone) {
    this.primaryContactPhone = primaryContactPhone;
  }

  public VendorResource salesEmail(String salesEmail) {
    this.salesEmail = salesEmail;
    return this;
  }

   /**
   * The email address for sale inquiries for the vendor
   * @return salesEmail
  **/
  @ApiModelProperty(example = "null", value = "The email address for sale inquiries for the vendor")
  public String getSalesEmail() {
    return salesEmail;
  }

  public void setSalesEmail(String salesEmail) {
    this.salesEmail = salesEmail;
  }

  public VendorResource supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * The email address for support inquiries for the vendor
   * @return supportEmail
  **/
  @ApiModelProperty(example = "null", value = "The email address for support inquiries for the vendor")
  public String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }

   /**
   * The date the vendor was last updated. Unix timestamp in seconds
   * @return updateDate
  **/
  @ApiModelProperty(example = "null", value = "The date the vendor was last updated. Unix timestamp in seconds")
  public Long getUpdateDate() {
    return updateDate;
  }

  public VendorResource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The url for the vendor's site
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The url for the vendor's site")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorResource vendorResource = (VendorResource) o;
    return Objects.equals(this.active, vendorResource.active) &&
        Objects.equals(this.createDate, vendorResource.createDate) &&
        Objects.equals(this.description, vendorResource.description) &&
        Objects.equals(this.id, vendorResource.id) &&
        Objects.equals(this.imageUrl, vendorResource.imageUrl) &&
        Objects.equals(this.manualApproval, vendorResource.manualApproval) &&
        Objects.equals(this.name, vendorResource.name) &&
        Objects.equals(this.primaryContactEmail, vendorResource.primaryContactEmail) &&
        Objects.equals(this.primaryContactName, vendorResource.primaryContactName) &&
        Objects.equals(this.primaryContactPhone, vendorResource.primaryContactPhone) &&
        Objects.equals(this.salesEmail, vendorResource.salesEmail) &&
        Objects.equals(this.supportEmail, vendorResource.supportEmail) &&
        Objects.equals(this.updateDate, vendorResource.updateDate) &&
        Objects.equals(this.url, vendorResource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, createDate, description, id, imageUrl, manualApproval, name, primaryContactEmail, primaryContactName, primaryContactPhone, salesEmail, supportEmail, updateDate, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    manualApproval: ").append(toIndentedString(manualApproval)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryContactEmail: ").append(toIndentedString(primaryContactEmail)).append("\n");
    sb.append("    primaryContactName: ").append(toIndentedString(primaryContactName)).append("\n");
    sb.append("    primaryContactPhone: ").append(toIndentedString(primaryContactPhone)).append("\n");
    sb.append("    salesEmail: ").append(toIndentedString(salesEmail)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

