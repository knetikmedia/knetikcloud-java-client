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

/**
 * SqlDatabaseConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-21T00:20:18.274-05:00")
public class SqlDatabaseConfig {
  @SerializedName("connection_pool_size")
  private Integer connectionPoolSize = null;

  @SerializedName("connection_string")
  private String connectionString = null;

  @SerializedName("db_name")
  private String dbName = null;

  @SerializedName("hostname")
  private String hostname = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("port")
  private Integer port = null;

  @SerializedName("username")
  private String username = null;

  public SqlDatabaseConfig connectionPoolSize(Integer connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
    return this;
  }

   /**
   * Get connectionPoolSize
   * @return connectionPoolSize
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getConnectionPoolSize() {
    return connectionPoolSize;
  }

  public void setConnectionPoolSize(Integer connectionPoolSize) {
    this.connectionPoolSize = connectionPoolSize;
  }

  public SqlDatabaseConfig connectionString(String connectionString) {
    this.connectionString = connectionString;
    return this;
  }

   /**
   * Get connectionString
   * @return connectionString
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }

  public SqlDatabaseConfig dbName(String dbName) {
    this.dbName = dbName;
    return this;
  }

   /**
   * Get dbName
   * @return dbName
  **/
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
  @ApiModelProperty(example = "null", value = "")
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
        Objects.equals(this.connectionString, sqlDatabaseConfig.connectionString) &&
        Objects.equals(this.dbName, sqlDatabaseConfig.dbName) &&
        Objects.equals(this.hostname, sqlDatabaseConfig.hostname) &&
        Objects.equals(this.password, sqlDatabaseConfig.password) &&
        Objects.equals(this.port, sqlDatabaseConfig.port) &&
        Objects.equals(this.username, sqlDatabaseConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionPoolSize, connectionString, dbName, hostname, password, port, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlDatabaseConfig {\n");
    
    sb.append("    connectionPoolSize: ").append(toIndentedString(connectionPoolSize)).append("\n");
    sb.append("    connectionString: ").append(toIndentedString(connectionString)).append("\n");
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

