package com.massage.massenger.data.repository

import com.massage.massenger.common.Resource
import com.massage.massenger.data.remote.api_service.group.GroupApiService
import com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.model.Chat
import com.massage.massenger.model.Group
import com.massage.massenger.model.enumstate.ChatType
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.nio.charset.Charset
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GroupApiRepository @Inject constructor(
    private val userDataRepository: UserDataRepository,
    private val groupApiService: GroupApiService,
    private val chatDBRepository: ChatDBRepository
) {

    fun createGroup(createGroupRequest: CreateGroupRequest): Flow<Resource<Group>> = flow {
        emit(Resource.Loading())
        val token = userDataRepository.getToken()

        val response = try {
            val group = groupApiService.createGroup(createGroupRequest, token)
            
            // create chat for this group
            val chat = Chat(
                id = group.id,
                name = group.name,
                type = ChatType.GROUP,
                time = System.currentTimeMillis()
            )
            chatDBRepository.insertChat(chat)
            Resource.Success(group)
        } catch (e: ResponseException) {
            val responseError = e.response.readText(Charset.defaultCharset())
            Resource.Error(responseError)
        }
        emit(response)
    }

    fun addUserToGroup(addMemberToGroupRequest: AddMemberToGroupRequest): Flow<Resource<Group>> =
        flow {
            val token = userDataRepository.getToken()

            val response = try {
                val response = groupApiService.addMemberToGroup(addMemberToGroupRequest, token)
                Resource.Success(response)

            } catch (e: ResponseException) {
                val responseError = e.response.readText(Charset.defaultCharset())
                Resource.Error(responseError)
            }
            emit(response)
        }

    fun getAllGroupForUser(userId: String): Flow<Resource<List<Group>>> = flow {
        emit(Resource.Loading())
        val token = userDataRepository.getToken()
        val response = try {
            val response = groupApiService.getAllGroupForUser(userId, token)
            Resource.Success(response)
        } catch (e: ResponseException) {
            val responseError = e.response.readText(Charset.defaultCharset())
            Resource.Error(responseError)
        }
        emit(response)
    }
}