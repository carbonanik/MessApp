package com.massage.massenger.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import com.massage.massenger.data.local.room.dao.*
import com.massage.massenger.model.*
import com.massage.massenger.util.ListTypeConverter

@TypeConverters(ListTypeConverter::class)
@Database(
    entities = [
        ChatMessage::class,
        Chat::class,
        User::class,
        Group::class,
        Post::class,
        DatabaseLog::class],
    version = 1,
    exportSchema = false
)
abstract class MessengerDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun messageDao(): MessageDao
    abstract fun chatDao(): ChatDao
    abstract fun groupDao(): GroupDao
    abstract fun postDao(): PostDao
    abstract fun databaseLogDao(): DatabaseLogDao

    companion object {
        const val USER_TABLE = "connection_table"
        const val MESSAGE_TABLE = "message_table"
        const val CHAT_TABLE = "chat_table"
        const val GROUP_TABLE = "group_table"
        const val POST_TABLE = "post_table"
        const val DATABASE_LOG_TABLE = "database_log_table"

        val DB_CALLBACK = object : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
//            db.execSQL("DROP TRIGGER IF EXISTS user_last_change")
                db.execSQL("CREATE TRIGGER IF NOT EXISTS user_last_change AFTER INSERT ON connection_table BEGIN INSERT INTO database_log_table (timestamp, table_name, operation) VALUES (DATETIME(), 'connection_table', 'insert'); END")
            }
        }
    }
}