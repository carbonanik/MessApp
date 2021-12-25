package com.massage.massenger.data.remote.api_service.group.dto

import kotlinx.serialization.Serializable

@Serializable
data class AddMemberToGroupRequest(
    val groupId: String,
    val userIds: List<String>,
    val asAdmin: Boolean
)
