package com.massage.massenger.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0011J\u001d\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\b\u0010%\u001a\u00020\u001aH\u0016J\"\u0010&\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0016J\b\u0010)\u001a\u00020\u001aH\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006*"}, d2 = {"Lcom/massage/massenger/service/SocketMessageService;", "Landroid/app/Service;", "()V", "messageNotificationManager", "Lcom/massage/massenger/service/IncomingMessageNotificationManager;", "getMessageNotificationManager", "()Lcom/massage/massenger/service/IncomingMessageNotificationManager;", "setMessageNotificationManager", "(Lcom/massage/massenger/service/IncomingMessageNotificationManager;)V", "messageRepository", "Lcom/massage/massenger/data/repository_impl/MessageRepository;", "getMessageRepository", "()Lcom/massage/massenger/data/repository_impl/MessageRepository;", "setMessageRepository", "(Lcom/massage/massenger/data/repository_impl/MessageRepository;)V", "notificationIds", "Ljava/util/HashMap;", "", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getOrNewNotificationId", "chatId", "isRtcRequest", "", "message", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newNotificationId", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "subscribeToSocketEvents", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SocketMessageService extends android.app.Service {
    @javax.inject.Inject()
    public com.massage.massenger.data.repository_impl.MessageRepository messageRepository;
    @javax.inject.Inject()
    public com.massage.massenger.service.IncomingMessageNotificationManager messageNotificationManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final java.util.HashMap<java.lang.String, java.lang.Integer> notificationIds = null;
    
    public SocketMessageService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.data.repository_impl.MessageRepository getMessageRepository() {
        return null;
    }
    
    public final void setMessageRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.MessageRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.service.IncomingMessageNotificationManager getMessageNotificationManager() {
        return null;
    }
    
    public final void setMessageNotificationManager(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.service.IncomingMessageNotificationManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void subscribeToSocketEvents() {
    }
    
    private final java.lang.Object isRtcRequest(com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return null;
    }
    
    public final int getOrNewNotificationId(@org.jetbrains.annotations.NotNull()
    java.lang.String chatId) {
        return 0;
    }
    
    private final int newNotificationId(java.lang.String chatId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}