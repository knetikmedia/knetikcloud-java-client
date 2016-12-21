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
import io.swagger.client.model.Behavior;
import io.swagger.client.model.Property;
import io.swagger.client.model.Sku;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * StoreItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:49:29.968-05:00")
public class StoreItem {
  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("behaviors")
  private List<Behavior> behaviors = new ArrayList<Behavior>();

  @SerializedName("category")
  private String category = null;

  @SerializedName("created_date")
  private Long createdDate = null;

  @SerializedName("displayable")
  private Boolean displayable = null;

  @SerializedName("geo_country_list")
  private List<String> geoCountryList = new ArrayList<String>();

  /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   */
  public enum GeoPolicyTypeEnum {
    @SerializedName("whitelist")
    WHITELIST("whitelist"),
    
    @SerializedName("blacklist")
    BLACKLIST("blacklist");

    private String value;

    GeoPolicyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("geo_policy_type")
  private GeoPolicyTypeEnum geoPolicyType = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shipping_tier")
  private Integer shippingTier = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("skus")
  private List<Sku> skus = new ArrayList<Sku>();

  @SerializedName("sort")
  private Integer sort = null;

  @SerializedName("store_end")
  private Long storeEnd = null;

  @SerializedName("store_start")
  private Long storeStart = null;

  @SerializedName("tags")
  private List<String> tags = new ArrayList<String>();

  @SerializedName("template")
  private String template = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("unique_key")
  private String uniqueKey = null;

  @SerializedName("updated_date")
  private Long updatedDate = null;

  @SerializedName("vendor_id")
  private Integer vendorId = null;

  public StoreItem additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public StoreItem putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type, or be an extra not from the template")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public StoreItem behaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
    return this;
  }

  public StoreItem addBehaviorsItem(Behavior behaviorsItem) {
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * The behaviors linked to the item, describing various options and interactions. May not be included in item lists
   * @return behaviors
  **/
  @ApiModelProperty(example = "null", value = "The behaviors linked to the item, describing various options and interactions. May not be included in item lists")
  public List<Behavior> getBehaviors() {
    return behaviors;
  }

  public void setBehaviors(List<Behavior> behaviors) {
    this.behaviors = behaviors;
  }

  public StoreItem category(String category) {
    this.category = category;
    return this;
  }

   /**
   * A category for filtering items
   * @return category
  **/
  @ApiModelProperty(example = "null", value = "A category for filtering items")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

   /**
   * The date the item was created, unix timestamp in seconds
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was created, unix timestamp in seconds")
  public Long getCreatedDate() {
    return createdDate;
  }

  public StoreItem displayable(Boolean displayable) {
    this.displayable = displayable;
    return this;
  }

   /**
   * Whether or not the item is currently displayable.  Default = true
   * @return displayable
  **/
  @ApiModelProperty(example = "false", value = "Whether or not the item is currently displayable.  Default = true")
  public Boolean getDisplayable() {
    return displayable;
  }

  public void setDisplayable(Boolean displayable) {
    this.displayable = displayable;
  }

  public StoreItem geoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
    return this;
  }

  public StoreItem addGeoCountryListItem(String geoCountryListItem) {
    this.geoCountryList.add(geoCountryListItem);
    return this;
  }

   /**
   * A list of country ID to include in the blacklist/whitelist geo policy
   * @return geoCountryList
  **/
  @ApiModelProperty(example = "null", value = "A list of country ID to include in the blacklist/whitelist geo policy")
  public List<String> getGeoCountryList() {
    return geoCountryList;
  }

  public void setGeoCountryList(List<String> geoCountryList) {
    this.geoCountryList = geoCountryList;
  }

  public StoreItem geoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
    return this;
  }

   /**
   * Whether to use the geo_country_list as a black list or white list for item geographical availability
   * @return geoPolicyType
  **/
  @ApiModelProperty(example = "null", value = "Whether to use the geo_country_list as a black list or white list for item geographical availability")
  public GeoPolicyTypeEnum getGeoPolicyType() {
    return geoPolicyType;
  }

  public void setGeoPolicyType(GeoPolicyTypeEnum geoPolicyType) {
    this.geoPolicyType = geoPolicyType;
  }

   /**
   * The id of the item
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the item")
  public Integer getId() {
    return id;
  }

  public StoreItem longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A long description of the item
   * @return longDescription
  **/
  @ApiModelProperty(example = "null", value = "A long description of the item")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public StoreItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the item
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of the item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StoreItem shippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
    return this;
  }

   /**
   * Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0
   * @return shippingTier
  **/
  @ApiModelProperty(example = "null", value = "Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0")
  public Integer getShippingTier() {
    return shippingTier;
  }

  public void setShippingTier(Integer shippingTier) {
    this.shippingTier = shippingTier;
  }

  public StoreItem shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A short description of the item, max 255 chars
   * @return shortDescription
  **/
  @ApiModelProperty(example = "null", value = "A short description of the item, max 255 chars")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public StoreItem skus(List<Sku> skus) {
    this.skus = skus;
    return this;
  }

  public StoreItem addSkusItem(Sku skusItem) {
    this.skus.add(skusItem);
    return this;
  }

   /**
   * The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart
   * @return skus
  **/
  @ApiModelProperty(example = "null", required = true, value = "The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart")
  public List<Sku> getSkus() {
    return skus;
  }

  public void setSkus(List<Sku> skus) {
    this.skus = skus;
  }

  public StoreItem sort(Integer sort) {
    this.sort = sort;
    return this;
  }

   /**
   * A number to use in sorting items.  Default 500
   * @return sort
  **/
  @ApiModelProperty(example = "null", value = "A number to use in sorting items.  Default 500")
  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public StoreItem storeEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
    return this;
  }

   /**
   * The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store
   * @return storeEnd
  **/
  @ApiModelProperty(example = "null", value = "The date the item will leave the store, unix timestamp in seconds.  If set to null, item will never leave the store")
  public Long getStoreEnd() {
    return storeEnd;
  }

  public void setStoreEnd(Long storeEnd) {
    this.storeEnd = storeEnd;
  }

  public StoreItem storeStart(Long storeStart) {
    this.storeStart = storeStart;
    return this;
  }

   /**
   * The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately
   * @return storeStart
  **/
  @ApiModelProperty(example = "null", value = "The date the item will appear in the store, unix timestamp in seconds.  If set to null, item will appear in store immediately")
  public Long getStoreStart() {
    return storeStart;
  }

  public void setStoreStart(Long storeStart) {
    this.storeStart = storeStart;
  }

  public StoreItem tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public StoreItem addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * List of tags used for filtering items
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "List of tags used for filtering items")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public StoreItem template(String template) {
    this.template = template;
    return this;
  }

   /**
   * An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "An item template this item is validated against.  May be null and no validation of additional_properties will be done.  Default = null")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public StoreItem typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The type of the item
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type of the item")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public StoreItem uniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
    return this;
  }

   /**
   * The unique key for the item
   * @return uniqueKey
  **/
  @ApiModelProperty(example = "null", value = "The unique key for the item")
  public String getUniqueKey() {
    return uniqueKey;
  }

  public void setUniqueKey(String uniqueKey) {
    this.uniqueKey = uniqueKey;
  }

   /**
   * The date the item was last updated, unix timestamp in seconds
   * @return updatedDate
  **/
  @ApiModelProperty(example = "null", value = "The date the item was last updated, unix timestamp in seconds")
  public Long getUpdatedDate() {
    return updatedDate;
  }

  public StoreItem vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * The vendor who provides the item
   * @return vendorId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The vendor who provides the item")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreItem storeItem = (StoreItem) o;
    return Objects.equals(this.additionalProperties, storeItem.additionalProperties) &&
        Objects.equals(this.behaviors, storeItem.behaviors) &&
        Objects.equals(this.category, storeItem.category) &&
        Objects.equals(this.createdDate, storeItem.createdDate) &&
        Objects.equals(this.displayable, storeItem.displayable) &&
        Objects.equals(this.geoCountryList, storeItem.geoCountryList) &&
        Objects.equals(this.geoPolicyType, storeItem.geoPolicyType) &&
        Objects.equals(this.id, storeItem.id) &&
        Objects.equals(this.longDescription, storeItem.longDescription) &&
        Objects.equals(this.name, storeItem.name) &&
        Objects.equals(this.shippingTier, storeItem.shippingTier) &&
        Objects.equals(this.shortDescription, storeItem.shortDescription) &&
        Objects.equals(this.skus, storeItem.skus) &&
        Objects.equals(this.sort, storeItem.sort) &&
        Objects.equals(this.storeEnd, storeItem.storeEnd) &&
        Objects.equals(this.storeStart, storeItem.storeStart) &&
        Objects.equals(this.tags, storeItem.tags) &&
        Objects.equals(this.template, storeItem.template) &&
        Objects.equals(this.typeHint, storeItem.typeHint) &&
        Objects.equals(this.uniqueKey, storeItem.uniqueKey) &&
        Objects.equals(this.updatedDate, storeItem.updatedDate) &&
        Objects.equals(this.vendorId, storeItem.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, behaviors, category, createdDate, displayable, geoCountryList, geoPolicyType, id, longDescription, name, shippingTier, shortDescription, skus, sort, storeEnd, storeStart, tags, template, typeHint, uniqueKey, updatedDate, vendorId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreItem {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    displayable: ").append(toIndentedString(displayable)).append("\n");
    sb.append("    geoCountryList: ").append(toIndentedString(geoCountryList)).append("\n");
    sb.append("    geoPolicyType: ").append(toIndentedString(geoPolicyType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shippingTier: ").append(toIndentedString(shippingTier)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    skus: ").append(toIndentedString(skus)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    storeEnd: ").append(toIndentedString(storeEnd)).append("\n");
    sb.append("    storeStart: ").append(toIndentedString(storeStart)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
    sb.append("    uniqueKey: ").append(toIndentedString(uniqueKey)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

