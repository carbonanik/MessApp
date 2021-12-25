package com.massage.massenger.data.remote.api_service.auth

import com.massage.massenger.data.remote.api_service.HttpRoutes
import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 18-10-21
 */
class AuthApiServiceImpl (
    private val client: HttpClient
) : AuthApiService {

    override suspend fun signUp(authRequest: AuthRequest) =
        withContext(Dispatchers.IO) {
            client.post<AuthResponse> {
                url(HttpRoutes.Auth.SIGNUP)
                contentType(ContentType.Application.Json)
                body = authRequest
            }
        }

    override suspend fun login(authRequest: AuthRequest) =
        withContext(Dispatchers.IO) {
            client.post<AuthResponse> {
                url(HttpRoutes.Auth.LOGIN)
                contentType(ContentType.Application.Json)
                body = authRequest
            }
        }

    override suspend fun refreshAuth(token: String) =
        withContext(Dispatchers.IO) {
            client.get<AuthResponse> {
                url(HttpRoutes.Auth.REFRESH)
                headers {
                    append(HttpHeaders.Authorization, token)
                }
            }
        }

}