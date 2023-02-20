package com.massage.massenger.unorganized.datachannel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012%\u0010\u0004\u001a!\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005\u0012!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\rJ\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u001cJ\"\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020!J\u0018\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R-\u0010\u0004\u001a!\u0012\u0017\u0012\u00150\u0006j\u0002`\u0007\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/massage/massenger/unorganized/datachannel/RTConnection;", "", "context", "Landroid/content/Context;", "sendMessage", "Lkotlin/Function1;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "Lkotlin/ParameterName;", "name", "message", "", "onDataChannelMessage", "Lorg/webrtc/DataChannel$Buffer;", "buffer", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "dataChannel", "Lorg/webrtc/DataChannel;", "peerConnection", "Lorg/webrtc/PeerConnection;", "peerConnectionFactory", "Lorg/webrtc/PeerConnectionFactory;", "createAnswer", "createOffer", "initialized", "sendChunk", "chunk", "sendData", "", "setIceCandidate", "candidate", "sdpMid", "sdpMLineIndex", "", "setRemoteSDP", "sessionDescription", "type", "Lorg/webrtc/SessionDescription$Type;", "Companion", "app_debug"})
public final class RTConnection {
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> sendMessage = null;
    private final kotlin.jvm.functions.Function1<org.webrtc.DataChannel.Buffer, kotlin.Unit> onDataChannelMessage = null;
    private org.webrtc.PeerConnectionFactory peerConnectionFactory;
    private org.webrtc.PeerConnection peerConnection;
    private org.webrtc.DataChannel dataChannel;
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.unorganized.datachannel.RTConnection.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "RTConnection";
    
    public RTConnection(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> sendMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.webrtc.DataChannel.Buffer, kotlin.Unit> onDataChannelMessage) {
        super();
    }
    
    public final void initialized() {
    }
    
    public final void setIceCandidate(@org.jetbrains.annotations.Nullable()
    java.lang.String candidate, @org.jetbrains.annotations.Nullable()
    java.lang.String sdpMid, int sdpMLineIndex) {
    }
    
    public final void createOffer() {
    }
    
    public final void createAnswer() {
    }
    
    public final void setRemoteSDP(@org.jetbrains.annotations.Nullable()
    java.lang.String sessionDescription, @org.jetbrains.annotations.NotNull()
    org.webrtc.SessionDescription.Type type) {
    }
    
    public final void sendData(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void sendChunk(@org.jetbrains.annotations.NotNull()
    org.webrtc.DataChannel.Buffer chunk) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/massage/massenger/unorganized/datachannel/RTConnection$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}