
# BreRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List&lt;ActionContextobject&gt;**](ActionContextobject.md) | A list of actions to execute, and the mapping for their parameters, when the rule runs. Minimum 1 | 
**condition** | [**PredicateResource**](PredicateResource.md) | A condition expression that must be met in a given event for the rule to run. Null to always run. |  [optional]
**conditionText** | **String** | The condition as a readable string. Filled in by the system from the condition |  [optional]
**description** | **String** | The human readable description of the rule |  [optional]
**enabled** | **Boolean** | Whether the rule is enabled to run (in conjunction with dates). Default true |  [optional]
**endDate** | **Long** | The date the rule ceases to take effect, or null if never. Unix timestamp in seconds |  [optional]
**evaluationCount** | **Long** | How many times the rule has been evaluated (it&#39;s conditions checked, whether it then runs or not) |  [optional]
**eventName** | **String** | The event name of the trigger this rule runs for. Affects which parameters are available | 
**id** | **String** | The id of the rule for later references. If left null a random guid will be generated. Must be unique. Cannot be changed |  [optional]
**name** | **String** | The human readable name of the rule | 
**runCount** | **Long** | How many times the rule has run |  [optional]
**sort** | **Integer** | Used to sort rules to control the order they run in. Larger numbered sort values run first.  Default 500 |  [optional]
**startDate** | **Long** | The date the rule begins to take effect, or null if always. Unix timestamp in seconds |  [optional]
**systemRule** | **Boolean** | Whether the rule is a default part of the system. System rules cannot be edited or deleted, but may be disabled |  [optional]



