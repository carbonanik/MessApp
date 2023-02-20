package com.massage.massenger.presentation.messaging.contact_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001aA\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a=\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00102!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000fH\u0007\u001a$\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0007\u00a8\u0006 "}, d2 = {"AskPermission", "", "contactPermission", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactPermission;", "onAllowClick", "Lkotlin/Function0;", "ContactScreen", "viewModel", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenViewModel;", "navController", "Landroidx/navigation/NavController;", "ContactScreenContent", "dataState", "Lcom/massage/massenger/presentation/messaging/contact_list/ContactScreenDataState;", "onContactClick", "Lkotlin/Function1;", "Lcom/massage/massenger/model/User;", "Lkotlin/ParameterName;", "name", "user", "onAllowPermissionClick", "ContactView", "modifier", "Landroidx/compose/ui/Modifier;", "connection", "StatusBar", "statusText", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "loadingIndicator", "", "app_debug"})
public final class ContactScreenKt {
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {com.google.accompanist.permissions.ExperimentalPermissionsApi.class})
    public static final void ContactScreen(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactScreenViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    public static final void ContactScreenContent(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactScreenDataState dataState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.User, kotlin.Unit> onContactClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAllowPermissionClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ContactView(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    com.massage.massenger.model.User connection, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.massage.massenger.model.User, kotlin.Unit> onContactClick) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void StatusBar(@org.jetbrains.annotations.NotNull()
    java.lang.String statusText, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.graphics.vector.ImageVector icon, boolean loadingIndicator) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AskPermission(@org.jetbrains.annotations.NotNull()
    com.massage.massenger.presentation.messaging.contact_list.ContactPermission contactPermission, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onAllowClick) {
    }
}