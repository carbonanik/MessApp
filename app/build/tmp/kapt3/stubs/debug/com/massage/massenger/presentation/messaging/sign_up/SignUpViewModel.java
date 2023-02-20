package com.massage.massenger.presentation.messaging.sign_up;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020(J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\u0006\u0010,\u001a\u00020!R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\rR+\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00198F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006-"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "authRepository", "Lcom/massage/massenger/data/repository/AuthRepository;", "countriesRepository", "Lcom/massage/massenger/data/local/assets/CountryCodeRepository;", "appStartingStateDataRepository", "Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;", "(Lcom/massage/massenger/data/repository/AuthRepository;Lcom/massage/massenger/data/local/assets/CountryCodeRepository;Lcom/massage/massenger/data/repository/AppStartingStateDataRepository;)V", "countries", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/massage/massenger/model/Country;", "getCountries", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "Lcom/massage/massenger/presentation/component/DialogMessage;", "dialogMessage", "getDialogMessage", "()Lcom/massage/massenger/presentation/component/DialogMessage;", "setDialogMessage", "(Lcom/massage/massenger/presentation/component/DialogMessage;)V", "dialogMessage$delegate", "Landroidx/compose/runtime/MutableState;", "filteredCountries", "getFilteredCountries", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpDataState;", "signUpDataState", "getSignUpDataState", "()Lcom/massage/massenger/presentation/messaging/sign_up/SignUpDataState;", "setSignUpDataState", "(Lcom/massage/massenger/presentation/messaging/sign_up/SignUpDataState;)V", "signUpDataState$delegate", "clearDataState", "", "clearDialog", "filterCountryCode", "query", "", "onEvent", "event", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "signUp", "signUpData", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpData;", "startingStateLoggedIn", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private final com.massage.massenger.data.repository.AuthRepository authRepository = null;
    private final com.massage.massenger.data.local.assets.CountryCodeRepository countriesRepository = null;
    private final com.massage.massenger.data.repository.AppStartingStateDataRepository appStartingStateDataRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState signUpDataState$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private final androidx.compose.runtime.MutableState dialogMessage$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.Country> countries = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.Country> filteredCountries = null;
    
    @javax.inject.Inject()
    public SignUpViewModel(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AuthRepository authRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.local.assets.CountryCodeRepository countriesRepository, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.data.repository.AppStartingStateDataRepository appStartingStateDataRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.sign_up.SignUpDataState getSignUpDataState() {
        return null;
    }
    
    private final void setSignUpDataState(com.massage.massenger.presentation.messaging.sign_up.SignUpDataState p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.massage.massenger.presentation.component.DialogMessage getDialogMessage() {
        return null;
    }
    
    private final void setDialogMessage(com.massage.massenger.presentation.component.DialogMessage p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.Country> getCountries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.massage.massenger.model.Country> getFilteredCountries() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent event) {
    }
    
    private final void signUp(com.massage.massenger.presentation.messaging.sign_up.SignUpData signUpData) {
    }
    
    public final void clearDialog() {
    }
    
    public final void clearDataState() {
    }
    
    public final void filterCountryCode(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void startingStateLoggedIn() {
    }
}