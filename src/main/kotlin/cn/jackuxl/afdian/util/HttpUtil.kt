package cn.jackuxl.afdian.util

import cn.jackuxl.afdian.param.AfdianRequest
import cn.jackuxl.afdian.param.AfdianResponse
import kotlinx.serialization.KSerializer
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.math.BigInteger
import java.security.MessageDigest


class HttpUtil(private val baseUrl: String, private val userId: String, private val token: String) {
    var client = OkHttpClient()

    private val JSON: MediaType = "application/json; charset=utf-8".toMediaType()
    private var jsonBuilder = Json {
        ignoreUnknownKeys = true
    }

    fun <T> sendPost(url: String, params: Map<String, String>, serializer: KSerializer<T>): AfdianResponse<T>? {
        val ts = System.currentTimeMillis() / 1000
        val paramsJson = jsonBuilder.encodeToString(params)
        val sign = md5(token + "params" + paramsJson + "ts" + ts + "user_id" + userId)

        val body: RequestBody =
            jsonBuilder.encodeToString(AfdianRequest.serializer(), AfdianRequest(userId, paramsJson, ts, sign))
                .toRequestBody(JSON)
        val request: Request = Request.Builder()
            .url(baseUrl + url)
            .post(body)
            .build()

        client.newCall(request).execute().use {
            it.body?.string()?.let { str ->
                return jsonBuilder.decodeFromString(AfdianResponse.serializer(serializer), str)
            }
            return null
        }
    }

    private fun md5(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
    }
}
