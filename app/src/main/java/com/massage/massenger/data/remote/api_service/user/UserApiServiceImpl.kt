package com.massage.massenger.data.remote.api_service.user

import com.massage.massenger.data.remote.api_service.HttpRoutes
import com.massage.massenger.model.User
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.util.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserApiServiceImpl(
    private val client: HttpClient
) : UserApiService {

    @OptIn(InternalAPI::class)
    override suspend fun getUserByToken(
        token: String
    ): User = withContext(Dispatchers.IO) {

        client.get<User> {
            url(HttpRoutes.User.ME)
            headers {
                append(HttpHeaders.Authorization, token)
            }
        }
    }

    override suspend fun queryUserByName(
        name: String,
        token: String
    ): List<User> = withContext(Dispatchers.IO) {

        client.get {
            url(HttpRoutes.User.GET_BY_NAME)
            parameter("name", name)
            header(HttpHeaders.Authorization, token)
        }
    }

    override suspend fun getUserById(
        userId: String,
        token: String
    ): User = withContext(Dispatchers.IO) {

        client.get {
            url(HttpRoutes.User.GET_BY_ID)
            parameter("id", userId)
            header(HttpHeaders.Authorization, token)
        }
    }

    override suspend fun getUsersByPhones(
        numbers: List<String>,
        token: String
    ): List<User> = withContext(Dispatchers.IO) {
        client.post {
            url(HttpRoutes.User.GET_BY_PHONE)
            contentType(ContentType.Application.Json)
            header(HttpHeaders.Authorization, token)
            body = numbers
        }
    }

    override suspend fun deleteUserById(
        userId: String,
        token: String
    ): String = withContext(Dispatchers.IO) {

        client.delete<String> {
            url(HttpRoutes.User.DELETE)
            parameter("id", userId)
            header(HttpHeaders.Authorization, token)
        }
    }
}