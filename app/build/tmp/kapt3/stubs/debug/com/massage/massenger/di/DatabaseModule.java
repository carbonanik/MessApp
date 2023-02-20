package com.massage.massenger.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/massage/massenger/di/DatabaseModule;", "", "()V", "provideChatDao", "Lcom/massage/massenger/data/local/room/dao/ChatDao;", "database", "Lcom/massage/massenger/data/local/room/MessengerDatabase;", "provideConnectionDao", "Lcom/massage/massenger/data/local/room/dao/UserDao;", "provideDatabase", "app", "Landroid/app/Application;", "provideGroupDao", "Lcom/massage/massenger/data/local/room/dao/GroupDao;", "provideMessageDao", "Lcom/massage/massenger/data/local/room/dao/MessageDao;", "providePostDao", "Lcom/massage/massenger/data/local/room/dao/PostDao;", "app_debug"})
@dagger.Module()
public final class DatabaseModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.di.DatabaseModule INSTANCE = null;
    
    private DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.MessengerDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.dao.MessageDao provideMessageDao(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.dao.ChatDao provideChatDao(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.dao.UserDao provideConnectionDao(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.dao.GroupDao provideGroupDao(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.massage.massenger.data.local.room.dao.PostDao providePostDao(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.MessengerDatabase database) {
        return null;
    }
}