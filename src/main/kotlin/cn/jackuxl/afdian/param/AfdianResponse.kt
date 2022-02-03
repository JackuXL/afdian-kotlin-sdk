package cn.jackuxl.afdian.param

import kotlinx.serialization.Serializable

@Serializable
data class AfdianResponse<T>(
    var ec: Int,
    var em: String,
    var data: T
)