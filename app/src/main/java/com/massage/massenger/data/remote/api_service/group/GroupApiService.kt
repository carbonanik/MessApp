package com.massage.massenger.data.remote.api_service.group

import com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.model.Group

interface GroupApiService {

    suspend fun createGroup(createGroupRequest: CreateGroupRequest, token: String): Group
    suspend fun addMemberToGroup(addMemberToGroupRequest: AddMemberToGroupRequest, token: String): Group
    suspend fun getAllGroupForUser(userId: String, token: String): List<Group>
}