package com.massage.massenger.unorganized.datachannel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J)\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u001f\u0010\u0013\u001a\u00020\u00042\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u000bH\u0016\u00a2\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\u0012\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016\u00a8\u0006$"}, d2 = {"Lcom/massage/massenger/unorganized/datachannel/CustomPeerConnectionObserver;", "Lorg/webrtc/PeerConnection$Observer;", "()V", "onAddStream", "", "mediaStream", "Lorg/webrtc/MediaStream;", "onAddTrack", "rtpReceiver", "Lorg/webrtc/RtpReceiver;", "mediaStreams", "", "(Lorg/webrtc/RtpReceiver;[Lorg/webrtc/MediaStream;)V", "onDataChannel", "dataChannel", "Lorg/webrtc/DataChannel;", "onIceCandidate", "iceCandidate", "Lorg/webrtc/IceCandidate;", "onIceCandidatesRemoved", "iceCandidates", "([Lorg/webrtc/IceCandidate;)V", "onIceConnectionChange", "iceConnectionState", "Lorg/webrtc/PeerConnection$IceConnectionState;", "onIceConnectionReceivingChange", "b", "", "onIceGatheringChange", "iceGatheringState", "Lorg/webrtc/PeerConnection$IceGatheringState;", "onRemoveStream", "onRenegotiationNeeded", "onSignalingChange", "signalingState", "Lorg/webrtc/PeerConnection$SignalingState;", "app_debug"})
public abstract class CustomPeerConnectionObserver implements org.webrtc.PeerConnection.Observer {
    
    public CustomPeerConnectionObserver() {
        super();
    }
    
    @java.lang.Override()
    public void onSignalingChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.SignalingState signalingState) {
    }
    
    @java.lang.Override()
    public void onIceConnectionChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.IceConnectionState iceConnectionState) {
    }
    
    @java.lang.Override()
    public void onIceConnectionReceivingChange(boolean b) {
    }
    
    @java.lang.Override()
    public void onIceGatheringChange(@org.jetbrains.annotations.Nullable()
    org.webrtc.PeerConnection.IceGatheringState iceGatheringState) {
    }
    
    @java.lang.Override()
    public void onIceCandidate(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate iceCandidate) {
    }
    
    @java.lang.Override()
    public void onIceCandidatesRemoved(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate[] iceCandidates) {
    }
    
    @java.lang.Override()
    public void onAddStream(@org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream mediaStream) {
    }
    
    @java.lang.Override()
    public void onRemoveStream(@org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream mediaStream) {
    }
    
    @java.lang.Override()
    public void onDataChannel(@org.jetbrains.annotations.Nullable()
    org.webrtc.DataChannel dataChannel) {
    }
    
    @java.lang.Override()
    public void onRenegotiationNeeded() {
    }
    
    @java.lang.Override()
    public void onAddTrack(@org.jetbrains.annotations.Nullable()
    org.webrtc.RtpReceiver rtpReceiver, @org.jetbrains.annotations.Nullable()
    org.webrtc.MediaStream[] mediaStreams) {
    }
}