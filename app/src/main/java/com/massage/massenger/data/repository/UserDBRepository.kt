package com.massage.massenger.data.repository

import com.massage.massenger.data.local.room.ConnectionDao
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserDBRepository @Inject constructor(
    private val connectionDao: ConnectionDao
) {
    suspend fun insertUser(vararg user: User) =
        connectionDao.insertUser(*user)

    suspend fun getUser(id: String?): User? =
        connectionDao.getUser(id)

    suspend fun updateUser(user: User) =
        connectionDao.updateUser(user)

    suspend fun deleteUser(user: User) =
        connectionDao.deleteUser(user)

    fun getAllUser(): Flow<List<User>?> =
        connectionDao.getAllUser()

}