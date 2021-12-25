package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.util.state.MessageStatus

@Entity(tableName = "chat_table")
data class Chat(
    @PrimaryKey
    var id: String = "",
    var name: String = "",
    var type: ChatType = ChatType.SINGLE,
    var message: String = "",
    var time: Long = 0,
    var status: MessageStatus = MessageStatus.RECEIVED
)
