package cn.jackuxl.afdian.webhook

import kotlinx.serialization.Serializable

@Serializable
data class AfdianWebHookOrderParam(
    var out_trade_no: String? = null,
    var user_id: String? = null,
    var plan_id: String? = null,
    var month: Int? = null,
    var total_amount: String? = null,
    var show_amount: String? = null,
    var status: Int? = null,
    var remark: String? = null,
    var redeem_id: String? = null,
    var product_type: Int? = null,
    var discount: String? = null,
    var sku_detail: List<String>? = null,
    var address_person: String? = null,
    var address_phone: String? = null,
    var address_address: String? = null
)

