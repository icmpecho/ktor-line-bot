package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Event {

    @Serializable
    @SerialName("message")
    data class MessageEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source,
        val replyToken: String,
        val message: Message
    ):Event()

    @Serializable
    @SerialName("follow")
    data class FollowEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source,
        val replyToken: String
    ):Event()

    @Serializable
    @SerialName("unfollow")
    data class UnFollowEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source
    ):Event()

    @Serializable
    @SerialName("join")
    data class JoinEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source,
        val replyToken: String
    ):Event()

    @Serializable
    @SerialName("leave")
    data class LeaveEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source
    ):Event()

    @Serializable
    @SerialName("memberJoined")
    data class MemberJoinedEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source,
        val replyToken: String,
        val joined: Members
    ):Event()

    @Serializable
    @SerialName("memberLeft")
    data class MemberLeftEvent(
        val mode: Mode = Mode.UNKNOWN,
        val timestamp: Long,
        val source: Source,
        val left: Members
    ):Event()
}
