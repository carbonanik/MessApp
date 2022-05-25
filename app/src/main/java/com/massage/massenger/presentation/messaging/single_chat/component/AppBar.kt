package com.massage.massenger.presentation.messaging.single_chat.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.VideoCall
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.massage.massenger.presentation.ui.theme.elevatedSurface

@Preview
@Composable
fun ChatTopBarPreview() {
    ChatTopBar(conversationName = "Anik", onCallPressed = { /*TODO*/ }) {

    }
}

@Composable
fun ChatTopBar(
    modifier: Modifier = Modifier,
    conversationName: String,
    isActive: Boolean = true,
    onNavIconPressed: () -> Unit = { },
    onProfileClick: () -> Unit = {},
    onCallPressed: () -> Unit,
    onVideoCallPressed: () -> Unit
) {

    AppBar(
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = { onNavIconPressed() }) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person",
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        },
        title = {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier,
                    text = conversationName,
                    style = MaterialTheme.typography.subtitle1,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    val activeText = if (isActive) "Active Now" else "Not Active"
                    val activeIndicColor = if (isActive) Color.Green else Color.Red
                    Box(
                        modifier = Modifier
                            .size(10.dp)
                            .clip(CircleShape)
                            .background(activeIndicColor)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = activeText,
                        style = MaterialTheme.typography.caption
                    )
                }
            }
        },
        actions = {
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                IconButton(onClick = onCallPressed) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        modifier = Modifier
                            .padding(horizontal = 12.dp, vertical = 16.dp)
                            .height(24.dp),
                        contentDescription = "call"
                    )
                }
                IconButton(onClick = onVideoCallPressed) {
                    Icon(
                        imageVector = Icons.Default.VideoCall,
                        modifier = Modifier
                            .padding(horizontal = 12.dp, vertical = 16.dp)
                            .height(24.dp),
                        contentDescription = "video call"
                    )
                }
            }
        }
    )
}


@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: @Composable RowScope.() -> Unit,
    navigationIcon: @Composable RowScope.() -> Unit = {},
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
            navigationIcon = { Row { navigationIcon() } }
        )
        Divider()
    }
}