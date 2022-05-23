package com.massage.massenger.presentation.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.NetworkState
import com.massage.massenger.data.local.room.dao.ChatDao
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TabScreensViewModel @Inject constructor(
    private val chatDao: ChatDao,
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    val allChat = chatDao.getAllChat()

    val connections = userRepository.getAllLocalUsers()
    val isLoading = MutableStateFlow(false)
    val errorMessage = MutableStateFlow<String?>(null)

    var navigateBackToLoginScreen by mutableStateOf(false)

    fun loadContactScreenData() {
        viewModelScope.launch {
            userRepository.getUsersByPhonesAndSave().collect { res ->
                println(res)
                isLoading.value = res is NetworkState.Loading
                if (res.errorMessage != null) {
                    errorMessage.value = res.errorMessage
                }
                if (res is NetworkState.Error && res.authenticationNeeded){
                    logout()
                }
            }
        }
    }

    fun logout() {
        viewModelScope.launch(Dispatchers.IO) {
            authRepository.deleteUserData()
            navigateBackToLoginScreen = true
            // navigate to login screen
        }
    }
}