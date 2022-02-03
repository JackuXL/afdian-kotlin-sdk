package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CurrentPlan(
    @SerialName("can_buy_hide")
    var canBuyHide: Int? = null,
    @SerialName("desc")
    var desc: String? = null,
    @SerialName("expire_time")
    var expireTime: Int? = null,
    @SerialName("independent")
    var independent: Int? = null,
    @SerialName("name")
    var name: String? = null,
    @SerialName("need_address")
    var needAddress: Int? = null,
    @SerialName("need_invite_code")
    var needInviteCode: Boolean? = null,
    @SerialName("pay_month")
    var payMonth: Int? = null,
    @SerialName("permanent")
    var permanent: Int? = null,
    @SerialName("pic")
    var pic: String? = null,
    @SerialName("plan_id")
    var planId: String? = null,
    @SerialName("price")
    var price: String? = null,
    @SerialName("product_type")
    var productType: Int? = null,
    @SerialName("rank")
    var rank: Int? = null,
    @SerialName("rankType")
    var rankType: Int? = null,
    @SerialName("sale_limit_count")
    var saleLimitCount: Int? = null,
    @SerialName("show_price")
    var showPrice: String? = null,
//    @SerialName("sku_processed")
//    var skuProcessed: List<Any>? = null,
    @SerialName("status")
    var status: Int? = null,
    @SerialName("update_time")
    var updateTime: Int? = null,
    @SerialName("user_id")
    var userId: String? = null
)