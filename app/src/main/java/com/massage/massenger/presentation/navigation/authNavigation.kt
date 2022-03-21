package com.massage.massenger.presentation.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.messaging.StartScreen
import com.massage.massenger.presentation.messaging.log_in.LoginScreen
import com.massage.massenger.presentation.messaging.sign_up.SignUpScreen


fun NavGraphBuilder.authNavigation(
    navController: NavHostController
) {
    navigation(AuthNavigation) {
        composable(StartScreen) {
            StartScreen(hiltViewModel(), navController)
        }
        composable(LoginScreen) {
            LoginScreen(navController, hiltViewModel())
        }
        composable(SignupScreen) {
            SignUpScreen(navController, hiltViewModel())
        }
    }
}