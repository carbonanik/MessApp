package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\'\u0010\u001f\u001a\u0004\u0018\u00010 2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0+0*2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0019\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0019\u0010/\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u00b4\u0001\u00101\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\'2\'\b\u0002\u00102\u001a!\u0012\u0017\u0012\u00150\u001cj\u0002`\u001d\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020%032\'\b\u0002\u00106\u001a!\u0012\u0017\u0012\u001507j\u0002`8\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020%032\'\b\u0002\u00109\u001a!\u0012\u0017\u0012\u00150:j\u0002`;\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020%032\'\b\u0002\u0010<\u001a!\u0012\u0017\u0012\u00150\u000fj\u0002`\u0010\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020%03H\u0002J\u0010\u0010=\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\'H\u0002J\u001d\u0010>\u001a\u00020%2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010?\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\'H\u0002J\u001d\u0010@\u001a\u00020%2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJi\u0010A\u001a\u00020%2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2J\b\u0002\u0010B\u001aD\b\u0001\u0012\u0013\u0012\u00110\u001a\u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110 \u00a2\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(D\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0E\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010CH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010FJ\u001d\u0010G\u001a\u00020%2\n\u0010H\u001a\u00060\u001cj\u0002`\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u000e\u0010I\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\'J!\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020\"2\u0006\u0010L\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u001d\u0010N\u001a\u00020%2\n\u00106\u001a\u000607j\u0002`8H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010OR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006P"}, d2 = {"Lcom/massage/massenger/data/repository_impl/MessageRepository;", "", "messageDao", "Lcom/massage/massenger/data/local/room/dao/MessageDao;", "chatDao", "Lcom/massage/massenger/data/local/room/dao/ChatDao;", "userDao", "Lcom/massage/massenger/data/local/room/dao/UserDao;", "socket", "Lcom/massage/massenger/data/remote/socket/KtorSocket;", "(Lcom/massage/massenger/data/local/room/dao/MessageDao;Lcom/massage/massenger/data/local/room/dao/ChatDao;Lcom/massage/massenger/data/local/room/dao/UserDao;Lcom/massage/massenger/data/remote/socket/KtorSocket;)V", "_incomingNotification", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/massage/massenger/service/NotificationData;", "_incomingRtcEvent", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "incomingNotification", "Lkotlinx/coroutines/flow/SharedFlow;", "getIncomingNotification", "()Lkotlinx/coroutines/flow/SharedFlow;", "incomingRtcEvent", "getIncomingRtcEvent", "scope", "Lkotlinx/coroutines/CoroutineScope;", "createAndInsertChat", "Lcom/massage/massenger/model/Chat;", "message", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/common/TextMessage;", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createAndInsertChatMessage", "Lcom/massage/massenger/model/ChatMessage;", "chatId", "", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitOutgoing", "", "socketEvent", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllMessageWithChat", "Lkotlinx/coroutines/flow/Flow;", "", "insertChat", "chat", "(Lcom/massage/massenger/model/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessage", "(Lcom/massage/massenger/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "messageCheck", "text", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "status", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;", "Lcom/massage/massenger/common/MessageStatusCarrier;", "wander", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$WanderingStatus;", "Lcom/massage/massenger/common/WanderingStatus;", "rtc", "processIncomingMessage", "processIncomingTextMessage", "processOutgoingMessage", "processOutgoingTextMessage", "processTextMessage", "success", "Lkotlin/Function3;", "chatMessage", "Lkotlin/coroutines/Continuation;", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "replyDeliveryStatus", "textMessage", "sendMessage", "updateImageUri", "id", "imageUri", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMessageStatus", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent$MessageStatusCarrier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class MessageRepository {
    private final com.massage.massenger.data.local.room.dao.MessageDao messageDao = null;
    private final com.massage.massenger.data.local.room.dao.ChatDao chatDao = null;
    private final com.massage.massenger.data.local.room.dao.UserDao userDao = null;
    private final com.massage.massenger.data.remote.socket.KtorSocket socket = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> _incomingRtcEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> incomingRtcEvent = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.service.NotificationData> _incomingNotification = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.service.NotificationData> incomingNotification = null;
    
    @javax.inject.Inject()
    public MessageRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.MessageDao messageDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.ChatDao chatDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.UserDao userDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.KtorSocket socket) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> getIncomingRtcEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.service.NotificationData> getIncomingNotification() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.ChatMessage>> getAllMessageWithChat(@org.jetbrains.annotations.Nullable()
    java.lang.String chatId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateImageUri(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void processIncomingMessage(com.massage.massenger.data.remote.socket.events.SocketEvent message) {
    }
    
    private final void processOutgoingMessage(com.massage.massenger.data.remote.socket.events.SocketEvent message) {
    }
    
    private final java.lang.Object processIncomingTextMessage(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object processOutgoingTextMessage(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object processTextMessage(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage message, kotlin.jvm.functions.Function3<? super com.massage.massenger.model.Chat, ? super com.massage.massenger.model.ChatMessage, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> success, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object createAndInsertChat(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage message, kotlin.coroutines.Continuation<? super com.massage.massenger.model.Chat> continuation) {
        return null;
    }
    
    private final java.lang.Object createAndInsertChatMessage(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage message, java.lang.String chatId, kotlin.coroutines.Continuation<? super com.massage.massenger.model.ChatMessage> continuation) {
        return null;
    }
    
    private final java.lang.Object insertChat(com.massage.massenger.model.Chat chat, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object insertMessage(com.massage.massenger.model.ChatMessage message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object updateMessageStatus(com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier status, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object emitOutgoing(com.massage.massenger.data.remote.socket.events.SocketEvent socketEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object replyDeliveryStatus(com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage textMessage, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void messageCheck(com.massage.massenger.data.remote.socket.events.SocketEvent message, kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage, kotlin.Unit> text, kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.MessageStatusCarrier, kotlin.Unit> status, kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.WanderingStatus, kotlin.Unit> wander, kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> rtc) {
    }
}