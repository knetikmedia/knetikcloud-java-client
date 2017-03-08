/*
 * Knetik Platform API Documentation latest 
 * This is the spec for the Knetik API.  Use this in conjunction with the documentation found at https://knetikcloud.com
 *
 * OpenAPI spec version: latest 
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
import io.swagger.client.model.Artist;
import io.swagger.client.model.Video;

/**
 * VideoContribution
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-07T19:33:34.950-05:00")
public class VideoContribution {
  @SerializedName("artist")
  private Artist artist = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("media")
  private Video media = null;

  @SerializedName("role")
  private String role = null;

  public VideoContribution artist(Artist artist) {
    this.artist = artist;
    return this;
  }

   /**
   * Get artist
   * @return artist
  **/
  @ApiModelProperty(example = "null", value = "")
  public Artist getArtist() {
    return artist;
  }

  public void setArtist(Artist artist) {
    this.artist = artist;
  }

  public VideoContribution id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public VideoContribution media(Video media) {
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @ApiModelProperty(example = "null", value = "")
  public Video getMedia() {
    return media;
  }

  public void setMedia(Video media) {
    this.media = media;
  }

  public VideoContribution role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoContribution videoContribution = (VideoContribution) o;
    return Objects.equals(this.artist, videoContribution.artist) &&
        Objects.equals(this.id, videoContribution.id) &&
        Objects.equals(this.media, videoContribution.media) &&
        Objects.equals(this.role, videoContribution.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artist, id, media, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoContribution {\n");
    
    sb.append("    artist: ").append(toIndentedString(artist)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
