package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
enum class Mode {
    @SerialName("active") ACTIVE,
    @SerialName("standby") STANDBY,
    UNKNOWN,
}