package com.massage.massenger.presentation.messaging

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.massage.massenger.presentation.messaging.home_nav.BottomNavigationBar
import com.massage.massenger.presentation.navigation.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppScaffold() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            AnimatedVisibility(shouldShowBottomBar(navController = navController)) {
                BottomNavigationBar(
                    items = tabItems,
                    navController = navController,
                    onItemClick = { screen ->
                        navController.checkPopNavigate(screen())
                    }
                )

            }
        }
    ) {
        CombinedAppNavigation(navController, it)
    }
}

@Composable
fun CombinedAppNavigation(
    navController: NavHostController,
    paddingValues: PaddingValues,
) {
    NavHost(
        navController = navController,
        startDestination = AuthNavigation.route,
        Modifier.padding(paddingValues)
    ) {

        authNavigation(navController)

        tabNavigation(navController)

        singleChatNavigation(navController)

        otherNavigation(navController)
    }
}


