package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.image_gallery.ImageGridScreen
import com.massage.massenger.presentation.messaging.single_chat.SingleChatScreen
import com.massage.massenger.presentation.navigation.SingleChatDestination.parseChat
import com.massage.massenger.presentation.navigation.SingleChatDestination.parseUser

fun NavGraphBuilder.singleChatNavigation(
    navController: NavHostController
){
    navigation(SingleChatNavigation){

        composable(SingleChatDestination) { backStack ->
            SingleChatScreen(
                viewModel = hiltViewModel(),
                navController = navController,
                user = backStack.parseUser(),
                chat = backStack.parseChat(),
            )
        }

        composable(ImageGridDestination) {
            ImageGridScreen(
                viewModel = hiltViewModel(),
                navController = navController
            )
        }
    }
}