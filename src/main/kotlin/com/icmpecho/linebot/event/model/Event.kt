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
        val userId: String
    ):Source()

    @Serializable
    @SerialName("group")
    data class Group(
        val groupId: String,
        val userId: String = ""
    ):Source()

    @Serializable
    @SerialName("room")
    data class Room(
        val roomId: String,
        val userId: String = ""
    ):Source()
}

@Serializable
sealed class Event {

    @Serializable
    @SerialName("message")
    data class MessageEvent(
        val replyToken: String,
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source
    ):Event()
}
