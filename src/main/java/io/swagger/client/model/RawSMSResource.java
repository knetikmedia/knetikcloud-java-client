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
import java.util.ArrayList;
import java.util.List;

/**
 * RawSMSResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T18:38:49.191-05:00")
public class RawSMSResource {
  @SerializedName("from")
  private String from = null;

  @SerializedName("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @SerializedName("text")
  private String text = null;

  public RawSMSResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public RawSMSResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public RawSMSResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(example = "null", required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public RawSMSResource text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The body of the outgoing text message.
   * @return text
  **/
  @ApiModelProperty(example = "null", required = true, value = "The body of the outgoing text message.")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawSMSResource rawSMSResource = (RawSMSResource) o;
    return Objects.equals(this.from, rawSMSResource.from) &&
        Objects.equals(this.recipients, rawSMSResource.recipients) &&
        Objects.equals(this.text, rawSMSResource.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, recipients, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawSMSResource {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

