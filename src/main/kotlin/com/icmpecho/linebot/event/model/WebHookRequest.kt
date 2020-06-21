package com.icmpecho.linebot.event.model

import com.google.gson.annotations.SerializedName

data class WebHookRequest(
    @SerializedName("events") val events: List<Event>
)