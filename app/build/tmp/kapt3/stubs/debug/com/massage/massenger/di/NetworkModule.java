package com.massage.massenger.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/massage/massenger/di/NetworkModule;", "", "()V", "provideAuthApiService", "Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;", "client", "Lio/ktor/client/HttpClient;", "provideFileShareApiService", "Lcom/massage/massenger/data/remote/api_service/file/FileShareApiService;", "provideGroupApiService", "Lcom/massage/massenger/data/remote/api_service/group/GroupApiService;", "provideHttpClient", "providePostApiService", "Lcom/massage/massenger/data/remote/api_service/post/PostApiService;", "provideUserApiService", "Lcom/massage/massenger/data/remote/api_service/user/UserApiService;", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.di.NetworkModule INSTANCE = null;
    
    private NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final io.ktor.client.HttpClient provideHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.remote.api_service.auth.AuthApiService provideAuthApiService(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.remote.api_service.user.UserApiService provideUserApiService(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.remote.api_service.group.GroupApiService provideGroupApiService(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.remote.api_service.post.PostApiService providePostApiService(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.remote.api_service.file.FileShareApiService provideFileShareApiService(@org.jetbrains.annotations.NotNull()
    io.ktor.client.HttpClient client) {
        return null;
    }
}