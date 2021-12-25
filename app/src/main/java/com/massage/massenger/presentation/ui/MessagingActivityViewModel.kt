package com.massage.massenger.presentation.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.repository.ChatDBRepository
import com.massage.massenger.domain.use_case.AuthenticateUseCase
import com.massage.massenger.domain.use_case.DataClearUseCase
import com.massage.massenger.domain.use_case.GetConnectionUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MessagingActivityViewModel @Inject constructor(
    private val chatDBRepository: ChatDBRepository,
    private val authenticateUseCase: AuthenticateUseCase,
    private val dataClearUseCase: DataClearUseCase,
    getConnectionUserUseCase: GetConnectionUserUseCase
) : ViewModel() {

    val goBackToAuthActivity = MutableLiveData(false)

    init {
        refreshAuth()
    }

    fun logout() {
        viewModelScope.launch(Dispatchers.IO) {
            dataClearUseCase()
            goBackToAuthActivity.postValue(true)
        }
    }

    private fun refreshAuth() {
        viewModelScope.launch {
//            val response = authenticateUseCase()
//            if (response.error?.status == HttpStatusCode.Unauthorized) { //todo
//                withContext(Dispatchers.IO) {
//                    dataRepository.clearData()
//                    goBackToAuthActivity.postValue(true)
//                }
//            }

        }
    }

    val connections = getConnectionUserUseCase()
    val allChat = chatDBRepository.getAllChat()
}