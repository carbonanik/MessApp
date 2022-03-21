package com.massage.massenger.presentation.component

//
//object StartScreen : Destination("start_screen")
//object LoginScreen : Destination("login_screen")
//object SignupScreen : Destination("signup_screen")
//object HomeTabScreen : Destination("home_screen")
//
//object SingleChatScreen : Destination("single_chat_screen") {
//
//    private const val CHAT = "chat"
//    private const val USER = "user"
//
//    override val route: String = "${super.route}?$CHAT={$CHAT}&$USER={$USER}"
//    //"single_chat_screen?chat={chat}&user={user}"
//
//    operator fun invoke(chat: Chat) = "${super.invoke()}?$CHAT=${chat.toJson()}"
//    operator fun invoke(user: User) = "${super.invoke()}?$USER=${user.toJson()}"
//
//    val args = listOf(
//        navArgument(CHAT) {
//            type = NavType.StringType; nullable = true; defaultValue = null
//        },
//        navArgument(USER) {
//            type = NavType.StringType; nullable = true; defaultValue = null
//        }
//    )
//
//    const val uri = "app://com.massage.massenger"
//
//    //"app://com.massage.massenger/chat={chat}"
//    val deepLinks = listOf(navDeepLink { uriPattern = "$uri/$CHAT={$CHAT}" })
//
//    //"app://com.massage.massenger/chat=json_chat"
//    fun getDeepLink(chat: Chat): Uri {
//        return "$uri/$CHAT=${chat.toJson()}".toUri()
//    }
//
//    fun NavBackStackEntry.parseChat() =
//        arguments?.getString(CHAT)?.fromJson<Chat>()
//
//    fun NavBackStackEntry.parseUser() =
//        arguments?.getString(USER)?.fromJson<User>()
//}
//
//object ImageGridScreen : Destination("select_photo_screen")
//object ImageViewScreen : Destination("image_view_screen") {
//
//    private const val PHOTO_URL = "photo_uri"
//    private const val PHOTO_NAME = "photo_name"
//
//    override operator fun invoke() = "${super.invoke()}/{$PHOTO_URL}?$PHOTO_NAME={$PHOTO_NAME}"
//
//    operator fun invoke(uri: String) = "${super.invoke()}/${uri.encode()}"
//    operator fun invoke(uri: String, name: String) =
//        "${super.invoke()}/${uri.encode()}?$PHOTO_NAME={$name}"
//
//    val args = listOf(
//        navArgument(PHOTO_URL) {
//            type = NavType.StringType
//        },
//        navArgument(PHOTO_NAME) {
//            type = NavType.StringType; nullable = true; defaultValue = null
//        }
//    )
//
//    fun NavBackStackEntry.parsePhotoUrl() =
//        arguments?.getString(PHOTO_URL)?.decode()
//
//    fun NavBackStackEntry.parsePhotoName() =
//        arguments?.getString(PHOTO_NAME)
//}
//
//object CreateGroupScreen : Destination("create_group")
//
//// Home Tab Screen
//object ChatListScreen : TabDestination("chat_list_screen", "Chat", Icons.Default.Chat)
//object ContactListScreen : TabDestination("contact_list_screen", "Contact", Icons.Default.Contacts)
//object NewsFeedScreen : TabDestination("news_feed_screen", "Feed", Icons.Default.Feed)
//
//open class TabDestination(
//    val id: String,
//    val title: String,
//    val icon: ImageVector
//) : Destination(route = id)
