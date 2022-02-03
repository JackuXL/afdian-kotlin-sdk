package cn.jackuxl.afdian

import cn.jackuxl.afdian.http.Afdian

fun main() {
    val afdian = Afdian(
        // UserId
        "你的用户ID",
        // Token
        "你的Token"
    )

    // ping 请求
    println(afdian.ping(mapOf("page" to "1")))

    // 获取订单列表
    println(afdian.queryOrder(mapOf("page" to "1")))

    // 获取赞助者列表
    println(afdian.querySponsor(mapOf("page" to "1")))
}