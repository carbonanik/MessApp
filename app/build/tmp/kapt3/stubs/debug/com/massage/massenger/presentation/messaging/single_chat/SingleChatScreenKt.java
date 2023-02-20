package com.massage.massenger.presentation.messaging.single_chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\r\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a0\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u00a8\u0006\u0018"}, d2 = {"SingleChatContent", "", "viewState", "Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatDataState;", "onImageSend", "Lkotlin/Function0;", "onMessageSent", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "text", "onImageClick", "Lcom/massage/massenger/model/ChatMessage;", "message", "SingleChatScreen", "viewModel", "Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatViewModel;", "navController", "Landroidx/navigation/NavController;", "chat", "Lcom/massage/massenger/model/Chat;", "user", "Lcom/massage/massenger/model/User;", "app_debug"})
public final class SingleChatScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void SingleChatScreen(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Chat chat, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User user) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SingleChatContent(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.single_chat.SingleChatDataState viewState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onImageSend, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onMessageSent, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.ChatMessage, kotlin.Unit> onImageClick) {
    }
}