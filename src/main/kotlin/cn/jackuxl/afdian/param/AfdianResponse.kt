package cn.jackuxl.afdian.param

import kotlinx.serialization.Serializable

@Serializable
data class AfdianResponse(
    var ec: Int,
    var em: String,
    var data: Map<String, String>
)