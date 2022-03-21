package com.massage.massenger.data.repository_impl

import com.massage.massenger.data.local.room.dao.ChatDao
import com.massage.massenger.model.Chat
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChatRepositoryImpl @Inject constructor(private val chatDao: ChatDao){

    suspend fun insertChat(chat: Chat) {
        chatDao.insertChat(chat)
    }

     fun getAllChat(): Flow<List<Chat>> {
         return chatDao.getAllChat()
    }

    suspend fun getChat(chatId: String?): Chat? {
        return chatDao.getChat(chatId)
    }

     suspend fun seenConversation(otherPersonId: String, seen: Boolean) {
        return chatDao.seenConversation(otherPersonId, seen)
    }

}