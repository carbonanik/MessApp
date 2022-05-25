package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.create_group.CreateGroupScreen
import com.massage.massenger.presentation.messaging.image_view.ImageViewScreen
import com.massage.massenger.presentation.navigation.ImageViewDestination.parsePhotoName
import com.massage.massenger.presentation.navigation.ImageViewDestination.parsePhotoUrl

fun NavGraphBuilder.otherNavigation(
    navController: NavHostController
) {
    composable(CreateGroupDestination) {
        CreateGroupScreen(hiltViewModel(), navController)
    }
    composable(ImageViewDestination) { backStack ->
        ImageViewScreen(
            hiltViewModel(),
            url = backStack.parsePhotoUrl(),
            name = backStack.parsePhotoName()
        )
    }
}