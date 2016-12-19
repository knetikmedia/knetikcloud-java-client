/*
 * Knetik Platform API Documentation Latest
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
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
 * TransactionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T18:05:42.900-05:00")
public class TransactionResource {
  @SerializedName("create_date")
  private Long createDate = null;

  @SerializedName("currency_code")
  private String currencyCode = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("invoice_id")
  private Integer invoiceId = null;

  @SerializedName("is_refunded")
  private Boolean isRefunded = null;

  @SerializedName("response")
  private String response = null;

  /**
   * The root source of the transaction
   */
  public enum SourceEnum {
    @SerializedName("digital")
    DIGITAL("digital"),
    
    @SerializedName("physical")
    PHYSICAL("physical");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("source")
  private SourceEnum source = null;

  @SerializedName("successful")
  private Boolean successful = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("type_hint")
  private String typeHint = null;

  @SerializedName("value")
  private Double value = null;

  public TransactionResource createDate(Long createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * The unix timestamp in seconds of the transaction
   * @return createDate
  **/
  @ApiModelProperty(example = "null", value = "The unix timestamp in seconds of the transaction")
  public Long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  public TransactionResource currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The code of the currency for the transaction
   * @return currencyCode
  **/
  @ApiModelProperty(example = "null", value = "The code of the currency for the transaction")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public TransactionResource details(String details) {
    this.details = details;
    return this;
  }

   /**
   * The specific details of the transaction, such as a message from the admin that created it
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "The specific details of the transaction, such as a message from the admin that created it")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public TransactionResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the transaction
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of the transaction")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TransactionResource invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice that spawned the transaction, if any
   * @return invoiceId
  **/
  @ApiModelProperty(example = "null", value = "The id of the invoice that spawned the transaction, if any")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public TransactionResource isRefunded(Boolean isRefunded) {
    this.isRefunded = isRefunded;
    return this;
  }

   /**
   * Whether the transaction has been refunded
   * @return isRefunded
  **/
  @ApiModelProperty(example = "false", value = "Whether the transaction has been refunded")
  public Boolean getIsRefunded() {
    return isRefunded;
  }

  public void setIsRefunded(Boolean isRefunded) {
    this.isRefunded = isRefunded;
  }

  public TransactionResource response(String response) {
    this.response = response;
    return this;
  }

   /**
   * The response
   * @return response
  **/
  @ApiModelProperty(example = "null", value = "The response")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public TransactionResource source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The root source of the transaction
   * @return source
  **/
  @ApiModelProperty(example = "null", value = "The root source of the transaction")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public TransactionResource successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * If the transaction was successful
   * @return successful
  **/
  @ApiModelProperty(example = "false", value = "If the transaction was successful")
  public Boolean getSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public TransactionResource transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The payment gateway (external) transaction ID
   * @return transactionId
  **/
  @ApiModelProperty(example = "null", value = "The payment gateway (external) transaction ID")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public TransactionResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The general type of the transaction
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "The general type of the transaction")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TransactionResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The table name of the subclass
   * @return typeHint
  **/
  @ApiModelProperty(example = "null", value = "The table name of the subclass")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public TransactionResource value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * The amount of the transaction, positive if a gain, negative if an expenditure
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "The amount of the transaction, positive if a gain, negative if an expenditure")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResource transactionResource = (TransactionResource) o;
    return Objects.equals(this.createDate, transactionResource.createDate) &&
        Objects.equals(this.currencyCode, transactionResource.currencyCode) &&
        Objects.equals(this.details, transactionResource.details) &&
        Objects.equals(this.id, transactionResource.id) &&
        Objects.equals(this.invoiceId, transactionResource.invoiceId) &&
        Objects.equals(this.isRefunded, transactionResource.isRefunded) &&
        Objects.equals(this.response, transactionResource.response) &&
        Objects.equals(this.source, transactionResource.source) &&
        Objects.equals(this.successful, transactionResource.successful) &&
        Objects.equals(this.transactionId, transactionResource.transactionId) &&
        Objects.equals(this.type, transactionResource.type) &&
        Objects.equals(this.typeHint, transactionResource.typeHint) &&
        Objects.equals(this.value, transactionResource.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, currencyCode, details, id, invoiceId, isRefunded, response, source, successful, transactionId, type, typeHint, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResource {\n");
    
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    isRefunded: ").append(toIndentedString(isRefunded)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeHint: ").append(toIndentedString(typeHint)).append("\n");
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
