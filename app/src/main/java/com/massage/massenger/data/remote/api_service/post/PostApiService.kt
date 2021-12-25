package com.massage.massenger.data.remote.api_service.post

import com.massage.massenger.data.remote.api_service.post.dto.CreatePostRequest
import com.massage.massenger.model.Post

interface PostApiService {
    suspend fun create(createPostRequest: CreatePostRequest, token: String): Post
    suspend fun getById(postId: String, token: String): Post
    suspend fun getOfUser(userId: String, token: String): List<Post>
    suspend fun getAllUntil(time: Long, token: String): List<Post>
    suspend fun getAllBetween(oldTime: Long, newTime: Long, token: String): List<Post>
}