package com.massage.massenger.data.local.room.dao

import androidx.room.*
import com.massage.massenger.model.Group
import kotlinx.coroutines.flow.Flow

@Dao
interface GroupDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGroup(vararg group: Group)

    @Query("SELECT * FROM group_table WHERE id IS :id")
    suspend fun getGroup(id: String?): Group?

    @Query("SELECT * FROM group_table")
    fun getAllGroup(): Flow<List<Group>>

    @Delete
    suspend fun deleteGroup(group: Group)
}