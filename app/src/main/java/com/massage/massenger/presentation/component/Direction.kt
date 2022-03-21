package com.massage.massenger.presentation.component

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

open class Destination(
    open val route: String,
    open val arguments: List<NamedNavArgument> = emptyList(),
    open val deepLink: List<NavDeepLink> = emptyList()
)