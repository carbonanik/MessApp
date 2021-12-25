package com.massage.massenger.data.remote.api_service.user

import com.massage.massenger.model.User


interface UserApiService {

    // route -> "/user/me"
    suspend fun getUserByToken(token: String): User

    suspend fun getUserByName(name: String, token: String): User

    suspend fun getUserById(userId: String, token: String): User

    suspend fun getUsersByPhones(
        numbers: List<String>, token: String
    ): List<User>

    suspend fun deleteUserById(userId: String, token: String): String
}