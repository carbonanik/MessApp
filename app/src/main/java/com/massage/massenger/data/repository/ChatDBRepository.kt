package com.massage.massenger.data.repository

import com.massage.massenger.data.local.room.ChatDao
import com.massage.massenger.model.Chat
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class ChatDBRepository @Inject constructor(
    private val chatDao: ChatDao
) {
    suspend fun insertChat(chat: Chat) = chatDao.insertChat(chat)

    fun getAllChat(): Flow<List<Chat>> = chatDao.getAllChat()

    suspend fun getChat(chatId: String?): Chat? = chatDao.getChat(chatId)

    suspend fun seenConversation(otherPersonId: String, seen: Boolean = true) =
        chatDao.seenConversation(otherPersonId, seen)
}