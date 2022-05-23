package com.massage.massenger.data.repository_impl

import com.massage.massenger.data.local.content.ContactDataSource
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.dao.UserDao
import com.massage.massenger.data.remote.api_service.user.UserApiService
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDataSource: UserDataSource,
    private val userDao: UserDao,
    private val userApiService: UserApiService,
    private val contactDataSource: ContactDataSource
) {

    fun getUsersByPhonesAndSave() = boundCacheFetchSave(
        query = { userDao.getAllUser().first() },
        fetch = {
            val numbers = contactDataSource.fetchContact()
            userApiService.getUsersByPhones(numbers, token())
        },
        saveFetched = {
            userDataSource.saveContactFetchTime(System.currentTimeMillis())
            userDao.insertUser(*it.toTypedArray())
        },
        shouldFetch = {
            (userDataSource.getContactFetchTime() < (System.currentTimeMillis() - 5 * 60 * 1000))
        }
    )

    suspend fun getUserByIdLocal(id: String?): User? {
        return userDao.getUser(id)
    }

    fun getAllLocalUsers() = userDao.getAllUser()


    private suspend fun token(): String {
        return userDataSource.getToken()
    }

}