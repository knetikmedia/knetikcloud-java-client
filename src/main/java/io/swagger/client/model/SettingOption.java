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
 * SettingOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:49:29.968-05:00")
public class SettingOption {
  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private String value = null;

  public SettingOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The textual name of the option
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The textual name of the option")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * The unique ID for the option
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for the option")
  public String getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingOption settingOption = (SettingOption) o;
    return Objects.equals(this.name, settingOption.name) &&
        Objects.equals(this.value, settingOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingOption {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

