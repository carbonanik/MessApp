package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b0\n2\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b0\n2\u0006\u0010\u0018\u001a\u00020\u0012J\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u0016J\u0011\u0010\u001b\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/data/repository_impl/PostRepository;", "", "postApiService", "Lcom/massage/massenger/data/remote/api_service/post/PostApiService;", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "postDao", "Lcom/massage/massenger/data/local/room/dao/PostDao;", "(Lcom/massage/massenger/data/remote/api_service/post/PostApiService;Lcom/massage/massenger/data/local/pref/UserDataSource;Lcom/massage/massenger/data/local/room/dao/PostDao;)V", "createPost", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/common/NetworkState;", "Lcom/massage/massenger/model/Post;", "createPostRequest", "Lcom/massage/massenger/data/remote/api_service/post/dto/CreatePostRequest;", "getAllBetween", "", "oldTime", "", "newTime", "getAllPostOfUser", "userId", "", "getAllUntil", "time", "getPostById", "postId", "token", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class PostRepository {
    private final com.massage.massenger.data.remote.api_service.post.PostApiService postApiService = null;
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final com.massage.massenger.data.local.room.dao.PostDao postDao = null;
    
    @javax.inject.Inject()
    public PostRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.post.PostApiService postApiService, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.PostDao postDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Post>> createPost(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.post.dto.CreatePostRequest createPostRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Post>> getPostById(@org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<java.util.List<com.massage.massenger.model.Post>>> getAllPostOfUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<java.util.List<com.massage.massenger.model.Post>>> getAllUntil(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<java.util.List<com.massage.massenger.model.Post>>> getAllBetween(long oldTime, long newTime) {
        return null;
    }
    
    private final java.lang.Object token(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}