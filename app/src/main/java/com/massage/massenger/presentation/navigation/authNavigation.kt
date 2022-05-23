package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.sign_in.SignInScreen
import com.massage.massenger.presentation.messaging.sign_up.SignUpScreen


fun NavGraphBuilder.authNavigation(
    navController: NavHostController
) {
    navigation(AuthNavigation) {

        composable(SignInScreen) {
            SignInScreen(navController, hiltViewModel())
        }
        composable(SignupScreen) {
            SignUpScreen(navController, hiltViewModel())
        }
    }
}