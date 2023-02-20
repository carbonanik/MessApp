package com.massage.massenger.data.remote.api_service.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;", "", "login", "Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthResponse;", "authRequest", "Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthRequest;", "(Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAuth", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "app_debug"})
public abstract interface AuthApiService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest authRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest authRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object refreshAuth(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation);
}