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
import com.knetikcloud.model.ExpressionResource;
import com.knetikcloud.model.OperationDefinitionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Expressions are instructions for the rule engine to resolve certain values. For example instead of &#x60;user 1&#x60; it&#39;d state &#x60;user provided by the event&#x60;. Full list and definitions available at GET /bre/expressions.
 */
@ApiModel(description = "Expressions are instructions for the rule engine to resolve certain values. For example instead of `user 1` it'd state `user provided by the event`. Full list and definitions available at GET /bre/expressions.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class DefaultOperationResource {
  @JsonProperty("args")
  private List<ExpressionResource> args = new ArrayList<ExpressionResource>();

  @JsonProperty("definition")
  private String definition = null;

  @JsonProperty("op")
  private String op = null;

  @JsonProperty("return_type")
  private String returnType = null;

  @JsonProperty("supported_operators")
  private List<OperationDefinitionResource> supportedOperators = null;

  @JsonProperty("type")
  private String type = null;

  public DefaultOperationResource args(List<ExpressionResource> args) {
    this.args = args;
    return this;
  }

  public DefaultOperationResource addArgsItem(ExpressionResource argsItem) {
    this.args.add(argsItem);
    return this;
  }

   /**
   * The arguments the operator apply to. See notes for details.
   * @return args
  **/
  @ApiModelProperty(required = true, value = "The arguments the operator apply to. See notes for details.")
  public List<ExpressionResource> getArgs() {
    return args;
  }

  public void setArgs(List<ExpressionResource> args) {
    this.args = args;
  }

  public DefaultOperationResource definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @ApiModelProperty(value = "")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public DefaultOperationResource op(String op) {
    this.op = op;
    return this;
  }

   /**
   * The operator to be used in this predicate. See notes for details.
   * @return op
  **/
  @ApiModelProperty(required = true, value = "The operator to be used in this predicate. See notes for details.")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public DefaultOperationResource returnType(String returnType) {
    this.returnType = returnType;
    return this;
  }

   /**
   * Get returnType
   * @return returnType
  **/
  @ApiModelProperty(value = "")
  public String getReturnType() {
    return returnType;
  }

  public void setReturnType(String returnType) {
    this.returnType = returnType;
  }

  public DefaultOperationResource supportedOperators(List<OperationDefinitionResource> supportedOperators) {
    this.supportedOperators = supportedOperators;
    return this;
  }

  public DefaultOperationResource addSupportedOperatorsItem(OperationDefinitionResource supportedOperatorsItem) {
    if (this.supportedOperators == null) {
      this.supportedOperators = new ArrayList<OperationDefinitionResource>();
    }
    this.supportedOperators.add(supportedOperatorsItem);
    return this;
  }

   /**
   * The operators supported by this expression
   * @return supportedOperators
  **/
  @ApiModelProperty(value = "The operators supported by this expression")
  public List<OperationDefinitionResource> getSupportedOperators() {
    return supportedOperators;
  }

  public void setSupportedOperators(List<OperationDefinitionResource> supportedOperators) {
    this.supportedOperators = supportedOperators;
  }

  public DefaultOperationResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
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
    DefaultOperationResource defaultOperationResource = (DefaultOperationResource) o;
    return Objects.equals(this.args, defaultOperationResource.args) &&
        Objects.equals(this.definition, defaultOperationResource.definition) &&
        Objects.equals(this.op, defaultOperationResource.op) &&
        Objects.equals(this.returnType, defaultOperationResource.returnType) &&
        Objects.equals(this.supportedOperators, defaultOperationResource.supportedOperators) &&
        Objects.equals(this.type, defaultOperationResource.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, definition, op, returnType, supportedOperators, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultOperationResource {\n");
    
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
    sb.append("    supportedOperators: ").append(toIndentedString(supportedOperators)).append("\n");
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

