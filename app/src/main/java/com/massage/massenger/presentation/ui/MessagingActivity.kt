package com.massage.massenger.presentation.ui

import android.Manifest
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.lifecycleScope
import com.massage.massenger.util.extensions.loadPhotosFromExternalStorage
import com.massage.massenger.util.extensions.myRequestPermission
import com.massage.massenger.presentation.auth.AuthActivity
import com.massage.massenger.presentation.messaging.AppNavigation
import com.massage.massenger.presentation.messaging.single_chat.SingleChatViewModel
import com.massage.massenger.presentation.ui.theme.MassengerTheme
import com.massage.massenger.util.PermissionStatus
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MessagingActivity : AppCompatActivity() {

    private val homeViewModel: MessagingActivityViewModel by viewModels()
    private val singleChatViewModel: SingleChatViewModel by viewModels()

    @OptIn(
        ExperimentalMaterialApi::class,
        ExperimentalFoundationApi::class,
        ExperimentalStdlibApi::class,
        ExperimentalCoroutinesApi::class
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MassengerTheme {
                AppNavigation()
            }
        }

        myRequestPermission(
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_CONTACTS
        ) { permissionStatus ->
            if (permissionStatus is PermissionStatus.PermissionGranted) {
                loadPhotos()
            }
        }

        homeViewModel.goBackToAuthActivity.observe(this, {
            if (it) {
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
                homeViewModel.goBackToAuthActivity.value = false
            }
        })
    }

    private fun loadPhotos() {
        lifecycleScope.launch {
            val ps = contentResolver
                .loadPhotosFromExternalStorage().toMutableStateList()
            singleChatViewModel.photos.addAll(ps)
        }
    }
}