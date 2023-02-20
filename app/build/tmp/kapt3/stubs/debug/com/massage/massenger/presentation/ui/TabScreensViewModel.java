package com.massage.massenger.presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/massage/massenger/presentation/ui/TabScreensViewModel;", "Landroidx/lifecycle/ViewModel;", "chatDao", "Lcom/massage/massenger/data/local/room/dao/ChatDao;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "userRepository", "Lcom/massage/massenger/data/repository_impl/UserRepository;", "(Lcom/massage/massenger/data/local/room/dao/ChatDao;Lcom/massage/massenger/data/repository/AuthRepository;Lcom/massage/massenger/data/repository_impl/UserRepository;)V", "chats", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/massage/massenger/model/Chat;", "getChats", "()Lkotlinx/coroutines/flow/Flow;", "isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "app_debug"})
public final class TabScreensViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.local.room.dao.ChatDao chatDao = null;
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    private final com.massage.massenger.data.repository_impl.UserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.Chat>> chats = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isLoading = null;
    
    @javax.inject.Inject()
    public TabScreensViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.ChatDao chatDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.UserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.Chat>> getChats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
}