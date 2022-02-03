package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Request(
    @SerialName("params")
    var params: String,
    @SerialName("sign")
    var sign: String,
    @SerialName("ts")
    var ts: Int,
    @SerialName("user_id")
    var userId: String
)