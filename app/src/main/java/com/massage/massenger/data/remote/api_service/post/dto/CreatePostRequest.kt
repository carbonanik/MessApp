package com.massage.massenger.data.remote.api_service.post.dto

data class CreatePostRequest(
    val authorId: String,
    val title: String,
    val body: String,
    val time: Long,
    val privacy: String,
    val contentUrl: String,
    val contentType: String,
)