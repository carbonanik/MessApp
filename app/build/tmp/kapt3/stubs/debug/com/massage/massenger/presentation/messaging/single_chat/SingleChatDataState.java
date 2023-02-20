package com.massage.massenger.presentation.messaging.single_chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JI\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006#"}, d2 = {"Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatDataState;", "", "loggedInUser", "Lcom/massage/massenger/model/User;", "currentChat", "Lcom/massage/massenger/model/Chat;", "receiverUser", "receivingGroup", "Lcom/massage/massenger/model/Group;", "messageList", "", "Lcom/massage/massenger/model/ChatMessage;", "(Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Chat;Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Group;Ljava/util/List;)V", "getCurrentChat", "()Lcom/massage/massenger/model/Chat;", "getLoggedInUser", "()Lcom/massage/massenger/model/User;", "getMessageList", "()Ljava/util/List;", "getReceiverUser", "getReceivingGroup", "()Lcom/massage/massenger/model/Group;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class SingleChatDataState {
    @org.jetbrains.annotations.Nullable()
    private final com.massage.massenger.model.User loggedInUser = null;
    @org.jetbrains.annotations.Nullable()
    private final com.massage.massenger.model.Chat currentChat = null;
    @org.jetbrains.annotations.Nullable()
    private final com.massage.massenger.model.User receiverUser = null;
    @org.jetbrains.annotations.Nullable()
    private final com.massage.massenger.model.Group receivingGroup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.massage.massenger.model.ChatMessage> messageList = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.single_chat.SingleChatDataState copy(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User loggedInUser, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Chat currentChat, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User receiverUser, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Group receivingGroup, @org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.ChatMessage> messageList) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public SingleChatDataState() {
        super();
    }
    
    public SingleChatDataState(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User loggedInUser, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Chat currentChat, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User receiverUser, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Group receivingGroup, @org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.ChatMessage> messageList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User getLoggedInUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Chat component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Chat getCurrentChat() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.User getReceiverUser() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Group component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.model.Group getReceivingGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.massage.massenger.model.ChatMessage> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.massage.massenger.model.ChatMessage> getMessageList() {
        return null;
    }
}