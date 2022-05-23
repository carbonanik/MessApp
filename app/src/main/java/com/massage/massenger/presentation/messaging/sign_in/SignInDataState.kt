package com.massage.massenger.presentation.messaging.sign_in

import com.massage.massenger.model.Country

data class SignInDataState(
    val country: Country? = null,
    val countryError: String? = null,

    val phone: String = "",
    val phoneError: String? = null,

    val password: String = "",
    val passwordError: String? = null,

    val rememberPassword: Boolean = false,
    val showPassword: Boolean = false,

    val isLoading: Boolean = false,
    val signInSuccess: Boolean = false,
)

fun SignInDataState.toSignInData() =
    SignInData(
        phone = phone.fullPhoneNumber(country),
        password = password
    )

fun String.fullPhoneNumber(country: Country?) = "+${country?.code ?: ""}$this"

fun SignInDataState.validateSignInData(): SignInData? {
    return if (
        phoneError == null &&
        passwordError == null &&
        isNotEmpty()
    ) {
        this.toSignInData()
    } else null
}

fun SignInDataState.isNotEmpty() =
    phone.isNotEmpty() &&
            password.isNotEmpty() &&
            country != null
