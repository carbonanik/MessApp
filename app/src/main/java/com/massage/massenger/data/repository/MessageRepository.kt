package com.massage.massenger.data.repository

import com.massage.massenger.data.remote.socket.events.SocketEvent
import com.massage.massenger.model.ChatMessage
import kotlinx.coroutines.flow.Flow

interface MessageRepository {
    fun sendMessage(message: SocketEvent)
    fun getAllMessageWithChat(chatId: String): Flow<List<ChatMessage>>
}