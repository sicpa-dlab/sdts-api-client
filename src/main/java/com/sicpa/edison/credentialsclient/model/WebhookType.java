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
import com.sicpa.edison.credentialsclient.model.WebhookTypeFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The webhook types associated with this webhook
 */
@ApiModel(description = "The webhook types associated with this webhook")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-24T16:36:10.832178+01:00[Europe/Zurich]")
public class WebhookType {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private List<WebhookTypeFilter> filters = new ArrayList<>();


  public WebhookType id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The webhook type id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The webhook type id")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WebhookType name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The webhook type name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The webhook type name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WebhookType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The webhook type description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The webhook type description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WebhookType filters(List<WebhookTypeFilter> filters) {
    
    this.filters = filters;
    return this;
  }

  public WebhookType addFiltersItem(WebhookTypeFilter filtersItem) {
    this.filters.add(filtersItem);
    return this;
  }

   /**
   * List of filters available
   * @return filters
  **/
  @ApiModelProperty(required = true, value = "List of filters available")

  public List<WebhookTypeFilter> getFilters() {
    return filters;
  }


  public void setFilters(List<WebhookTypeFilter> filters) {
    this.filters = filters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookType webhookType = (WebhookType) o;
    return Objects.equals(this.id, webhookType.id) &&
        Objects.equals(this.name, webhookType.name) &&
        Objects.equals(this.description, webhookType.description) &&
        Objects.equals(this.filters, webhookType.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, filters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

