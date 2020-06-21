package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WebHookRequest(
    @SerialName("events") val events: List<Event>
)