package com.massage.massenger.presentation.messaging.video_playback

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.R
import com.massage.massenger.presentation.messaging.single_chat.component.AppBar
import com.massage.massenger.presentation.ui.theme.MessengerTheme

@Composable
fun VideoPlaybackScreen() {
    Surface(color = Color.Black) {
        Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
            AppBar(
                navigationIcon = {
                    IconButton(modifier = Modifier.padding(start = 16.dp), onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                    }
                },
                actions = {},
                title = {
                    Column {
                        Text(text = "Playing Video", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                        Text(text = "open-movie.mp4", fontSize = 14.sp)
                    }
                })

            Column {
                Box(Modifier.fillMaxWidth()) {
                    Image(
                        modifier = Modifier.fillMaxWidth(),
                        painter = painterResource(id = R.drawable.video_play_mock),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth
                    )
                    Surface(
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.Center),
                        color = Color.Gray.copy(alpha = 0.4f)
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            modifier = Modifier.align(Alignment.Center),
                            tint = Color.Black.copy(alpha = 0.5f)
                        )
                    }
                }
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth(),progress = 0.5f)
            }


            Box {

            }
        }
    }
}

@Preview
@Composable
fun VideoPlabackPrev() {
    MessengerTheme {
        VideoPlaybackScreen()
    }
}