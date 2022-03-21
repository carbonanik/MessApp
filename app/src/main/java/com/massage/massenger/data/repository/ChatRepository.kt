package com.massage.massenger.data.repository

import com.massage.massenger.model.Chat
import kotlinx.coroutines.flow.Flow

interface ChatRepository {
    suspend fun insertChat(chat: Chat)
    fun getAllChat(): Flow<List<Chat>>
    suspend fun getChat(id: String): Chat?
    suspend fun seenChat(id: String, seen: Boolean)
}