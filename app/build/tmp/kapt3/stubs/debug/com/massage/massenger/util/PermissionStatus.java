package com.massage.massenger.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/util/PermissionStatus;", "", "()V", "PermissionDenied", "PermissionGranted", "Lcom/massage/massenger/util/PermissionStatus$PermissionGranted;", "Lcom/massage/massenger/util/PermissionStatus$PermissionDenied;", "app_debug"})
public abstract class PermissionStatus {
    
    private PermissionStatus() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/massage/massenger/util/PermissionStatus$PermissionGranted;", "Lcom/massage/massenger/util/PermissionStatus;", "()V", "app_debug"})
    public static final class PermissionGranted extends com.massage.massenger.util.PermissionStatus {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.util.PermissionStatus.PermissionGranted INSTANCE = null;
        
        private PermissionGranted() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/massage/massenger/util/PermissionStatus$PermissionDenied;", "Lcom/massage/massenger/util/PermissionStatus;", "deniedPermission", "", "", "(Ljava/util/List;)V", "getDeniedPermission", "()Ljava/util/List;", "app_debug"})
    public static final class PermissionDenied extends com.massage.massenger.util.PermissionStatus {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> deniedPermission = null;
        
        public PermissionDenied(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> deniedPermission) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getDeniedPermission() {
            return null;
        }
    }
}