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
 * CredentialDefinitionSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-23T15:13:07.571806+01:00[Europe/Zurich]")
public class CredentialDefinitionSummary {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;


  public CredentialDefinitionSummary id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The credential definition&#39;s id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The credential definition's id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDefinitionSummary credentialDefinitionSummary = (CredentialDefinitionSummary) o;
    return Objects.equals(this.id, credentialDefinitionSummary.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDefinitionSummary {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

