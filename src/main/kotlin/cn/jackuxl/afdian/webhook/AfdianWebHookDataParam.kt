package cn.jackuxl.afdian.webhook

import kotlinx.serialization.Serializable

@Serializable
data class AfdianWebHookDataParam(
    /**
     * 类型
     */
    var type:String,
    /**
     * 订单
     */
    var order:AfdianWebHookOrderParam
)
