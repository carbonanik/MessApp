package com.massage.massenger.data.remote.api_service.post

import com.massage.massenger.data.remote.api_service.HttpRoutes
import com.massage.massenger.data.remote.api_service.post.dto.CreatePostRequest
import com.massage.massenger.model.Post
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class PostApiServiceImpl(private val client: HttpClient) : PostApiService {

    override suspend fun create(createPostRequest: CreatePostRequest, token: String): Post =
        withContext(Dispatchers.IO) {
            client.post<Post> {
                url(HttpRoutes.Post.CREATE)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
                body = createPostRequest
            }
        }

    override suspend fun getById(postId: String, token: String): Post =
        withContext(Dispatchers.IO) {
            client.get {
                url(HttpRoutes.Post.GET_BY_ID)
                parameter("id", postId)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }

    override suspend fun getOfUser(userId: String, token: String): List<Post> =
        withContext(Dispatchers.IO) {
            client.get {
                url(HttpRoutes.Post.GET_OF_USER)
                parameter("id", userId)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }

    override suspend fun getAllUntil(time: Long, token: String): List<Post> =
        withContext(Dispatchers.IO) {
            client.get {
                url(HttpRoutes.Post.GET_ALL_UNTIL)
                parameter("time", time)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }

    override suspend fun getAllBetween(oldTime: Long, newTime: Long, token: String): List<Post> =
        withContext(Dispatchers.IO) {
            client.get {
                url(HttpRoutes.Post.GET_ALL_BETWEEN)
                parameter("old_time", oldTime)
                parameter("new_time", newTime)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }
}