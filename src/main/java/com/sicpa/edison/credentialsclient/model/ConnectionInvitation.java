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
 * ConnectionInvitation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T10:45:45.459026+01:00[Europe/Zurich]")
public class ConnectionInvitation {
  public static final String SERIALIZED_NAME_CONNECTION_INVITATION_CONTENT = "connectionInvitationContent";
  @SerializedName(SERIALIZED_NAME_CONNECTION_INVITATION_CONTENT)
  private ConnectionInvitationContent connectionInvitationContent;

  public static final String SERIALIZED_NAME_ALIAS = "alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;


  public ConnectionInvitation connectionInvitationContent(ConnectionInvitationContent connectionInvitationContent) {
    
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


  public ConnectionInvitation alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInvitation connectionInvitation = (ConnectionInvitation) o;
    return Objects.equals(this.connectionInvitationContent, connectionInvitation.connectionInvitationContent) &&
        Objects.equals(this.alias, connectionInvitation.alias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionInvitationContent, alias);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInvitation {\n");
    sb.append("    connectionInvitationContent: ").append(toIndentedString(connectionInvitationContent)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
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

