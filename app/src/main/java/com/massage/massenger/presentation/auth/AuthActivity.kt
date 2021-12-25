package com.massage.massenger.presentation.auth

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.insets.ProvideWindowInsets
import com.massage.massenger.presentation.auth.log_in.LoginScreen
import com.massage.massenger.presentation.auth.sign_up.SignUpScreen
import com.massage.massenger.presentation.auth.splash.SplashScreen
import com.massage.massenger.service.HelloService
import com.massage.massenger.presentation.ui.MessagingActivity
import com.massage.massenger.presentation.ui.theme.MassengerTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@ExperimentalStdlibApi
@AndroidEntryPoint
class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val helloService = HelloService()
        intent = Intent(this, helloService.javaClass)
        if (!isServiceRunning(helloService.javaClass)) {
            startService(intent)
        }

        setContent {

            ProvideWindowInsets {
                MassengerTheme {
                    val navController = rememberNavController()

                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") {
                            SplashScreen(navController, hiltViewModel()) { openMessaging() }
                        }
                        composable("login") {
                            LoginScreen(navController, hiltViewModel()) { openMessaging() }
                        }
                        composable("signup") {
                            SignUpScreen(navController, hiltViewModel()) { openMessaging() }
                        }
                        composable("test") {
                            WindowInsect()
                        }
                    }
                }
            }

        }
    }


    private fun isServiceRunning(serviceClass: Class<*>): Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name.equals(service.service.className)) {
                return true
            }
        }
        return false
    }

    private fun openMessaging() {
        startActivity(Intent(this@AuthActivity, MessagingActivity::class.java))
        this@AuthActivity.finish()
    }
}