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
import java.util.ArrayList;
import java.util.List;

/**
 * SchemaCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T16:36:10.832178+01:00[Europe/Zurich]")
public class SchemaCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ATTRIBUTES_NAME = "attributesName";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES_NAME)
  private List<String> attributesName = new ArrayList<>();


  public SchemaCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Schema name
   * @return name
  **/
  @ApiModelProperty(example = "prefs", required = true, value = "Schema name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SchemaCreate version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Schema version
   * @return version
  **/
  @ApiModelProperty(example = "1.0", required = true, value = "Schema version")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public SchemaCreate attributesName(List<String> attributesName) {
    
    this.attributesName = attributesName;
    return this;
  }

  public SchemaCreate addAttributesNameItem(String attributesNameItem) {
    this.attributesName.add(attributesNameItem);
    return this;
  }

   /**
   * List of schema attributes
   * @return attributesName
  **/
  @ApiModelProperty(required = true, value = "List of schema attributes")

  public List<String> getAttributesName() {
    return attributesName;
  }


  public void setAttributesName(List<String> attributesName) {
    this.attributesName = attributesName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaCreate schemaCreate = (SchemaCreate) o;
    return Objects.equals(this.name, schemaCreate.name) &&
        Objects.equals(this.version, schemaCreate.version) &&
        Objects.equals(this.attributesName, schemaCreate.attributesName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, attributesName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    attributesName: ").append(toIndentedString(attributesName)).append("\n");
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

