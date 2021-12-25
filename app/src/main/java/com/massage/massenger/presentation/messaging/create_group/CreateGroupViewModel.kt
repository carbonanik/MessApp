package com.massage.massenger.presentation.messaging.create_group

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.common.Resource
import com.massage.massenger.data.repository.AuthApiRepository
import com.massage.massenger.data.repository.GroupApiRepository
import com.massage.massenger.data.repository.UserDataRepository
import com.massage.massenger.domain.use_case.GetConnectionUserUseCase
import com.massage.massenger.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateGroupViewModel @Inject constructor(
    private val getConnectionUserUseCase: GetConnectionUserUseCase,
    private val groupApiRepository: GroupApiRepository,
    private val userDataRepository: UserDataRepository
) : ViewModel() {

    var connectionDataState by mutableStateOf<DataState<List<User>>>(DataState())
        private set

    val selectedPersons = mutableStateListOf<User>()


    init {
        getConnections()
    }

    private fun getConnections() {
        viewModelScope.launch {
            getConnectionUserUseCase().collect { resource ->
                connectionDataState = resource.toDataState()
            }
        }
    }

    fun createGroup() {
        viewModelScope.launch {
            userDataRepository.getToken()
            userDataRepository.getUser()
            groupApiRepository.createGroup()
        }
    }
}