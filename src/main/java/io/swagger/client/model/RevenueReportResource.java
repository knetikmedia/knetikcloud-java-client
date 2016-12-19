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
 * RevenueReportResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-19T17:51:09.896-05:00")
public class RevenueReportResource {
  @SerializedName("customer_count")
  private Long customerCount = null;

  @SerializedName("sale_count")
  private Long saleCount = null;

  @SerializedName("sales_average")
  private Double salesAverage = null;

  @SerializedName("sales_total")
  private Double salesTotal = null;

  public RevenueReportResource customerCount(Long customerCount) {
    this.customerCount = customerCount;
    return this;
  }

   /**
   * Get customerCount
   * @return customerCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCustomerCount() {
    return customerCount;
  }

  public void setCustomerCount(Long customerCount) {
    this.customerCount = customerCount;
  }

  public RevenueReportResource saleCount(Long saleCount) {
    this.saleCount = saleCount;
    return this;
  }

   /**
   * Get saleCount
   * @return saleCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSaleCount() {
    return saleCount;
  }

  public void setSaleCount(Long saleCount) {
    this.saleCount = saleCount;
  }

  public RevenueReportResource salesAverage(Double salesAverage) {
    this.salesAverage = salesAverage;
    return this;
  }

   /**
   * Get salesAverage
   * @return salesAverage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSalesAverage() {
    return salesAverage;
  }

  public void setSalesAverage(Double salesAverage) {
    this.salesAverage = salesAverage;
  }

  public RevenueReportResource salesTotal(Double salesTotal) {
    this.salesTotal = salesTotal;
    return this;
  }

   /**
   * Get salesTotal
   * @return salesTotal
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getSalesTotal() {
    return salesTotal;
  }

  public void setSalesTotal(Double salesTotal) {
    this.salesTotal = salesTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevenueReportResource revenueReportResource = (RevenueReportResource) o;
    return Objects.equals(this.customerCount, revenueReportResource.customerCount) &&
        Objects.equals(this.saleCount, revenueReportResource.saleCount) &&
        Objects.equals(this.salesAverage, revenueReportResource.salesAverage) &&
        Objects.equals(this.salesTotal, revenueReportResource.salesTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerCount, saleCount, salesAverage, salesTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevenueReportResource {\n");
    
    sb.append("    customerCount: ").append(toIndentedString(customerCount)).append("\n");
    sb.append("    saleCount: ").append(toIndentedString(saleCount)).append("\n");
    sb.append("    salesAverage: ").append(toIndentedString(salesAverage)).append("\n");
    sb.append("    salesTotal: ").append(toIndentedString(salesTotal)).append("\n");
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

