package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.VideoCameraFront
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.presentation.ui.theme.elevatedSurface

@Preview
@Composable
fun ChatTopBarPreview(){
    ChatTopBar(conversationName = "Anik", onCallPressed = { /*TODO*/ }) {

    }
}

@Composable
fun ChatTopBar(
    conversationName: String,
    modifier: Modifier = Modifier,
    onNavIconPressed: () -> Unit = { },
    onCallPressed: () -> Unit,
    onVideoCallPressed: () -> Unit
) {

    AppBar(
        modifier = modifier,
        onNavIconPressed = onNavIconPressed,
        title = {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = conversationName,
                    style = MaterialTheme.typography.subtitle1,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Active Status",
                    style = MaterialTheme.typography.caption
                )
            }
        },
        actions = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Icon(
                    imageVector = Icons.Default.Call,
                    modifier = Modifier
                        .clickable(onClick = onCallPressed)
                        .padding(horizontal = 12.dp, vertical = 16.dp)
                        .height(24.dp),
                    contentDescription = "call"
                )
                Icon(
                    imageVector = Icons.Default.VideoCameraFront,
                    modifier = Modifier
                        .clickable(onClick = onVideoCallPressed)
                        .padding(horizontal = 12.dp, vertical = 16.dp)
                        .height(24.dp),
                    contentDescription = "video call"
                )
            }
        }
    )
}


@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    onNavIconPressed: () -> Unit = { },
    title: @Composable RowScope.() -> Unit,
    actions: @Composable RowScope.() -> Unit = {}
) {

    val backgroundColor = MaterialTheme.colors.elevatedSurface(3.dp)
    Column(
        Modifier.background(backgroundColor.copy(alpha = 0.95f))
    ) {
        TopAppBar(
            modifier = modifier,
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            contentColor = MaterialTheme.colors.onSurface,
            actions = actions,
            title = { Row { title() } }, // https://issuetracker.google.com/168793068
            navigationIcon = {
//                Image(
//                    painter = painterResource(id = R.drawable.per),
//                    contentDescription = "stringResource(id = R.string.back)",
//                    modifier = Modifier
//                        .clickable(onClick = onNavIconPressed)
//                        .padding(horizontal = 16.dp)
//                )
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person",
                    modifier = Modifier
                        .clickable(onClick = onNavIconPressed)
                        .padding(horizontal = 16.dp)
                )
            }
        )
        Divider()
    }
}