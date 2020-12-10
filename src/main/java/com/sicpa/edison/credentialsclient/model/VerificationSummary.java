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
 * VerificationSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-12-10T15:22:45.234670+01:00[Europe/Zurich]")
public class VerificationSummary {
  public static final String SERIALIZED_NAME_VERIFICATION_ID = "verificationId";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ID)
  private String verificationId;

  public static final String SERIALIZED_NAME_CONNECTION_ID = "connectionId";
  @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
  private String connectionId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The current state of the verification
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    REQUESTED("requested"),
    
    VERIFIED("verified"),
    
    REJECTED("rejected"),
    
    ERROR("error");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;


  public VerificationSummary verificationId(String verificationId) {
    
    this.verificationId = verificationId;
    return this;
  }

   /**
   * The verification id
   * @return verificationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ac32f24e-2f90-4e90-9427-c59482078a4b", value = "The verification id")

  public String getVerificationId() {
    return verificationId;
  }


  public void setVerificationId(String verificationId) {
    this.verificationId = verificationId;
  }


  public VerificationSummary connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection id
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "The connection id")

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public VerificationSummary name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the validation
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example", value = "The name of the validation")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VerificationSummary state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The current state of the verification
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "verified", value = "The current state of the verification")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationSummary verificationSummary = (VerificationSummary) o;
    return Objects.equals(this.verificationId, verificationSummary.verificationId) &&
        Objects.equals(this.connectionId, verificationSummary.connectionId) &&
        Objects.equals(this.name, verificationSummary.name) &&
        Objects.equals(this.state, verificationSummary.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationId, connectionId, name, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationSummary {\n");
    sb.append("    verificationId: ").append(toIndentedString(verificationId)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

