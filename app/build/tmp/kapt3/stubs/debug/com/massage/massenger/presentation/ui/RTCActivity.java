package com.massage.massenger.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001dH\u0002J\b\u0010!\u001a\u00020\u001dH\u0002J\u0012\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J-\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'2\u000e\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040)2\u0006\u0010*\u001a\u00020+H\u0016\u00a2\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u001dH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00061"}, d2 = {"Lcom/massage/massenger/presentation/ui/RTCActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "audioManager", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager;", "getAudioManager", "()Lcom/massage/massenger/unorganized/rtc/RTCAudioManager;", "audioManager$delegate", "Lkotlin/Lazy;", "binding", "Lcom/massage/massenger/databinding/ActivityRtcBinding;", "inSpeakerMode", "", "isMute", "isVideoPaused", "rtcClient", "Lcom/massage/massenger/unorganized/rtc/RTCClient;", "sdpObserver", "Lcom/massage/massenger/unorganized/rtc/AppSdpObserver;", "viewModel", "Lcom/massage/massenger/unorganized/RTCViewModel;", "getViewModel", "()Lcom/massage/massenger/unorganized/RTCViewModel;", "viewModel$delegate", "checkCameraAndAudioPermission", "", "createSignallingClientListener", "Lcom/massage/massenger/unorganized/rtc/SignalingClientListener;", "onCameraAndAudioPermissionGranted", "onCameraPermissionDenied", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestCameraAndAudioPermission", "dialogShown", "showPermissionRationaleDialog", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RTCActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.massage.massenger.databinding.ActivityRtcBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.presentation.ui.RTCActivity.Companion Companion = null;
    private static final int CAMERA_AUDIO_PERMISSION_REQUEST_CODE = 1;
    private static final java.lang.String CAMERA_PERMISSION = "android.permission.CAMERA";
    private static final java.lang.String AUDIO_PERMISSION = "android.permission.RECORD_AUDIO";
    private com.massage.massenger.unorganized.rtc.RTCClient rtcClient;
    private final kotlin.Lazy audioManager$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "MainActivity";
    private boolean isMute = false;
    private boolean isVideoPaused = false;
    private boolean inSpeakerMode = true;
    private final com.massage.massenger.unorganized.rtc.AppSdpObserver sdpObserver = null;
    
    public RTCActivity() {
        super();
    }
    
    private final com.massage.massenger.unorganized.RTCViewModel getViewModel() {
        return null;
    }
    
    private final com.massage.massenger.unorganized.rtc.RTCAudioManager getAudioManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkCameraAndAudioPermission() {
    }
    
    private final void onCameraAndAudioPermissionGranted() {
    }
    
    private final com.massage.massenger.unorganized.rtc.SignalingClientListener createSignallingClientListener() {
        return null;
    }
    
    private final void requestCameraAndAudioPermission(boolean dialogShown) {
    }
    
    private final void showPermissionRationaleDialog() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void onCameraPermissionDenied() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/massage/massenger/presentation/ui/RTCActivity$Companion;", "", "()V", "AUDIO_PERMISSION", "", "CAMERA_AUDIO_PERMISSION_REQUEST_CODE", "", "CAMERA_PERMISSION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}