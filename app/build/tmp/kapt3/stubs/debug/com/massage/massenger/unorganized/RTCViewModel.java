package com.massage.massenger.unorganized;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u00020\u00162\n\u0010\u001e\u001a\u00060\u000fj\u0002`\u0010R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\b\u0012\u00060\u000fj\u0002`\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/massage/massenger/unorganized/RTCViewModel;", "Landroidx/lifecycle/ViewModel;", "messageRepository", "Lcom/massage/massenger/data/repository_impl/MessageRepository;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/massage/massenger/data/repository_impl/MessageRepository;Lcom/massage/massenger/data/repository/AuthRepository;Landroidx/lifecycle/SavedStateHandle;)V", "SDPtype", "", "firstRequest", "", "incomingRtc", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "otherPerson", "Lcom/massage/massenger/model/User;", "requestingOrAccepting", "thisPerson", "init", "", "listener", "Lcom/massage/massenger/unorganized/rtc/SignalingClientListener;", "sendIceCandidate", "candidate", "Lorg/webrtc/IceCandidate;", "(Lorg/webrtc/IceCandidate;)Lkotlin/Unit;", "sendRtcMessage", "message", "app_debug"})
public final class RTCViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository_impl.MessageRepository messageRepository = null;
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.massage.massenger.model.User otherPerson = null;
    private com.massage.massenger.model.User thisPerson;
    private final java.lang.String requestingOrAccepting = null;
    private final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> incomingRtc = null;
    private java.lang.String SDPtype;
    private boolean firstRequest = true;
    
    @javax.inject.Inject()
    public RTCViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.MessageRepository messageRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    public final void sendRtcMessage(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage message) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.unorganized.rtc.SignalingClientListener listener) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit sendIceCandidate(@org.jetbrains.annotations.Nullable()
    org.webrtc.IceCandidate candidate) {
        return null;
    }
}