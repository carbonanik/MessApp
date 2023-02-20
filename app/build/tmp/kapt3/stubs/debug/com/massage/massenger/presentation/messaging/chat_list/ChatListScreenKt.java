package com.massage.massenger.presentation.messaging.chat_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001aG\u0010\r\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0014\u00a8\u0006\u0015"}, d2 = {"ChatListItem", "", "chat", "Lcom/massage/massenger/model/Chat;", "onItemChatClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "ChatListScreen", "viewModel", "Lcom/massage/massenger/presentation/ui/TabScreensViewModel;", "chatNavController", "Landroidx/navigation/NavController;", "ChatListScreenContent", "chats", "", "createGroup", "Lkotlin/Function0;", "isScrolledToTheEnd", "", "Landroidx/compose/foundation/lazy/LazyListState;", "app_debug"})
public final class ChatListScreenKt {
    
    @androidx.compose.runtime.Composable()
    public static final void ChatListScreen(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.ui.TabScreensViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController chatNavController) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ChatListScreenContent(@org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.Chat> chats, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> createGroup, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.Chat, kotlin.Unit> onItemChatClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ChatListItem(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.Chat chat, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.Chat, kotlin.Unit> onItemChatClick) {
    }
    
    public static final boolean isScrolledToTheEnd(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.lazy.LazyListState $this$isScrolledToTheEnd) {
        return false;
    }
}