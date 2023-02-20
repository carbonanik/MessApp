package com.massage.massenger.presentation.messaging.destinations

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.ramcosta.composedestinations.scope.DestinationScope
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder
import com.ramcosta.composedestinations.spec.*
import androidx.navigation.navDeepLink
import com.massage.massenger.presentation.messaging.contact_list.ContactScreen

object ContactScreenDestination : DirectionDestination {
         
    operator fun invoke() = this
    
    override val routeId = "contact_screen"

    override val route = routeId
    
    @Composable
    override fun DestinationScope<Unit>.Content(
		dependenciesContainerBuilder: @Composable DependenciesContainerBuilder<Unit>.() -> Unit
    ) {
		ContactScreen(
			navigator = destinationsNavigator
		)
    }
    
}