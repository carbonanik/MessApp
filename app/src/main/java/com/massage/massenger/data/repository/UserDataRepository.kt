package com.massage.massenger.data.repository

import com.massage.massenger.data.local.pref.DataStoreManager
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserDataRepository @Inject constructor(
    private val dataStoreManager: DataStoreManager
) {

    suspend fun storeToken(token: String) = dataStoreManager.storeToken(token)

    suspend fun storeUser(user: User) = dataStoreManager.storeUser(user)

    suspend fun getToken()= dataStoreManager.savedToken.first()

    fun getTokenFlow()= dataStoreManager.savedToken

    suspend fun getUser()= dataStoreManager.savedUser.first()

    fun getUserFlow()= dataStoreManager.savedUser

    suspend fun clearAll() = dataStoreManager.clear()
}