package com.massage.massenger.data.remote.api_service.auth;

import java.lang.System;

/**
 * 18-10-21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/auth/AuthApiServiceImpl;", "Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;", "client", "Lio/ktor/client/HttpClient;", "(Lio/ktor/client/HttpClient;)V", "login", "Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthResponse;", "authRequest", "Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthRequest;", "(Lcom/massage/massenger/data/remote/api_service/auth/dto/AuthRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshAuth", "token", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "app_debug"})
public final class AuthApiServiceImpl implements com.massage.massenger.data.remote.api_service.auth.AuthApiService {
    private final io.ktor.client.HttpClient client = null;
    
    public AuthApiServiceImpl(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest authRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.dto.AuthRequest authRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object refreshAuth(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.data.remote.api_service.auth.dto.AuthResponse> continuation) {
        return null;
    }
}