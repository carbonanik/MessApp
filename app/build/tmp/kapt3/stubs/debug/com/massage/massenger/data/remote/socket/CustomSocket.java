package com.massage.massenger.data.remote.socket;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fJ\u0016\u0010\u0011\u001a\u0012\u0012\f\u0012\n\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013\u0018\u00010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J4\u0010\u0016\u001a\u00020\u00152!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00150\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/massage/massenger/data/remote/socket/CustomSocket;", "", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "(Lcom/massage/massenger/data/local/pref/UserDataSource;)V", "client", "Lio/ktor/client/HttpClient;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "wsSession", "Lio/ktor/http/cio/websocket/DefaultWebSocketSession;", "createHttpClient", "token", "", "incoming", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "incomingText", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/common/TextMessage;", "openSocketSession", "", "receiveIncoming", "receive", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOutgoing", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "app_debug"})
@javax.inject.Singleton()
public final class CustomSocket {
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private io.ktor.client.HttpClient client;
    private io.ktor.http.cio.websocket.DefaultWebSocketSession wsSession;
    
    @javax.inject.Inject()
    public CustomSocket(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource) {
        super();
    }
    
    private final void start() {
    }
    
    private final io.ktor.client.HttpClient createHttpClient(java.lang.String token) {
        return null;
    }
    
    private final void openSocketSession() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object receiveIncoming(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent, kotlin.Unit> receive, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.data.remote.socket.events.SocketEvent> incoming() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage> incomingText() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendOutgoing(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}