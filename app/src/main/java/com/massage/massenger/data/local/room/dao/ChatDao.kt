package com.massage.massenger.data.local.room.dao

import androidx.room.*
import com.massage.massenger.model.Chat
import kotlinx.coroutines.flow.Flow

@Dao
interface ChatDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertChat(chat: Chat)

    @Query("SELECT * FROM chat_table")
    fun getAllChat(): Flow<List<Chat>>

    @Query("SELECT * FROM chat_table WHERE id is :chatId")
    suspend fun getChat(chatId: String?): Chat?

    @Query("UPDATE chat_table SET status = :seen WHERE id is :otherPersonId")
    suspend fun seenConversation(otherPersonId: String, seen: Boolean = true)

    @Delete
    suspend fun deleteChat(chat: Chat)

}