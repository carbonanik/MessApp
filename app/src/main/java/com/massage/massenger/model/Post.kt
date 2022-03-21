package com.massage.massenger.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.POST_TABLE
import kotlinx.serialization.Serializable

@Entity(tableName = POST_TABLE)
@Serializable
data class Post(
    @PrimaryKey
    val id: String,
    val authorId: String,
    val title: String,
    val body: String,
    val time: Long,
    val privacy: String,
    val contentUrl: String,
    val contentType: String,
)
