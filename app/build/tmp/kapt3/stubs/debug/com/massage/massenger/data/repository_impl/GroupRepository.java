package com.massage.massenger.data.repository_impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\r0\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/data/repository_impl/GroupRepository;", "", "userDataSource", "Lcom/massage/massenger/data/local/pref/UserDataSource;", "groupApiService", "Lcom/massage/massenger/data/remote/api_service/group/GroupApiService;", "chatDao", "Lcom/massage/massenger/data/local/room/dao/ChatDao;", "groupDao", "Lcom/massage/massenger/data/local/room/dao/GroupDao;", "(Lcom/massage/massenger/data/local/pref/UserDataSource;Lcom/massage/massenger/data/remote/api_service/group/GroupApiService;Lcom/massage/massenger/data/local/room/dao/ChatDao;Lcom/massage/massenger/data/local/room/dao/GroupDao;)V", "addUserToGroup", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/common/NetworkState;", "Lcom/massage/massenger/model/Group;", "addMemberToGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/AddMemberToGroupRequest;", "createGroup", "createGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/CreateGroupRequest;", "getAllGroupForUser", "", "userId", "", "getCachedGroupById", "groupId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton()
public final class GroupRepository {
    private final com.massage.massenger.data.local.pref.UserDataSource userDataSource = null;
    private final com.massage.massenger.data.remote.api_service.group.GroupApiService groupApiService = null;
    private final com.massage.massenger.data.local.room.dao.ChatDao chatDao = null;
    private final com.massage.massenger.data.local.room.dao.GroupDao groupDao = null;
    
    @javax.inject.Inject()
    public GroupRepository(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.pref.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.GroupApiService groupApiService, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.ChatDao chatDao, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.room.dao.GroupDao groupDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Group>> createGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest createGroupRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Group>> addUserToGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest addMemberToGroupRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<java.util.List<com.massage.massenger.model.Group>>> getAllGroupForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCachedGroupById(@org.jetbrains.annotations.Nullable()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.Group> continuation) {
        return null;
    }
    
    private final java.lang.Object token(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}