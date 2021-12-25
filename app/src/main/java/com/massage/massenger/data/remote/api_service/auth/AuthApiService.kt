package com.massage.massenger.data.remote.api_service.auth

import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse


interface AuthApiService {

    suspend fun signUp(authRequest: AuthRequest): AuthResponse

    suspend fun login(authRequest: AuthRequest): AuthResponse

    suspend fun refreshAuth(token: String): AuthResponse
}