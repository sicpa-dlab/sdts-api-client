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
import com.sicpa.edison.credentialsclient.model.CredentialProposal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Credential
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T10:45:45.459026+01:00[Europe/Zurich]")
public class Credential {
  public static final String SERIALIZED_NAME_CREDENTIAL_ID = "credentialId";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_ID)
  private String credentialId;

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  public static final String SERIALIZED_NAME_CREDENTIAL_DEFINITION_ID = "credentialDefinitionId";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_DEFINITION_ID)
  private String credentialDefinitionId;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_CREDENTIAL_PROPOSAL = "credentialProposal";
  @SerializedName(SERIALIZED_NAME_CREDENTIAL_PROPOSAL)
  private CredentialProposal credentialProposal;


  public Credential credentialId(String credentialId) {
    
    this.credentialId = credentialId;
    return this;
  }

   /**
   * Get credentialId
   * @return credentialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCredentialId() {
    return credentialId;
  }


  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }


  public Credential schemaId(String schemaId) {
    
    this.schemaId = schemaId;
    return this;
  }

   /**
   * A schema ID
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A schema ID")

  public String getSchemaId() {
    return schemaId;
  }


  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public Credential credentialDefinitionId(String credentialDefinitionId) {
    
    this.credentialDefinitionId = credentialDefinitionId;
    return this;
  }

   /**
   * A credential definition ID
   * @return credentialDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A credential definition ID")

  public String getCredentialDefinitionId() {
    return credentialDefinitionId;
  }


  public void setCredentialDefinitionId(String credentialDefinitionId) {
    this.credentialDefinitionId = credentialDefinitionId;
  }


  public Credential comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * A human readable comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable comment")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public Credential credentialProposal(CredentialProposal credentialProposal) {
    
    this.credentialProposal = credentialProposal;
    return this;
  }

   /**
   * Get credentialProposal
   * @return credentialProposal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CredentialProposal getCredentialProposal() {
    return credentialProposal;
  }


  public void setCredentialProposal(CredentialProposal credentialProposal) {
    this.credentialProposal = credentialProposal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credential credential = (Credential) o;
    return Objects.equals(this.credentialId, credential.credentialId) &&
        Objects.equals(this.schemaId, credential.schemaId) &&
        Objects.equals(this.credentialDefinitionId, credential.credentialDefinitionId) &&
        Objects.equals(this.comment, credential.comment) &&
        Objects.equals(this.credentialProposal, credential.credentialProposal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId, schemaId, credentialDefinitionId, comment, credentialProposal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credential {\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    credentialDefinitionId: ").append(toIndentedString(credentialDefinitionId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    credentialProposal: ").append(toIndentedString(credentialProposal)).append("\n");
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
