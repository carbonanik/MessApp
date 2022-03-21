package com.massage.massenger.presentation.messaging

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.massage.massenger.presentation.navigation.LoginScreen
import com.massage.massenger.presentation.navigation.TabNavigation
import com.massage.massenger.presentation.navigation.popNavigate
import com.massage.massenger.presentation.ui.MessagingViewModel

@Composable
fun StartScreen(
    messagingViewModel: MessagingViewModel,
    navController: NavHostController
){
    LaunchedEffect(key1 = Unit, block = {
        if (messagingViewModel.isLoggedIn())
            navController.popNavigate(TabNavigation())
        else navController.popNavigate(LoginScreen())
    })

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            imageVector = Icons.Default.ThumbUp, contentDescription = null,
            tint = Color.Blue
        )
    }
}
