package cn.jackuxl.afdian.param

import kotlinx.serialization.Serializable

@Serializable
data class AfdianRequest(
    var user_id: String,
    var params: String,
    var ts: Long,
    var sign: String
)