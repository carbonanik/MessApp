package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.USER_TABLE
import kotlinx.serialization.Serializable


@Serializable
@Entity(tableName = USER_TABLE)
class User(
    @PrimaryKey
    val id: String,
    val name: String,
    val phone: String,
)
