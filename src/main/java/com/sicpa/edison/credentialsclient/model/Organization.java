/*
 * Edison Credentials API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.sicpa.edison.credentialsclient.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T15:13:07.571806+01:00[Europe/Zurich]")
public class Organization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private Boolean issuer;


  public Organization id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The organization&#39;s id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Organization name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The organization&#39;s label
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's label")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Organization clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The organization&#39;s clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's clientId")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public Organization imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Organization issuer(Boolean issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Defines if the organization acts as an issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the organization acts as an issuer")

  public Boolean getIssuer() {
    return issuer;
  }


  public void setIssuer(Boolean issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name) &&
        Objects.equals(this.clientId, organization.clientId) &&
        Objects.equals(this.imageUrl, organization.imageUrl) &&
        Objects.equals(this.issuer, organization.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, clientId, imageUrl, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

