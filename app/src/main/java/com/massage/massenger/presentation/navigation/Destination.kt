package com.massage.massenger.presentation.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

open class Destination(open val route: String) {
    open val arguments = listOf<NamedNavArgument>()
    open val deepLinks = listOf<NavDeepLink>()

    operator fun invoke() = route
}

open class Navigation(
    open val route: String,
    open val startDestination: String,
    open val arguments: List<NamedNavArgument> = emptyList(),
    open val deepLinks: List<NavDeepLink> = emptyList()
) {
    operator fun invoke() = route
}


