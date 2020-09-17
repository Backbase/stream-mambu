

# LoanTransactionDetails

Contains the details about the loan transaction including fields like encoded key, transaction channel key and channel id.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodedKey** | **String** | The encoded key of the entity, generated, globally unique |  [optional] [readonly]
**internalTransfer** | **Boolean** | Whether the transaction was transferred between loans or deposit accounts |  [optional]
**transactionChannelKey** | **String** | The encoded key of the transaction channel associated with the transaction details. |  [optional]
**transactionChannelId** | **String** | The id of the transaction channel associated with the transaction details. |  [optional]
**targetDepositAccountKey** | **String** | In case of a transaction to a deposit account this represent the deposit account key to which the transaction was made. |  [optional]



