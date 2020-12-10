

# Verification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationId** | **String** | The verification id |  [optional]
**connectionId** | **String** | The connection id |  [optional]
**name** | **String** | The name of the validation |  [optional]
**presentation** | **String** | The validated data |  [optional]
**presentationRequest** | **String** | The original validation request |  [optional]
**state** | [**StateEnum**](#StateEnum) | The current state of the verification |  [optional]
**createdAt** | **String** | The time when the verification was created |  [optional]
**updatedAt** | **String** | The time when the verification was updated |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
REQUESTED | &quot;requested&quot;
VERIFIED | &quot;verified&quot;
REJECTED | &quot;rejected&quot;
ERROR | &quot;error&quot;



