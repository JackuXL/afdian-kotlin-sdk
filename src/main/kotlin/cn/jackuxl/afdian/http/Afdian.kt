package cn.jackuxl.afdian.http

import cn.jackuxl.afdian.entity.Data
import cn.jackuxl.afdian.entity.Order
import cn.jackuxl.afdian.entity.PingData
import cn.jackuxl.afdian.entity.Sponsor
import cn.jackuxl.afdian.param.AfdianResponse
import cn.jackuxl.afdian.util.HttpUtil

class Afdian(userId: String, token: String) {
    private val baseUrl = "https://afdian.net/api/open"
    private val httpUtil: HttpUtil = HttpUtil(baseUrl, userId, token)

    private val pingUrl = "/ping"
    private val queryOrderUrl = "/query-order"
    private val querySponsorUrl = "/query-sponsor"

    fun ping(params: Map<String, String>): AfdianResponse<PingData>? {
        return httpUtil.sendPost(pingUrl, params, PingData.serializer())
    }

    fun queryOrder(params: Map<String, String>): AfdianResponse<Data<Order>>? {
        return httpUtil.sendPost(queryOrderUrl, params, Data.serializer(Order.serializer()))
    }

    fun querySponsor(params: Map<String, String>): AfdianResponse<Data<Sponsor>>? {
        return httpUtil.sendPost(querySponsorUrl, params, Data.serializer(Sponsor.serializer()))
    }
}

