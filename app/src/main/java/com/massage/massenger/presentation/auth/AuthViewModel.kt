package com.massage.massenger.presentation.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest
import com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse
import com.massage.massenger.domain.use_case.AuthenticateUseCase
import com.massage.massenger.presentation.messaging.create_group.DataState
import com.massage.massenger.presentation.messaging.create_group.toDataState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val authenticate: AuthenticateUseCase
) : ViewModel() {

    suspend fun isLoggedIn() = authenticate.isLoggedIn()

}

