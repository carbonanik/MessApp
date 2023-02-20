package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ-\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0011\u0010 \u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/massage/massenger/data/repository_impl/AuthRepositoryImpl;", "Lcom/massage/massenger/data/repository/AuthRepository;", "authApiService", "Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "database", "Lcom/massage/massenger/data/local/room/MessengerDatabase;", "(Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;Lcom/massage/massenger/data/local/pref/UserDataSource;Lcom/massage/massenger/data/local/room/MessengerDatabase;)V", "deleteUserData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoggedInUser", "Lcom/massage/massenger/model/User;", "isLoggedIn", "", "login", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/common/NetworkState;", "Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthResponse;", "phone", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAuth", "saveFetchedAuthResult", "response", "(Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "signUpData", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpData;", "(Lcom/massage/massenger/presentation/messaging/sign_up/SignUpData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "app_debug"})
public final class AuthRepositoryImpl implements com.massage.massenger.data.repository.AuthRepository {
    private final com.massage.massenger.data.remote.api_service.auth.AuthApiService authApiService = null;
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final com.massage.massenger.data.local.room.MessengerDatabase database = null;
    
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.AuthApiService authApiService, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.massage.massenger.common.NetworkState<com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.sign_up.SignUpData signUpData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.massage.massenger.common.NetworkState<com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshAuth(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.massage.massenger.common.NetworkState<com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse>>> continuation) {
        return null;
    }
    
    private final java.lang.Object saveFetchedAuthResult(com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse response, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isLoggedIn(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLoggedInUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.User> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteUserData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object token(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}