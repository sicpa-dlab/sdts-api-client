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
import com.sicpa.edison.credentialsclient.model.IndyProofReqNonRevoked;
import com.sicpa.edison.credentialsclient.model.IndyProofReqPredSpecRestrictions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IndyProofReqPredSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-10T15:13:18.986882+01:00[Europe/Zurich]")
public class IndyProofReqPredSpec {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NON_REVOKED = "nonRevoked";
  @SerializedName(SERIALIZED_NAME_NON_REVOKED)
  private IndyProofReqNonRevoked nonRevoked;

  /**
   * Gets or Sets getpType
   */
  @JsonAdapter(GetpTypeEnum.Adapter.class)
  public enum GetpTypeEnum {
    LESS_THAN("<"),
    
    LESS_THAN_OR_EQUAL_TO("<="),
    
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    GREATER_THAN(">");

    private String value;

    GetpTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GetpTypeEnum fromValue(String value) {
      for (GetpTypeEnum b : GetpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GetpTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GetpTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GetpTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GetpTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GETP_TYPE = "getpType";
  @SerializedName(SERIALIZED_NAME_GETP_TYPE)
  private GetpTypeEnum getpType;

  public static final String SERIALIZED_NAME_GETP_VALUE = "getpValue";
  @SerializedName(SERIALIZED_NAME_GETP_VALUE)
  private Integer getpValue;

  public static final String SERIALIZED_NAME_RESTRICTIONS = "restrictions";
  @SerializedName(SERIALIZED_NAME_RESTRICTIONS)
  private List<IndyProofReqPredSpecRestrictions> restrictions = null;


  public IndyProofReqPredSpec name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IndyProofReqPredSpec nonRevoked(IndyProofReqNonRevoked nonRevoked) {
    
    this.nonRevoked = nonRevoked;
    return this;
  }

   /**
   * Get nonRevoked
   * @return nonRevoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndyProofReqNonRevoked getNonRevoked() {
    return nonRevoked;
  }


  public void setNonRevoked(IndyProofReqNonRevoked nonRevoked) {
    this.nonRevoked = nonRevoked;
  }


  public IndyProofReqPredSpec getpType(GetpTypeEnum getpType) {
    
    this.getpType = getpType;
    return this;
  }

   /**
   * Get getpType
   * @return getpType
  **/
  @ApiModelProperty(required = true, value = "")

  public GetpTypeEnum getGetpType() {
    return getpType;
  }


  public void setGetpType(GetpTypeEnum getpType) {
    this.getpType = getpType;
  }


  public IndyProofReqPredSpec getpValue(Integer getpValue) {
    
    this.getpValue = getpValue;
    return this;
  }

   /**
   * Get getpValue
   * @return getpValue
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getGetpValue() {
    return getpValue;
  }


  public void setGetpValue(Integer getpValue) {
    this.getpValue = getpValue;
  }


  public IndyProofReqPredSpec restrictions(List<IndyProofReqPredSpecRestrictions> restrictions) {
    
    this.restrictions = restrictions;
    return this;
  }

  public IndyProofReqPredSpec addRestrictionsItem(IndyProofReqPredSpecRestrictions restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    return this;
  }

   /**
   * Get restrictions
   * @return restrictions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IndyProofReqPredSpecRestrictions> getRestrictions() {
    return restrictions;
  }


  public void setRestrictions(List<IndyProofReqPredSpecRestrictions> restrictions) {
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
    IndyProofReqPredSpec indyProofReqPredSpec = (IndyProofReqPredSpec) o;
    return Objects.equals(this.name, indyProofReqPredSpec.name) &&
        Objects.equals(this.nonRevoked, indyProofReqPredSpec.nonRevoked) &&
        Objects.equals(this.getpType, indyProofReqPredSpec.getpType) &&
        Objects.equals(this.getpValue, indyProofReqPredSpec.getpValue) &&
        Objects.equals(this.restrictions, indyProofReqPredSpec.restrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nonRevoked, getpType, getpValue, restrictions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyProofReqPredSpec {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nonRevoked: ").append(toIndentedString(nonRevoked)).append("\n");
    sb.append("    getpType: ").append(toIndentedString(getpType)).append("\n");
    sb.append("    getpValue: ").append(toIndentedString(getpValue)).append("\n");
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

