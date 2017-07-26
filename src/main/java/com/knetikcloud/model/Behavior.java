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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Behavior
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-26T11:50:12.891-04:00")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type_hint", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = TimePeriodGettable.class, name = "time_period_gettable"),
  @JsonSubTypes.Type(value = Expirable.class, name = "expirable"),
  @JsonSubTypes.Type(value = Fulfillable.class, name = "fulfillable"),
  @JsonSubTypes.Type(value = Consumable.class, name = "consumable"),
  @JsonSubTypes.Type(value = PreReqEntitlement.class, name = "pre_req_entitlement"),
  @JsonSubTypes.Type(value = GuestPlayable.class, name = "guest_playable"),
  @JsonSubTypes.Type(value = LimitedGettable.class, name = "limited_gettable"),
  @JsonSubTypes.Type(value = TimePeriodUsable.class, name = "time_period_usable"),
  @JsonSubTypes.Type(value = Spendable.class, name = "spendable"),
  @JsonSubTypes.Type(value = PriceOverridable.class, name = "price_overridable"),
})

public class Behavior {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type_hint")
  private String typeHint = null;

  public Behavior description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Behavior typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * Used for polymorphic type recognition and thus must match an expected type with additional properties
   * @return typeHint
  **/
  @ApiModelProperty(value = "Used for polymorphic type recognition and thus must match an expected type with additional properties")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Behavior behavior = (Behavior) o;
    return Objects.equals(this.description, behavior.description) &&
        Objects.equals(this.typeHint, behavior.typeHint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, typeHint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Behavior {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
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

