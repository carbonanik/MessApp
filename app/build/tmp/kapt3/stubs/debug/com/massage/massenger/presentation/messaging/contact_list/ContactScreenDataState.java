package com.massage.massenger.presentation.messaging.contact_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u0016\u001a\u00020\nH\u00c6\u0003J9\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenDataState;", "", "contacts", "", "Lcom/massage/massenger/model/User;", "isLoading", "", "errorMessage", "", "contactPermission", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactPermission;", "(Ljava/util/List;ZLjava/lang/String;Lcom/massage/massenger/presentation/messaging/contact_list/ContactPermission;)V", "getContactPermission", "()Lcom/massage/massenger/presentation/messaging/contact_list/ContactPermission;", "getContacts", "()Ljava/util/List;", "getErrorMessage", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
public final class ContactScreenDataState {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.massage.massenger.model.User> contacts = null;
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final com.massage.massenger.presentation.messaging.contact_list.ContactPermission contactPermission = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.contact_list.ContactScreenDataState copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.User> contacts, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactPermission contactPermission) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ContactScreenDataState() {
        super();
    }
    
    public ContactScreenDataState(@org.jetbrains.annotations.NotNull()
    java.util.List<com.massage.massenger.model.User> contacts, boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactPermission contactPermission) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.massage.massenger.model.User> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.massage.massenger.model.User> getContacts() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.contact_list.ContactPermission component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.massage.massenger.presentation.messaging.contact_list.ContactPermission getContactPermission() {
        return null;
    }
}