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
import com.sicpa.edison.credentialsclient.model.VerificationTemplateContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * VerificationTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T16:36:10.832178+01:00[Europe/Zurich]")
public class VerificationTemplate {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private VerificationTemplateContent content;

  public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organizationId";
  @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
  private Integer organizationId;


  public VerificationTemplate id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The verificationTemplate id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The verificationTemplate id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public VerificationTemplate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The verificationTemplate name
   * @return name
  **/
  @ApiModelProperty(example = "example", required = true, value = "The verificationTemplate name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VerificationTemplate content(VerificationTemplateContent content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(required = true, value = "")

  public VerificationTemplateContent getContent() {
    return content;
  }


  public void setContent(VerificationTemplateContent content) {
    this.content = content;
  }


  public VerificationTemplate organizationId(Integer organizationId) {
    
    this.organizationId = organizationId;
    return this;
  }

   /**
   * The organization id
   * @return organizationId
  **/
  @ApiModelProperty(example = "1", required = true, value = "The organization id")

  public Integer getOrganizationId() {
    return organizationId;
  }


  public void setOrganizationId(Integer organizationId) {
    this.organizationId = organizationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationTemplate verificationTemplate = (VerificationTemplate) o;
    return Objects.equals(this.id, verificationTemplate.id) &&
        Objects.equals(this.name, verificationTemplate.name) &&
        Objects.equals(this.content, verificationTemplate.content) &&
        Objects.equals(this.organizationId, verificationTemplate.organizationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, content, organizationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

