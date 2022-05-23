package com.massage.massenger.presentation.messaging.sign_in

import com.massage.massenger.model.Country

sealed class SignInFormEvent {
    class PhoneChanged(val phone: String) : SignInFormEvent()
    class PasswordChanged(val password: String) : SignInFormEvent()
    class CountrySelected(val country: Country): SignInFormEvent()
    object SignInClick : SignInFormEvent()
}
