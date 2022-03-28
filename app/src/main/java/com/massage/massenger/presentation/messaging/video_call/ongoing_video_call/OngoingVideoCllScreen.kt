package com.massage.massenger.presentation.messaging.video_call.ongoing_video_call

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CallEnd
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.R
import com.massage.massenger.presentation.messaging.single_chat.component.AppBar
import com.massage.massenger.presentation.ui.theme.MessengerTheme

@Preview
@Composable
fun VideoCallPrev() {
    MessengerTheme() {
        OngoingVideoCllScreen()
    }
}

@Composable
fun OngoingVideoCllScreen() {
    Surface {
        Column(Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceBetween) {
            AppBar(navigationIcon = {
                IconButton(modifier = Modifier.padding(start = 16.dp), onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
                }
            }, actions = {
                IconButton(modifier = Modifier.padding(end = 16.dp), onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.PersonAdd, contentDescription = null)
                }
            }, title = {
                Column {
                    Text(text = "Sheikh Anik", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                    Text(text = "Ongoing Call", fontSize = 14.sp)
                }
            })

            Box {
                Image(
                    painter = painterResource(id = R.drawable.video_call_mock_image),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop,
                )
                Image(
                    painter = painterResource(id = R.drawable.video_call_mock_image),
                    contentDescription = null,
                    modifier = Modifier
                        .width(150.dp)
                        .align(alignment = Alignment.BottomStart)
                )
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
                        .background(color = Color.Red)
                ) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.CallEnd, contentDescription = null)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun MyColumnPrev() {
    MyColumn {
        Text(text = "Sheikh")
        Text(text = "Anik")
    }
}

@Composable
fun MyColumn(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Layout(
        modifier = modifier,
        content = content
    ) { measurables, constraints ->

        val placeables = measurables.map { measurable ->
            measurable.measure(constraints = constraints)
        }

        val height = placeables.sumOf { it.height }
        val width = placeables.maxOf { it.width }

        layout(width, height) {
            var y = 0
            placeables.forEach { placeable ->
                placeable.placeRelative(x = 0, y = y)
                y += placeable.height
            }
        }

    }
}