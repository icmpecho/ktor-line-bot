package com.icmpecho.linebot.event.model

import kotlinx.serialization.Serializable

@Serializable
data class WebHookRequest(
    val events: List<Event>
)