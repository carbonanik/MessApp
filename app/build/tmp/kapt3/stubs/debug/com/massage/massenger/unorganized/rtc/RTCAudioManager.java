package com.massage.massenger.unorganized.rtc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 62\u00020\u0001:\u000534567B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001fJ\b\u0010 \u001a\u0004\u0018\u00010\nJ\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0003J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0002J\u000e\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\nJ\u0012\u0010)\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010*\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010\nJ\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0013H\u0002J\u0010\u0010.\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0013H\u0002J\u0010\u0010/\u001a\u00020#2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u00100\u001a\u00020#J\u0010\u00101\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001dH\u0002J\u0006\u00102\u001a\u00020#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u001a8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "amState", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioManagerState;", "apprtcContext", "audioDevices", "", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioDevice;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioManager", "Landroid/media/AudioManager;", "audioManagerEvents", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioManagerEvents;", "defaultAudioDevice", "hasWiredHeadset", "", "savedAudioMode", "", "savedIsMicrophoneMute", "savedIsSpeakerPhoneOn", "selectedAudioDevice", "useSpeakerphone", "", "userSelectedAudioDevice", "wiredHeadsetReceiver", "Landroid/content/BroadcastReceiver;", "getAudioDevices", "", "getSelectedAudioDevice", "hasEarpiece", "registerReceiver", "", "receiver", "filter", "Landroid/content/IntentFilter;", "selectAudioDevice", "device", "setAudioDeviceInternal", "setDefaultAudioDevice", "defaultDevice", "setMicrophoneMute", "on", "setSpeakerphoneOn", "start", "stop", "unregisterReceiver", "updateAudioDeviceState", "AudioDevice", "AudioManagerEvents", "AudioManagerState", "Companion", "WiredHeadsetReceiver", "app_debug"})
public final class RTCAudioManager {
    private final android.content.Context apprtcContext = null;
    @androidx.annotation.Nullable()
    private final android.media.AudioManager audioManager = null;
    @androidx.annotation.Nullable()
    private com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioManagerEvents audioManagerEvents;
    private com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioManagerState amState;
    private int savedAudioMode = android.media.AudioManager.MODE_NORMAL;
    private boolean savedIsSpeakerPhoneOn = false;
    private boolean savedIsMicrophoneMute = false;
    private boolean hasWiredHeadset = false;
    private com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice defaultAudioDevice;
    private com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice selectedAudioDevice;
    private com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice userSelectedAudioDevice;
    @androidx.annotation.Nullable()
    private final java.lang.String useSpeakerphone = null;
    private java.util.Set<com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice> audioDevices;
    private final android.content.BroadcastReceiver wiredHeadsetReceiver = null;
    @androidx.annotation.Nullable()
    private android.media.AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.unorganized.rtc.RTCAudioManager.Companion Companion = null;
    private static final java.lang.String TAG = "AppRTCAudioManager";
    private static final java.lang.String SPEAKERPHONE_AUTO = "auto";
    private static final java.lang.String SPEAKERPHONE_TRUE = "true";
    private static final java.lang.String SPEAKERPHONE_FALSE = "false";
    
    public RTCAudioManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void start(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioManagerEvents audioManagerEvents) {
    }
    
    public final void stop() {
    }
    
    /**
     * Changes selection of the currently active audio device.
     */
    private final void setAudioDeviceInternal(com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice device) {
    }
    
    /**
     * Changes default audio device.
     */
    public final void setDefaultAudioDevice(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice defaultDevice) {
    }
    
    /**
     * Changes selection of the currently active audio device.
     */
    public final void selectAudioDevice(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice device) {
    }
    
    /**
     * Returns current set of available/selectable audio devices.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice> getAudioDevices() {
        return null;
    }
    
    /**
     * Returns the currently selected audio device.
     */
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice getSelectedAudioDevice() {
        return null;
    }
    
    /**
     * Helper method for receiver registration.
     */
    private final void registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter) {
    }
    
    /**
     * Helper method for unregistration of an existing receiver.
     */
    private final void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    }
    
    /**
     * Sets the speaker phone mode.
     */
    private final void setSpeakerphoneOn(boolean on) {
    }
    
    /**
     * Sets the microphone mute state.
     */
    private final void setMicrophoneMute(boolean on) {
    }
    
    /**
     * Gets the current earpiece state.
     */
    private final boolean hasEarpiece() {
        return false;
    }
    
    /**
     * Checks whether a wired headset is connected or not.
     * This is not a valid indication that audio playback is actually over
     * the wired headset as audio routing depends on other conditions. We
     * only use it as an early indicator (during initialization) of an attached
     * wired headset.
     */
    @java.lang.Deprecated()
    private final boolean hasWiredHeadset() {
        return false;
    }
    
    /**
     * Updates list of possible audio devices and make new device selection.
     */
    public final void updateAudioDeviceState() {
    }
    
    /**
     * AudioDevice is the names of possible audio devices that we currently
     * support.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioDevice;", "", "(Ljava/lang/String;I)V", "SPEAKER_PHONE", "WIRED_HEADSET", "EARPIECE", "NONE", "app_debug"})
    public static enum AudioDevice {
        /*public static final*/ SPEAKER_PHONE /* = new SPEAKER_PHONE() */,
        /*public static final*/ WIRED_HEADSET /* = new WIRED_HEADSET() */,
        /*public static final*/ EARPIECE /* = new EARPIECE() */,
        /*public static final*/ NONE /* = new NONE() */;
        
        AudioDevice() {
        }
    }
    
    /**
     * AudioManager state.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioManagerState;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "PREINITIALIZED", "RUNNING", "app_debug"})
    public static enum AudioManagerState {
        /*public static final*/ UNINITIALIZED /* = new UNINITIALIZED() */,
        /*public static final*/ PREINITIALIZED /* = new PREINITIALIZED() */,
        /*public static final*/ RUNNING /* = new RUNNING() */;
        
        AudioManagerState() {
        }
    }
    
    /**
     * Selected audio device change event.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioManagerEvents;", "", "onAudioDeviceChanged", "", "selectedAudioDevice", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$AudioDevice;", "availableAudioDevices", "", "app_debug"})
    public static abstract interface AudioManagerEvents {
        
        public abstract void onAudioDeviceChanged(@org.jetbrains.annotations.Nullable()
        com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice selectedAudioDevice, @org.jetbrains.annotations.Nullable()
        java.util.Set<? extends com.massage.massenger.unorganized.rtc.RTCAudioManager.AudioDevice> availableAudioDevices);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$WiredHeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/massage/massenger/unorganized/rtc/RTCAudioManager;)V", "HAS_MIC", "", "HAS_NO_MIC", "STATE_PLUGGED", "STATE_UNPLUGGED", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
    final class WiredHeadsetReceiver extends android.content.BroadcastReceiver {
        private final int STATE_UNPLUGGED = 0;
        private final int STATE_PLUGGED = 1;
        private final int HAS_NO_MIC = 0;
        private final int HAS_MIC = 1;
        
        public WiredHeadsetReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/massage/massenger/unorganized/rtc/RTCAudioManager$Companion;", "", "()V", "SPEAKERPHONE_AUTO", "", "SPEAKERPHONE_FALSE", "SPEAKERPHONE_TRUE", "TAG", "create", "Lcom/massage/massenger/unorganized/rtc/RTCAudioManager;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Construction.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.unorganized.rtc.RTCAudioManager create(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}