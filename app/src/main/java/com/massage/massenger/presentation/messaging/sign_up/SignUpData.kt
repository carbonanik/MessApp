package com.massage.massenger.presentation.messaging.sign_up

import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest

data class SignUpData(
    val name: String,
    val phone: String,
    val password: String,
)

fun SignUpData.toAuthRequest(): AuthRequest {
    return AuthRequest(
        name = name,
        phone = phone,
        password = password
    )
}
