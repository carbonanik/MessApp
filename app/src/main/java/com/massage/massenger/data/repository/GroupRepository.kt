package com.massage.massenger.data.repository

import com.massage.massenger.common.Resource
import com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.model.Group
import kotlinx.coroutines.flow.Flow

interface GroupRepository {
    fun createGroup(createGroupRequest: CreateGroupRequest): kotlinx.coroutines.flow.Flow<Resource<Group>>
    fun addUserToGroup(addMemberToGroupRequest: AddMemberToGroupRequest): Flow<Resource<Group>>
    fun getAllGroupFor(): Flow<Resource<Group>>
    suspend fun getGroupByIdLocal(): Group
}