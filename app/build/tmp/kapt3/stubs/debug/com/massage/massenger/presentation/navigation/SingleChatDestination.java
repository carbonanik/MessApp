package com.massage.massenger.presentation.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\f\u0010\u0019\u001a\u0004\u0018\u00010\u0015*\u00020\u001aJ\f\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u001aR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/massage/massenger/presentation/navigation/SingleChatDestination;", "Lcom/massage/massenger/presentation/navigation/Destination;", "()V", "CHAT", "", "USER", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "getArguments", "()Ljava/util/List;", "deepLinks", "Landroidx/navigation/NavDeepLink;", "getDeepLinks", "route", "getRoute", "()Ljava/lang/String;", "uri", "getDeepLink", "Landroid/net/Uri;", "chat", "Lcom/massage/massenger/model/Chat;", "invoke", "user", "Lcom/massage/massenger/model/User;", "parseChat", "Landroidx/navigation/NavBackStackEntry;", "parseUser", "app_debug"})
public final class SingleChatDestination extends com.massage.massenger.presentation.navigation.Destination {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.presentation.navigation.SingleChatDestination INSTANCE = null;
    private static final java.lang.String CHAT = "chat";
    private static final java.lang.String USER = "user";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<androidx.navigation.NamedNavArgument> arguments = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<androidx.navigation.NavDeepLink> deepLinks = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String uri = "app://com.massage.massenger";
    
    private SingleChatDestination() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<androidx.navigation.NamedNavArgument> getArguments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<androidx.navigation.NavDeepLink> getDeepLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String invoke(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.Chat chat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String invoke(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getDeepLink(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.Chat chat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Chat parseChat(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavBackStackEntry $this$parseChat) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User parseUser(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavBackStackEntry $this$parseUser) {
        return null;
    }
}