package com.massage.massenger.data.remote.api_service.group.dto

import kotlinx.serialization.Serializable

@Serializable
data class CreateGroupRequest(
    val name: String,
    val admin: List<String>,
    val members: List<String>
)