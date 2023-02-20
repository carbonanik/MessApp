package com.massage.massenger.presentation.messaging.contact_list;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/massage/massenger/data/repository_impl/UserRepository;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "(Lcom/massage/massenger/data/repository_impl/UserRepository;Lcom/massage/massenger/data/repository/AuthRepository;)V", "<set-?>", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenDataState;", "dataState", "getDataState", "()Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenDataState;", "setDataState", "(Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenDataState;)V", "dataState$delegate", "Landroidx/compose/runtime/MutableState;", "", "navigateBackToLoginScreen", "getNavigateBackToLoginScreen", "()Z", "setNavigateBackToLoginScreen", "(Z)V", "navigateBackToLoginScreen$delegate", "loadData", "", "logout", "updatePermissionText", "contactPermission", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactPermission;", "app_debug"})
public final class ContactScreenViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository_impl.UserRepository userRepository = null;
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState dataState$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState navigateBackToLoginScreen$delegate = null;
    
    @javax.inject.Inject()
    public ContactScreenViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository_impl.UserRepository userRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.contact_list.ContactScreenDataState getDataState() {
        return null;
    }
    
    public final void setDataState(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactScreenDataState p0) {
    }
    
    public final boolean getNavigateBackToLoginScreen() {
        return false;
    }
    
    public final void setNavigateBackToLoginScreen(boolean p0) {
    }
    
    public final void loadData() {
    }
    
    public final void updatePermissionText(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactPermission contactPermission) {
    }
    
    private final void logout() {
    }
}