package com.massage.massenger.util.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\'\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u001aM\u0010\u0005\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0007\"\u0004\b\u0002\u0010\u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u0001\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\u00060\n\u00a2\u0006\u0002\u0010\u000b\u001a\u0011\u0010\f\u001a\u0004\u0018\u00010\r*\u00020\u000e\u00a2\u0006\u0002\u0010\u000f\u001a\n\u0010\u0010\u001a\u00020\u000e*\u00020\u000e\u001a\n\u0010\u0011\u001a\u00020\u000e*\u00020\u000e\u001a\f\u0010\u0012\u001a\u0004\u0018\u00010\u000e*\u00020\r\u001a\n\u0010\u0013\u001a\u00020\u000e*\u00020\u000e\u001aV\u0010\u0014\u001a\u00020\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0016*\u0002H\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0001\u00a2\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00150\u001bH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001f\u001a\u0011\u0010 \u001a\u0004\u0018\u00010\r*\u00020\u000e\u00a2\u0006\u0002\u0010\u000f\u001a\f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\r\u001a\f\u0010\"\u001a\u0004\u0018\u00010\u000e*\u00020\r\u001a\u0011\u0010#\u001a\u0004\u0018\u00010\r*\u00020\u000e\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006$"}, d2 = {"minSDK29OrUp", "T", "onSdk29", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "biLet", "R", "U", "Lkotlin/Pair;", "body", "Lkotlin/Function2;", "(Lkotlin/Pair;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "dateToTimestamp", "", "", "(Ljava/lang/String;)Ljava/lang/Long;", "decode", "encode", "generateName", "md5", "setPersons", "", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent;", "sender", "Lcom/massage/massenger/model/User;", "receiver", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "(Lcom/massage/massenger/data/remote/socket/events/SocketEvent;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/User;Lkotlin/jvm/functions/Function1;)V", "timeToTimestamp", "toDate", "toTime", "toTimestamp", "app_debug"})
public final class ExtensionKt {
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object>R biLet(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<? extends T, ? extends U> $this$biLet, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super U, ? extends R> body) {
        return null;
    }
    
    public static final <T extends com.massage.massenger.data.remote.socket.events.SocketEvent>void setPersons(@org.jetbrains.annotations.NotNull()
    T $this$setPersons, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User sender, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User receiver, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends java.lang.Object>T minSDK29OrUp(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> onSdk29) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toTime(long $this$toTime) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toDate(long $this$toDate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long toTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toTimestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long timeToTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$timeToTimestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long dateToTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$dateToTimestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String generateName(long $this$generateName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String encode(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$encode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String decode(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$decode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String md5(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$md5) {
        return null;
    }
}