package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Order(
    @SerialName("address_address")
    var addressAddress: String,
    @SerialName("address_person")
    var addressPerson: String,
    @SerialName("address_phone")
    var addressPhone: String,
    @SerialName("discount")
    var discount: String,
    @SerialName("month")
    var month: Int,
    @SerialName("out_trade_no")
    var outTradeNo: String,
    @SerialName("plan_id")
    var planId: String,
    @SerialName("product_type")
    var productType: Int,
    @SerialName("redeem_id")
    var redeemId: String,
    @SerialName("remark")
    var remark: String,
    @SerialName("show_amount")
    var showAmount: String,
//    @SerialName("sku_detail")
//    var skuDetail: List<Any>,
    @SerialName("status")
    var status: Int,
    @SerialName("total_amount")
    var totalAmount: String,
    @SerialName("user_id")
    var userId: String,
    @SerialName("user_private_id")
    var userPrivateId: String
)