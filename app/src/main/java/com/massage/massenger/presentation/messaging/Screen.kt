package com.massage.massenger.presentation.messaging

import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen(val route: String) {
    object HomeTabScreen : Screen("home_screen")
    object SingleChatScreen : Screen("single_chat_screen") {

        data class SingleChatArgs(val chatId: String?, val userId: String?)

        private const val CHAT_ID = "chatId"
        private const val USER_ID = "userId"
        val routeWithArg = "$route?$CHAT_ID={$CHAT_ID}&$USER_ID={$USER_ID}"

        fun routeWithArg(chatId: String? = null, userId: String? = null) = buildString {
            append(route)
            chatId?.let {
                append("?")
                append("$CHAT_ID=$chatId")
            }
            userId?.let {
                if (chatId == null) append("?")
                else append("&")
                append("$USER_ID=$userId")
            }
        }

        val argumentList
            get() = listOf(
                navArgument(CHAT_ID) {
                    type = NavType.StringType; nullable = true; defaultValue = null
                },
                navArgument(USER_ID) {
                    type = NavType.StringType; nullable = true; defaultValue = null
                }
            )

        fun parseArguments(backStackEntry: NavBackStackEntry): SingleChatArgs {
            return SingleChatArgs(
                chatId = backStackEntry.arguments?.getString(CHAT_ID),
                userId = backStackEntry.arguments?.getString(USER_ID)
            )
        }
        //"?userId=user123&userType=user"
    }

    object SelectPhotoScreen : Screen("select_photo_screen")
    object CreateGroupScreen: Screen("create_group")
    object ProfileScreen : Screen("profile_screen")
    object SettingScreen : Screen("setting_screen")
}

