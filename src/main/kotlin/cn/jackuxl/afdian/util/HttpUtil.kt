package cn.jackuxl.afdian.util

import cn.jackuxl.afdian.param.AfdianRequest
import cn.jackuxl.afdian.param.AfdianResponse
import cn.jackuxl.afdian.serializer.SortedMapSerializer
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody


class HttpUtil(private val baseUrl: String, private val userId: String, private val token: String) {
    var client = OkHttpClient()
    val JSON: MediaType = "application/json; charset=utf-8".toMediaType()

    fun sendPost(url: String, params: Map<String, String>): AfdianResponse? {
        val ts = System.currentTimeMillis() / 1000
        val paramsJson = Json.encodeToString(SortedMapSerializer, params)
        val sign = token + "params" + paramsJson + "ts" + ts + "user_id" + userId


        val body: RequestBody =
            Json.encodeToString(AfdianRequest.serializer(), AfdianRequest(userId, paramsJson, ts, sign))
                .toRequestBody(JSON)
        val request: Request = Request.Builder()
            .url(baseUrl + url)
            .post(body)
            .build()

        client.newCall(request).execute().use {
            it.body?.string()?.let { str ->
                return Json.decodeFromString(AfdianResponse.serializer(), str)
            }
            return null
        }
    }
}