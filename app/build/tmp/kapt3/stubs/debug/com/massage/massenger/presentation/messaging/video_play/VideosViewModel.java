package com.massage.massenger.presentation.messaging.video_play;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\b\u0010\u0011\u001a\u00020\rH\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/massage/massenger/presentation/messaging/video_play/VideosViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "currentlyPlayingIndex", "Landroidx/lifecycle/MutableLiveData;", "", "getCurrentlyPlayingIndex", "()Landroidx/lifecycle/MutableLiveData;", "videos", "", "Lcom/massage/massenger/presentation/messaging/video_play/VideoItem;", "getVideos", "onPlayVideoClick", "", "playbackPosition", "", "videoIndex", "populateListWithFakeData", "app_debug"})
public final class VideosViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.massage.massenger.presentation.messaging.video_play.VideoItem>> videos = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentlyPlayingIndex = null;
    
    @javax.inject.Inject()
    public VideosViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.massage.massenger.presentation.messaging.video_play.VideoItem>> getVideos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentlyPlayingIndex() {
        return null;
    }
    
    private final void populateListWithFakeData() {
    }
    
    public final void onPlayVideoClick(long playbackPosition, int videoIndex) {
    }
}