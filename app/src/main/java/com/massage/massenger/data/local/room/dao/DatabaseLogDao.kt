package com.massage.massenger.data.local.room.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.massage.massenger.model.DatabaseLog
import kotlinx.coroutines.flow.Flow

@Dao
interface DatabaseLogDao {

    @Insert
    suspend fun insertLog(log: DatabaseLog)

    @Query("SELECT * FROM database_log_table WHERE table_name IS :tableName AND operation IS :operation")
    suspend fun getLastTimeForTable(tableName: String, operation: String): List<DatabaseLog>

//    @Query("SELECT * FROM database_log_table WHERE MAX(timestamp)")
//    suspend fun getLast(): DatabaseLog

    @Query("DELETE FROM database_log_table WHERE timestamp < :timestamp")
    suspend fun deleteOlder(timestamp: Long)

    @Query("SELECT * FROM database_log_table WHERE timestamp=(SELECT max(timestamp) FROM database_log_table)")
    suspend fun getLastItem(): DatabaseLog

    @Query("SELECT * FROM database_log_table")
    fun getAllLog(): Flow<List<DatabaseLog>>
}