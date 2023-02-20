package com.massage.massenger.presentation.messaging.image_view;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/massage/massenger/presentation/messaging/image_view/ImageViewViewModel;", "Landroidx/lifecycle/ViewModel;", "externalStorageImageProvider", "Lcom/massage/massenger/data/local/content/ExternalStorageImageProvider;", "(Lcom/massage/massenger/data/local/content/ExternalStorageImageProvider;)V", "savePhotoToExternalStorage", "", "bitmap", "Landroid/graphics/Bitmap;", "name", "", "app_debug"})
public final class ImageViewViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.local.content.ExternalStorageImageProvider externalStorageImageProvider = null;
    
    @javax.inject.Inject()
    public ImageViewViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.content.ExternalStorageImageProvider externalStorageImageProvider) {
        super();
    }
    
    public final void savePhotoToExternalStorage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
}