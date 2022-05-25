package com.massage.massenger.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.material.icons.filled.Feed
import androidx.core.net.toUri
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink
import com.massage.massenger.model.Chat
import com.massage.massenger.model.User
import com.massage.massenger.util.extensions.decode
import com.massage.massenger.util.extensions.encode
import com.massage.massenger.util.extensions.fromJson
import com.massage.massenger.util.extensions.toJson


object AuthNavigation : Navigation(route = "auth_navigation", startDestination = SignInDestination.route)
object TabNavigation : Navigation(route = "tab_navigation", startDestination = ChatListDestination.route)
object SingleChatNavigation :
    Navigation(route = "single_chat_navigation", startDestination = SingleChatDestination.route)

object OnBoardingDestination : Destination("on_boarding_screen")
object SignInDestination : Destination("login_screen")
object SignupDestination : Destination("signup_screen")

object SingleChatDestination : Destination("single_chat_screen") {

    private const val CHAT = "chat"
    private const val USER = "user"

    override val route =
        "${super.route}?$CHAT={$CHAT}&$USER={$USER}"  //"single_chat_screen?chat={chat}&user={user}"

    override val arguments = listOf(
        navArgument(CHAT) {
            type = NavType.StringType; nullable = true; defaultValue = null
        },
        navArgument(USER) {
            type = NavType.StringType; nullable = true; defaultValue = null
        }
    )

    override val deepLinks = listOf(navDeepLink {
        uriPattern = "$uri/$CHAT={$CHAT}"
    }) //"app://com.massage.massenger/chat={chat}"

    operator fun invoke(chat: Chat) =
        "${super.route}?$CHAT=${chat.toJson()}"

    operator fun invoke(user: User) =
        "${super.route}?$USER=${user.toJson()}"

    const val uri = "app://com.massage.massenger"

    fun getDeepLink(chat: Chat) =
        "$uri/$CHAT=${chat.toJson()}".toUri() //"app://com.massage.massenger/chat=json_chat"

    fun NavBackStackEntry.parseChat() =
        arguments?.getString(CHAT)?.fromJson<Chat>()

    fun NavBackStackEntry.parseUser() =
        arguments?.getString(USER)?.fromJson<User>()
}

object ImageGridDestination : Destination("select_photo_screen")
object ImageViewDestination : Destination("image_view_screen") {

    private const val PHOTO_URL = "photo_uri"
    private const val PHOTO_NAME = "photo_name"

    override val route = "${super.route}/{$PHOTO_URL}?$PHOTO_NAME={$PHOTO_NAME}"

    override val arguments = listOf(
        navArgument(PHOTO_URL) {
            type = NavType.StringType
        },
        navArgument(PHOTO_NAME) {
            type = NavType.StringType; nullable = true; defaultValue = null
        }
    )

    //navigation route
    operator fun invoke(uri: String) =
        "${super.route}/${uri.encode()}"

    operator fun invoke(uri: String, name: String) =
        "${super.route}/${uri.encode()}?$PHOTO_NAME={$name}"

    fun NavBackStackEntry.parsePhotoUrl() =
        arguments?.getString(PHOTO_URL)?.decode()

    fun NavBackStackEntry.parsePhotoName() =
        arguments?.getString(PHOTO_NAME)
}

object CreateGroupDestination : Destination("create_group")

// Home Tab Destination
object ChatListDestination : TabDestination("chat_list_screen", "Chat", Icons.Default.Chat)
object ContactListDestination : TabDestination("contact_list_screen", "Contact", Icons.Default.Contacts)
object NewsFeedDestination : TabDestination("news_feed_screen", "Feed", Icons.Default.Feed)

val tabItems = listOf(
    ChatListDestination,
    ContactListDestination,
    NewsFeedDestination
)