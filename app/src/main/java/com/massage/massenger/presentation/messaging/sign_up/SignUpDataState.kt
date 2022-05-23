package com.massage.massenger.presentation.messaging.sign_up

import com.massage.massenger.model.Country
import com.massage.massenger.presentation.messaging.sign_in.fullPhoneNumber

data class SignUpDataState(
    val country: Country? = null,
    val countryError: String? = null,

    val phone: String = "",
    val phoneError: String? = null,

    val name: String = "",
    val nameError: String? = null,

    val password: String = "",
    val passwordError: String? = null,

    val confirmPassword: String = "",
    val confirmPasswordError: String? = null,

    val rememberPassword: Boolean = false,
    val showPassword: Boolean = false,

    val isLoading: Boolean = false,
    val signUpSuccess: Boolean = false,
)

fun SignUpDataState.toSignUpData() =
    SignUpData(
        phone = phone.fullPhoneNumber(country),
        name = name,
        password = password
    )


fun SignUpDataState.validateSignUpData(): SignUpData? {
    return if (
        phoneError == null &&
        nameError == null &&
        passwordError == null &&
        confirmPasswordError == null &&
        isNotEmpty()
    ) {
        this.toSignUpData()
    } else null
}

fun SignUpDataState.isNotEmpty() =
    phone.isNotEmpty() &&
            name.isNotEmpty() &&
            password.isNotEmpty() &&
            confirmPassword.isNotEmpty() &&
            country != null
