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
import io.swagger.client.model.Property;
import io.swagger.client.model.UserRelationshipReferenceResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-13T10:30:34.175-05:00")
public class UserResource {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("address")
  private String address = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("avatar_url")
  private String avatarUrl = null;

  @SerializedName("children")
  private List<UserRelationshipReferenceResource> children = new ArrayList<UserRelationshipReferenceResource>();

  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("date_of_birth")
  private Long dateOfBirth = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("fullname")
  private String fullname = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("language_code")
  private String languageCode = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("mobile_number")
  private String mobileNumber = null;

  @SerializedName("parents")
  private List<UserRelationshipReferenceResource> parents = new ArrayList<UserRelationshipReferenceResource>();

  @SerializedName("password")
  private String password = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("timezone_code")
  private String timezoneCode = null;

  @SerializedName("username")
  private String username = null;

  public UserResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public UserResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public UserResource address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The first line of the user's address (private)
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "The first line of the user's address (private)")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserResource address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * The second line of user's address (private)
   * @return address2
  **/
  @ApiModelProperty(example = "null", value = "The second line of user's address (private)")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public UserResource avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The url of the user's avatar image
   * @return avatarUrl
  **/
  @ApiModelProperty(example = "null", value = "The url of the user's avatar image")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public UserResource children(List<UserRelationshipReferenceResource> children) {
    this.children = children;
    return this;
  }

  public UserResource addChildrenItem(UserRelationshipReferenceResource childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Relationships where this user is the parent. Read-Only, manage through separate endpoints
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "Relationships where this user is the parent. Read-Only, manage through separate endpoints")
  public List<UserRelationshipReferenceResource> getChildren() {
    return children;
  }

  public void setChildren(List<UserRelationshipReferenceResource> children) {
    this.children = children;
  }

  public UserResource city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The user's city (private)
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The user's city (private)")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserResource countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * The ISO3 code for the country from the user's address (private). Will be filled in based on GeoIP country at registration if not provided.
   * @return countryCode
  **/
  @ApiModelProperty(example = "null", value = "The ISO3 code for the country from the user's address (private). Will be filled in based on GeoIP country at registration if not provided.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public UserResource currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The code for the user's real money currency (private)
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "The code for the user's real money currency (private)")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public UserResource dateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The user's date of birth (private) as a unix timestamp
   * @return dateOfBirth
  **/
  @ApiModelProperty(example = "null", value = "The user's date of birth (private) as a unix timestamp")
  public Long getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Long dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public UserResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The user's self description (private)
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The user's self description (private)")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserResource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The chosen display name of the user, defaults to username if not present
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "The chosen display name of the user, defaults to username if not present")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)
   * @return email
  **/
  @ApiModelProperty(example = "null", required = true, value = "The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822)")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserResource firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The user's first name (private)
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "The user's first name (private)")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserResource fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

   /**
   * The user's full name (private)
   * @return fullname
  **/
  @ApiModelProperty(example = "null", value = "The user's full name (private)")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public UserResource gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * The user's gender (private)
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "The user's gender (private)")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

   /**
   * The id of the user
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the user")
  public Integer getId() {
    return id;
  }

  public UserResource languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * The ISO3 code for the user's currency (private)
   * @return languageCode
  **/
  @ApiModelProperty(example = "null", value = "The ISO3 code for the user's currency (private)")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public UserResource lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The user's last name (private)
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "The user's last name (private)")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserResource mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * The user's mobile phone number (private)
   * @return mobileNumber
  **/
  @ApiModelProperty(example = "null", value = "The user's mobile phone number (private)")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserResource parents(List<UserRelationshipReferenceResource> parents) {
    this.parents = parents;
    return this;
  }

  public UserResource addParentsItem(UserRelationshipReferenceResource parentsItem) {
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Relationships where this user is the child. Read-Only, manage through separate endpoints
   * @return parents
  **/
  @ApiModelProperty(example = "null", value = "Relationships where this user is the child. Read-Only, manage through separate endpoints")
  public List<UserRelationshipReferenceResource> getParents() {
    return parents;
  }

  public void setParents(List<UserRelationshipReferenceResource> parents) {
    this.parents = parents;
  }

  public UserResource password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserResource postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The user's postal code (private)
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The user's postal code (private)")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public UserResource state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The user's state (private)
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "The user's state (private)")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public UserResource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserResource addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags on the user. Can only be set by admin. Max length per tag is 64 characters
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "Tags on the user. Can only be set by admin. Max length per tag is 64 characters")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UserResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A user template this user is validated against (private). May be null and no validation of properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "A user template this user is validated against (private). May be null and no validation of properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public UserResource timezoneCode(String timezoneCode) {
    this.timezoneCode = timezoneCode;
    return this;
  }

   /**
   * The code for the user's timezone (private)
   * @return timezoneCode
  **/
  @ApiModelProperty(example = "null", value = "The code for the user's timezone (private)")
  public String getTimezoneCode() {
    return timezoneCode;
  }

  public void setTimezoneCode(String timezoneCode) {
    this.timezoneCode = timezoneCode;
  }

  public UserResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The login username for the user (private). May be set to match email if system does not require usernames separately.
   * @return username
  **/
  @ApiModelProperty(example = "null", required = true, value = "The login username for the user (private). May be set to match email if system does not require usernames separately.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResource userResource = (UserResource) o;
    return Objects.equals(this.additionalProperties, userResource.additionalProperties) &&
        Objects.equals(this.address, userResource.address) &&
        Objects.equals(this.address2, userResource.address2) &&
        Objects.equals(this.avatarUrl, userResource.avatarUrl) &&
        Objects.equals(this.children, userResource.children) &&
        Objects.equals(this.city, userResource.city) &&
        Objects.equals(this.countryCode, userResource.countryCode) &&
        Objects.equals(this.currencyCode, userResource.currencyCode) &&
        Objects.equals(this.dateOfBirth, userResource.dateOfBirth) &&
        Objects.equals(this.description, userResource.description) &&
        Objects.equals(this.displayName, userResource.displayName) &&
        Objects.equals(this.email, userResource.email) &&
        Objects.equals(this.firstName, userResource.firstName) &&
        Objects.equals(this.fullname, userResource.fullname) &&
        Objects.equals(this.gender, userResource.gender) &&
        Objects.equals(this.id, userResource.id) &&
        Objects.equals(this.languageCode, userResource.languageCode) &&
        Objects.equals(this.lastName, userResource.lastName) &&
        Objects.equals(this.mobileNumber, userResource.mobileNumber) &&
        Objects.equals(this.parents, userResource.parents) &&
        Objects.equals(this.password, userResource.password) &&
        Objects.equals(this.postalCode, userResource.postalCode) &&
        Objects.equals(this.state, userResource.state) &&
        Objects.equals(this.tags, userResource.tags) &&
        Objects.equals(this.template, userResource.template) &&
        Objects.equals(this.timezoneCode, userResource.timezoneCode) &&
        Objects.equals(this.username, userResource.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, address, address2, avatarUrl, children, city, countryCode, currencyCode, dateOfBirth, description, displayName, email, firstName, fullname, gender, id, languageCode, lastName, mobileNumber, parents, password, postalCode, state, tags, template, timezoneCode, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    fullname: ").append(toIndentedString(fullname)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    timezoneCode: ").append(toIndentedString(timezoneCode)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

