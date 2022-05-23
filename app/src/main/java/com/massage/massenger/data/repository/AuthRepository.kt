package com.massage.massenger.data.repository

import com.massage.massenger.common.NetworkState
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.sign_up.SignUpData
import kotlinx.coroutines.flow.Flow

interface AuthRepository {
    suspend fun login(phone: String, password: String): Flow<NetworkState<AuthResponse>>
    suspend fun signUp(signUpData: SignUpData): Flow<NetworkState<AuthResponse>>
    suspend fun refreshAuth(): Flow<NetworkState<AuthResponse>>

    suspend fun isLoggedIn(): Boolean
    suspend fun getLoggedInUser(): User?
    suspend fun deleteUserData()
}