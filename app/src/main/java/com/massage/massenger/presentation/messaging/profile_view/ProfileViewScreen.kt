package com.massage.massenger.presentation.messaging.profile_view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.presentation.messaging.chat_list.ProfileCircle
import com.massage.massenger.presentation.ui.theme.MessengerTheme

@Composable
fun ProfileViewScreen() {
    val name = "Sheikh Anik"
    Surface {
        Column(Modifier.padding(16.dp)) {
            ProfileCircle(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
                    .padding(bottom = 16.dp),
                name = name,
                textSize = 150.sp,
                roundedCorner = 35.dp
            )
            Text(text = name, fontSize = 35.sp, fontWeight = FontWeight.Bold)
            Text(text = "Shared Media", fontSize = 35.sp)
        }
    }
}

@Preview
@Composable
fun ProfileViewScreenPrev() {
    MessengerTheme {
        ProfileViewScreen()
    }
}