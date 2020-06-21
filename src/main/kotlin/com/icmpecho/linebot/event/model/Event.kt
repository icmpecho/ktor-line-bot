package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Mode {
    @SerialName("active") ACTIVE,
    @SerialName("standby") STANDBY,
    UNKNOWN,
}

@Serializable
sealed class Source {

    @Serializable
    @SerialName("user")
    data class User(
        @SerialName("userId") val userId: String
    ):Source()
}

@Serializable
sealed class Event {

    @Serializable
    @SerialName("message")
    data class MessageEvent(
        @SerialName("replyToken") val replyToken: String,
        @SerialName("mode") val mode: Mode = Mode.UNKNOWN,
        @SerialName("timestamp") val timestamp: Long,
        @SerialName("source") val source: Source
    ):Event()
}
