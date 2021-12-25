package com.massage.massenger.domain.use_case

import androidx.datastore.dataStore
import com.massage.massenger.common.Resource
import com.massage.massenger.data.local.content.ContactDataSource
import com.massage.massenger.data.local.pref.DataStoreManager
import com.massage.massenger.data.local.room.ConnectionDao
import com.massage.massenger.data.remote.api_service.user.UserApiService
import com.massage.massenger.data.repository.MessageDBRepository
import com.massage.massenger.data.repository.UserDBRepository
import com.massage.massenger.data.repository.UserDataRepository
import com.massage.massenger.model.User
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.*
import java.nio.charset.Charset
import javax.inject.Inject


class GetConnectionUserUseCase @Inject constructor(
    private val userData: UserDataRepository,
    private val userDBRepository: UserDBRepository,
    private val userApi: UserApiService,
    private val contact: ContactDataSource
) {

    operator fun invoke(shouldFetch: Boolean = true): Flow<Resource<List<User>>> = flow {
        emitUsersFromDatabase()

        if (shouldFetch) {

            val phones = contact.fetchContact().phone
            val token = userData.getToken()
            val users = userApi.getUsersByPhones(phones, token)

            insertAllUsers(users)
            emit(Resource.Success(users))
        }
    }.catch { exception ->
        (exception as? ResponseException)?.let { e ->
            Resource.Error<List<User>>(e.response.readText(Charset.defaultCharset()))
        }
        (exception as? Exception)?.let { e ->
            Resource.Error<List<User>>(e.message ?: "Unknown Error Occurred")
        }
    }

    private suspend fun FlowCollector<Resource<List<User>>>.emitUsersFromDatabase() =
        emit(
            userDBRepository.getAllUser()
                .map {
                    if (it.isNullOrEmpty()) Resource.Loading()
                    else Resource.Success(it)
                }.first()
        )


    private suspend fun insertAllUsers(users: List<User>) {
        userDBRepository.insertUser(*users.toTypedArray())
    }
}
