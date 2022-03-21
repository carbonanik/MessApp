package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.image_gallery.ImageGridScreen
import com.massage.massenger.presentation.messaging.single_chat.SingleChatScreen
import com.massage.massenger.presentation.navigation.SingleChatScreen.parseChat
import com.massage.massenger.presentation.navigation.SingleChatScreen.parseUser

fun NavGraphBuilder.singleChatNavigation(
    navController: NavHostController
){
    navigation(SingleChatNavigation){

        composable(SingleChatScreen) { backStack ->
            SingleChatScreen(
                viewModel = hiltViewModel(),
                navController = navController,
                user = backStack.parseUser(),
                chat = backStack.parseChat(),
            )
        }

        composable(ImageGridScreen) {
            ImageGridScreen(
                viewModel = hiltViewModel(),
                navController = navController
            )
        }
    }
}