package com.massage.massenger.presentation.ui

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.massage.massenger.presentation.messaging.AppScaffold
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MessagingActivity : AppCompatActivity() {

    private val messagingActivityViewModel: MessagingActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val helloService = HelloService()
//        val serviceIntent = Intent(this, helloService.javaClass)
//        if (!isServiceRunning(helloService.javaClass)) {
//            startService(serviceIntent)
//        }

        installSplashScreen().setKeepOnScreenCondition {
            messagingActivityViewModel.isLoading
        }

        setContent {
            MessengerTheme {
//                DestinationsNavHost(navGraph = NavGraphs.root)
                AppScaffold(messagingActivityViewModel.startDestination)
            }
        }
    }

    @Suppress("DEPRECATION")
    private fun isServiceRunning(serviceClass: Class<*>): Boolean {
        val manager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        for (service in manager.getRunningServices(Int.MAX_VALUE)) {
            if (serviceClass.name.equals(service.service.className)) {
                return true
            }
        }
        return false
    }

}