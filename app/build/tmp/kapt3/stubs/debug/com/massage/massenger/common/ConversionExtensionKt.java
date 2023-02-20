package com.massage.massenger.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00060\u0002j\u0002`\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0005\u001a\u0012\u0010\u0006\u001a\u00060\u0007j\u0002`\b*\u00060\u0002j\u0002`\u0003\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, d2 = {"crateChat", "Lcom/massage/massenger/model/Chat;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/common/TextMessage;", "createChat", "Lcom/massage/massenger/model/User;", "createDeliveredStatus", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "Lcom/massage/massenger/common/MessageStatusCarrier;", "toChatMessage", "Lcom/massage/massenger/model/ChatMessage;", "chatId", "", "app_debug"})
public final class ConversionExtensionKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final com.massage.massenger.model.ChatMessage toChatMessage(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage $this$toChatMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String chatId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final com.massage.massenger.model.Chat crateChat(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage $this$crateChat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.model.Chat createChat(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.User $this$createChat) {
        return null;
    }
    
    /**
     * creating a new text message [MessageStatus.DELIVERED] status carrier
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier createDeliveredStatus(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage $this$createDeliveredStatus) {
        return null;
    }
}