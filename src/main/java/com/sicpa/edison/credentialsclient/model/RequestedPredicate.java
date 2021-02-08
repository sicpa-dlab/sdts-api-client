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
import com.sicpa.edison.credentialsclient.model.Restriction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The requested predicates. In order for the verification to be successful, all requested predicates should be validated
 */
@ApiModel(description = "The requested predicates. In order for the verification to be successful, all requested predicates should be validated")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-05T10:45:45.459026+01:00[Europe/Zurich]")
public class RequestedPredicate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * A predicate type
   */
  @JsonAdapter(PredicateTypeEnum.Adapter.class)
  public enum PredicateTypeEnum {
    LESS_THAN("LESS_THAN"),
    
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    
    GREATER_THAN("GREATER_THAN");

    private String value;

    PredicateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PredicateTypeEnum fromValue(String value) {
      for (PredicateTypeEnum b : PredicateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PredicateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PredicateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PredicateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PredicateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PREDICATE_TYPE = "predicateType";
  @SerializedName(SERIALIZED_NAME_PREDICATE_TYPE)
  private PredicateTypeEnum predicateType;

  public static final String SERIALIZED_NAME_PREDICATE_VALUE = "predicateValue";
  @SerializedName(SERIALIZED_NAME_PREDICATE_VALUE)
  private Integer predicateValue;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private List<Restriction> restrictions = null;


  public RequestedPredicate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * A predicate name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A predicate name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RequestedPredicate predicateType(PredicateTypeEnum predicateType) {
    
    this.predicateType = predicateType;
    return this;
  }

   /**
   * A predicate type
   * @return predicateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A predicate type")

  public PredicateTypeEnum getPredicateType() {
    return predicateType;
  }


  public void setPredicateType(PredicateTypeEnum predicateType) {
    this.predicateType = predicateType;
  }


  public RequestedPredicate predicateValue(Integer predicateValue) {
    
    this.predicateValue = predicateValue;
    return this;
  }

   /**
   * A predicate value
   * @return predicateValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A predicate value")

  public Integer getPredicateValue() {
    return predicateValue;
  }


  public void setPredicateValue(Integer predicateValue) {
    this.predicateValue = predicateValue;
  }


  public RequestedPredicate restrictions(List<Restriction> restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

  public RequestedPredicate addRestrictionsItem(Restriction restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

   /**
   * A list of predicate restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of predicate restrictions")

  public List<Restriction> getRestrictions() {
    return restrictions;
  }


  public void setRestrictions(List<Restriction> restrictions) {
    this.restrictions = restrictions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestedPredicate requestedPredicate = (RequestedPredicate) o;
    return Objects.equals(this.name, requestedPredicate.name) &&
        Objects.equals(this.predicateType, requestedPredicate.predicateType) &&
        Objects.equals(this.predicateValue, requestedPredicate.predicateValue) &&
        Objects.equals(this.restrictions, requestedPredicate.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, predicateType, predicateValue, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestedPredicate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    predicateType: ").append(toIndentedString(predicateType)).append("\n");
    sb.append("    predicateValue: ").append(toIndentedString(predicateValue)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
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

