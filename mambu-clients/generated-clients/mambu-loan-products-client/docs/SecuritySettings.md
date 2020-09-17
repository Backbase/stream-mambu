

# SecuritySettings

The settings and constraints for securities.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isCollateralEnabled** | **Boolean** | Shows whether collateral (assets or other goods) are accepted in order to reach required securities percentage from loan amount, as defined in this product. |  [optional]
**isGuarantorsEnabled** | **Boolean** | Shows whether guarantors (other clients) are accepted in order to reach the required securities percentage from loan amount, as defined in this product. |  [optional]
**requiredGuaranties** | [**BigDecimal**](BigDecimal.md) | The securities percentage from loan amount that is needed in order for this account to be approved. Null if the securities are not required. |  [optional]



