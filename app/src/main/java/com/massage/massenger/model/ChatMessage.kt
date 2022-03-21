package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.MESSAGE_TABLE
import com.massage.massenger.util.state.AttachedMedia
import com.massage.massenger.util.state.MessageStatus


@Entity(tableName = MESSAGE_TABLE)
data class ChatMessage(
    @PrimaryKey
    val id: String,
    val chatId: String,
    val authorId: String,
    val authorName: String,
    val text: String? = null,

    val mediaUrl: String? = null,
    val cacheMediaUri: String? = null,
    val mediaType: AttachedMedia? = null,

    val timestamp: Long,
    val date: String?,
    val time: String?,

    val status: MessageStatus
)
