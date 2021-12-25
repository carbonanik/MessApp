package com.massage.massenger.presentation.messaging.home_nav

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Contacts
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.massage.massenger.presentation.ui.MessagingActivityViewModel
import com.massage.massenger.presentation.messaging.chat_list.ChatListScreen
import com.massage.massenger.presentation.messaging.contact_list.ContactScreen

@ExperimentalMaterialApi
@Composable
fun HomeTabScreen(
    viewModel: MessagingActivityViewModel,
    chatNavController: NavHostController
) {
    val homeNavController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        name = "Chat",
                        route = "chat",
                        icon = Icons.Default.Chat
                    ),
                    BottomNavItem(
                        name = "Contact",
                        route = "contact",
                        icon = Icons.Default.Contacts,
                    )
                ),
                navController = homeNavController,
                onItemClick = {
//                    if (it.route == "chat") {
//                        homeNavController.popBackStack()
//                    }
                    homeNavController.popBackStack()
                    homeNavController.navigate(it.route)
                }
            )
        }
    ) {
        Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {
                viewModel.logout()
            }) {
                Text(text = "Log Out")
            }
        }
        HomeTabNavigation(homeNavController = homeNavController, chatNavController, viewModel)
    }
}


@Composable
fun HomeTabNavigation(
    homeNavController: NavHostController,
    chatNavController: NavHostController,
    viewModel: MessagingActivityViewModel
) {
    NavHost(navController = homeNavController, startDestination = "chat") {
        composable("chat") {
            ChatListScreen(viewModel, chatNavController)
        }
        composable("contact") {
            ContactScreen(viewModel, chatNavController)
        }
    }
}