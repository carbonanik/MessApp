package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.Resource
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.dao.ChatDao
import com.massage.massenger.data.local.room.dao.GroupDao
import com.massage.massenger.data.remote.api_service.group.GroupApiService
import com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.model.Group
import com.massage.massenger.model.toNewChat
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GroupRepository @Inject constructor(
    private val userDataSource: UserDataSource,
    private val groupApiService: GroupApiService,
    private val chatDao: ChatDao,
    private val groupDao: GroupDao
) {

    fun createGroup(createGroupRequest: CreateGroupRequest): Flow<Resource<Group>> =
        boundFetchSave(
            fetch = { groupApiService.createGroup(createGroupRequest, token()) },
            save = {
                groupDao.insertGroup(it)
                chatDao.insertChat(it.toNewChat())
            }
        )

    fun addUserToGroup(addMemberToGroupRequest: AddMemberToGroupRequest): Flow<Resource<Group>> =
        boundFetchSave(fetch = { groupApiService.addMemberToGroup(addMemberToGroupRequest, token()) },
            save = { groupDao.insertGroup(it) })

    fun getAllGroupForUser(userId: String) =
        boundCacheFetchSave(
            query = { groupDao.getAllGroup().first() },
            fetch = { groupApiService.getAllGroupForUser(userId, token()) },
            saveFetched = { groupDao.insertGroup(*it.toTypedArray()) }
        )

    suspend fun getCachedGroupById(groupId: String?) = groupDao.getGroup(groupId)

    private suspend fun token() = userDataSource.getTokenFirst()
}