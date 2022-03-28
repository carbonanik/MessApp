package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.Resource
import com.massage.massenger.data.local.content.ContactDataSource
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.dao.UserDao
import com.massage.massenger.data.remote.api_service.user.UserApiService
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDataSource: UserDataSource,
    private val userDao: UserDao,
    private val userApiService: UserApiService,
    private val contactDataSource: ContactDataSource
) {
    fun getUserByToken(): Flow<Resource<User>> =
        boundFetchSave(fetch = { userApiService.getUserByToken(token()) },
            save = { userDataSource.saveUser(it) })

    fun getUserByName(name: String) =
        boundFetch { userApiService.queryUserByName(name, token()) }

    fun getUserById(userId: String) =
        boundCacheFetchSave(query = { userDao.getUser(userId) },
            fetch = { userApiService.getUserById(userId, token()) },
            saveFetched = { userDao.insertUser(it) }
        )

    fun getUsersByPhonesAndSave() = boundFetchSave(
//        query = { userDao.getAllUser().first() },
        fetch = {
            val numbers = contactDataSource.fetchContact()
            println(numbers)
            val a = userApiService.getUsersByPhones(numbers, token())
            println(a)
            a
        },
        save = {
            userDao.insertUser(*it.toTypedArray())
               },
//        shouldFetch = { false }
    )

    fun deleteUserById(userId: String) =
        boundFetch { userApiService.deleteUserById(userId, token()) }

    suspend fun getUserByIdLocal(id: String?): User? {
        val user = userDao.getUser(id)
        return user
    }

    fun getAllLocalUsers() = userDao.getAllUser()


    private suspend fun token(): String {
        return userDataSource.getTokenFirst()
    }

}