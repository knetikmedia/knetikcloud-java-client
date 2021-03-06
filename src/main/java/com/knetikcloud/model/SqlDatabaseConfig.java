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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SqlDatabaseConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-14T12:03:43.231-04:00")
public class SqlDatabaseConfig {
  @JsonProperty("connection_pool_size")
  private Integer connectionPoolSize = null;

  @JsonProperty("db_name")
  private String dbName = null;

  @JsonProperty("hostname")
  private String hostname = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("port")
  private Integer port = null;

  @JsonProperty("username")
  private String username = null;

  public SqlDatabaseConfig connectionPoolSize(Integer connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
    return this;
  }

   /**
   * Get connectionPoolSize
   * @return connectionPoolSize
  **/
  @ApiModelProperty(value = "")
  public Integer getConnectionPoolSize() {
    return connectionPoolSize;
  }

  public void setConnectionPoolSize(Integer connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
  }

  public SqlDatabaseConfig dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @ApiModelProperty(value = "")
  public String getDbName() {
    return dbName;
  }

  public void setDbName(String dbName) {
    this.dbName = dbName;
  }

  public SqlDatabaseConfig hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @ApiModelProperty(value = "")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public SqlDatabaseConfig password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SqlDatabaseConfig port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(value = "")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public SqlDatabaseConfig username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
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
    SqlDatabaseConfig sqlDatabaseConfig = (SqlDatabaseConfig) o;
    return Objects.equals(this.connectionPoolSize, sqlDatabaseConfig.connectionPoolSize) &&
        Objects.equals(this.dbName, sqlDatabaseConfig.dbName) &&
        Objects.equals(this.hostname, sqlDatabaseConfig.hostname) &&
        Objects.equals(this.password, sqlDatabaseConfig.password) &&
        Objects.equals(this.port, sqlDatabaseConfig.port) &&
        Objects.equals(this.username, sqlDatabaseConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPoolSize, dbName, hostname, password, port, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlDatabaseConfig {\n");
    
    sb.append("    connectionPoolSize: ").append(toIndentedString(connectionPoolSize)).append("\n");
    sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

