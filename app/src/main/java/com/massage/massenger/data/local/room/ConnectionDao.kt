package com.massage.massenger.data.local.room

import androidx.room.*
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface ConnectionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(vararg user: User)

    @Query("SELECT * FROM connection_table WHERE id is :id")
    suspend fun getUser(id: String?): User?

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT * FROM connection_table")
    fun getAllUser(): Flow<List<User>?>
}