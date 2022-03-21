package com.massage.massenger.presentation.ui

import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.massage.massenger.presentation.messaging.AppScaffold
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.service.HelloService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi


@AndroidEntryPoint
class MessagingActivity : AppCompatActivity() {

    private val messagingViewModel: MessagingViewModel by viewModels()

    @Suppress("EXPERIMENTAL_IS_NOT_ENABLED")
    @OptIn(
        ExperimentalMaterialApi::class,
        ExperimentalFoundationApi::class,
        ExperimentalStdlibApi::class,
        ExperimentalCoroutinesApi::class,
        ExperimentalPermissionsApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val helloService = HelloService()
        val serviceIntent = Intent(this, helloService.javaClass)
        if (!isServiceRunning(helloService.javaClass)) {
            startService(serviceIntent)
        }

        setContent {
            MessengerTheme {
                AppScaffold()
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