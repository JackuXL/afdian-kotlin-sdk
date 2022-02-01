package cn.jackuxl.afdian.http

import cn.jackuxl.afdian.util.HttpUtil
import cn.jackuxl.afdian.param.AfdianResponse

class Afdian(private val userId: String, private val token: String) {
    private val baseUrl = "https://afdian.net/api/open"
    private val httpUtil: HttpUtil = HttpUtil(baseUrl,userId,token)

    private val pingUrl = "/ping"
    private val queryOrderUrl = "/query-order"
    private val querySponsorUrl = "/query-sponsor"

    fun ping(params:Map<String,String>):AfdianResponse?{
        return httpUtil.sendPost(pingUrl,params)
    }

    fun queryOrder(params:Map<String,String>):AfdianResponse?{
        return httpUtil.sendPost(queryOrderUrl,params)
    }

    fun querySponsor(params:Map<String,String>):AfdianResponse?{
        return httpUtil.sendPost(querySponsorUrl,params)
    }


}
