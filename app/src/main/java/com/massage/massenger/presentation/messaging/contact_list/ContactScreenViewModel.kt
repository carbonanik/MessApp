package com.massage.massenger.presentation.messaging.contact_list

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.NetworkState
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactScreenViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val authRepository: AuthRepository,

) : ViewModel() {
    var dataState by mutableStateOf(ContactScreenDataState())

    var navigateBackToLoginScreen by mutableStateOf(false)

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            dataState = dataState.copy(isLoading = true)
            userRepository.getUsersByPhonesAndSave().collect { response ->
                when (response) {
                    is NetworkState.Loading -> {
                        dataState = dataState.copy(
                            isLoading = true,
                            contacts = response.data ?: emptyList()
                        )
                    }
                    is NetworkState.Success -> {
                        dataState = dataState.copy(
                            contacts = response.data ?: emptyList(),
                            isLoading = false
                        )
                    }
                    is NetworkState.Error -> {
                        dataState = dataState.copy(
                            errorMessage = response.errorMessage,
                            isLoading = false
                        )
                        if (response.authenticationNeeded) {
                            logout()
                        }
                    }
                }
            }
        }
    }

    fun updatePermissionText(text: String?) {
        dataState = dataState.copy(permissionText = text)
    }

    private fun logout() {
        viewModelScope.launch(Dispatchers.IO) {
            authRepository.deleteUserData()
            navigateBackToLoginScreen = true
            // navigate to login screen
        }
    }
}