package com.massage.massenger.presentation.messaging.log_in

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.AuthRepositoryImpl
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
class LogInViewModel @Inject constructor(
    private val authRepository: AuthRepository
) : ViewModel() {

    var dataState by mutableStateOf(DataState<AuthResponse>())
    var loggedIn by mutableStateOf(false)

    var phone by mutableStateOf("")
    var password by mutableStateOf("")

    var phoneError by mutableStateOf(false)
    var passwordError by mutableStateOf(false)

    var submitButtonText by mutableStateOf("Submit")
    var errorText: String? by mutableStateOf(null)

    fun login() {
        viewModelScope.launch {
            authRepository.login("+880$phone", password).collect {
                dataState = it.toDataState()
                doWithResponse()
            }
        }
    }

    fun loginFormValidate(onComplete: (valid: Boolean) -> Unit) {
        phoneError = !phone.validPhone()
        passwordError = !password.validPassword()

        if (!(phoneError || passwordError)) onComplete(true)
        else onComplete(false)
    }

    fun doWithResponse() {

        if (dataState.isLoading) {
            submitButtonText = "Loading..."
            errorText = null
        }

        dataState.data?.let {
            submitButtonText = "Successful"
            viewModelScope.launch {
                delay(300)
                loggedIn = true
            }
        }

        dataState.error?.let {
            submitButtonText = "Submit"
            errorText = "Error: ${dataState.error}"
        }
    }
}