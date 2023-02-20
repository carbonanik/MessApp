package com.massage.massenger.presentation.messaging.video_play;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u001a3\u0010\n\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\fH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"VideoCard", "", "videoItem", "Lcom/massage/massenger/presentation/messaging/video_play/VideoItem;", "isPlaying", "", "exoPlayer", "Lcom/google/android/exoplayer2/ExoPlayer;", "onClick", "Lkotlin/Function0;", "VideoPlayer", "onControllerVisibilityChanged", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "uiVisible", "VideoThumbnail", "url", "", "app_debug"})
public final class VideoPlayerKt {
    
    @androidx.compose.runtime.Composable()
    public static final void VideoCard(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.video_play.VideoItem videoItem, boolean isPlaying, @org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer exoPlayer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VideoPlayer(@org.jetbrains.annotations.NotNull()
    com.google.android.exoplayer2.ExoPlayer exoPlayer, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onControllerVisibilityChanged) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VideoThumbnail(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
}