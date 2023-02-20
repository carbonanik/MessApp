package com.massage.massenger.data.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.massage.massenger.model.ChatMessage.class, com.massage.massenger.model.Chat.class, com.massage.massenger.model.User.class, com.massage.massenger.model.Group.class, com.massage.massenger.model.Post.class, com.massage.massenger.model.DatabaseLog.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.massage.massenger.util.ListTypeConverter.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/massage/massenger/data/local/room/MessengerDatabase;", "Landroidx/room/RoomDatabase;", "()V", "chatDao", "Lcom/massage/massenger/data/local/room/dao/ChatDao;", "databaseLogDao", "Lcom/massage/massenger/data/local/room/dao/DatabaseLogDao;", "groupDao", "Lcom/massage/massenger/data/local/room/dao/GroupDao;", "messageDao", "Lcom/massage/massenger/data/local/room/dao/MessageDao;", "postDao", "Lcom/massage/massenger/data/local/room/dao/PostDao;", "userDao", "Lcom/massage/massenger/data/local/room/dao/UserDao;", "Companion", "app_debug"})
public abstract class MessengerDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.data.local.room.MessengerDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_TABLE = "connection_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_TABLE = "message_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAT_TABLE = "chat_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GROUP_TABLE = "group_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POST_TABLE = "post_table";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_LOG_TABLE = "database_log_table";
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.RoomDatabase.Callback DB_CALLBACK = null;
    
    public MessengerDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.MessageDao messageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.ChatDao chatDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.GroupDao groupDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.PostDao postDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.massage.massenger.data.local.room.dao.DatabaseLogDao databaseLogDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/massage/massenger/data/local/room/MessengerDatabase$Companion;", "", "()V", "CHAT_TABLE", "", "DATABASE_LOG_TABLE", "DB_CALLBACK", "Landroidx/room/RoomDatabase$Callback;", "getDB_CALLBACK", "()Landroidx/room/RoomDatabase$Callback;", "GROUP_TABLE", "MESSAGE_TABLE", "POST_TABLE", "USER_TABLE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.RoomDatabase.Callback getDB_CALLBACK() {
            return null;
        }
    }
}