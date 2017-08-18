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
 * CountryResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-17T22:17:10.473-04:00")
public class CountryResource {
  @JsonProperty("iso2")
  private String iso2 = null;

  @JsonProperty("iso3")
  private String iso3 = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * The iso2 of the country
   * @return iso2
  **/
  @ApiModelProperty(value = "The iso2 of the country")
  public String getIso2() {
    return iso2;
  }

   /**
   * The iso3 of the country
   * @return iso3
  **/
  @ApiModelProperty(value = "The iso3 of the country")
  public String getIso3() {
    return iso3;
  }

   /**
   * The name of the country resource
   * @return name
  **/
  @ApiModelProperty(value = "The name of the country resource")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryResource countryResource = (CountryResource) o;
    return Objects.equals(this.iso2, countryResource.iso2) &&
        Objects.equals(this.iso3, countryResource.iso3) &&
        Objects.equals(this.name, countryResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iso2, iso3, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryResource {\n");
    
    sb.append("    iso2: ").append(toIndentedString(iso2)).append("\n");
    sb.append("    iso3: ").append(toIndentedString(iso3)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

