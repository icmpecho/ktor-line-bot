package com.icmpecho.linebot.event.model

import kotlinx.serialization.Serializable

@Serializable
data class Emoji(
    val index: Int,
    val length: Int,
    val productId: String,
    val emojiId: String
)