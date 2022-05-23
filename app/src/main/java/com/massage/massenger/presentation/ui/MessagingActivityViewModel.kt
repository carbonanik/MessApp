package com.massage.massenger.presentation.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.data.repository.AppStartingStateDataRepository
import com.massage.massenger.presentation.navigation.AuthNavigation
import com.massage.massenger.presentation.navigation.OnBoardingScreen
import com.massage.massenger.presentation.navigation.TabNavigation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MessagingActivityViewModel @Inject constructor(
    private val appStartingStateDataRepository: AppStartingStateDataRepository
) : ViewModel() {
    var isLoading = true
    var startDestination by mutableStateOf(OnBoardingScreen())

    init {
        getAppStartingState()
    }

    private fun getAppStartingState() {
        viewModelScope.launch {
            appStartingStateDataRepository.getAppState().collectLatest { state ->
                startDestination = when (state) {
                    AppStartingState.FIRST_TIME -> {
                        OnBoardingScreen()
                    }
                    AppStartingState.ON_BOARDING_COMPLETED -> {
                        AuthNavigation()
                    }
                    AppStartingState.LOGGED_IN -> {
                        TabNavigation()
                    }
                }
                isLoading = false
            }
        }
    }
}