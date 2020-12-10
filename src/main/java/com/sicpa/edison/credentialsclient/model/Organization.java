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
import com.sicpa.edison.credentialsclient.model.Did;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Organization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-10T15:22:45.234670+01:00[Europe/Zurich]")
public class Organization {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_HOST = "host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_WALLET_NAME = "walletName";
  @SerializedName(SERIALIZED_NAME_WALLET_NAME)
  private String walletName;

  public static final String SERIALIZED_NAME_WALLET_KEY = "walletKey";
  @SerializedName(SERIALIZED_NAME_WALLET_KEY)
  private String walletKey;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Integer clientId;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_PUBLIC_DID = "publicDid";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DID)
  private Boolean publicDid;

  public static final String SERIALIZED_NAME_DIDS = "dids";
  @SerializedName(SERIALIZED_NAME_DIDS)
  private List<Did> dids = null;


  public Organization id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The organization&#39;s id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Organization label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The organization&#39;s label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public Organization host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * The organization&#39;s host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public Organization walletName(String walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * The organization&#39;s wallet name
   * @return walletName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's wallet name")

  public String getWalletName() {
    return walletName;
  }


  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }


  public Organization walletKey(String walletKey) {
    
    this.walletKey = walletKey;
    return this;
  }

   /**
   * The organization&#39;s wallet key
   * @return walletKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's wallet key")

  public String getWalletKey() {
    return walletKey;
  }


  public void setWalletKey(String walletKey) {
    this.walletKey = walletKey;
  }


  public Organization clientId(Integer clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The organization&#39;s clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's clientId")

  public Integer getClientId() {
    return clientId;
  }


  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }


  public Organization imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Organization publicDid(Boolean publicDid) {
    
    this.publicDid = publicDid;
    return this;
  }

   /**
   * Defines if the organization has a public DID or not
   * @return publicDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the organization has a public DID or not")

  public Boolean getPublicDid() {
    return publicDid;
  }


  public void setPublicDid(Boolean publicDid) {
    this.publicDid = publicDid;
  }


  public Organization dids(List<Did> dids) {
    
    this.dids = dids;
    return this;
  }

  public Organization addDidsItem(Did didsItem) {
    if (this.dids == null) {
      this.dids = new ArrayList<>();
    }
    this.dids.add(didsItem);
    return this;
  }

   /**
   * The organization&#39;s DIDs
   * @return dids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization's DIDs")

  public List<Did> getDids() {
    return dids;
  }


  public void setDids(List<Did> dids) {
    this.dids = dids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.id, organization.id) &&
        Objects.equals(this.label, organization.label) &&
        Objects.equals(this.host, organization.host) &&
        Objects.equals(this.walletName, organization.walletName) &&
        Objects.equals(this.walletKey, organization.walletKey) &&
        Objects.equals(this.clientId, organization.clientId) &&
        Objects.equals(this.imageUrl, organization.imageUrl) &&
        Objects.equals(this.publicDid, organization.publicDid) &&
        Objects.equals(this.dids, organization.dids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, host, walletName, walletKey, clientId, imageUrl, publicDid, dids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
    sb.append("    walletKey: ").append(toIndentedString(walletKey)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    publicDid: ").append(toIndentedString(publicDid)).append("\n");
    sb.append("    dids: ").append(toIndentedString(dids)).append("\n");
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

