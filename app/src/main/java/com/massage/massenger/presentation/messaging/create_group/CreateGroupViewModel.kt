package com.massage.massenger.presentation.messaging.create_group

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.GroupRepository
import com.massage.massenger.data.repository_impl.UserRepository
import com.massage.massenger.model.Group
import com.massage.massenger.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CreateGroupViewModel @Inject constructor(
    private val userRepository: UserRepository,
    private val groupRepository: GroupRepository,
    private val authRepository: AuthRepository
) : ViewModel() {

    var createGroupResponse by mutableStateOf<DataState<Group>>(DataState())

    val selectedPersons =  mutableStateListOf<User>()

    fun getConnections() = userRepository.getAllLocalUsers()

    fun createGroup() {
        viewModelScope.launch {
            val me = authRepository.getLoggedInUser()
            val createGroupRequest = CreateGroupRequest(
                name = groupName(),
                admin = listOf(me?.id?:""),
                members = selectedPersons.map { it.id }
            )
            groupRepository.createGroup(createGroupRequest).collect {
                createGroupResponse = it.toDataState()
            }
        }
    }

    private fun groupName(): String {
        var name = ""
        for (it in selectedPersons) {
            if (name.length < 25){
                name += "${it.name},"
            } else {
                name = name.take(20) + "..."
                break
            }
        }
        return name
    }
}