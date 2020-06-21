package com.icmpecho.linebot.event.model

import kotlinx.serialization.Serializable

@Serializable
data class Members(
    val members: List<Source.User>
)