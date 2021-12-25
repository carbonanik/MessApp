package com.massage.massenger.model

import kotlinx.serialization.Serializable

@Serializable
data class Post(
    val id: String,
    val authorId: String,
    val title: String,
    val body: String,
    val time: Long,
    val privacy: String,
    val contentUrl: String,
    val contentType: String,
)
