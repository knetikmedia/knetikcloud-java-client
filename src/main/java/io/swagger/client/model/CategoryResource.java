/**
 * Knetik Platform API Documentation latest 
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: latest 
 * Contact: support@knetik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Property;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * CategoryResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-05T03:17:56.208-05:00")
public class CategoryResource   {
  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("additional_properties")
  private Map<String, Property> additionalProperties = new HashMap<String, Property>();

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("template")
  private String template = null;

  public CategoryResource active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Whether the category is currently active. If not, it and its questions will be filtered out.
   * @return active
  **/
  @ApiModelProperty(example = "false", value = "Whether the category is currently active. If not, it and its questions will be filtered out.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CategoryResource additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public CategoryResource putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type
   * @return additionalProperties
  **/
  @ApiModelProperty(example = "null", value = "A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public CategoryResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique ID for this category
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique ID for this category")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CategoryResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this category. Cannot be blank
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "The name of this category. Cannot be blank")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CategoryResource template(String template) {
    this.template = template;
    return this;
  }

   /**
   * A category template this category is validated against (private). May be null and no validation of additional_properties will be done
   * @return template
  **/
  @ApiModelProperty(example = "null", value = "A category template this category is validated against (private). May be null and no validation of additional_properties will be done")
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryResource categoryResource = (CategoryResource) o;
    return Objects.equals(this.active, categoryResource.active) &&
        Objects.equals(this.additionalProperties, categoryResource.additionalProperties) &&
        Objects.equals(this.id, categoryResource.id) &&
        Objects.equals(this.name, categoryResource.name) &&
        Objects.equals(this.template, categoryResource.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, additionalProperties, id, name, template);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryResource {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

