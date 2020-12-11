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
 * CredentialDefinitionCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-11T17:14:05.875852+01:00[Europe/Zurich]")
public class CredentialDefinitionCreate {
  public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public static final String SERIALIZED_NAME_SUPPORT_REVOCATION = "supportRevocation";
  @SerializedName(SERIALIZED_NAME_SUPPORT_REVOCATION)
  private Boolean supportRevocation;

  public static final String SERIALIZED_NAME_REVOCATION_REGISTRY_SIZE = "revocationRegistrySize";
  @SerializedName(SERIALIZED_NAME_REVOCATION_REGISTRY_SIZE)
  private Integer revocationRegistrySize;


  public CredentialDefinitionCreate schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * Schema identifier
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0", value = "Schema identifier")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public CredentialDefinitionCreate tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Credential definition identifier tag
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "default", value = "Credential definition identifier tag")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }


  public CredentialDefinitionCreate supportRevocation(Boolean supportRevocation) {
    
    this.supportRevocation = supportRevocation;
    return this;
  }

   /**
   * Revocation supported flag
   * @return supportRevocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revocation supported flag")

  public Boolean getSupportRevocation() {
    return supportRevocation;
  }


  public void setSupportRevocation(Boolean supportRevocation) {
    this.supportRevocation = supportRevocation;
  }


  public CredentialDefinitionCreate revocationRegistrySize(Integer revocationRegistrySize) {
    
    this.revocationRegistrySize = revocationRegistrySize;
    return this;
  }

   /**
   * Get revocationRegistrySize
   * minimum: 4
   * @return revocationRegistrySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRevocationRegistrySize() {
    return revocationRegistrySize;
  }


  public void setRevocationRegistrySize(Integer revocationRegistrySize) {
    this.revocationRegistrySize = revocationRegistrySize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDefinitionCreate credentialDefinitionCreate = (CredentialDefinitionCreate) o;
    return Objects.equals(this.schemaId, credentialDefinitionCreate.schemaId) &&
        Objects.equals(this.tag, credentialDefinitionCreate.tag) &&
        Objects.equals(this.supportRevocation, credentialDefinitionCreate.supportRevocation) &&
        Objects.equals(this.revocationRegistrySize, credentialDefinitionCreate.revocationRegistrySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaId, tag, supportRevocation, revocationRegistrySize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDefinitionCreate {\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    supportRevocation: ").append(toIndentedString(supportRevocation)).append("\n");
    sb.append("    revocationRegistrySize: ").append(toIndentedString(revocationRegistrySize)).append("\n");
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

