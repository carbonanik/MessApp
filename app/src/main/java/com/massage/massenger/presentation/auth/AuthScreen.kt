package com.massage.massenger.presentation.auth

sealed class AuthScreen(val route: String) {
    object SplashScreen: AuthScreen("splash_screen")
    object LoginScreen: AuthScreen("login_screen")
    object SignUpScreen: AuthScreen("signup_screen")
}

