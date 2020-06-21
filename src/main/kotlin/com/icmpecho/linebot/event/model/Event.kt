package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
