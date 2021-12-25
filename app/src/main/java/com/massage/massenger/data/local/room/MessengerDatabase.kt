package com.massage.massenger.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.util.ListTypeConverter
import com.massage.massenger.util.UUIDTypeConverter

@TypeConverters(UUIDTypeConverter::class, ListTypeConverter::class)
@Database(entities = [ChatMessage::class, Chat::class, User::class], version = 1, exportSchema = false)
abstract class MessengerDatabase : RoomDatabase() {

    abstract fun messageDao(): MessageDao
    abstract fun chatDao(): ChatDao
    abstract fun connectionDao(): ConnectionDao
}