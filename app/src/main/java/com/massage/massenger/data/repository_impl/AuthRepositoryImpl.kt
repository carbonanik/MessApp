package com.massage.massenger.data.repository_impl

import com.massage.massenger.data.local.pref.NO_TOKEN
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.MessengerDatabase
import com.massage.massenger.data.remote.api_service.auth.AuthApiService
import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.data.remote.api_service.auth.dto.userFromAuth
import com.massage.massenger.data.repository.AuthRepository


class AuthRepositoryImpl(
    private val authApiService: AuthApiService,
    private val userDataSource: UserDataSource,
    private val database: MessengerDatabase
): AuthRepository {

    override suspend fun login(phone: String, password: String) =
        boundFetchSave(
            fetch = { authApiService.login(AuthRequest(null, phone, password)) },
            save = { saveFetchedAuthResult(it) }
        )

    override suspend fun signUp(name: String, phone: String, password: String) =
        boundFetchSave(
            fetch = { authApiService.signUp(AuthRequest(name, phone, password)) },
            save = { saveFetchedAuthResult(it) }
        )

    override suspend fun refreshAuth() =
        boundFetchSave(
            fetch = { authApiService.refreshAuth(token()) },
            save = { saveFetchedAuthResult(it) }
        )

    private suspend fun saveFetchedAuthResult(response: AuthResponse?) {
        response?.let { auth ->
            userDataSource.saveToken(auth.authToken)
            userDataSource.saveUser(auth.userFromAuth())
        }
    }

    override suspend fun isLoggedIn(): Boolean {
        return userDataSource.getTokenFirst() != NO_TOKEN
    }

    override suspend fun getLoggedInUser() = userDataSource.getUserFirst()

    override suspend fun deleteUserData() {
        database.clearAllTables()
        userDataSource.clearData()
    }

    private suspend fun token() = userDataSource.getTokenFirst()
}