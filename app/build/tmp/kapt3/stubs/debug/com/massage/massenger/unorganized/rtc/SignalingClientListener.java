package com.massage.massenger.unorganized.rtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0003H&\u00a8\u0006\r"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/SignalingClientListener;", "", "onAnswerReceived", "", "description", "Lorg/webrtc/SessionDescription;", "onCallEnded", "onConnectionEstablished", "onIceCandidateReceived", "iceCandidate", "Lorg/webrtc/IceCandidate;", "onOfferReceived", "onRequestAccepted", "app_debug"})
public abstract interface SignalingClientListener {
    
    public abstract void onConnectionEstablished();
    
    public abstract void onRequestAccepted();
    
    public abstract void onOfferReceived(@org.jetbrains.annotations.NotNull()
    org.webrtc.SessionDescription description);
    
    public abstract void onAnswerReceived(@org.jetbrains.annotations.NotNull()
    org.webrtc.SessionDescription description);
    
    public abstract void onIceCandidateReceived(@org.jetbrains.annotations.NotNull()
    org.webrtc.IceCandidate iceCandidate);
    
    public abstract void onCallEnded();
}