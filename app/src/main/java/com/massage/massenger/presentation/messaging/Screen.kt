package com.massage.massenger.presentation.messaging

//const val TAB_NAVIGATION_ROUTE = "TAB_NAVIGATION_ROUTE"
//const val SINGLE_CHAT_NAVIGATION_ROUTE = "SINGLE_CHAT_NAVIGATION_ROUTE"
//const val AUTH_NAVIGATION_ROUTE = "AUTH_NAVIGATION"
//
//sealed class Screen(private val route: String) {
//    object StartScreen : Screen("start_screen")
//    object LoginScreen : Screen("login_screen")
//    object SignupScreen : Screen("signup_screen")
//    object HomeTabScreen : Screen("home_screen")
//
//    object SingleChatScreen : Screen("single_chat_screen") {
//
//        private const val CHAT = "chat"
//        private const val USER = "user"
//
//        override operator fun invoke() = "${super.invoke()}?$CHAT={$CHAT}&$USER={$USER}"
//        //"single_chat_screen?chat={chat}&user={user}"
//
//        operator fun invoke(chat: Chat) = "${super.invoke()}?$CHAT=${chat.toJson()}"
//        operator fun invoke(user: User) = "${super.invoke()}?$USER=${user.toJson()}"
//
//        val args = listOf(
//            navArgument(CHAT) {
//                type = NavType.StringType; nullable = true; defaultValue = null
//            },
//            navArgument(USER) {
//                type = NavType.StringType; nullable = true; defaultValue = null
//            }
//        )
//
//        const val uri = "app://com.massage.massenger"
//
//        //"app://com.massage.massenger/chat={chat}"
//        val deepLinks = listOf(navDeepLink { uriPattern = "$uri/$CHAT={$CHAT}" })
//
//        //"app://com.massage.massenger/chat=json_chat"
//        fun getDeepLink(chat: Chat): Uri {
//            return "$uri/$CHAT=${chat.toJson()}".toUri()
//        }
//
//        fun NavBackStackEntry.parseChat() =
//            arguments?.getString(CHAT)?.fromJson<Chat>()
//
//        fun NavBackStackEntry.parseUser() =
//            arguments?.getString(USER)?.fromJson<User>()
//    }
//
//    object ImageGridScreen : Screen("select_photo_screen")
//    object ImageViewScreen : Screen("image_view_screen") {
//
//        private const val PHOTO_URL = "photo_uri"
//        private const val PHOTO_NAME = "photo_name"
//
//        override operator fun invoke() = "${super.invoke()}/{$PHOTO_URL}?$PHOTO_NAME={$PHOTO_NAME}"
//
//        operator fun invoke(uri: String) = "${super.invoke()}/${uri.encode()}"
//        operator fun invoke(uri: String, name: String) =
//            "${super.invoke()}/${uri.encode()}?$PHOTO_NAME={$name}"
//
//        val args = listOf(
//            navArgument(PHOTO_URL) {
//                type = NavType.StringType
//            },
//            navArgument(PHOTO_NAME) {
//                type = NavType.StringType; nullable = true; defaultValue = null
//            }
//        )
//
//        fun NavBackStackEntry.parsePhotoUrl() =
//            arguments?.getString(PHOTO_URL)?.decode()
//
//        fun NavBackStackEntry.parsePhotoName() =
//            arguments?.getString(PHOTO_NAME)
//    }
//
//    object CreateGroupScreen : Screen("create_group")
//
//    // Home Tab Screen
//    object ChatListScreen : TabScreens("chat_list_screen", "Chat", Icons.Default.Chat)
//    object ContactListScreen : TabScreens("contact_list_screen", "Contact", Icons.Default.Contacts)
//    object NewsFeedScreen : TabScreens("news_feed_screen", "Feed", Icons.Default.Feed)
//
//    open operator fun invoke() = route
//
//    open class TabScreens(
//        val id: String,
//        val title: String,
//        val icon: ImageVector
//    ) : Screen(route = id)
//}
//
//val tabItems = listOf(
//    Screen.ChatListScreen,
//    Screen.ContactListScreen,
//    Screen.NewsFeedScreen
//)