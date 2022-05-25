package com.massage.massenger.presentation.messaging

import androidx.compose.animation.animateContentSize
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
//            AnimatedVisibility(
//                shouldShowBottomBar(navController = navController),
//                enter = slideInVertically(
//                    initialOffsetY = { it / 2 }
//                ) + fadeIn(),
//                exit = slideOutVertically(
//                    targetOffsetY = { it / 2 }
//                ) + fadeOut(),
//            ) {
            if (shouldShowBottomBar(navController = navController)) {
                BottomNavigationBar(
                    items = tabItems,
                    navController = navController,
                    onItemClick = { screen ->
                        navController.checkPopNavigate(screen())
                    }
                )
            }
//            }
        }
    ) { paddingValue ->
//        val padding = if (shouldShowBottomBar(navController = navController)){
//            paddingValue
//        } else {
//            PaddingValues()
//        }
        CombinedAppNavigation(
            navController = navController,
            startDestination = startDestination,
            modifier = Modifier
                .padding(paddingValue)
                .animateContentSize()
        )
    }
}

@Composable
fun CombinedAppNavigation(
    navController: NavHostController,
    startDestination: String,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(OnBoardingDestination) {
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


