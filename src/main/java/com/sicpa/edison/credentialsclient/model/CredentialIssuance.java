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
import com.sicpa.edison.credentialsclient.model.Credential;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * CredentialIssuance
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T10:45:45.459026+01:00[Europe/Zurich]")
public class CredentialIssuance {
  public static final String SERIALIZED_NAME_ISSUANCE_ID = "issuanceId";
  @SerializedName(SERIALIZED_NAME_ISSUANCE_ID)
  private String issuanceId;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "errorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_CREDENTIAL = "credential";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL)
  private Credential credential;


  public CredentialIssuance issuanceId(String issuanceId) {
    
    this.issuanceId = issuanceId;
    return this;
  }

   /**
   * A credential issuance ID
   * @return issuanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A credential issuance ID")

  public String getIssuanceId() {
    return issuanceId;
  }


  public void setIssuanceId(String issuanceId) {
    this.issuanceId = issuanceId;
  }


  public CredentialIssuance errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Optional error message
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional error message")

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public CredentialIssuance state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * State of the credential transaction
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State of the credential transaction")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public CredentialIssuance updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CredentialIssuance credential(Credential credential) {
    
    this.credential = credential;
    return this;
  }

   /**
   * Get credential
   * @return credential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Credential getCredential() {
    return credential;
  }


  public void setCredential(Credential credential) {
    this.credential = credential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialIssuance credentialIssuance = (CredentialIssuance) o;
    return Objects.equals(this.issuanceId, credentialIssuance.issuanceId) &&
        Objects.equals(this.errorMessage, credentialIssuance.errorMessage) &&
        Objects.equals(this.state, credentialIssuance.state) &&
        Objects.equals(this.updatedAt, credentialIssuance.updatedAt) &&
        Objects.equals(this.credential, credentialIssuance.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuanceId, errorMessage, state, updatedAt, credential);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialIssuance {\n");
    sb.append("    issuanceId: ").append(toIndentedString(issuanceId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

