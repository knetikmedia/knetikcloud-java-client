
# CouponDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**discountType** | [**DiscountTypeEnum**](#DiscountTypeEnum) |  |  [optional]
**exclusive** | **Boolean** |  |  [optional]
**maxDiscount** | **Double** |  |  [optional]
**maxQuantity** | **Integer** |  |  [optional]
**minCartTotal** | **Double** |  |  [optional]
**name** | **String** |  |  [optional]
**selfExclusive** | **Boolean** |  |  [optional]
**targetItemId** | **Integer** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**validForTags** | **List&lt;String&gt;** |  |  [optional]
**value** | **Double** |  |  [optional]
**vendorId** | **Integer** |  |  [optional]


<a name="DiscountTypeEnum"></a>
## Enum: DiscountTypeEnum
Name | Value
---- | -----
VALUE | &quot;value&quot;
PERCENTAGE | &quot;percentage&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CART | &quot;coupon_cart&quot;
SINGLE_ITEM | &quot;coupon_single_item&quot;
VOUCHER | &quot;coupon_voucher&quot;
VENDOR | &quot;coupon_vendor&quot;
TAG | &quot;coupon_tag&quot;



