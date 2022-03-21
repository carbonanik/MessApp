package com.massage.massenger.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.massage.massenger.data.local.room.MessengerDatabase.Companion.DATABASE_LOG_TABLE


@Entity(tableName = DATABASE_LOG_TABLE)
data class DatabaseLog(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Int,
    @ColumnInfo(name = "timestamp")
    val timestamp: Long,
    @ColumnInfo(name = "table_name")
    val tableName: String,
    @ColumnInfo(name = "operation")
    val operation: String
)

enum class Operation{
    INSERT,
    UPDATE,
    DELETE
}
