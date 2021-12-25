package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.util.state.MessageStatus


@Entity(tableName = "message_table")
data class ChatMessage(
    @PrimaryKey
    val id: String,
    val chatId: String,
    val authorId: String,
    val authorName: String,
    val text: String? = null,
    val image: String? = null,
    val messageTime: Long,
    val messageStatus: MessageStatus
)
