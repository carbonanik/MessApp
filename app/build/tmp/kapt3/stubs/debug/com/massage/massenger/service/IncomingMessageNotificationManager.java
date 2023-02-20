package com.massage.massenger.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/massage/massenger/service/IncomingMessageNotificationManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buildPendingIntent", "Landroid/app/PendingIntent;", "chat", "Lcom/massage/massenger/model/Chat;", "createChannel", "", "id", "", "name", "createFloatingNotificationChannel", "createMessageNotificationChannel", "notificationBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "notificationData", "Lcom/massage/massenger/service/NotificationData;", "sendNotification", "notificationId", "", "Companion", "app_debug"})
public final class IncomingMessageNotificationManager {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.service.IncomingMessageNotificationManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FLOATING_CHANNEL_ID = "floating_notification_channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_CHANNEL_ID = "messapp_notification_channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FLOATING_CHANNEL_NAME = "Floating Notification Channel";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MESSAGE_CHANNEL_NAME = "Messapp Notification Channel";
    public static final int REQUEST_CODE_OPEN_CHAT = 1121111;
    
    @javax.inject.Inject()
    public IncomingMessageNotificationManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createFloatingNotificationChannel() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public final void createMessageNotificationChannel() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    private final void createChannel(java.lang.String id, java.lang.String name) {
    }
    
    public final void sendNotification(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.service.NotificationData notificationData, int notificationId) {
    }
    
    private final androidx.core.app.NotificationCompat.Builder notificationBuilder(com.massage.massenger.service.NotificationData notificationData) {
        return null;
    }
    
    private final android.app.PendingIntent buildPendingIntent(com.massage.massenger.model.Chat chat) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/massage/massenger/service/IncomingMessageNotificationManager$Companion;", "", "()V", "FLOATING_CHANNEL_ID", "", "FLOATING_CHANNEL_NAME", "MESSAGE_CHANNEL_ID", "MESSAGE_CHANNEL_NAME", "REQUEST_CODE_OPEN_CHAT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}