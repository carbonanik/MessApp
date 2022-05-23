package com.massage.massenger.presentation.messaging.on_boarding

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.local.pref.AppStartingState
import com.massage.massenger.data.repository.AppStartingStateDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class OnBoardingViewModel @Inject constructor(
    private val appStartingStateDataRepository: AppStartingStateDataRepository
): ViewModel() {

    fun saveOnBoardingState(state: AppStartingState) {
        viewModelScope.launch {
            appStartingStateDataRepository.saveAppState(state)
        }
    }
}