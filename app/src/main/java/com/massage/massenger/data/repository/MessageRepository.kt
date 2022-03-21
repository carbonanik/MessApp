package com.massage.massenger.data.repository

import com.massage.massenger.data.remote.socket.dto.SocketMessage
import com.massage.massenger.model.ChatMessage
import kotlinx.coroutines.flow.Flow

interface MessageRepository {
    fun sendMessage(message: SocketMessage)
    fun getAllMessageWithChat(chatId: String): Flow<List<ChatMessage>>
}