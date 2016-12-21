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
 * AmazonS3Activity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:09:59.107-05:00")
public class AmazonS3Activity {
  @SerializedName("action")
  private String action = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("object_key")
  private String objectKey = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("user_id")
  private Integer userId = null;

  public AmazonS3Activity action(String action) {
    this.action = action;
    return this;
  }

   /**
   * S3 action (i.e., 'PUT') associated with the activity
   * @return action
  **/
  @ApiModelProperty(example = "null", value = "S3 action (i.e., 'PUT') associated with the activity")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public AmazonS3Activity createdDate(Long createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Date the resource was created in S3
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "Date the resource was created in S3")
  public Long getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Long createdDate) {
    this.createdDate = createdDate;
  }

  public AmazonS3Activity filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * Name of the file being processed as a resource in S3
   * @return filename
  **/
  @ApiModelProperty(example = "null", value = "Name of the file being processed as a resource in S3")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

   /**
   * Unique id of the S3 activity
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique id of the S3 activity")
  public Long getId() {
    return id;
  }

  public AmazonS3Activity objectKey(String objectKey) {
    this.objectKey = objectKey;
    return this;
  }

   /**
   * S3 object key for the resource
   * @return objectKey
  **/
  @ApiModelProperty(example = "null", value = "S3 object key for the resource")
  public String getObjectKey() {
    return objectKey;
  }

  public void setObjectKey(String objectKey) {
    this.objectKey = objectKey;
  }

  public AmazonS3Activity url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL for accessing the S3 resource
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "URL for accessing the S3 resource")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public AmazonS3Activity userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the user that created this S3 activity
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "The id of the user that created this S3 activity")
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
    AmazonS3Activity amazonS3Activity = (AmazonS3Activity) o;
    return Objects.equals(this.action, amazonS3Activity.action) &&
        Objects.equals(this.createdDate, amazonS3Activity.createdDate) &&
        Objects.equals(this.filename, amazonS3Activity.filename) &&
        Objects.equals(this.id, amazonS3Activity.id) &&
        Objects.equals(this.objectKey, amazonS3Activity.objectKey) &&
        Objects.equals(this.url, amazonS3Activity.url) &&
        Objects.equals(this.userId, amazonS3Activity.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, createdDate, filename, id, objectKey, url, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AmazonS3Activity {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

