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
 * ForwardLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T15:48:30.259-05:00")
public class ForwardLog {
  @SerializedName("end_date")
  private Long endDate = null;

  @SerializedName("error_msg")
  private String errorMsg = null;

  @SerializedName("http_status_code")
  private Integer httpStatusCode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("payload")
  private Object payload = null;

  @SerializedName("response")
  private String response = null;

  @SerializedName("retry_count")
  private Integer retryCount = null;

  @SerializedName("start_date")
  private Long startDate = null;

  @SerializedName("url")
  private String url = null;

   /**
   * The end date of the forward log entry
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "The end date of the forward log entry")
  public Long getEndDate() {
    return endDate;
  }

  public ForwardLog errorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

   /**
   * Get errorMsg
   * @return errorMsg
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorMsg() {
    return errorMsg;
  }

  public void setErrorMsg(String errorMsg) {
    this.errorMsg = errorMsg;
  }

   /**
   * The http status code the forward log entry
   * @return httpStatusCode
  **/
  @ApiModelProperty(example = "null", value = "The http status code the forward log entry")
  public Integer getHttpStatusCode() {
    return httpStatusCode;
  }

   /**
   * The id of the forward log entry
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the forward log entry")
  public String getId() {
    return id;
  }

  public ForwardLog payload(Object payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload of the forward log entry
   * @return payload
  **/
  @ApiModelProperty(example = "null", value = "The payload of the forward log entry")
  public Object getPayload() {
    return payload;
  }

  public void setPayload(Object payload) {
    this.payload = payload;
  }

   /**
   * The response string of the forward log entry
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "The response string of the forward log entry")
  public String getResponse() {
    return response;
  }

   /**
   * The retry count of the forward log entry
   * @return retryCount
  **/
  @ApiModelProperty(example = "null", value = "The retry count of the forward log entry")
  public Integer getRetryCount() {
    return retryCount;
  }

   /**
   * The start date of the forward log entry
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "The start date of the forward log entry")
  public Long getStartDate() {
    return startDate;
  }

   /**
   * The endpoint url of the forward log entry
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "The endpoint url of the forward log entry")
  public String getUrl() {
    return url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForwardLog forwardLog = (ForwardLog) o;
    return Objects.equals(this.endDate, forwardLog.endDate) &&
        Objects.equals(this.errorMsg, forwardLog.errorMsg) &&
        Objects.equals(this.httpStatusCode, forwardLog.httpStatusCode) &&
        Objects.equals(this.id, forwardLog.id) &&
        Objects.equals(this.payload, forwardLog.payload) &&
        Objects.equals(this.response, forwardLog.response) &&
        Objects.equals(this.retryCount, forwardLog.retryCount) &&
        Objects.equals(this.startDate, forwardLog.startDate) &&
        Objects.equals(this.url, forwardLog.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, errorMsg, httpStatusCode, id, payload, response, retryCount, startDate, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForwardLog {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
    sb.append("    httpStatusCode: ").append(toIndentedString(httpStatusCode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

