package com.massage.massenger.data.repository_impl

import com.massage.massenger.common.Resource
import com.massage.massenger.data.local.pref.UserDataSource
import com.massage.massenger.data.local.room.dao.PostDao
import com.massage.massenger.data.remote.api_service.post.PostApiService
import com.massage.massenger.data.remote.api_service.post.dto.CreatePostRequest
import com.massage.massenger.model.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PostRepository @Inject constructor(
    private val postApiService: PostApiService,
    private val userDataSource: UserDataSource,
    private val postDao: PostDao
) {
    fun createPost(createPostRequest: CreatePostRequest): Flow<Resource<Post>> =
        boundFetchSave(fetch = { postApiService.create(createPostRequest, token()) },
            save = { postDao.insertPost(it) })

    fun getPostById(postId: String) =
        boundCacheFetchSave(query = { postDao.getPost(postId) },
            fetch = { postApiService.getById(postId, token()) },
            saveFetched = { postDao.insertPost(it) })

    fun getAllPostOfUser(userId: String) =
        boundCacheFetchSave(query = { postDao.getAllPostOf(userId) },
            fetch = { postApiService.getOfUser(userId, token()) },
            saveFetched = { postDao.insertPost(*it.toTypedArray()) })

    fun getAllUntil(time: Long): Flow<Resource<List<Post>>> =
        boundFetch { postApiService.getAllUntil(time, token()) }


    fun getAllBetween(oldTime: Long, newTime: Long) =
        boundFetch { postApiService.getAllBetween(oldTime, newTime, token()) }


    private suspend fun token() = userDataSource.getTokenFirst()
}