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
import io.swagger.client.model.MongoDatabaseConfig;
import io.swagger.client.model.SqlDatabaseConfig;

/**
 * DatabaseConfig
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2016-12-20T15:48:30.259-05:00")
public class DatabaseConfig {
  @SerializedName("mongo")
  private MongoDatabaseConfig mongo = null;

  @SerializedName("sql")
  private SqlDatabaseConfig sql = null;

  public DatabaseConfig mongo(MongoDatabaseConfig mongo) {
    this.mongo = mongo;
    return this;
  }

   /**
   * Get mongo
   * @return mongo
  **/
  @ApiModelProperty(example = "null", value = "")
  public MongoDatabaseConfig getMongo() {
    return mongo;
  }

  public void setMongo(MongoDatabaseConfig mongo) {
    this.mongo = mongo;
  }

  public DatabaseConfig sql(SqlDatabaseConfig sql) {
    this.sql = sql;
    return this;
  }

   /**
   * Get sql
   * @return sql
  **/
  @ApiModelProperty(example = "null", value = "")
  public SqlDatabaseConfig getSql() {
    return sql;
  }

  public void setSql(SqlDatabaseConfig sql) {
    this.sql = sql;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseConfig databaseConfig = (DatabaseConfig) o;
    return Objects.equals(this.mongo, databaseConfig.mongo) &&
        Objects.equals(this.sql, databaseConfig.sql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mongo, sql);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseConfig {\n");
    
    sb.append("    mongo: ").append(toIndentedString(mongo)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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

