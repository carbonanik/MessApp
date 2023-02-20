package com.massage.massenger.presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\u00020*2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J\u0014\u00104\u001a\u00020*2\n\u00105\u001a\u00060 j\u0002`!H\u0002J\u0018\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000209H\u0002R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\f\u0012\b\u0012\u00060 j\u0002`!0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lcom/massage/massenger/presentation/ui/DataChannelViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "messageRepository", "Lcom/massage/massenger/data/repository_impl/MessageRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "context", "Landroid/content/Context;", "(Lcom/massage/massenger/data/repository/AuthRepository;Lcom/massage/massenger/data/repository_impl/MessageRepository;Landroidx/lifecycle/SavedStateHandle;Landroid/content/Context;)V", "CHUNK_SIZE", "", "getCHUNK_SIZE", "()I", "TAG", "", "getTAG", "()Ljava/lang/String;", "currentIndexPointer", "firstRequest", "", "imageFileBytes", "", "incomingFileSize", "incomingImage", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getIncomingImage", "()Landroidx/lifecycle/MutableLiveData;", "incomingRtc", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$RTCMessage;", "Lcom/massage/massenger/common/RTCMessage;", "otherPerson", "Lcom/massage/massenger/model/User;", "receivingFile", "requestingOrAccepting", "rtcConnection", "Lcom/massage/massenger/unorganized/datachannel/RTConnection;", "thisPerson", "init", "", "readIncomingMessage", "Lkotlinx/coroutines/Job;", "buffer", "Ljava/nio/ByteBuffer;", "sendImage", "inputStream", "Ljava/io/InputStream;", "size", "", "sendRtcMessage", "message", "stringToByteBuffer", "msg", "charset", "Ljava/nio/charset/Charset;", "app_debug"})
public final class DataChannelViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    private final com.massage.massenger.data.repository_impl.MessageRepository messageRepository = null;
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "DataChannelViewModel";
    private final com.massage.massenger.model.User otherPerson = null;
    private com.massage.massenger.model.User thisPerson;
    private final java.lang.String requestingOrAccepting = null;
    private com.massage.massenger.unorganized.datachannel.RTConnection rtcConnection;
    private final kotlinx.coroutines.flow.SharedFlow<com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage> incomingRtc = null;
    private boolean firstRequest = true;
    private final int CHUNK_SIZE = 64000;
    private boolean receivingFile = false;
    private int incomingFileSize = 0;
    private byte[] imageFileBytes;
    private int currentIndexPointer = 0;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> incomingImage = null;
    
    @javax.inject.Inject()
    public DataChannelViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.MessageRepository messageRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void init() {
    }
    
    private final void sendRtcMessage(com.massage.massenger.data.remote.socket.events.SocketEvent.RTCMessage message) {
    }
    
    public final int getCHUNK_SIZE() {
        return 0;
    }
    
    public final void sendImage(@org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream, long size) {
    }
    
    private final java.nio.ByteBuffer stringToByteBuffer(java.lang.String msg, java.nio.charset.Charset charset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getIncomingImage() {
        return null;
    }
    
    private final kotlinx.coroutines.Job readIncomingMessage(java.nio.ByteBuffer buffer) {
        return null;
    }
}