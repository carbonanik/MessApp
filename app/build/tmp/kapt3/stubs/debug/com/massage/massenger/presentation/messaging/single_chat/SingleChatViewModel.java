package com.massage.massenger.presentation.messaging.single_chat;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJJ\u0010\u0018\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u001b\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J%\u0010\'\u001a\u00020$2\b\u0010(\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0-J\u0011\u00100\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u001b\u00102\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J%\u00104\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001a\u00106\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010(\u001a\u0004\u0018\u00010\u001cJ\u001c\u00107\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010(\u001a\u0004\u0018\u00010\u001cH\u0002J!\u00108\u001a\u0004\u0018\u00010$2\b\u00109\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u00a2\u0006\u0002\u0010:J5\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=2#\u0010>\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010=\u00a2\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020$0?H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "messageRepository", "Lcom/massage/massenger/data/repository_impl/MessageRepository;", "chatRepository", "Lcom/massage/massenger/data/repository_impl/ChatRepositoryImpl;", "groupRepository", "Lcom/massage/massenger/data/repository_impl/GroupRepository;", "userRepository", "Lcom/massage/massenger/data/repository_impl/UserRepository;", "externalStorageImageProvider", "Lcom/massage/massenger/data/local/content/ExternalStorageImageProvider;", "(Lcom/massage/massenger/data/repository/AuthRepository;Lcom/massage/massenger/data/repository_impl/MessageRepository;Lcom/massage/massenger/data/repository_impl/ChatRepositoryImpl;Lcom/massage/massenger/data/repository_impl/GroupRepository;Lcom/massage/massenger/data/repository_impl/UserRepository;Lcom/massage/massenger/data/local/content/ExternalStorageImageProvider;)V", "<set-?>", "Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatDataState;", "dataState", "getDataState", "()Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatDataState;", "setDataState", "(Lcom/massage/massenger/presentation/messaging/single_chat/SingleChatDataState;)V", "dataState$delegate", "Landroidx/compose/runtime/MutableState;", "createTextMessage", "Lcom/massage/massenger/data/remote/socket/events/SocketEvent$TextMessage;", "Lcom/massage/massenger/common/TextMessage;", "me", "Lcom/massage/massenger/model/User;", "image", "", "messageText", "receiverUser", "receiverGroup", "Lcom/massage/massenger/model/Group;", "getAllMessageWithChat", "", "chatId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentChat", "user", "chat", "Lcom/massage/massenger/model/Chat;", "(Lcom/massage/massenger/model/User;Lcom/massage/massenger/model/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getImages", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/massage/massenger/model/SharedStoragePhoto;", "getLoggedInUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceiverGroup", "(Lcom/massage/massenger/model/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceiverUser", "(Lcom/massage/massenger/model/Chat;Lcom/massage/massenger/model/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSingleChatDataState", "initAllData", "sendTextMessage", "text", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Unit;", "uploadPhoto", "contentUri", "Landroid/net/Uri;", "complete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "uri", "app_debug"})
public final class SingleChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    private final com.massage.massenger.data.repository_impl.MessageRepository messageRepository = null;
    private final com.massage.massenger.data.repository_impl.ChatRepositoryImpl chatRepository = null;
    private final com.massage.massenger.data.repository_impl.GroupRepository groupRepository = null;
    private final com.massage.massenger.data.repository_impl.UserRepository userRepository = null;
    private final com.massage.massenger.data.local.content.ExternalStorageImageProvider externalStorageImageProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState dataState$delegate = null;
    
    @javax.inject.Inject()
    public SingleChatViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.MessageRepository messageRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.ChatRepositoryImpl chatRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.GroupRepository groupRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.content.ExternalStorageImageProvider externalStorageImageProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.single_chat.SingleChatDataState getDataState() {
        return null;
    }
    
    private final void setDataState(com.massage.massenger.presentation.messaging.single_chat.SingleChatDataState p0) {
    }
    
    public final void getSingleChatDataState(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.Chat chat, @org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User user) {
    }
    
    private final void initAllData(com.massage.massenger.model.Chat chat, com.massage.massenger.model.User user) {
    }
    
    private final java.lang.Object getAllMessageWithChat(java.lang.String chatId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getLoggedInUser(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getReceiverUser(com.massage.massenger.model.Chat chat, com.massage.massenger.model.User user, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getReceiverGroup(com.massage.massenger.model.Chat chat, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object getCurrentChat(com.massage.massenger.model.User user, com.massage.massenger.model.Chat chat, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit sendTextMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    java.lang.String image) {
        return null;
    }
    
    private final void uploadPhoto(android.net.Uri contentUri, kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> complete) {
    }
    
    private final com.massage.massenger.data.remote.socket.events.SocketEvent.TextMessage createTextMessage(com.massage.massenger.model.User me, java.lang.String image, java.lang.String messageText, com.massage.massenger.model.User receiverUser, com.massage.massenger.model.Group receiverGroup) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.SharedStoragePhoto>> getImages() {
        return null;
    }
}