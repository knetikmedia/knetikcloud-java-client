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
import com.knetikcloud.model.SimpleUserResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * WalletTransactionResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class WalletTransactionResource {
  @JsonProperty("balance")
  private BigDecimal balance = null;

  @JsonProperty("create_date")
  private Long createDate = null;

  @JsonProperty("currency_code")
  private String currencyCode = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("invoice_id")
  private Integer invoiceId = null;

  @JsonProperty("is_refunded")
  private Boolean isRefunded = null;

  @JsonProperty("response")
  private String response = null;

  /**
   * The root source of the transaction
   */
  public enum SourceEnum {
    DIGITAL("digital"),
    
    PHYSICAL("physical");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("source")
  private SourceEnum source = null;

  @JsonProperty("successful")
  private Boolean successful = null;

  @JsonProperty("transaction_id")
  private String transactionId = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("type_hint")
  private String typeHint = null;

  @JsonProperty("user")
  private SimpleUserResource user = null;

  @JsonProperty("value")
  private BigDecimal value = null;

  @JsonProperty("wallet_id")
  private Integer walletId = null;

  public WalletTransactionResource balance(BigDecimal balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The new balance of the wallet after the transaction
   * @return balance
  **/
  @ApiModelProperty(value = "The new balance of the wallet after the transaction")
  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }

  public WalletTransactionResource createDate(Long createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * The unix timestamp in seconds of the transaction
   * @return createDate
  **/
  @ApiModelProperty(value = "The unix timestamp in seconds of the transaction")
  public Long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  public WalletTransactionResource currencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The code of the currency for the transaction
   * @return currencyCode
  **/
  @ApiModelProperty(value = "The code of the currency for the transaction")
  public String getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }

  public WalletTransactionResource details(String details) {
    this.details = details;
    return this;
  }

   /**
   * The specific details of the transaction, such as a message from the admin that created it
   * @return details
  **/
  @ApiModelProperty(value = "The specific details of the transaction, such as a message from the admin that created it")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public WalletTransactionResource id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the transaction
   * @return id
  **/
  @ApiModelProperty(value = "The id of the transaction")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WalletTransactionResource invoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * The id of the invoice that spawned the transaction, if any
   * @return invoiceId
  **/
  @ApiModelProperty(value = "The id of the invoice that spawned the transaction, if any")
  public Integer getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(Integer invoiceId) {
    this.invoiceId = invoiceId;
  }

  public WalletTransactionResource isRefunded(Boolean isRefunded) {
    this.isRefunded = isRefunded;
    return this;
  }

   /**
   * Whether the transaction has been refunded
   * @return isRefunded
  **/
  @ApiModelProperty(example = "false", value = "Whether the transaction has been refunded")
  public Boolean isIsRefunded() {
    return isRefunded;
  }

  public void setIsRefunded(Boolean isRefunded) {
    this.isRefunded = isRefunded;
  }

  public WalletTransactionResource response(String response) {
    this.response = response;
    return this;
  }

   /**
   * The response
   * @return response
  **/
  @ApiModelProperty(value = "The response")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public WalletTransactionResource source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * The root source of the transaction
   * @return source
  **/
  @ApiModelProperty(value = "The root source of the transaction")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }

  public WalletTransactionResource successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * If the transaction was successful
   * @return successful
  **/
  @ApiModelProperty(example = "false", value = "If the transaction was successful")
  public Boolean isSuccessful() {
    return successful;
  }

  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }

  public WalletTransactionResource transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The payment gateway (external) transaction ID
   * @return transactionId
  **/
  @ApiModelProperty(value = "The payment gateway (external) transaction ID")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public WalletTransactionResource type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The general type of the transaction
   * @return type
  **/
  @ApiModelProperty(value = "The general type of the transaction")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public WalletTransactionResource typeHint(String typeHint) {
    this.typeHint = typeHint;
    return this;
  }

   /**
   * The table name of the subclass
   * @return typeHint
  **/
  @ApiModelProperty(value = "The table name of the subclass")
  public String getTypeHint() {
    return typeHint;
  }

  public void setTypeHint(String typeHint) {
    this.typeHint = typeHint;
  }

  public WalletTransactionResource user(SimpleUserResource user) {
    this.user = user;
    return this;
  }

   /**
   * The owner of the wallet
   * @return user
  **/
  @ApiModelProperty(value = "The owner of the wallet")
  public SimpleUserResource getUser() {
    return user;
  }

  public void setUser(SimpleUserResource user) {
    this.user = user;
  }

  public WalletTransactionResource value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The amount of the transaction, positive if a gain, negative if an expenditure
   * @return value
  **/
  @ApiModelProperty(value = "The amount of the transaction, positive if a gain, negative if an expenditure")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public WalletTransactionResource walletId(Integer walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The id of the wallet this transaction affected
   * @return walletId
  **/
  @ApiModelProperty(value = "The id of the wallet this transaction affected")
  public Integer getWalletId() {
    return walletId;
  }

  public void setWalletId(Integer walletId) {
    this.walletId = walletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletTransactionResource walletTransactionResource = (WalletTransactionResource) o;
    return Objects.equals(this.balance, walletTransactionResource.balance) &&
        Objects.equals(this.createDate, walletTransactionResource.createDate) &&
        Objects.equals(this.currencyCode, walletTransactionResource.currencyCode) &&
        Objects.equals(this.details, walletTransactionResource.details) &&
        Objects.equals(this.id, walletTransactionResource.id) &&
        Objects.equals(this.invoiceId, walletTransactionResource.invoiceId) &&
        Objects.equals(this.isRefunded, walletTransactionResource.isRefunded) &&
        Objects.equals(this.response, walletTransactionResource.response) &&
        Objects.equals(this.source, walletTransactionResource.source) &&
        Objects.equals(this.successful, walletTransactionResource.successful) &&
        Objects.equals(this.transactionId, walletTransactionResource.transactionId) &&
        Objects.equals(this.type, walletTransactionResource.type) &&
        Objects.equals(this.typeHint, walletTransactionResource.typeHint) &&
        Objects.equals(this.user, walletTransactionResource.user) &&
        Objects.equals(this.value, walletTransactionResource.value) &&
        Objects.equals(this.walletId, walletTransactionResource.walletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, createDate, currencyCode, details, id, invoiceId, isRefunded, response, source, successful, transactionId, type, typeHint, user, value, walletId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletTransactionResource {\n");
    
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
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

