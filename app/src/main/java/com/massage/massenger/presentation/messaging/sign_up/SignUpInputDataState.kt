package com.massage.massenger.presentation.messaging.sign_up

import com.massage.massenger.presentation.component.DialogMessage

data class SignUpInputDataState(
    val name: String = "",
    val nameError: String? = null,
    val phone: String = "",
    val phoneError: String? = null,
    val password: String = "",
    val passwordError: String? = null,

    val rememberPassword: Boolean = false,
    val showPassword: Boolean = false,

    val isLoading: Boolean = false,
    val signUpSuccess: Boolean = false,
    val dialogMessage: DialogMessage? = null,
)

fun SignUpInputDataState.toSignUpData() =
    SignUpData(
        name = name,
        phone = phone,
        password = password
    )


fun SignUpInputDataState.validateSignUpData(): SignUpData? {
    return if (phoneError == null && passwordError == null && isNotEmpty()) {
        this.toSignUpData()
    } else null
}

fun SignUpInputDataState.isNotEmpty() =
    phone.isNotEmpty() && password.isNotEmpty() && name.isNotEmpty()
