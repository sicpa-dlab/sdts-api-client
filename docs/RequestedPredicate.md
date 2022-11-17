

# RequestedPredicate

The requested predicates. In order for the verification to be successful, all requested predicates should be validated

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | A predicate name |  [optional]
**predicateType** | [**PredicateTypeEnum**](#PredicateTypeEnum) | A predicate type |  [optional]
**predicateValue** | **Integer** | A predicate value |  [optional]
**restrictions** | [**List&lt;Restriction&gt;**](Restriction.md) | A list of predicate restrictions |  [optional]



## Enum: PredicateTypeEnum

Name | Value
---- | -----
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_OR_EQUAL_TO | &quot;LESS_THAN_OR_EQUAL_TO&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;GREATER_THAN_OR_EQUAL_TO&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;



