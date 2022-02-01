package cn.jackuxl.afdian.webhook

import kotlinx.serialization.Serializable


@Serializable
data class AfdianWebHookParam(
    /**
     * 状态码 200成功
     */
    var ec: Int,

    /**
     * 消息
     */
    var em: String? = null,

    /**
     * data参数
     */
    var data: AfdianWebHookDataParam? = null
)

