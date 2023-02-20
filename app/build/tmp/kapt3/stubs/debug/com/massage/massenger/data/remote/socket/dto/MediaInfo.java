package com.massage.massenger.data.remote.socket.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/massage/massenger/data/remote/socket/dto/MediaInfo;", "", "()V", "Audio", "Image", "Pdf", "Video", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Image;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Video;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Audio;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Pdf;", "app_debug"})
public abstract class MediaInfo {
    
    private MediaInfo() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Image;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo;", "height", "", "width", "extension", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getExtension", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "app_debug"})
    public static final class Image extends com.massage.massenger.data.remote.socket.dto.MediaInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer height = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer width = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String extension = null;
        
        public Image(@org.jetbrains.annotations.Nullable()
        java.lang.Integer height, @org.jetbrains.annotations.Nullable()
        java.lang.Integer width, @org.jetbrains.annotations.NotNull()
        java.lang.String extension) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWidth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExtension() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Video;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo;", "height", "", "width", "extension", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getExtension", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWidth", "app_debug"})
    public static final class Video extends com.massage.massenger.data.remote.socket.dto.MediaInfo {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer height = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer width = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String extension = null;
        
        public Video(@org.jetbrains.annotations.Nullable()
        java.lang.Integer height, @org.jetbrains.annotations.Nullable()
        java.lang.Integer width, @org.jetbrains.annotations.NotNull()
        java.lang.String extension) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getHeight() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWidth() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExtension() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Audio;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo;", "duration", "", "extension", "", "(JLjava/lang/String;)V", "getDuration", "()J", "getExtension", "()Ljava/lang/String;", "app_debug"})
    public static final class Audio extends com.massage.massenger.data.remote.socket.dto.MediaInfo {
        private final long duration = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String extension = null;
        
        public Audio(long duration, @org.jetbrains.annotations.NotNull()
        java.lang.String extension) {
            super();
        }
        
        public final long getDuration() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getExtension() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/data/remote/socket/dto/MediaInfo$Pdf;", "Lcom/massage/massenger/data/remote/socket/dto/MediaInfo;", "pageCount", "", "(I)V", "getPageCount", "()I", "app_debug"})
    public static final class Pdf extends com.massage.massenger.data.remote.socket.dto.MediaInfo {
        private final int pageCount = 0;
        
        public Pdf(int pageCount) {
            super();
        }
        
        public final int getPageCount() {
            return 0;
        }
    }
}