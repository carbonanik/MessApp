package com.massage.massenger.data.local.room.dao

import androidx.room.*
import com.massage.massenger.model.User
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(vararg user: User)

    @Query("SELECT * FROM connection_table WHERE id is :id")
    suspend fun getUser(id: String?): User?

    @Update
    suspend fun updateUser(user: User)

    @Delete
    suspend fun deleteUser(user: User)

    @Query("SELECT * FROM connection_table ORDER BY name")
    fun getAllUser(): Flow<List<User>>

    @Query("SELECT EXISTS(SELECT * FROM connection_table WHERE id = :id)")
    fun isUserExists(id : String) : Boolean
}