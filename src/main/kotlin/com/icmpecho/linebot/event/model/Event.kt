package com.icmpecho.linebot.event.model

import com.google.gson.annotations.SerializedName

data class Event(
    @SerializedName("replyToken") val replyToken: String,
    @SerializedName("type") val type: String
)