package com.massage.massenger.data.remote.api_service.group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/massage/massenger/data/remote/api_service/group/GroupApiService;", "", "addMemberToGroup", "Lcom/massage/massenger/model/Group;", "addMemberToGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/AddMemberToGroupRequest;", "token", "", "(Lcom/massage/massenger/data/remote/api_service/group/dto/AddMemberToGroupRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createGroup", "createGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/CreateGroupRequest;", "(Lcom/massage/massenger/data/remote/api_service/group/dto/CreateGroupRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGroupForUser", "", "userId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GroupApiService {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest createGroupRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.Group> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addMemberToGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest addMemberToGroupRequest, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.Group> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllGroupForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.massage.massenger.model.Group>> continuation);
}