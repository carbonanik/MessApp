package com.massage.massenger.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/massage/massenger/di/RepositoryModule;", "", "()V", "provideAppStartingStateDataRepository", "Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;", "dataSource", "Lcom/massage/massenger/data/local/pref/AppStartingStateDataSource;", "provideAuthRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "authApiService", "Lcom/massage/massenger/data/remote/api_service/auth/AuthApiService;", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "database", "Lcom/massage/massenger/data/local/room/MessengerDatabase;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.massage.massenger.data.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.auth.AuthApiService authApiService, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.massage.massenger.data.repository.AppStartingStateDataRepository provideAppStartingStateDataRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.AppStartingStateDataSource dataSource) {
        return null;
    }
}