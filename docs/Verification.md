

# Verification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verificationId** | **String** | The verification id |  [optional]
**connectionId** | **String** | The connection id |  [optional]
**verificationRequest** | [**VerificationRequest**](VerificationRequest.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The verification state |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) | The creation date  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) | The update date |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
SUCCESS | &quot;SUCCESS&quot;
PENDING | &quot;PENDING&quot;
FAILURE | &quot;FAILURE&quot;
ERROR | &quot;ERROR&quot;



