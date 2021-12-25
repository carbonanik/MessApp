package com.massage.massenger.data.repository

import com.massage.massenger.common.Resource
import com.massage.massenger.data.remote.api_service.post.PostApiService
import com.massage.massenger.data.remote.api_service.post.dto.CreatePostRequest
import com.massage.massenger.model.Post
import io.ktor.client.features.*
import io.ktor.client.statement.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PostApiRepository @Inject constructor(
    private val postApiService: PostApiService,
    private val userDataRepository: UserDataRepository
) {
    fun createPost(createPostRequest: CreatePostRequest): Flow<Resource<Post>> = flow {
        emit(Resource.Loading())
        val response = try {
            val token = userDataRepository.getToken()
            val post = postApiService.create(createPostRequest, token)
            Resource.Success(post)
        } catch (e: ResponseException){
            val errorText = e.response.readText()
            Resource.Error(errorText)
        }
        emit(response)
    }

    fun getPostById(postId: String): Flow<Resource<Post>> = flow {
        emit(Resource.Loading())
        val response = try {
            val token = userDataRepository.getToken()
            val post = postApiService.getById(postId, token)
            Resource.Success(post)
        } catch (e: ResponseException){
            val errorText = e.response.readText()
            Resource.Error(errorText)
        }
        emit(response)
    }

    fun getAllPostOfUser(userId: String): Flow<Resource<List<Post>>> = flow {
        emit(Resource.Loading())
        val response = try {
            val token = userDataRepository.getToken()
            val posts = postApiService.getOfUser(userId, token)
            Resource.Success(posts)
        } catch (e: ResponseException){
            val errorText = e.response.readText()
            Resource.Error(errorText)
        }
        emit(response)
    }

    fun getAllUntil(time: Long): Flow<Resource<List<Post>>> = flow {
        emit(Resource.Loading())
        val response = try {
            val token = userDataRepository.getToken()
            val posts = postApiService.getAllUntil(time, token)
            Resource.Success(posts)
        } catch (e: ResponseException){
            val errorText = e.response.readText()
            Resource.Error(errorText)
        }
        emit(response)
    }

    fun getAllBetween(oldTime: Long, newTime: Long): Flow<Resource<List<Post>>> = flow {
        emit(Resource.Loading())
        val response = try {
            val token = userDataRepository.getToken()
            val posts = postApiService.getAllBetween(oldTime, newTime, token)
            Resource.Success(posts)
        } catch (e: ResponseException){
            val errorText = e.response.readText()
            Resource.Error(errorText)
        }
        emit(response)
    }
}