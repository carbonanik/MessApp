package com.massage.massenger.data.remote.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J<\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000b2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\t0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J`\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000b2#\b\u0002\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001b\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\t0\r2#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\t0\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/data/remote/firebase/FirebaseStorage;", "", "()V", "photosRef", "Lcom/google/firebase/storage/StorageReference;", "ref", "storage", "Lcom/google/firebase/storage/FirebaseStorage;", "getDownloadUrl", "", "link", "", "onSuccess", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImage", "path", "onSaved", "Ljava/io/File;", "localFile", "uploadPhoto", "extension", "onProgress", "", "progress", "app_debug"})
public final class FirebaseStorage {
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.data.remote.firebase.FirebaseStorage INSTANCE = null;
    private static final com.google.firebase.storage.FirebaseStorage storage = null;
    private static final com.google.firebase.storage.StorageReference ref = null;
    private static final com.google.firebase.storage.StorageReference photosRef = null;
    
    private FirebaseStorage() {
        super();
    }
    
    public final void uploadPhoto(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    java.lang.String extension, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> onProgress, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getImage(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.io.File, kotlin.Unit> onSaved, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDownloadUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> onSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}