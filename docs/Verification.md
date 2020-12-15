

# Verification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationId** | **String** | The verification id |  [optional]
**connectionId** | **String** | The connection id |  [optional]
**verificationRequest** | [**VerificationRequest**](VerificationRequest.md) |  |  [optional]
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



