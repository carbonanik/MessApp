package com.massage.massenger.data.local.room.dao

import androidx.room.*
import com.massage.massenger.model.Post
import kotlinx.coroutines.flow.Flow

@Dao
interface PostDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPost(vararg group: Post)

    @Query("SELECT * FROM post_table WHERE id IS :id")
    suspend fun getPost(id: String): Post?

    @Query("SELECT * FROM post_table")
    fun getAllPost(): Flow<List<Post>>

    @Query("SELECT * FROM post_table WHERE authorId IS :userId")
    suspend fun getAllPostOf(userId: String): List<Post>

//    @Delete
//    suspend fun deletePost(id: String)
}