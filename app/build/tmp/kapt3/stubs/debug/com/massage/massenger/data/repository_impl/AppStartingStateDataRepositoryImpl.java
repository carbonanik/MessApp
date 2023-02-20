package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/massage/massenger/data/repository_impl/AppStartingStateDataRepositoryImpl;", "Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;", "appStartingStateDataSource", "Lcom/massage/massenger/data/local/pref/AppStartingStateDataSource;", "(Lcom/massage/massenger/data/local/pref/AppStartingStateDataSource;)V", "getAppState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/data/local/pref/AppStartingState;", "saveAppState", "", "appState", "(Lcom/massage/massenger/data/local/pref/AppStartingState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppStartingStateDataRepositoryImpl implements com.massage.massenger.data.repository.AppStartingStateDataRepository {
    private final com.massage.massenger.data.local.pref.AppStartingStateDataSource appStartingStateDataSource = null;
    
    public AppStartingStateDataRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.AppStartingStateDataSource appStartingStateDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveAppState(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.AppStartingState appState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<com.massage.massenger.data.local.pref.AppStartingState> getAppState() {
        return null;
    }
}