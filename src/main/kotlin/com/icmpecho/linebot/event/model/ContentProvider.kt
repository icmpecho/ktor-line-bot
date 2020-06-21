package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ContentProvider {

    @Serializable
    @SerialName("line")
    object Line: ContentProvider()

    @Serializable
    @SerialName("external")
    data class External(
        val originalContentUrl: String,
        val previewImageUrl: String? = null
    ): ContentProvider()
}