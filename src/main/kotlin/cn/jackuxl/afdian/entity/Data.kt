package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data<T>(
    @SerialName("total_count")
    var totalCount: Int,
    @SerialName("total_page")
    var totalPage: Int,
    @SerialName("list")
    var list: List<T>
)