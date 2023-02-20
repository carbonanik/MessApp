package com.massage.massenger.presentation.messaging.create_group;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001c0\u001bJ\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/massage/massenger/presentation/messaging/create_group/CreateGroupViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/massage/massenger/data/repository_impl/UserRepository;", "groupRepository", "Lcom/massage/massenger/data/repository_impl/GroupRepository;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "(Lcom/massage/massenger/data/repository_impl/UserRepository;Lcom/massage/massenger/data/repository_impl/GroupRepository;Lcom/massage/massenger/data/repository/AuthRepository;)V", "<set-?>", "Lcom/massage/massenger/presentation/messaging/create_group/DataState;", "Lcom/massage/massenger/model/Group;", "createGroupResponse", "getCreateGroupResponse", "()Lcom/massage/massenger/presentation/messaging/create_group/DataState;", "setCreateGroupResponse", "(Lcom/massage/massenger/presentation/messaging/create_group/DataState;)V", "createGroupResponse$delegate", "Landroidx/compose/runtime/MutableState;", "selectedPersons", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/massage/massenger/model/User;", "getSelectedPersons", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "createGroup", "", "getConnections", "Lkotlinx/coroutines/flow/Flow;", "", "groupName", "", "app_debug"})
public final class CreateGroupViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository_impl.UserRepository userRepository = null;
    private final com.massage.massenger.data.repository_impl.GroupRepository groupRepository = null;
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState createGroupResponse$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.User> selectedPersons = null;
    
    @javax.inject.Inject()
    public CreateGroupViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.GroupRepository groupRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.create_group.DataState<com.massage.massenger.model.Group> getCreateGroupResponse() {
        return null;
    }
    
    public final void setCreateGroupResponse(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.create_group.DataState<com.massage.massenger.model.Group> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.User> getSelectedPersons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.massage.massenger.model.User>> getConnections() {
        return null;
    }
    
    public final void createGroup() {
    }
    
    private final java.lang.String groupName() {
        return null;
    }
}