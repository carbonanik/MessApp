package com.massage.massenger.presentation.messaging

import androidx.compose.animation.*
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.massage.massenger.presentation.messaging.home_nav.BottomNavigationBar
import com.massage.massenger.presentation.messaging.on_boarding.OnBoardingScreen
import com.massage.massenger.presentation.navigation.*


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppScaffold(startDestination: String) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            AnimatedVisibility(
                shouldShowBottomBar(navController = navController),
                enter = slideInVertically() + fadeIn(),
                exit = slideOutVertically() + fadeOut(),
            ) {
                BottomNavigationBar(
                    items = tabItems,
                    navController = navController,
                    onItemClick = { screen ->
                        navController.checkPopNavigate(screen())
                    }
                )
            }
        }
    ) { paddingValue ->
        CombinedAppNavigation(navController, paddingValue, startDestination)
    }
}

@Composable
fun CombinedAppNavigation(
    navController: NavHostController,
    paddingValues: PaddingValues,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        Modifier.padding(paddingValues)
    ) {

        composable(OnBoardingScreen) {
            OnBoardingScreen(
                navController = navController,
                viewModel = hiltViewModel()
            )
        }

        authNavigation(navController)

        tabNavigation(navController)

        singleChatNavigation(navController)

        otherNavigation(navController)
    }
}


