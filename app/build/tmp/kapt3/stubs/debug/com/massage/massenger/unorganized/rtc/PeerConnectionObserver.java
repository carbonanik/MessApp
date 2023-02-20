package com.massage.massenger.unorganized.rtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J)\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fH\u0016J\u001f\u0010\u0010\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\nH\u0016\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u001bH\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/PeerConnectionObserver;", "Lorg/webrtc/PeerConnection$Observer;", "()V", "onAddStream", "", "p0", "Lorg/webrtc/MediaStream;", "onAddTrack", "Lorg/webrtc/RtpReceiver;", "p1", "", "(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V", "onDataChannel", "Lorg/webrtc/DataChannel;", "onIceCandidate", "Lorg/webrtc/IceCandidate;", "onIceCandidatesRemoved", "([Lorg/webrtc/IceCandidate;)V", "onIceConnectionChange", "Lorg/webrtc/PeerConnection$IceConnectionState;", "onIceConnectionReceivingChange", "", "onIceGatheringChange", "Lorg/webrtc/PeerConnection$IceGatheringState;", "onRemoveStream", "onRenegotiationNeeded", "onSignalingChange", "Lorg/webrtc/PeerConnection$SignalingState;", "app_debug"})
public class PeerConnectionObserver implements org.webrtc.PeerConnection.Observer {
    
    public PeerConnectionObserver() {
        super();
    }
    
    @java.lang.Override()
    public void onIceCandidate(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate p0) {
    }
    
    @java.lang.Override()
    public void onDataChannel(@org.jetbrains.annotations.Nullable()
    org.webrtc.DataChannel p0) {
    }
    
    @java.lang.Override()
    public void onIceConnectionReceivingChange(boolean p0) {
    }
    
    @java.lang.Override()
    public void onIceConnectionChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.IceConnectionState p0) {
    }
    
    @java.lang.Override()
    public void onIceGatheringChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.IceGatheringState p0) {
    }
    
    @java.lang.Override()
    public void onAddStream(@org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream p0) {
    }
    
    @java.lang.Override()
    public void onSignalingChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.SignalingState p0) {
    }
    
    @java.lang.Override()
    public void onIceCandidatesRemoved(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate[] p0) {
    }
    
    @java.lang.Override()
    public void onRemoveStream(@org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream p0) {
    }
    
    @java.lang.Override()
    public void onRenegotiationNeeded() {
    }
    
    @java.lang.Override()
    public void onAddTrack(@org.jetbrains.annotations.Nullable()
    org.webrtc.RtpReceiver p0, @org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream[] p1) {
    }
}