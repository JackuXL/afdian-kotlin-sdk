package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PingData(
    @SerialName("page")
    var page: String,
    @SerialName("request")
    var request: Request,
    @SerialName("uid")
    var uid: String
)