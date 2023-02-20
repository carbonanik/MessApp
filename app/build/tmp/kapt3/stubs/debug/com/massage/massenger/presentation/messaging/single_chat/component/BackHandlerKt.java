package com.massage.massenger.presentation.messaging.single_chat.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0007\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006\t"}, d2 = {"LocalBackPressedDispatcher", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/activity/OnBackPressedDispatcher;", "getLocalBackPressedDispatcher", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "BackPressHandler", "", "onBackPressed", "Lkotlin/Function0;", "app_debug"})
public final class BackHandlerKt {
    
    /**
     * This [CompositionLocal] is used to provide an [OnBackPressedDispatcher]:
     *
     * ```
     * CompositionLocalProvider(
     *    LocalBackPressedDispatcher provides requireActivity().onBackPressedDispatcher
     * ) { }
     * ```
     *
     * and setting up the callbacks with [BackPressHandler].
     */
    @org.jetbrains.annotations.NotNull()
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcher> LocalBackPressedDispatcher = null;
    
    /**
     * This [Composable] can be used with a [LocalBackPressedDispatcher] to intercept a back press.
     *
     * @param onBackPressed (Event) What to do when back is intercepted
     */
    @androidx.compose.runtime.Composable()
    public static final void BackPressHandler(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackPressed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.activity.OnBackPressedDispatcher> getLocalBackPressedDispatcher() {
        return null;
    }
}