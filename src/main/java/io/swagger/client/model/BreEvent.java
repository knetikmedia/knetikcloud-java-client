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
 * BreEvent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:49:29.968-05:00")
public class BreEvent {
  @SerializedName("event_name")
  private String eventName = null;

  @SerializedName("params")
  private Object params = null;

  public BreEvent eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

   /**
   * The event name of the trigger to be fired
   * @return eventName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The event name of the trigger to be fired")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public BreEvent params(Object params) {
    this.params = params;
    return this;
  }

   /**
   * The parameters to the event. A Map (assosiative array) with a key for each trigger parameter name and a corrosponding value.
   * @return params
  **/
  @ApiModelProperty(example = "null", required = true, value = "The parameters to the event. A Map (assosiative array) with a key for each trigger parameter name and a corrosponding value.")
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreEvent breEvent = (BreEvent) o;
    return Objects.equals(this.eventName, breEvent.eventName) &&
        Objects.equals(this.params, breEvent.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreEvent {\n");
    
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

