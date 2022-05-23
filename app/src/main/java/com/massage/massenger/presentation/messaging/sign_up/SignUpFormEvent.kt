package com.massage.massenger.presentation.messaging.sign_up

import com.massage.massenger.model.Country

sealed class SignUpFormEvent {
    class CountrySelected(val country: Country): SignUpFormEvent()
    class PhoneChanged(val phone: String) : SignUpFormEvent()
    class NameChanged(val name: String) : SignUpFormEvent()
    class PasswordChanged(val password: String) : SignUpFormEvent()
    class ConfirmPasswordChanged(val confirmPassword: String) : SignUpFormEvent()
    object SignInClick : SignUpFormEvent()
}
