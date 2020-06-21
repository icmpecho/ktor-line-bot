package com.icmpecho.linebot.event.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Message {

    @Serializable
    @SerialName("text")
    data class TextMessage(
        val id: String,
        val text: String,
        val emojis: List<Emoji>? = null
    ): Message()

    @Serializable
    @SerialName("image")
    data class ImageMessage(
        val id: String,
        val contentProvider: ContentProvider
    ): Message()

    @Serializable
    @SerialName("video")
    data class VideoMessage(
        val id: String,
        val duration: Long,
        val contentProvider: ContentProvider
    ): Message()

    @Serializable
    @SerialName("audio")
    data class AudioMessage(
        val id: String,
        val duration: Long,
        val contentProvider: ContentProvider
    ): Message()

    @Serializable
    @SerialName("file")
    data class FileMessage(
        val id: String,
        val fileName: String,
        val fileSize: Long
    ): Message()

    @Serializable
    @SerialName("location")
    data class LocationMessage(
        val id: String,
        val title: String,
        val address: String,
        val latitude: Float,
        val longitude: Float
    ): Message()

    @Serializable
    @SerialName("sticker")
    data class StickerMessage(
        val id: String,
        val packageId: String,
        val stickerId: String,
        val stickerResourceType: String? = null
    ): Message()
}