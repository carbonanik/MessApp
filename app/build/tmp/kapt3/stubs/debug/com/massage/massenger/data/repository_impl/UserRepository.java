package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00140\fJ\u0011\u0010\u0015\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/massage/massenger/data/repository_impl/UserRepository;", "", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "userDao", "Lcom/massage/massenger/data/local/room/dao/UserDao;", "userApiService", "Lcom/massage/massenger/data/remote/api_service/user/UserApiService;", "contactDataSource", "Lcom/massage/massenger/data/local/content/ContactDataSource;", "(Lcom/massage/massenger/data/local/pref/UserDataSource;Lcom/massage/massenger/data/local/room/dao/UserDao;Lcom/massage/massenger/data/remote/api_service/user/UserApiService;Lcom/massage/massenger/data/local/content/ContactDataSource;)V", "getAllLocalUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/massage/massenger/model/User;", "getUserByIdLocal", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersByPhonesAndSave", "Lcom/massage/massenger/common/NetworkState;", "token", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class UserRepository {
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final com.massage.massenger.data.local.room.dao.UserDao userDao = null;
    private final com.massage.massenger.data.remote.api_service.user.UserApiService userApiService = null;
    private final com.massage.massenger.data.local.content.ContactDataSource contactDataSource = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.user.UserApiService userApiService, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.content.ContactDataSource contactDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<java.util.List<com.massage.massenger.model.User>>> getUsersByPhonesAndSave() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserByIdLocal(@org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.User> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.User>> getAllLocalUsers() {
        return null;
    }
    
    private final java.lang.Object token(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}