package com.massage.massenger.data.local.pref

import com.massage.massenger.model.User


interface UserDataSource {

    suspend fun saveToken(token: String)
    suspend fun getToken(): String

    suspend fun saveUser(user: User)
    suspend fun getUser(): User?

    suspend fun saveContactFetchTime(time: Long)
    suspend fun getContactFetchTime(): Long

    suspend fun clearData()
}

