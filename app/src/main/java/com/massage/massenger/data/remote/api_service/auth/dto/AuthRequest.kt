package com.massage.massenger.data.remote.api_service.auth.dto

import kotlinx.serialization.Serializable

@Serializable
data class AuthRequest(
    val name: String? = null,
    val phone: String,
    val password: String
)