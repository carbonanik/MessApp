package com.massage.massenger.data.remote.socket;

import java.lang.System;

/**
 * 19-10-21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0019\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u0015\u0010\u0019\u001a\u00020\u0013*\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u0013*\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/data/remote/socket/KtorSocket;", "", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "(Lcom/massage/massenger/data/local/pref/UserDataSource;)V", "incomingMessage", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "getIncomingMessage", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "outgoingMessage", "getOutgoingMessage", "scope", "Lkotlinx/coroutines/CoroutineScope;", "createWSClient", "Lio/ktor/client/HttpClient;", "token", "", "openSocketSession", "", "client", "receive", "m", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "receiveIncoming", "Lio/ktor/client/features/websocket/DefaultClientWebSocketSession;", "(Lio/ktor/client/features/websocket/DefaultClientWebSocketSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOutgoing", "app_debug"})
@javax.inject.Singleton()
public final class KtorSocket {
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent> incomingMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent> outgoingMessage = null;
    
    @javax.inject.Inject()
    public KtorSocket(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent> getIncomingMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent> getOutgoingMessage() {
        return null;
    }
    
    private final void start() {
    }
    
    /**
     * create a new [HttpClient] with authorization token
     */
    private final io.ktor.client.HttpClient createWSClient(java.lang.String token) {
        return null;
    }
    
    /**
     * try opening [WebSocketSession]
     */
    private final void openSocketSession(io.ktor.client.HttpClient client) {
    }
    
    private final java.lang.Object receiveIncoming(io.ktor.client.features.websocket.DefaultClientWebSocketSession $this$receiveIncoming, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final java.lang.Object sendOutgoing(io.ktor.client.features.websocket.DefaultClientWebSocketSession $this$sendOutgoing, kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private final java.lang.Object receive(com.massage.massenger.data.remote.socket.events.SocketEvent m, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}