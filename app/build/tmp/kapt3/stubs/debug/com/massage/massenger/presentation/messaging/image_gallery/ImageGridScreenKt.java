package com.massage.massenger.presentation.messaging.image_gallery;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"ImageGridContent", "", "photos", "", "Lcom/massage/massenger/model/SharedStoragePhoto;", "onImageClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "photo", "ImageGridScreen", "viewModel", "Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatViewModel;", "navController", "Landroidx/navigation/NavHostController;", "app_debug"})
public final class ImageGridScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    public static final void ImageGridScreen(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavHostController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void ImageGridContent(@org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.SharedStoragePhoto> photos, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.SharedStoragePhoto, kotlin.Unit> onImageClick) {
    }
}