package com.massage.massenger.data.local.room.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\'J\u0011\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/massage/massenger/data/local/room/dao/DatabaseLogDao;", "", "deleteOlder", "", "timestamp", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLog", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/massage/massenger/model/DatabaseLog;", "getLastItem", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastTimeForTable", "tableName", "", "operation", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertLog", "log", "(Lcom/massage/massenger/model/DatabaseLog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DatabaseLogDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insertLog(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.DatabaseLog log, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM database_log_table WHERE table_name IS :tableName AND operation IS :operation")
    public abstract java.lang.Object getLastTimeForTable(@org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String operation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.massage.massenger.model.DatabaseLog>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM database_log_table WHERE timestamp < :timestamp")
    public abstract java.lang.Object deleteOlder(long timestamp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM database_log_table WHERE timestamp=(SELECT max(timestamp) FROM database_log_table)")
    public abstract java.lang.Object getLastItem(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.DatabaseLog> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM database_log_table")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.DatabaseLog>> getAllLog();
}