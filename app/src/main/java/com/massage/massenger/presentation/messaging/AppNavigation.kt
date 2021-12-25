package com.massage.massenger.presentation.messaging

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.massage.massenger.presentation.messaging.create_group.CreateGroupScreen
import com.massage.massenger.presentation.messaging.create_group.CreateGroupViewModel
import com.massage.massenger.presentation.messaging.home_nav.HomeTabScreen
import com.massage.massenger.presentation.messaging.image_gallery.ImageGridScreen
import com.massage.massenger.presentation.messaging.single_chat.SingleChatScreen
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel
import com.massage.massenger.presentation.ui.MessagingActivityViewModel

/*

 */
@ExperimentalFoundationApi
@ExperimentalMaterialApi
@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.HomeTabScreen.route
    ) {
        composable(route = Screen.HomeTabScreen.route) {
            HomeTabScreen(hiltViewModel(), navController)
        }
        composable(
            route = Screen.SingleChatScreen.routeWithArg,
            arguments = Screen.SingleChatScreen.argumentList
        ) { entry ->

            hiltViewModel<SingleChatViewModel>().initSingleChatArgs(Screen.SingleChatScreen.parseArguments(entry))
            println("hiltViewModel<SingleChatViewModel>().initSingleChatArgs")
            SingleChatScreen(
                viewModel = hiltViewModel(),
                navController = navController,
            )
        }
        composable(Screen.SelectPhotoScreen.route) {
            ImageGridScreen(
                viewModel = hiltViewModel(),
                navController = navController
            )
        }
        composable(Screen.CreateGroupScreen.route) {
            CreateGroupScreen(
                viewModel = hiltViewModel(),
                navController = navController
            )
        }
    }
}