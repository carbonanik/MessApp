package com.massage.massenger.presentation.messaging.sign_up;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "", "()V", "ConfirmPasswordChanged", "CountrySelected", "NameChanged", "PasswordChanged", "PhoneChanged", "SignInClick", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$CountrySelected;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$PhoneChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$NameChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$PasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$ConfirmPasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$SignInClick;", "app_debug"})
public abstract class SignUpFormEvent {
    
    private SignUpFormEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$CountrySelected;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "country", "Lcom/massage/massenger/model/Country;", "(Lcom/massage/massenger/model/Country;)V", "getCountry", "()Lcom/massage/massenger/model/Country;", "app_debug"})
    public static final class CountrySelected extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$PhoneChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "phone", "", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "app_debug"})
    public static final class PhoneChanged extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$NameChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "app_debug"})
    public static final class NameChanged extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String name = null;
        
        public NameChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getName() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$PasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "password", "", "(Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "app_debug"})
    public static final class PasswordChanged extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$ConfirmPasswordChanged;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "confirmPassword", "", "(Ljava/lang/String;)V", "getConfirmPassword", "()Ljava/lang/String;", "app_debug"})
    public static final class ConfirmPasswordChanged extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String confirmPassword = null;
        
        public ConfirmPasswordChanged(@org.jetbrains.annotations.NotNull()
        java.lang.String confirmPassword) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getConfirmPassword() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent$SignInClick;", "Lcom/massage/massenger/presentation/messaging/sign_up/SignUpFormEvent;", "()V", "app_debug"})
    public static final class SignInClick extends com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.massage.massenger.presentation.messaging.sign_up.SignUpFormEvent.SignInClick INSTANCE = null;
        
        private SignInClick() {
            super();
        }
    }
}