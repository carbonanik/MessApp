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
import androidx.compose.runtime.*
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.navDeepLink
import com.massage.massenger.model.Chat
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.navtype.chatNavType
import com.massage.massenger.presentation.messaging.navtype.userNavType
import com.massage.massenger.presentation.messaging.single_chat.SingleChatScreen
import java.util.*

object SingleChatScreenDestination : TypedDestination<SingleChatScreenDestination.NavArgs> {
    
    override fun invoke(navArgs: NavArgs): Direction = with(navArgs) {
        invoke(chat, user)
    }
     
    operator fun invoke(
		chat: Chat? = null,
		user: User? = null,
    ): Direction {
        return object : Direction {
            override val route = "$routeId" + 
					"?chat=${chatNavType.serializeValue(chat)}" + 
					"?user=${userNavType.serializeValue(user)}"
        }
    }
    
    override val routeId = "single_chat_screen"

    override val route = "$routeId?chat={chat}?user={user}"
    
	override val arguments get() = listOf(
		navArgument("chat") {
			type = chatNavType
			nullable = true
			defaultValue = null
		},
		navArgument("user") {
			type = userNavType
			nullable = true
			defaultValue = null
		}
	)

    @Composable
    override fun DestinationScope<NavArgs>.Content(
		dependenciesContainerBuilder: @Composable DependenciesContainerBuilder<NavArgs>.() -> Unit
    ) {
		val (chat, user) = navArgs
		SingleChatScreen(
			chat = chat, 
			user = user, 
			navigator = destinationsNavigator
		)
    }
                    
	override fun argsFrom(navBackStackEntry: NavBackStackEntry): NavArgs {
	    return NavArgs(
			chat = chatNavType.get(navBackStackEntry, "chat"),
			user = userNavType.get(navBackStackEntry, "user"),
	    )
	}
                
	override fun argsFrom(savedStateHandle: SavedStateHandle): NavArgs {
	    return NavArgs(
			chat = chatNavType.get(savedStateHandle, "chat"),
			user = userNavType.get(savedStateHandle, "user"),
	    )
	}

	data class NavArgs(
		val chat: Chat? = null,
		val user: User? = null,
	)
}