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
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.navDeepLink
import com.massage.massenger.presentation.messaging.image_view.ImageViewScreen
import com.ramcosta.composedestinations.navargs.primitives.DestinationsStringNavType

object ImageViewScreenDestination : TypedDestination<ImageViewScreenDestination.NavArgs> {
    
    override fun invoke(navArgs: NavArgs): Direction = with(navArgs) {
        invoke(url, name)
    }
     
    operator fun invoke(
		url: String? = null,
		name: String? = null,
    ): Direction {
        return object : Direction {
            override val route = "$routeId" + 
					"?url=${DestinationsStringNavType.serializeValue("url", url)}" + 
					"?name=${DestinationsStringNavType.serializeValue("name", name)}"
        }
    }
    
    override val routeId = "image_view_screen"

    override val route = "$routeId?url={url}?name={name}"
    
	override val arguments get() = listOf(
		navArgument("url") {
			type = DestinationsStringNavType
			nullable = true
		},
		navArgument("name") {
			type = DestinationsStringNavType
			nullable = true
		}
	)

    @Composable
    override fun DestinationScope<NavArgs>.Content(
		dependenciesContainerBuilder: @Composable DependenciesContainerBuilder<NavArgs>.() -> Unit
    ) {
		val (url, name) = navArgs
		ImageViewScreen(
			url = url, 
			name = name
		)
    }
                    
	override fun argsFrom(navBackStackEntry: NavBackStackEntry): NavArgs {
	    return NavArgs(
			url = DestinationsStringNavType.get(navBackStackEntry, "url"),
			name = DestinationsStringNavType.get(navBackStackEntry, "name"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): NavArgs {
	    return NavArgs(
			url = DestinationsStringNavType.get(savedStateHandle, "url"),
			name = DestinationsStringNavType.get(savedStateHandle, "name"),
	    )
	}

	data class NavArgs(
		val url: String? = null,
		val name: String? = null,
	)
}