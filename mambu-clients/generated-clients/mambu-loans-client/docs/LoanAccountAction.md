

# LoanAccountAction

Allows specifying the action details for a loan account
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action type to be applied | 
**notes** | **String** | The notes related to the action performed |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
REQUEST_APPROVAL | &quot;REQUEST_APPROVAL&quot;
SET_INCOMPLETE | &quot;SET_INCOMPLETE&quot;
APPROVE | &quot;APPROVE&quot;
UNDO_APPROVE | &quot;UNDO_APPROVE&quot;
REJECT | &quot;REJECT&quot;
WITHDRAW | &quot;WITHDRAW&quot;
CLOSE | &quot;CLOSE&quot;
UNDO_REJECT | &quot;UNDO_REJECT&quot;
UNDO_WITHDRAW | &quot;UNDO_WITHDRAW&quot;
UNDO_CLOSE | &quot;UNDO_CLOSE&quot;



