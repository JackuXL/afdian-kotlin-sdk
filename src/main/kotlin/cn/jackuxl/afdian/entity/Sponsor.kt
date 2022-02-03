package cn.jackuxl.afdian.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Sponsor(
    @SerialName("all_sum_amount")
    var allSumAmount: String,
    @SerialName("current_plan")
    var currentPlan: CurrentPlan,
    @SerialName("first_pay_time")
    var firstPayTime: Int,
    @SerialName("last_pay_time")
    var lastPayTime: Int,
    @SerialName("sponsor_plans")
    var sponsorPlans: List<SponsorPlan>,
    @SerialName("user")
    var user: User
)