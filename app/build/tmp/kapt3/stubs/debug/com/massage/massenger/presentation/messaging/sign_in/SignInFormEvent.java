package com.massage.massenger.presentation.messaging.sign_in;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent;", "", "()V", "CountrySelected", "PasswordChanged", "PhoneChanged", "SignInClick", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$PhoneChanged;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$PasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$CountrySelected;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$SignInClick;", "app_debug"})
public abstract class SignInFormEvent {
    
    private SignInFormEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$PhoneChanged;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent;", "phone", "", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "app_debug"})
    public static final class PhoneChanged extends com.massage.massenger.presentation.messaging.sign_in.SignInFormEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String phone = null;
        
        public PhoneChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String phone) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhone() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$PasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent;", "password", "", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "app_debug"})
    public static final class PasswordChanged extends com.massage.massenger.presentation.messaging.sign_in.SignInFormEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String password = null;
        
        public PasswordChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPassword() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$CountrySelected;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent;", "country", "Lcom/massage/massenger/model/Country;", "(Lcom/massage/massenger/model/Country;)V", "getCountry", "()Lcom/massage/massenger/model/Country;", "app_debug"})
    public static final class CountrySelected extends com.massage.massenger.presentation.messaging.sign_in.SignInFormEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.massage.massenger.model.Country country = null;
        
        public CountrySelected(@org.jetbrains.annotations.NotNull()
        com.massage.massenger.model.Country country) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.massage.massenger.model.Country getCountry() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent$SignInClick;", "Lcom/massage/massenger/presentation/messaging/sign_in/SignInFormEvent;", "()V", "app_debug"})
    public static final class SignInClick extends com.massage.massenger.presentation.messaging.sign_in.SignInFormEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.presentation.messaging.sign_in.SignInFormEvent.SignInClick INSTANCE = null;
        
        private SignInClick() {
            super();
        }
    }
}