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
 * OrganizationCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-10T15:22:45.234670+01:00[Europe/Zurich]")
public class OrganizationCreate {
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

  /**
   * The wallet type
   */
  @JsonAdapter(WalletTypeEnum.Adapter.class)
  public enum WalletTypeEnum {
    INDY("INDY");

    private String value;

    WalletTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WalletTypeEnum fromValue(String value) {
      for (WalletTypeEnum b : WalletTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WalletTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WalletTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WalletTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WalletTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WALLET_TYPE = "walletType";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletTypeEnum walletType;

  public static final String SERIALIZED_NAME_PUBLIC_DID = "publicDid";
  @SerializedName(SERIALIZED_NAME_PUBLIC_DID)
  private Boolean publicDid;


  public OrganizationCreate label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The organization label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization label")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public OrganizationCreate host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * The organization host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The organization host")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public OrganizationCreate walletName(String walletName) {
    
    this.walletName = walletName;
    return this;
  }

   /**
   * The wallet name
   * @return walletName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The wallet name")

  public String getWalletName() {
    return walletName;
  }


  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }


  public OrganizationCreate walletKey(String walletKey) {
    
    this.walletKey = walletKey;
    return this;
  }

   /**
   * The wallet key
   * @return walletKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The wallet key")

  public String getWalletKey() {
    return walletKey;
  }


  public void setWalletKey(String walletKey) {
    this.walletKey = walletKey;
  }


  public OrganizationCreate walletType(WalletTypeEnum walletType) {
    
    this.walletType = walletType;
    return this;
  }

   /**
   * The wallet type
   * @return walletType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The wallet type")

  public WalletTypeEnum getWalletType() {
    return walletType;
  }


  public void setWalletType(WalletTypeEnum walletType) {
    this.walletType = walletType;
  }


  public OrganizationCreate publicDid(Boolean publicDid) {
    
    this.publicDid = publicDid;
    return this;
  }

   /**
   * Determine if the did generated will be public or not
   * @return publicDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determine if the did generated will be public or not")

  public Boolean getPublicDid() {
    return publicDid;
  }


  public void setPublicDid(Boolean publicDid) {
    this.publicDid = publicDid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreate organizationCreate = (OrganizationCreate) o;
    return Objects.equals(this.label, organizationCreate.label) &&
        Objects.equals(this.host, organizationCreate.host) &&
        Objects.equals(this.walletName, organizationCreate.walletName) &&
        Objects.equals(this.walletKey, organizationCreate.walletKey) &&
        Objects.equals(this.walletType, organizationCreate.walletType) &&
        Objects.equals(this.publicDid, organizationCreate.publicDid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, host, walletName, walletKey, walletType, publicDid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreate {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
    sb.append("    walletKey: ").append(toIndentedString(walletKey)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    publicDid: ").append(toIndentedString(publicDid)).append("\n");
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

