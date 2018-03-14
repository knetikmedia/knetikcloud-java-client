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
import com.knetikcloud.model.Property;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SubscriptionPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class SubscriptionPlan {
  @JsonProperty("additional_properties")
  private Map<String, Property> additionalProperties = null;

  /**
   * Gets or Sets availability
   */
  public enum AvailabilityEnum {
    ALL("all"),
    
    NEW_SUBSCRIBERS("new_subscribers");

    private String value;

    AvailabilityEnum(String value) {
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
    public static AvailabilityEnum fromValue(String text) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("availability")
  private AvailabilityEnum availability = null;

  @JsonProperty("bill_grace_days")
  private Integer billGraceDays = null;

  @JsonProperty("consolidated")
  private Boolean consolidated = null;

  @JsonProperty("first_bill")
  private Integer firstBill = null;

  /**
   * Gets or Sets firstBillUnitOfTime
   */
  public enum FirstBillUnitOfTimeEnum {
    MILLISECOND("millisecond"),
    
    SECOND("second"),
    
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    FirstBillUnitOfTimeEnum(String value) {
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
    public static FirstBillUnitOfTimeEnum fromValue(String text) {
      for (FirstBillUnitOfTimeEnum b : FirstBillUnitOfTimeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("first_bill_unit_of_time")
  private FirstBillUnitOfTimeEnum firstBillUnitOfTime = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("late_payment_sku")
  private String latePaymentSku = null;

  @JsonProperty("locked")
  private Boolean locked = null;

  @JsonProperty("max_auto_renew")
  private Integer maxAutoRenew = null;

  @JsonProperty("max_bill_attempts")
  private Integer maxBillAttempts = null;

  @JsonProperty("migration_plan")
  private String migrationPlan = null;

  @JsonProperty("minimum_term")
  private Integer minimumTerm = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("primary_sku")
  private String primarySku = null;

  @JsonProperty("reactivation_sku")
  private String reactivationSku = null;

  @JsonProperty("recurring_sku")
  private String recurringSku = null;

  @JsonProperty("renew_period")
  private Integer renewPeriod = null;

  /**
   * Gets or Sets renewPeriodUnitOfTime
   */
  public enum RenewPeriodUnitOfTimeEnum {
    MILLISECOND("millisecond"),
    
    SECOND("second"),
    
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week"),
    
    MONTH("month"),
    
    YEAR("year");

    private String value;

    RenewPeriodUnitOfTimeEnum(String value) {
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
    public static RenewPeriodUnitOfTimeEnum fromValue(String text) {
      for (RenewPeriodUnitOfTimeEnum b : RenewPeriodUnitOfTimeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("renew_period_unit_of_time")
  private RenewPeriodUnitOfTimeEnum renewPeriodUnitOfTime = null;

  @JsonProperty("subscription_id")
  private Integer subscriptionId = null;

  public SubscriptionPlan additionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public SubscriptionPlan putAdditionalPropertiesItem(String key, Property additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Property>();
    }
    this.additionalProperties.put(key, additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "")
  public Map<String, Property> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(Map<String, Property> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public SubscriptionPlan availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public SubscriptionPlan billGraceDays(Integer billGraceDays) {
    this.billGraceDays = billGraceDays;
    return this;
  }

   /**
   * Get billGraceDays
   * @return billGraceDays
  **/
  @ApiModelProperty(value = "")
  public Integer getBillGraceDays() {
    return billGraceDays;
  }

  public void setBillGraceDays(Integer billGraceDays) {
    this.billGraceDays = billGraceDays;
  }

  public SubscriptionPlan consolidated(Boolean consolidated) {
    this.consolidated = consolidated;
    return this;
  }

   /**
   * Get consolidated
   * @return consolidated
  **/
  @ApiModelProperty(value = "")
  public Boolean isConsolidated() {
    return consolidated;
  }

  public void setConsolidated(Boolean consolidated) {
    this.consolidated = consolidated;
  }

  public SubscriptionPlan firstBill(Integer firstBill) {
    this.firstBill = firstBill;
    return this;
  }

   /**
   * Get firstBill
   * @return firstBill
  **/
  @ApiModelProperty(value = "")
  public Integer getFirstBill() {
    return firstBill;
  }

  public void setFirstBill(Integer firstBill) {
    this.firstBill = firstBill;
  }

  public SubscriptionPlan firstBillUnitOfTime(FirstBillUnitOfTimeEnum firstBillUnitOfTime) {
    this.firstBillUnitOfTime = firstBillUnitOfTime;
    return this;
  }

   /**
   * Get firstBillUnitOfTime
   * @return firstBillUnitOfTime
  **/
  @ApiModelProperty(value = "")
  public FirstBillUnitOfTimeEnum getFirstBillUnitOfTime() {
    return firstBillUnitOfTime;
  }

  public void setFirstBillUnitOfTime(FirstBillUnitOfTimeEnum firstBillUnitOfTime) {
    this.firstBillUnitOfTime = firstBillUnitOfTime;
  }

  public SubscriptionPlan id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubscriptionPlan latePaymentSku(String latePaymentSku) {
    this.latePaymentSku = latePaymentSku;
    return this;
  }

   /**
   * Get latePaymentSku
   * @return latePaymentSku
  **/
  @ApiModelProperty(value = "")
  public String getLatePaymentSku() {
    return latePaymentSku;
  }

  public void setLatePaymentSku(String latePaymentSku) {
    this.latePaymentSku = latePaymentSku;
  }

  public SubscriptionPlan locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @ApiModelProperty(value = "")
  public Boolean isLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public SubscriptionPlan maxAutoRenew(Integer maxAutoRenew) {
    this.maxAutoRenew = maxAutoRenew;
    return this;
  }

   /**
   * Get maxAutoRenew
   * @return maxAutoRenew
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxAutoRenew() {
    return maxAutoRenew;
  }

  public void setMaxAutoRenew(Integer maxAutoRenew) {
    this.maxAutoRenew = maxAutoRenew;
  }

  public SubscriptionPlan maxBillAttempts(Integer maxBillAttempts) {
    this.maxBillAttempts = maxBillAttempts;
    return this;
  }

   /**
   * Get maxBillAttempts
   * @return maxBillAttempts
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxBillAttempts() {
    return maxBillAttempts;
  }

  public void setMaxBillAttempts(Integer maxBillAttempts) {
    this.maxBillAttempts = maxBillAttempts;
  }

  public SubscriptionPlan migrationPlan(String migrationPlan) {
    this.migrationPlan = migrationPlan;
    return this;
  }

   /**
   * Get migrationPlan
   * @return migrationPlan
  **/
  @ApiModelProperty(value = "")
  public String getMigrationPlan() {
    return migrationPlan;
  }

  public void setMigrationPlan(String migrationPlan) {
    this.migrationPlan = migrationPlan;
  }

  public SubscriptionPlan minimumTerm(Integer minimumTerm) {
    this.minimumTerm = minimumTerm;
    return this;
  }

   /**
   * Get minimumTerm
   * @return minimumTerm
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumTerm() {
    return minimumTerm;
  }

  public void setMinimumTerm(Integer minimumTerm) {
    this.minimumTerm = minimumTerm;
  }

  public SubscriptionPlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionPlan primarySku(String primarySku) {
    this.primarySku = primarySku;
    return this;
  }

   /**
   * Get primarySku
   * @return primarySku
  **/
  @ApiModelProperty(value = "")
  public String getPrimarySku() {
    return primarySku;
  }

  public void setPrimarySku(String primarySku) {
    this.primarySku = primarySku;
  }

  public SubscriptionPlan reactivationSku(String reactivationSku) {
    this.reactivationSku = reactivationSku;
    return this;
  }

   /**
   * Get reactivationSku
   * @return reactivationSku
  **/
  @ApiModelProperty(value = "")
  public String getReactivationSku() {
    return reactivationSku;
  }

  public void setReactivationSku(String reactivationSku) {
    this.reactivationSku = reactivationSku;
  }

  public SubscriptionPlan recurringSku(String recurringSku) {
    this.recurringSku = recurringSku;
    return this;
  }

   /**
   * Get recurringSku
   * @return recurringSku
  **/
  @ApiModelProperty(value = "")
  public String getRecurringSku() {
    return recurringSku;
  }

  public void setRecurringSku(String recurringSku) {
    this.recurringSku = recurringSku;
  }

  public SubscriptionPlan renewPeriod(Integer renewPeriod) {
    this.renewPeriod = renewPeriod;
    return this;
  }

   /**
   * Get renewPeriod
   * @return renewPeriod
  **/
  @ApiModelProperty(value = "")
  public Integer getRenewPeriod() {
    return renewPeriod;
  }

  public void setRenewPeriod(Integer renewPeriod) {
    this.renewPeriod = renewPeriod;
  }

  public SubscriptionPlan renewPeriodUnitOfTime(RenewPeriodUnitOfTimeEnum renewPeriodUnitOfTime) {
    this.renewPeriodUnitOfTime = renewPeriodUnitOfTime;
    return this;
  }

   /**
   * Get renewPeriodUnitOfTime
   * @return renewPeriodUnitOfTime
  **/
  @ApiModelProperty(value = "")
  public RenewPeriodUnitOfTimeEnum getRenewPeriodUnitOfTime() {
    return renewPeriodUnitOfTime;
  }

  public void setRenewPeriodUnitOfTime(RenewPeriodUnitOfTimeEnum renewPeriodUnitOfTime) {
    this.renewPeriodUnitOfTime = renewPeriodUnitOfTime;
  }

  public SubscriptionPlan subscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Get subscriptionId
   * @return subscriptionId
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(Integer subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionPlan subscriptionPlan = (SubscriptionPlan) o;
    return Objects.equals(this.additionalProperties, subscriptionPlan.additionalProperties) &&
        Objects.equals(this.availability, subscriptionPlan.availability) &&
        Objects.equals(this.billGraceDays, subscriptionPlan.billGraceDays) &&
        Objects.equals(this.consolidated, subscriptionPlan.consolidated) &&
        Objects.equals(this.firstBill, subscriptionPlan.firstBill) &&
        Objects.equals(this.firstBillUnitOfTime, subscriptionPlan.firstBillUnitOfTime) &&
        Objects.equals(this.id, subscriptionPlan.id) &&
        Objects.equals(this.latePaymentSku, subscriptionPlan.latePaymentSku) &&
        Objects.equals(this.locked, subscriptionPlan.locked) &&
        Objects.equals(this.maxAutoRenew, subscriptionPlan.maxAutoRenew) &&
        Objects.equals(this.maxBillAttempts, subscriptionPlan.maxBillAttempts) &&
        Objects.equals(this.migrationPlan, subscriptionPlan.migrationPlan) &&
        Objects.equals(this.minimumTerm, subscriptionPlan.minimumTerm) &&
        Objects.equals(this.name, subscriptionPlan.name) &&
        Objects.equals(this.primarySku, subscriptionPlan.primarySku) &&
        Objects.equals(this.reactivationSku, subscriptionPlan.reactivationSku) &&
        Objects.equals(this.recurringSku, subscriptionPlan.recurringSku) &&
        Objects.equals(this.renewPeriod, subscriptionPlan.renewPeriod) &&
        Objects.equals(this.renewPeriodUnitOfTime, subscriptionPlan.renewPeriodUnitOfTime) &&
        Objects.equals(this.subscriptionId, subscriptionPlan.subscriptionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalProperties, availability, billGraceDays, consolidated, firstBill, firstBillUnitOfTime, id, latePaymentSku, locked, maxAutoRenew, maxBillAttempts, migrationPlan, minimumTerm, name, primarySku, reactivationSku, recurringSku, renewPeriod, renewPeriodUnitOfTime, subscriptionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionPlan {\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    billGraceDays: ").append(toIndentedString(billGraceDays)).append("\n");
    sb.append("    consolidated: ").append(toIndentedString(consolidated)).append("\n");
    sb.append("    firstBill: ").append(toIndentedString(firstBill)).append("\n");
    sb.append("    firstBillUnitOfTime: ").append(toIndentedString(firstBillUnitOfTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latePaymentSku: ").append(toIndentedString(latePaymentSku)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxAutoRenew: ").append(toIndentedString(maxAutoRenew)).append("\n");
    sb.append("    maxBillAttempts: ").append(toIndentedString(maxBillAttempts)).append("\n");
    sb.append("    migrationPlan: ").append(toIndentedString(migrationPlan)).append("\n");
    sb.append("    minimumTerm: ").append(toIndentedString(minimumTerm)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primarySku: ").append(toIndentedString(primarySku)).append("\n");
    sb.append("    reactivationSku: ").append(toIndentedString(reactivationSku)).append("\n");
    sb.append("    recurringSku: ").append(toIndentedString(recurringSku)).append("\n");
    sb.append("    renewPeriod: ").append(toIndentedString(renewPeriod)).append("\n");
    sb.append("    renewPeriodUnitOfTime: ").append(toIndentedString(renewPeriodUnitOfTime)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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

