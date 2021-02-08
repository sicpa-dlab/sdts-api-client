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
import com.sicpa.edison.credentialsclient.model.ConnectionInvitationContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ConnectionInvitationCreationResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T10:45:45.459026+01:00[Europe/Zurich]")
public class ConnectionInvitationCreationResult {
  public static final String SERIALIZED_NAME_INVITATION_URL = "invitationUrl";
  @SerializedName(SERIALIZED_NAME_INVITATION_URL)
  private String invitationUrl;

  public static final String SERIALIZED_NAME_CONNECTION_INVITATION_CONTENT = "connectionInvitationContent";
  @SerializedName(SERIALIZED_NAME_CONNECTION_INVITATION_CONTENT)
  private ConnectionInvitationContent connectionInvitationContent;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connectionId";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;


  public ConnectionInvitationCreationResult invitationUrl(String invitationUrl) {
    
    this.invitationUrl = invitationUrl;
    return this;
  }

   /**
   * Invitation URL
   * @return invitationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://192.168.56.101:8020/invite?c_i=eyJAdHlwZSI6Li4ufQ==", value = "Invitation URL")

  public String getInvitationUrl() {
    return invitationUrl;
  }


  public void setInvitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
  }


  public ConnectionInvitationCreationResult connectionInvitationContent(ConnectionInvitationContent connectionInvitationContent) {
    
    this.connectionInvitationContent = connectionInvitationContent;
    return this;
  }

   /**
   * Get connectionInvitationContent
   * @return connectionInvitationContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionInvitationContent getConnectionInvitationContent() {
    return connectionInvitationContent;
  }


  public void setConnectionInvitationContent(ConnectionInvitationContent connectionInvitationContent) {
    this.connectionInvitationContent = connectionInvitationContent;
  }


  public ConnectionInvitationCreationResult connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ConnectionInvitationCreationResult connectionInvitationCreationResult = (ConnectionInvitationCreationResult) o;
    return Objects.equals(this.invitationUrl, connectionInvitationCreationResult.invitationUrl) &&
        Objects.equals(this.connectionInvitationContent, connectionInvitationCreationResult.connectionInvitationContent) &&
        Objects.equals(this.connectionId, connectionInvitationCreationResult.connectionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invitationUrl, connectionInvitationContent, connectionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInvitationCreationResult {\n");
    sb.append("    invitationUrl: ").append(toIndentedString(invitationUrl)).append("\n");
    sb.append("    connectionInvitationContent: ").append(toIndentedString(connectionInvitationContent)).append("\n");
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
