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
import com.sicpa.edison.credentialsclient.model.WebhookWebhookTypeUpsert;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-15T13:20:26.194789+01:00[Europe/Zurich]")
public class WebhookUpdate {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_WEBHOOK_TYPES = "webhookTypes";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPES)
  private List<WebhookWebhookTypeUpsert> webhookTypes = new ArrayList<>();


  public WebhookUpdate active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Defines if the webhook is active or not
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines if the webhook is active or not")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public WebhookUpdate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The webhook&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookUpdate url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Defines the webhook url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the webhook url")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public WebhookUpdate webhookTypes(List<WebhookWebhookTypeUpsert> webhookTypes) {
    
    this.webhookTypes = webhookTypes;
    return this;
  }

  public WebhookUpdate addWebhookTypesItem(WebhookWebhookTypeUpsert webhookTypesItem) {
    this.webhookTypes.add(webhookTypesItem);
    return this;
  }

   /**
   * The webhook types associated with this webhook
   * @return webhookTypes
  **/
  @ApiModelProperty(required = true, value = "The webhook types associated with this webhook")

  public List<WebhookWebhookTypeUpsert> getWebhookTypes() {
    return webhookTypes;
  }


  public void setWebhookTypes(List<WebhookWebhookTypeUpsert> webhookTypes) {
    this.webhookTypes = webhookTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdate webhookUpdate = (WebhookUpdate) o;
    return Objects.equals(this.active, webhookUpdate.active) &&
        Objects.equals(this.name, webhookUpdate.name) &&
        Objects.equals(this.url, webhookUpdate.url) &&
        Objects.equals(this.webhookTypes, webhookUpdate.webhookTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name, url, webhookTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdate {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    webhookTypes: ").append(toIndentedString(webhookTypes)).append("\n");
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

