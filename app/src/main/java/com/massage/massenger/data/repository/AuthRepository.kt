package com.massage.massenger.data.repository

import com.massage.massenger.common.Resource
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun login(phone: String, password: String): Flow<Resource<AuthResponse>>
    suspend fun signUp(name: String, phone: String, password: String): Flow<Resource<AuthResponse>>
    suspend fun refreshAuth(): Flow<Resource<AuthResponse>>

    suspend fun isLoggedIn(): Boolean
    suspend fun getLoggedInUser(): User?
    suspend fun deleteUserData()
}