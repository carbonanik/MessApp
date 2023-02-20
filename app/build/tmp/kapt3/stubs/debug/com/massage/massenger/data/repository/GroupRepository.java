package com.massage.massenger.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0011\u0010\f\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/massage/massenger/data/repository/GroupRepository;", "", "addUserToGroup", "Lkotlinx/coroutines/flow/Flow;", "Lcom/massage/massenger/common/NetworkState;", "Lcom/massage/massenger/model/Group;", "addMemberToGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/AddMemberToGroupRequest;", "createGroup", "createGroupRequest", "Lcom/massage/massenger/data/remote/api_service/group/dto/CreateGroupRequest;", "getAllGroupFor", "getGroupByIdLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface GroupRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Group>> createGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.CreateGroupRequest createGroupRequest);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Group>> addUserToGroup(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.remote.api_service.group.dto.AddMemberToGroupRequest addMemberToGroupRequest);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<com.massage.massenger.common.NetworkState<com.massage.massenger.model.Group>> getAllGroupFor();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGroupByIdLocal(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.massage.massenger.model.Group> continuation);
}