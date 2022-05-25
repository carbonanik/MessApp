package com.massage.massenger.presentation.ui

import androidx.lifecycle.ViewModel
import com.massage.massenger.data.local.room.dao.ChatDao
import com.massage.massenger.data.repository.AuthRepository
import com.massage.massenger.data.repository_impl.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class TabScreensViewModel @Inject constructor(
    private val chatDao: ChatDao,
    private val authRepository: AuthRepository,
    private val userRepository: UserRepository
) : ViewModel() {

    val chats = chatDao.getAllChat()

    val isLoading = MutableStateFlow(false)
}