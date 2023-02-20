package com.massage.massenger.unorganized.rtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010!J\u0015\u0010K\u001a\u0004\u0018\u00010\n2\u0006\u0010L\u001a\u00020M\u00a2\u0006\u0002\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u0001012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010P\u001a\u000206H\u0002J\u0015\u0010Q\u001a\u0004\u0018\u00010\n2\u0006\u0010L\u001a\u00020M\u00a2\u0006\u0002\u0010NJ\u000e\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020TJ\u000e\u0010U\u001a\u00020\n2\u0006\u0010V\u001a\u00020TJ\u0006\u0010W\u001a\u00020\nJ\u0010\u0010F\u001a\u00020E2\u0006\u0010\u0002\u001a\u00020XH\u0002J\u0010\u0010Y\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010Z\u001a\u00020\n2\u0006\u0010[\u001a\u00020\\J\u000e\u0010]\u001a\u00020\n2\u0006\u0010^\u001a\u00020;J\u000e\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\\J\u0006\u0010a\u001a\u00020\nJ\u0014\u0010K\u001a\u00020\n*\u0002012\u0006\u0010L\u001a\u00020MH\u0002J\u0014\u0010Q\u001a\u00020\n*\u0002012\u0006\u0010L\u001a\u00020MH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010&0&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010)\u001a\n \u0014*\u0004\u0018\u00010*0*8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b+\u0010,R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00100\u001a\u0004\u0018\u0001018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u0018\u001a\u0004\b2\u00103R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u0018\u001a\u0004\b7\u00108R\u001c\u0010:\u001a\u0004\u0018\u00010;X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000e\u0010@\u001a\u00020AX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001b\u0010D\u001a\u00020E8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\u0018\u001a\u0004\bF\u0010G\u00a8\u0006c"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCClient;", "", "context", "Landroid/app/Application;", "observer", "Lorg/webrtc/PeerConnection$Observer;", "sendMessage", "Lkotlin/Function1;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "", "(Landroid/app/Application;Lorg/webrtc/PeerConnection$Observer;Lkotlin/jvm/functions/Function1;)V", "CHUNK_SIZE", "", "TAG", "", "getTAG", "()Ljava/lang/String;", "audioSource", "Lorg/webrtc/AudioSource;", "kotlin.jvm.PlatformType", "getAudioSource", "()Lorg/webrtc/AudioSource;", "audioSource$delegate", "Lkotlin/Lazy;", "dataChannel", "Lorg/webrtc/DataChannel;", "getDataChannel", "()Lorg/webrtc/DataChannel;", "setDataChannel", "(Lorg/webrtc/DataChannel;)V", "iceCandidateArray", "", "Lorg/webrtc/IceCandidate;", "getIceCandidateArray", "()Ljava/util/List;", "iceServer", "", "Lorg/webrtc/PeerConnection$IceServer;", "localAudioTrack", "Lorg/webrtc/AudioTrack;", "localVideoSource", "Lorg/webrtc/VideoSource;", "getLocalVideoSource", "()Lorg/webrtc/VideoSource;", "localVideoSource$delegate", "localVideoTrack", "Lorg/webrtc/VideoTrack;", "peerConnection", "Lorg/webrtc/PeerConnection;", "getPeerConnection", "()Lorg/webrtc/PeerConnection;", "peerConnection$delegate", "peerConnectionFactory", "Lorg/webrtc/PeerConnectionFactory;", "getPeerConnectionFactory", "()Lorg/webrtc/PeerConnectionFactory;", "peerConnectionFactory$delegate", "remoteSessionDescription", "Lorg/webrtc/SessionDescription;", "getRemoteSessionDescription", "()Lorg/webrtc/SessionDescription;", "setRemoteSessionDescription", "(Lorg/webrtc/SessionDescription;)V", "rootEglBase", "Lorg/webrtc/EglBase;", "getSendMessage", "()Lkotlin/jvm/functions/Function1;", "videoCapturer", "Lorg/webrtc/CameraVideoCapturer;", "getVideoCapturer", "()Lorg/webrtc/CameraVideoCapturer;", "videoCapturer$delegate", "addIceCandidate", "iceCandidate", "answer", "sdpObserver", "Lorg/webrtc/SdpObserver;", "(Lorg/webrtc/SdpObserver;)Lkotlin/Unit;", "buildPeerConnection", "buildPeerConnectionFactory", "call", "enableAudio", "audioEnabled", "", "enableVideo", "videoEnabled", "endCall", "Landroid/content/Context;", "initPeerConnectionFactory", "initSurfaceView", "view", "Lorg/webrtc/SurfaceViewRenderer;", "onRemoteSessionReceived", "sessionDescription", "startLocalVideoCapture", "localVideoOutput", "switchCamera", "Companion", "app_debug"})
public final class RTCClient {
    private final android.app.Application context = null;
    private final org.webrtc.PeerConnection.Observer observer = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> sendMessage = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.unorganized.rtc.RTCClient.Companion Companion = null;
    private static final java.lang.String LOCAL_TRACK_ID = "local_track";
    private static final java.lang.String LOCAL_STREAM_ID = "local_track";
    private final int CHUNK_SIZE = 64000;
    private final org.webrtc.EglBase rootEglBase = null;
    private org.webrtc.AudioTrack localAudioTrack;
    private org.webrtc.VideoTrack localVideoTrack;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "RTCClient";
    @org.jetbrains.annotations.Nullable()
    private org.webrtc.SessionDescription remoteSessionDescription;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.webrtc.IceCandidate> iceCandidateArray = null;
    @org.jetbrains.annotations.Nullable()
    private org.webrtc.DataChannel dataChannel;
    private final java.util.List<org.webrtc.PeerConnection.IceServer> iceServer = null;
    private final kotlin.Lazy peerConnectionFactory$delegate = null;
    private final kotlin.Lazy videoCapturer$delegate = null;
    private final kotlin.Lazy audioSource$delegate = null;
    private final kotlin.Lazy localVideoSource$delegate = null;
    private final kotlin.Lazy peerConnection$delegate = null;
    
    public RTCClient(@org.jetbrains.annotations.NotNull()
    android.app.Application context, @org.jetbrains.annotations.NotNull()
    org.webrtc.PeerConnection.Observer observer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> sendMessage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage, kotlin.Unit> getSendMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.webrtc.SessionDescription getRemoteSessionDescription() {
        return null;
    }
    
    public final void setRemoteSessionDescription(@org.jetbrains.annotations.Nullable()
    org.webrtc.SessionDescription p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.webrtc.IceCandidate> getIceCandidateArray() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.webrtc.DataChannel getDataChannel() {
        return null;
    }
    
    public final void setDataChannel(@org.jetbrains.annotations.Nullable()
    org.webrtc.DataChannel p0) {
    }
    
    private final org.webrtc.PeerConnectionFactory getPeerConnectionFactory() {
        return null;
    }
    
    private final org.webrtc.CameraVideoCapturer getVideoCapturer() {
        return null;
    }
    
    private final org.webrtc.AudioSource getAudioSource() {
        return null;
    }
    
    private final org.webrtc.VideoSource getLocalVideoSource() {
        return null;
    }
    
    private final org.webrtc.PeerConnection getPeerConnection() {
        return null;
    }
    
    private final void initPeerConnectionFactory(android.app.Application context) {
    }
    
    private final org.webrtc.PeerConnectionFactory buildPeerConnectionFactory() {
        return null;
    }
    
    private final org.webrtc.PeerConnection buildPeerConnection(org.webrtc.PeerConnection.Observer observer) {
        return null;
    }
    
    private final org.webrtc.CameraVideoCapturer getVideoCapturer(android.content.Context context) {
        return null;
    }
    
    public final void initSurfaceView(@org.jetbrains.annotations.NotNull()
    org.webrtc.SurfaceViewRenderer view) {
    }
    
    public final void startLocalVideoCapture(@org.jetbrains.annotations.NotNull()
    org.webrtc.SurfaceViewRenderer localVideoOutput) {
    }
    
    private final void call(org.webrtc.PeerConnection $this$call, org.webrtc.SdpObserver sdpObserver) {
    }
    
    private final void answer(org.webrtc.PeerConnection $this$answer, org.webrtc.SdpObserver sdpObserver) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit call(@org.jetbrains.annotations.NotNull()
    org.webrtc.SdpObserver sdpObserver) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit answer(@org.jetbrains.annotations.NotNull()
    org.webrtc.SdpObserver sdpObserver) {
        return null;
    }
    
    public final void onRemoteSessionReceived(@org.jetbrains.annotations.NotNull()
    org.webrtc.SessionDescription sessionDescription) {
    }
    
    public final void addIceCandidate(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate iceCandidate) {
    }
    
    public final void endCall() {
    }
    
    public final void enableVideo(boolean videoEnabled) {
    }
    
    public final void enableAudio(boolean audioEnabled) {
    }
    
    public final void switchCamera() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCClient$Companion;", "", "()V", "LOCAL_STREAM_ID", "", "LOCAL_TRACK_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}