package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Source {

    @Serializable
    @SerialName("user")
    data class User(
        val userId: String
    ): Source()

    @Serializable
    @SerialName("group")
    data class Group(
        val groupId: String,
        val userId: String? = null
    ): Source()

    @Serializable
    @SerialName("room")
    data class Room(
        val roomId: String,
        val userId: String? = null
    ): Source()
}