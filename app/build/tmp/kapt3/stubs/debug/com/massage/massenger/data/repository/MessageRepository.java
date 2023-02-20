package com.massage.massenger.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/massage/massenger/data/repository/MessageRepository;", "", "getAllMessageWithChat", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/massage/massenger/model/ChatMessage;", "chatId", "", "sendMessage", "", "message", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "app_debug"})
public abstract interface MessageRepository {
    
    public abstract void sendMessage(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent message);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.ChatMessage>> getAllMessageWithChat(@org.jetbrains.annotations.NotNull()
    java.lang.String chatId);
}