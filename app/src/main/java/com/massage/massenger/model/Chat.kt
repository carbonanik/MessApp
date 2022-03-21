package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.CHAT_TABLE
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.state.MessageStatus
import kotlinx.serialization.Serializable


@Serializable
@Entity(tableName = CHAT_TABLE)
data class Chat(
    @PrimaryKey
    var id: String = "",
    var name: String = "",
    var type: ChatType = ChatType.SINGLE,
    var message: String = "",
    var time: Long = 0,
    var status: MessageStatus = MessageStatus.RECEIVED
)
