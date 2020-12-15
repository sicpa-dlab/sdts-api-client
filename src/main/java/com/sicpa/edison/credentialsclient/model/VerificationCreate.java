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
 * VerificationCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-15T13:20:26.194789+01:00[Europe/Zurich]")
public class VerificationCreate {
  public static final String SERIALIZED_NAME_VERIFICATION_TEMPLATE_ID = "verificationTemplateId";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_TEMPLATE_ID)
  private Integer verificationTemplateId;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connectionId";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;


  public VerificationCreate verificationTemplateId(Integer verificationTemplateId) {
    
    this.verificationTemplateId = verificationTemplateId;
    return this;
  }

   /**
   * The verification template id
   * @return verificationTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "The verification template id")

  public Integer getVerificationTemplateId() {
    return verificationTemplateId;
  }


  public void setVerificationTemplateId(Integer verificationTemplateId) {
    this.verificationTemplateId = verificationTemplateId;
  }


  public VerificationCreate connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection id
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "The connection id")

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationCreate verificationCreate = (VerificationCreate) o;
    return Objects.equals(this.verificationTemplateId, verificationCreate.verificationTemplateId) &&
        Objects.equals(this.connectionId, verificationCreate.connectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationTemplateId, connectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationCreate {\n");
    sb.append("    verificationTemplateId: ").append(toIndentedString(verificationTemplateId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

