package com.massage.massenger.presentation.messaging.single_chat.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u001a\b\u0010\u0014\u001a\u00020\u0001H\u0007\u001a\u001a\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u00a8\u0006\u001a"}, d2 = {"Message", "", "onAuthorClick", "Lkotlin/Function1;", "Lcom/massage/massenger/model/User;", "message", "Lcom/massage/massenger/model/ChatMessage;", "isUserMe", "", "firstOfAuthor", "lastOfAuthor", "firstOfDay", "lastOfDay", "onImageClick", "Lkotlin/ParameterName;", "name", "listHeight", "", "modifier", "Landroidx/compose/ui/Modifier;", "MessagePreview", "fakeMessage", "txt", "", "status", "Lcom/massage/massenger/util/state/MessageStatus;", "app_debug"})
public final class MessageKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final com.massage.massenger.model.ChatMessage fakeMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String txt, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.util.state.MessageStatus status) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void MessagePreview() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Message(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.User, kotlin.Unit> onAuthorClick, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.ChatMessage message, boolean isUserMe, boolean firstOfAuthor, boolean lastOfAuthor, boolean firstOfDay, boolean lastOfDay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.ChatMessage, kotlin.Unit> onImageClick, float listHeight, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}