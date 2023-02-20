package com.massage.massenger.presentation.messaging.single_chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007\u001a\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u001a\b\u0010\u0010\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0007\u001a@\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001a8\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0007\u001a3\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b&\u0010\'\"\u0016\u0010\u0000\u001a\u00020\u0001\u00f8\u0001\u0000\u00a2\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006("}, d2 = {"droidGreen", "Landroidx/compose/ui/graphics/Color;", "getDroidGreen", "()J", "J", "IgChatBottomBar", "", "IgChatHeader", "onUpPressed", "Lkotlin/Function0;", "IgChatList", "modifier", "Landroidx/compose/ui/Modifier;", "chats", "", "Lcom/massage/massenger/presentation/messaging/single_chat/ChatMessage;", "IgChatPrev", "IgChatScreen", "IgSentMessage", "chat", "", "isPrevSent", "", "isNextSent", "isEmojiOnly", "isNextEmojiOnly", "isPrevEmojiOnly", "listHeight", "", "ReceivedMessage", "isPrevReceived", "isNextReceived", "getColorAtProgress", "progress", "start", "end", "evaluator", "Landroid/animation/ArgbEvaluator;", "getColorAtProgress-IbeAmgk", "(FJJLandroid/animation/ArgbEvaluator;)J", "app_debug"})
public final class IgChatScreenKt {
    private static final long droidGreen = 0L;
    
    public static final long getDroidGreen() {
        return 0L;
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void IgChatPrev() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IgChatScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpPressed) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IgChatHeader(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onUpPressed) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    public static final void IgChatBottomBar() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IgChatList(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.presentation.messaging.single_chat.ChatMessage> chats) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IgSentMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String chat, boolean isPrevSent, boolean isNextSent, boolean isEmojiOnly, boolean isNextEmojiOnly, boolean isPrevEmojiOnly, float listHeight) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ReceivedMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String chat, boolean isPrevReceived, boolean isNextReceived, boolean isEmojiOnly, boolean isNextEmojiOnly, boolean isPrevEmojiOnly) {
    }
}