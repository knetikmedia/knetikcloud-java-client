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
 * SavedAddressResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-13T10:30:34.175-05:00")
public class SavedAddressResource {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("phone1")
  private String phone1 = null;

  @SerializedName("phone2")
  private String phone2 = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state_code")
  private String stateCode = null;

  public SavedAddressResource address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * The first line of the address
   * @return address1
  **/
  @ApiModelProperty(example = "null", required = true, value = "The first line of the address")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public SavedAddressResource address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * A second line of the address
   * @return address2
  **/
  @ApiModelProperty(example = "null", value = "A second line of the address")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public SavedAddressResource city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city
   * @return city
  **/
  @ApiModelProperty(example = "null", required = true, value = "The city")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SavedAddressResource countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The iso3 code for the country
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", required = true, value = "The iso3 code for the country")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SavedAddressResource _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public SavedAddressResource firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the user
   * @return firstName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The first name of the user")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

   /**
   * The id of the address
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the address")
  public Integer getId() {
    return id;
  }

  public SavedAddressResource lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the user
   * @return lastName
  **/
  @ApiModelProperty(example = "null", required = true, value = "The last name of the user")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SavedAddressResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the address
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the address")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SavedAddressResource phone1(String phone1) {
    this.phone1 = phone1;
    return this;
  }

   /**
   * The first phone number of the user
   * @return phone1
  **/
  @ApiModelProperty(example = "null", value = "The first phone number of the user")
  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }

  public SavedAddressResource phone2(String phone2) {
    this.phone2 = phone2;
    return this;
  }

   /**
   * The second phone number of the user
   * @return phone2
  **/
  @ApiModelProperty(example = "null", value = "The second phone number of the user")
  public String getPhone2() {
    return phone2;
  }

  public void setPhone2(String phone2) {
    this.phone2 = phone2;
  }

  public SavedAddressResource postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SavedAddressResource stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * The code for the state. Required if the country has states/provinces/equivalent
   * @return stateCode
  **/
  @ApiModelProperty(example = "null", value = "The code for the state. Required if the country has states/provinces/equivalent")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedAddressResource savedAddressResource = (SavedAddressResource) o;
    return Objects.equals(this.address1, savedAddressResource.address1) &&
        Objects.equals(this.address2, savedAddressResource.address2) &&
        Objects.equals(this.city, savedAddressResource.city) &&
        Objects.equals(this.countryCode, savedAddressResource.countryCode) &&
        Objects.equals(this._default, savedAddressResource._default) &&
        Objects.equals(this.firstName, savedAddressResource.firstName) &&
        Objects.equals(this.id, savedAddressResource.id) &&
        Objects.equals(this.lastName, savedAddressResource.lastName) &&
        Objects.equals(this.name, savedAddressResource.name) &&
        Objects.equals(this.phone1, savedAddressResource.phone1) &&
        Objects.equals(this.phone2, savedAddressResource.phone2) &&
        Objects.equals(this.postalCode, savedAddressResource.postalCode) &&
        Objects.equals(this.stateCode, savedAddressResource.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, countryCode, _default, firstName, id, lastName, name, phone1, phone2, postalCode, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedAddressResource {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

