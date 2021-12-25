package com.massage.massenger.presentation.auth.sign_up

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.domain.use_case.AuthenticateUseCase
import com.massage.massenger.presentation.messaging.create_group.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val authenticateUseCase: AuthenticateUseCase
): ViewModel() {

    var name by mutableStateOf("")
    var phone by mutableStateOf("")
    var password by mutableStateOf("")

    var dataState by mutableStateOf(DataState<AuthResponse>())

    fun signUp(){
        viewModelScope.launch {
            authenticateUseCase(name, "+880$phone", password)
        }
    }
}