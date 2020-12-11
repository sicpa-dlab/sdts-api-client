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
 * OrganizationCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-11T17:14:05.875852+01:00[Europe/Zurich]")
public class OrganizationCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ISSUER = "issuer";
  @SerializedName(SERIALIZED_NAME_ISSUER)
  private Boolean issuer;


  public OrganizationCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The organization name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationCreate issuer(Boolean issuer) {
    
    this.issuer = issuer;
    return this;
  }

   /**
   * Determine if this organization will act as a credential issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determine if this organization will act as a credential issuer")

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
    OrganizationCreate organizationCreate = (OrganizationCreate) o;
    return Objects.equals(this.name, organizationCreate.name) &&
        Objects.equals(this.issuer, organizationCreate.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, issuer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

