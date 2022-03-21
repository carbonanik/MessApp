package com.massage.massenger.data.local.pref

import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow


interface UserDataSource {
    suspend fun saveToken(token: String)
    fun getToken(): Flow<String>
    suspend fun getTokenFirst(): String

    suspend fun saveUser(user: User)
    fun getUser(): Flow<User?>
    suspend fun getUserFirst(): User?

    suspend fun clearData()
}

