package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @SerialName("avatar")
    var avatar: String,
    @SerialName("name")
    var name: String,
    @SerialName("user_id")
    var userId: String,
    @SerialName("user_private_id")
    var userPrivateId: String
)