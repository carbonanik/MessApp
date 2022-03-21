package com.massage.massenger.presentation.messaging.sign_up

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.presentation.customComposeView.valid
import com.massage.massenger.presentation.customComposeView.validPassword
import com.massage.massenger.presentation.customComposeView.validPhone
import com.massage.massenger.presentation.messaging.create_group.DataState
import com.massage.massenger.presentation.messaging.create_group.toDataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    var dataState by mutableStateOf(DataState<AuthResponse>())
    var signedUp by mutableStateOf(false)

    var name by mutableStateOf("")
    var phone by mutableStateOf("")
    var password by mutableStateOf("")

    var nameError by mutableStateOf(false)
    var phoneError by mutableStateOf(false)
    var passwordError by mutableStateOf(false)

    var submitButtonText by mutableStateOf("Submit")
    var errorText: String? by mutableStateOf(null)


    private fun doWithResponse() {
        if (dataState.isLoading) {
            submitButtonText = "Loading..."
            errorText = null
        }

        dataState.data?.let {
            submitButtonText = "Successful"
            errorText = null
            viewModelScope.launch {
                delay(300)
                signedUp = true
            }
        }

        dataState.error?.let {
            submitButtonText = "Submit"
            errorText = "Error: ${dataState.error}"
        }

    }


    fun signUp() {
        viewModelScope.launch {
            authRepository.signUp(name, "+880$phone", password).collect {
                dataState = it.toDataState()
                doWithResponse()
            }
        }
    }

    fun signUpFormValidate(onComplete: (valid: Boolean) -> Unit) {
        nameError = !name.valid()
        phoneError = !phone.validPhone()
        passwordError = !password.validPassword()

        if (!(nameError || phoneError || passwordError))
            onComplete(true)
        else onComplete(false)
    }
}
