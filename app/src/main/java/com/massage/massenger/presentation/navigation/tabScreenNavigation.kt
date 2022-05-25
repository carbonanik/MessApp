package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.chat_list.ChatListScreen
import com.massage.massenger.presentation.messaging.contact_list.ContactScreen
import com.massage.massenger.presentation.messaging.video_play.VideosScreen


fun NavGraphBuilder.tabNavigation(
    navController: NavHostController
) {
    navigation(TabNavigation) {

        composable(ChatListDestination) {
            ChatListScreen(hiltViewModel(), navController)
        }
        composable(ContactListDestination) {
            ContactScreen(hiltViewModel(), navController)
        }
        composable(NewsFeedDestination) {
            VideosScreen()
        }
    }
}