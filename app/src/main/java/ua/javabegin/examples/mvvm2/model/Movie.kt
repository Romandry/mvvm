package ua.javabegin.examples.mvvm2.model

import com.google.gson.annotations.SerializedName

data class SmoothResponse (
    @SerializedName("0") val foo : MainParams,
    @SerializedName("name") val name : String = "freee" //,
//        @SerializedName("messageList") val messageList : List<String>
)
data class MainParams (
//        @SerializedName("redirect") val redirect : String,
    @SerializedName("response") val response : Response//,
//        @SerializedName("htmlList") val htmlList : List<String>,
//        @SerializedName("evalScriptList") val evalScriptList : List<String>,
//        @SerializedName("domComponentCallList") val domComponentCallList : List<String>,
//        @SerializedName("containerComponentCallList") val containerComponentCallList : List<String>,
//        @SerializedName("domElementFunctionList") val domElementFunctionList : List<String>,
//        @SerializedName("captureTo") val captureTo : String,
//        @SerializedName("children") val children : List<String>,
//        @SerializedName("options") val options : List<String>,
//        @SerializedName("template") val template : String,
//        @SerializedName("terminate") val terminate : Boolean,
//        @SerializedName("variables") val variables : List<String>,
//        @SerializedName("append") val append : Boolean
)
data class Response (
    @SerializedName("0") val bar : List<ResponseItem>//,
//        @SerializedName("countryName") val countryName : String,
//        @SerializedName("countryId") val countryId : String,
//        @SerializedName("cityName") val cityName : String,
//        @SerializedName("cityId") val cityId : String
)
class Image (

)
data class ResponseItem (
    @SerializedName("name") val name: String,
    @SerializedName("startTimestamp") val date: String,
    @SerializedName("cityName") val cityName: String,
    @SerializedName("userName") val userName: String,
    @SerializedName("userImg") val userImg: String,
    @SerializedName("img") val img: String,
    @SerializedName("text") val text: String,
    @SerializedName("eventId") val eventId: Int
)












data class SmoothEvent(
    @SerializedName("append") val append: Boolean,
    @SerializedName("captureTo") val captureTo: String,
    @SerializedName("children") val children: List<Any>,
    @SerializedName("containerComponentCallList") val containerComponentCallList: List<Any>,
    @SerializedName("domComponentCallList") val domComponentCallList: List<Any>,
    @SerializedName("domElementFunctionList") val domElementFunctionList: List<Any>,
    @SerializedName("evalScriptList") val evalScriptList: List<Any>,
    @SerializedName("htmlList") val htmlList: List<Any>,
    @SerializedName("messageList") val messageList: List<Any>,
    @SerializedName("options") val options: List<Any>,
    @SerializedName("redirect") val redirect: Any,
    @SerializedName("response") val response: EventResponse,
    @SerializedName("template") val template: String,
    @SerializedName("terminate") val terminate: Boolean,
    @SerializedName("variables") val variables: List<Any>
)
data class EventResponse(
    @SerializedName("currentUserEntity") val currentUserEntity: Any,
    @SerializedName("eventCommentGrid") val eventCommentGrid: List<Any>,
    @SerializedName("participants") val participants: List<EventParticipants>,
    @SerializedName("r") val r: Any,
    @SerializedName("0") val event: Event
)
data class EventParticipants(
    @SerializedName("activityVisitTimestamp") val activityVisitTimestamp: Any,
    @SerializedName("addingTimestamp") val addingTimestamp: String,
    @SerializedName("agentUserId") val agentUserId: String,
    @SerializedName("alias") val alias: Any,
    @SerializedName("birthday") val birthday: String,
    @SerializedName("cityId") val cityId: String,
    @SerializedName("cropper") val cropper: Any,
    @SerializedName("email") val email: String,
    @SerializedName("firstName") val firstName: String,
    @SerializedName("firstTransactionId") val firstTransactionId: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("image") val image: ParticipantImage,
    @SerializedName("isAgent") val isAgent: String,
    @SerializedName("isEmailConfirmed") val isEmailConfirmed: String,
    @SerializedName("isModel") val isModel: String,
    @SerializedName("isModelAdmin") val isModelAdmin: String,
    @SerializedName("isNewsAdmin") val isNewsAdmin: String,
    @SerializedName("isNewsMaker") val isNewsMaker: String,
    @SerializedName("isPhoneConfirmed") val isPhoneConfirmed: Any,
    @SerializedName("isSpammer") val isSpammer: String,
    @SerializedName("language") val language: String,
    @SerializedName("lastName") val lastName: String,
    @SerializedName("lastPaymentTimestamp") val lastPaymentTimestamp: String,
    @SerializedName("lastVisitTimestamp") val lastVisitTimestamp: String,
    @SerializedName("membershipTimestamp") val membershipTimestamp: String,
    @SerializedName("oldCity") val oldCity: Any,
    @SerializedName("oldData") val oldData: Any,
    @SerializedName("oldId") val oldId: Any,
    @SerializedName("password") val password: Any,
    @SerializedName("phone") val phone: String,
    @SerializedName("role") val role: String,
    @SerializedName("status") val status: String,
    @SerializedName("timeZone") val timeZone: String,
    @SerializedName("userId") val userId: String
)
class ParticipantImage(
)
class EventImage(
)
data class Event(
    @SerializedName("addingTimestamp") val addingTimestamp: String,
    @SerializedName("cityId") val cityId: String,
    @SerializedName("description") val description: String,
    @SerializedName("endTimestamp") val endTimestamp: Any,
    @SerializedName("eventId") val eventId: String,
    @SerializedName("feedback") val feedback: Any,
    @SerializedName("image") val image: EventImage,
    @SerializedName("img") val img: String,
    @SerializedName("is24AdSent") val is24AdSent: String,
    @SerializedName("isChatEnable") val isChatEnable: String,
    @SerializedName("isPublished") val isPublished: String,
    @SerializedName("name") val name: String,
    @SerializedName("startTimestamp") val startTimestamp: String,
    @SerializedName("text") val text: String,
    @SerializedName("userId") val userId: String
)