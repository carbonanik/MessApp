package com.massage.massenger.presentation.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/massage/massenger/presentation/ui/MessagingActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "appStartingStateDataRepository", "Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;", "(Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "<set-?>", "", "startDestination", "getStartDestination", "()Ljava/lang/String;", "setStartDestination", "(Ljava/lang/String;)V", "startDestination$delegate", "Landroidx/compose/runtime/MutableState;", "getAppStartingState", "", "app_debug"})
public final class MessagingActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository.AppStartingStateDataRepository appStartingStateDataRepository = null;
    private boolean isLoading = true;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState startDestination$delegate = null;
    
    @javax.inject.Inject()
    public MessagingActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AppStartingStateDataRepository appStartingStateDataRepository) {
        super();
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartDestination() {
        return null;
    }
    
    public final void setStartDestination(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void getAppStartingState() {
    }
}