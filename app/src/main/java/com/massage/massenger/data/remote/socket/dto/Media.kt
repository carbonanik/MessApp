package com.massage.massenger.data.remote.socket.dto

data class Media(
    val url: String,
    val supported: Boolean,
    val info: MediaInfo?,
)

sealed class MediaInfo() {
    class Image(
        val height: Int?,
        val width: Int?,
        val extension: String
    ) : MediaInfo()

    class Video(
        val height: Int?,
        val width: Int?,
        val extension: String
    ) : MediaInfo()

    class Audio(
        val duration: Long,
        val extension: String
    ) : MediaInfo()

    class Pdf(
        val pageCount: Int
    ) : MediaInfo()
}
