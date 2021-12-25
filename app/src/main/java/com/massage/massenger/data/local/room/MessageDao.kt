package com.massage.massenger.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.util.state.MessageStatus
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface MessageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMessage(message: ChatMessage)

    @Query("SELECT * FROM message_table WHERE chatId IS :chatId ORDER BY messageTime DESC")
    fun allWithChat(chatId: String?): Flow<List<ChatMessage>>

//    @Query("SELECT * FROM message_table WHERE group_id IS :groupId ORDER BY time DESC")
//    fun allWithGroup(groupId: String): Flow<List<TextMessage>>

    @Query("UPDATE message_table SET messageStatus = :newStatus WHERE id = :localId")
    suspend fun updateMessageStatus(localId: UUID, newStatus: MessageStatus?)

//    @Query("UPDATE RoomMessage SET status = :seen WHERE otherId IS :otherPersonId")
//    suspend fun seenAllInConversation(otherPersonId: String, seen: MessageStatus = MessageStatus.SEEN)

}