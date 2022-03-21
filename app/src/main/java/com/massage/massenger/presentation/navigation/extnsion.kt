package com.massage.massenger.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation

fun NavGraphBuilder.composable(
    destination: Destination,
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(
        route = destination.route,
        arguments = destination.arguments,
        deepLinks = destination.deepLinks,
        content = content
    )
}

fun NavGraphBuilder.navigation(
    navigation: Navigation,
    builder: NavGraphBuilder.() -> Unit
) {
    navigation(
        startDestination = navigation.startDestination,
        route = navigation.route,
        arguments = emptyList(),
        deepLinks = emptyList(),
        builder = builder
    )
}

fun NavController.navigate(navigationRoute: NavigationRoute) {
    navigate(navigationRoute.value)
}

fun NavController.popNavigate(route: String) {
    popBackStack()
    navigate(route = route)
}

fun NavController.checkPopNavigate(route: String) {
    if (currentDestination?.route != route) {
        popBackStack()
        navigate(route = route)
    }
}