package com.massage.massenger.data.repository

import com.massage.massenger.data.remote.api_service.auth.AuthApiService
import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthApiRepository @Inject constructor(
    private val authApi: AuthApiService
) {

    suspend fun login(phone: String, password: String) =
        authApi.login(AuthRequest(null, phone, password))

    suspend fun signUp(name: String, phone: String, password: String) =
        authApi.signUp(AuthRequest(name, phone, password))

    suspend fun refreshAuth(token: String) = authApi.refreshAuth(token)
}