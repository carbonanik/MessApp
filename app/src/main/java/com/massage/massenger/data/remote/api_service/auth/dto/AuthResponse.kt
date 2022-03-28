package com.massage.massenger.data.remote.api_service.auth.dto

import com.massage.massenger.model.User
import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    val authToken: String,
    val id: String,
    val name: String,
    val phone: String
)

fun AuthResponse.userFromAuth() = User(id, name, phone)