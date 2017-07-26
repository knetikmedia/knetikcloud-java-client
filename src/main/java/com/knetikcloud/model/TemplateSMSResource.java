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
import com.knetikcloud.model.Localizer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * TemplateSMSResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-26T11:50:12.891-04:00")
public class TemplateSMSResource {
  @JsonProperty("from")
  private String from = null;

  @JsonProperty("localizer")
  private Localizer localizer = null;

  @JsonProperty("recipients")
  private List<Integer> recipients = new ArrayList<Integer>();

  @JsonProperty("template_key")
  private String templateKey = null;

  @JsonProperty("template_vars")
  private List<String> templateVars = null;

  public TemplateSMSResource from(String from) {
    this.from = from;
    return this;
  }

   /**
   * The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.
   * @return from
  **/
  @ApiModelProperty(value = "The phone number to attribute the outgoing message to. Optional if the config text.out_number is set.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public TemplateSMSResource localizer(Localizer localizer) {
    this.localizer = localizer;
    return this;
  }

   /**
   * Get localizer
   * @return localizer
  **/
  @ApiModelProperty(value = "")
  public Localizer getLocalizer() {
    return localizer;
  }

  public void setLocalizer(Localizer localizer) {
    this.localizer = localizer;
  }

  public TemplateSMSResource recipients(List<Integer> recipients) {
    this.recipients = recipients;
    return this;
  }

  public TemplateSMSResource addRecipientsItem(Integer recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * A list of user ids to send the message to.
   * @return recipients
  **/
  @ApiModelProperty(required = true, value = "A list of user ids to send the message to.")
  public List<Integer> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<Integer> recipients) {
    this.recipients = recipients;
  }

  public TemplateSMSResource templateKey(String templateKey) {
    this.templateKey = templateKey;
    return this;
  }

   /**
   * The key for the template.
   * @return templateKey
  **/
  @ApiModelProperty(required = true, value = "The key for the template.")
  public String getTemplateKey() {
    return templateKey;
  }

  public void setTemplateKey(String templateKey) {
    this.templateKey = templateKey;
  }

  public TemplateSMSResource templateVars(List<String> templateVars) {
    this.templateVars = templateVars;
    return this;
  }

  public TemplateSMSResource addTemplateVarsItem(String templateVarsItem) {
    if (this.templateVars == null) {
      this.templateVars = new ArrayList<String>();
    }
    this.templateVars.add(templateVarsItem);
    return this;
  }

   /**
   * A list of values to fill in the template. Order matters.
   * @return templateVars
  **/
  @ApiModelProperty(value = "A list of values to fill in the template. Order matters.")
  public List<String> getTemplateVars() {
    return templateVars;
  }

  public void setTemplateVars(List<String> templateVars) {
    this.templateVars = templateVars;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateSMSResource templateSMSResource = (TemplateSMSResource) o;
    return Objects.equals(this.from, templateSMSResource.from) &&
        Objects.equals(this.localizer, templateSMSResource.localizer) &&
        Objects.equals(this.recipients, templateSMSResource.recipients) &&
        Objects.equals(this.templateKey, templateSMSResource.templateKey) &&
        Objects.equals(this.templateVars, templateSMSResource.templateVars);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, localizer, recipients, templateKey, templateVars);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateSMSResource {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    localizer: ").append(toIndentedString(localizer)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    templateKey: ").append(toIndentedString(templateKey)).append("\n");
    sb.append("    templateVars: ").append(toIndentedString(templateVars)).append("\n");
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

