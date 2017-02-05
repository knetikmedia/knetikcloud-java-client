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
import io.swagger.client.model.BreGlobalScopeDefinition;
import java.util.ArrayList;
import java.util.List;


/**
 * BreGlobalResource
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-05T03:17:56.208-05:00")
public class BreGlobalResource   {
  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scopes")
  private List<BreGlobalScopeDefinition> scopes = new ArrayList<BreGlobalScopeDefinition>();

  @SerializedName("system_global")
  private Boolean systemGlobal = null;

  @SerializedName("type")
  private String type = null;

  public BreGlobalResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human readable description for display in admin pages
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A human readable description for display in admin pages")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BreGlobalResource id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the global definition. Default is a random guid. Cannot be updated
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the global definition. Default is a random guid. Cannot be updated")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BreGlobalResource key(String key) {
    this.key = key;
    return this;
  }

   /**
   * The key for the global. Must be unique when combined with scope names. Usually a single descriptive word like 'purchases' or 'logins'
   * @return key
  **/
  @ApiModelProperty(example = "null", required = true, value = "The key for the global. Must be unique when combined with scope names. Usually a single descriptive word like 'purchases' or 'logins'")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BreGlobalResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human readable name for display in admin pages
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "A human readable name for display in admin pages")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BreGlobalResource scopes(List<BreGlobalScopeDefinition> scopes) {
    this.scopes = scopes;
    return this;
  }

  public BreGlobalResource addScopesItem(BreGlobalScopeDefinition scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * A list of scoping parameters. Allows the global to have a different value in different context such as a count of purchases for each user (by putting a 'user' scope in this list). When using this global in a rule these scopes will need to be mapped with an expression to provide a value, similar to the parameters in an action
   * @return scopes
  **/
  @ApiModelProperty(example = "null", value = "A list of scoping parameters. Allows the global to have a different value in different context such as a count of purchases for each user (by putting a 'user' scope in this list). When using this global in a rule these scopes will need to be mapped with an expression to provide a value, similar to the parameters in an action")
  public List<BreGlobalScopeDefinition> getScopes() {
    return scopes;
  }

  public void setScopes(List<BreGlobalScopeDefinition> scopes) {
    this.scopes = scopes;
  }

   /**
   * Where this global came from. System globals cannot be removed or updated
   * @return systemGlobal
  **/
  @ApiModelProperty(example = "false", value = "Where this global came from. System globals cannot be removed or updated")
  public Boolean getSystemGlobal() {
    return systemGlobal;
  }

  public BreGlobalResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The variable type the global stores. See the See Bre Variables enpoint for list
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The variable type the global stores. See the See Bre Variables enpoint for list")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BreGlobalResource breGlobalResource = (BreGlobalResource) o;
    return Objects.equals(this.description, breGlobalResource.description) &&
        Objects.equals(this.id, breGlobalResource.id) &&
        Objects.equals(this.key, breGlobalResource.key) &&
        Objects.equals(this.name, breGlobalResource.name) &&
        Objects.equals(this.scopes, breGlobalResource.scopes) &&
        Objects.equals(this.systemGlobal, breGlobalResource.systemGlobal) &&
        Objects.equals(this.type, breGlobalResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, key, name, scopes, systemGlobal, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreGlobalResource {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    systemGlobal: ").append(toIndentedString(systemGlobal)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

