package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Type {
    @SerialName("message") MESSAGE,
}

@Serializable
enum class Mode {
    @SerialName("active") ACTIVE,
    @SerialName("standby") STANDBY,
    UNKNOWN,
}

@Serializable
sealed class Source {
    @SerialName("user")
    @Serializable
    data class User(
        @SerialName("userId") val userId: String
    ):Source()
}

@Serializable
data class Event(
    @SerialName("replyToken") val replyToken: String,
    @SerialName("type") val type: Type,
    @SerialName("mode") val mode: Mode = Mode.UNKNOWN,
    @SerialName("timestamp") val timestamp: Long,
    @SerialName("source") val source: Source
)