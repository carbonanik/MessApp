package com.massage.massenger.data.repository

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.massage.massenger.data.local.room.MessageDao
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.util.state.MessageStatus
import kotlinx.coroutines.flow.Flow
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class MessageDBRepository @Inject constructor(
    private val messageDao: MessageDao
) {
    suspend fun insertMessage(message: ChatMessage) =
        messageDao.insertMessage(message)

    fun allWithChat(chatId: String?): Flow<List<ChatMessage>> {
        println("all with chat")
        println(chatId)
        return messageDao.allWithChat(chatId)
    }

//    fun allWithGroup(groupId: String): Flow<List<TextMessage>>

    suspend fun updateMessageStatus(localId: UUID, newStatus: MessageStatus?) =
        messageDao.updateMessageStatus(localId, newStatus)

//    suspend fun seenAllInConversation(otherPersonId: String, seen: MessageStatus = MessageStatus.SEEN)


}