package com.massage.massenger.presentation.messaging.ongoing_video_call

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.R


@Composable
fun IncomingCallScreen() {

    Image(
        painter = painterResource(id = R.drawable.video_call_mock_image),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize(),
        contentScale = ContentScale.Crop,
        )
    Box(modifier = Modifier
        .background(Color.Black.copy(.5f))
        .fillMaxSize())
    Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
        Column {
            IconButton(
                modifier = Modifier
                    .padding(start = 16.dp, top = 16.dp)
                    .clip(CircleShape)
                    .background(Color.White.copy(alpha = .2f)),
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, tint = Color.White)
            }

            Column(Modifier.padding(start = 36.dp, top = 75.dp).fillMaxWidth()) {
                Text(text = "Sheikh Anik", fontSize = 38.sp, fontWeight = FontWeight.Bold, color = Color.White)
                Text(text = "Incoming Call", fontSize = 22.sp, color = Color.White)
            }
        }


        Row(
            Modifier
                .fillMaxWidth()
                .padding(24.dp), horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color.Green)

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Call, contentDescription = null)

                }
            }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color.White)

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.MicOff, contentDescription = null)

                }
            }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color.White)

            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.VideocamOff , contentDescription = null)

                }
            }
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(color = Color.Red)
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.CallEnd, contentDescription = null)
                }
            }
        }
    }
}

@Preview
@Composable
fun IncomingCallScreenPrev() {
    IncomingCallScreen()
}