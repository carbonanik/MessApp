package com.massage.massenger.presentation.messaging.create_group;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007\u001a\b\u0010\u0015\u001a\u00020\u0001H\u0007\u001a3\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00110\u0019\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001a\u0012\u0010\u001b\u001a\u00020\u00012\b\u0010\u0017\u001a\u0004\u0018\u00010\bH\u0007\u00a8\u0006\u001c"}, d2 = {"CreateGroupScreen", "", "viewModel", "Lcom/massage/massenger/presentation/messaging/create_group/CreateGroupViewModel;", "navController", "Landroidx/navigation/NavController;", "users", "", "Lcom/massage/massenger/model/User;", "selectedUsers", "userSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "user", "userRemoved", "createGroup", "Lkotlin/Function0;", "createGroupResponse", "Lcom/massage/massenger/presentation/messaging/create_group/DataState;", "Lcom/massage/massenger/model/Group;", "CreateGroupScreenPrev", "SelectablePerson", "person", "onSelect", "", "selected", "SelectedPerson", "app_debug"})
public final class CreateGroupKt {
    
    @androidx.compose.runtime.Composable()
    public static final void CreateGroupScreen(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CreateGroupScreen(@org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.User> users, @org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.User> selectedUsers, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.User, kotlin.Unit> userSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.User, kotlin.Unit> userRemoved, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> createGroup, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.create_group.DataState<com.massage.massenger.model.Group> createGroupResponse) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SelectedPerson(@org.jetbrains.annotations.Nullable()
    com.massage.massenger.model.User person) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SelectablePerson(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.User person, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSelect) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview()
    public static final void CreateGroupScreenPrev() {
    }
}