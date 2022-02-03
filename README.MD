# afdian-kotlin-sdk
## 介绍
[爱发电 API 接口](https://afdian.net/p/010ff078177211eca44f52540025c377) 的 Kotlin 封装。

基于官方文档构建，WebHook 部分暂未测试，不保证可用。

主动请求部分已完成测试，如遇问题欢迎 [issue](https://github.com/JackuXL/afdian-kotlin-sdk/issues) 反馈。

## 使用
```kotlin
val afdian = Afdian(
    // UserId
    userId,
    // Token
    token
)

// ping 请求
afdian.ping(params)

// 获取订单列表
afdian.queryOrder(params)

// 获取赞助者列表
afdian.querySponsor(params)
```
## 依赖
本项目依赖 [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization/) 和 [okhttp](https://github.com/square/okhttp)

## 感谢
本项目参考了 handy-git 的 [afdian-java-sdk](https://gitee.com/handy-git/afdian-java-sdk)