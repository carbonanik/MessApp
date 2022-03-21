package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.GROUP_TABLE
import com.massage.massenger.model.enumstate.ChatType
import kotlinx.serialization.Serializable

@Entity(tableName = GROUP_TABLE)
@Serializable
data class Group(
    @PrimaryKey
    val id: String,
    val name: String,
    val admin: List<String>,
    val members: List<String>
)

fun Group.toNewChat(): Chat {
    return Chat(
        id = id,
        name = name,
        type = ChatType.GROUP,
        time = System.currentTimeMillis()
    )
}