package com.icmpecho.linebot.event.model

import kotlinx.serialization.Serializable

@Serializable
data class WebHookRequest(
    val destination: String? = null,
    val events: List<Event>
)