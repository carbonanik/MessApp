package com.massage.massenger.presentation.auth.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.auth.AuthViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashScreen(
    navController: NavHostController,
    viewModel: AuthViewModel,
    loggedIn: () -> Unit
) {

    Surface {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Icon(
                imageVector = Icons.Default.ThumbUp,
                contentDescription = "",
                Modifier.size(100.dp),
                tint = Color(0xFFE71B60)
            )
        }
    }

    LaunchedEffect(key1 = true, block = {
        launch {
            val isLoggedIn = viewModel.isLoggedIn()
            if (isLoggedIn) {
                loggedIn()
            } else {
                delay(1000)
                navController.popBackStack()
                navController.navigate("login")
            }
        }
    })
}