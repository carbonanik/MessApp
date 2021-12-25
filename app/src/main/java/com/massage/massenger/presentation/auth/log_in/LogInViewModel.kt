package com.massage.massenger.presentation.auth.log_in

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.domain.use_case.AuthenticateUseCase
import com.massage.massenger.presentation.messaging.create_group.DataState
import com.massage.massenger.presentation.messaging.create_group.toDataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class LogInViewModel @Inject constructor(
    private val authenticateUseCase: AuthenticateUseCase
): ViewModel() {

    var phone by mutableStateOf("")
    var password by mutableStateOf("")

    var dataState by mutableStateOf(DataState<AuthResponse>())

    fun login() {
        viewModelScope.launch {
            authenticateUseCase("+880$phone", password).collect {
                dataState = it.toDataState()
            }
        }
    }
}