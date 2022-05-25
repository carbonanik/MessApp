package com.massage.massenger.presentation.messaging.chat_list

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.HourglassEmpty
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.massage.massenger.model.Chat
import com.massage.massenger.presentation.messaging.single_chat.component.StatusIndicator
import com.massage.massenger.presentation.navigation.CreateGroupDestination
import com.massage.massenger.presentation.navigation.SingleChatDestination
import com.massage.massenger.presentation.ui.TabScreensViewModel
import com.massage.massenger.util.extensions.toTime

@Composable
fun ChatListScreen(viewModel: TabScreensViewModel, chatNavController: NavController) {
    val chats by viewModel.chats.collectAsState(initial = emptyList())
    println("Chat List item ${chats.getOrNull(0)?.name}")
    ChatListScreenContent(chats = chats,
        createGroup = {
            chatNavController.navigate(CreateGroupDestination())
        },
        onItemChatClick = { chat ->
            chatNavController.navigate(SingleChatDestination(chat = chat))
        }
    )
}

@Composable
fun ChatListScreenContent(
    chats: List<Chat>,
    createGroup: () -> Unit,
    onItemChatClick: (chat: Chat) -> Unit
) {
    var showFab by remember { mutableStateOf(true) }
    val fabOffset by animateDpAsState(targetValue = if (showFab) 0.dp else 72.dp)

    val nestedScrollConnection = remember {
        object : NestedScrollConnection {
            override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {

                val d = available.y
                if (d > 1) showFab = true
                else if (d < -1) showFab = false

                super.onPreScroll(available, source)
                return Offset.Zero
            }
        }
    }

    Scaffold(
        Modifier.nestedScroll(nestedScrollConnection),
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    createGroup()
                }, modifier = Modifier
                    .offset(y = fabOffset)
            ) {
                Icon(imageVector = Icons.Default.Group, contentDescription = "")
            }
        }
    ) {
        if (chats.isEmpty()) {
            Box(
                Modifier
                    .fillMaxSize()
                    .padding(it), contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = Icons.Default.HourglassEmpty,
                    contentDescription = "Empty Chat List",
                    modifier = Modifier.size(100.dp)
                )
            }
        }
        LazyColumn {
            items(chats) { chat -> // todo test chat
                ChatListItem(chat, onItemChatClick)
            }
        }
    }
}

@Composable
fun ChatListItem(
    chat: Chat,
    onItemChatClick: (chat: Chat) -> Unit
) {
    Surface {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onItemChatClick(chat)
                    }
                    .padding(
                        horizontal = 15.dp,
                        vertical = 8.dp
                    ),
//                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row {
                    NameBox(
                        Modifier
                            .size(50.dp)
                            .align(CenterVertically),
                        chat.name
                    )

                    Spacer(Modifier.width(15.dp))
                    Column {
                        Text(
                            text = chat.name,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = chat.message,
                            color = MaterialTheme.colors.primaryVariant
                        )
                    }
                }
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = chat.time.toTime() ?: "time",
                        style = MaterialTheme.typography
                            .overline,
                        color = MaterialTheme.colors.primaryVariant
                    )

                    StatusIndicator(Modifier.size(18.dp), chat.status)
                }
            }
            Divider(
                color = MaterialTheme.colors.background,
                thickness = 2.dp
            )
        }
    }
}

fun LazyListState.isScrolledToTheEnd() =
    layoutInfo.visibleItemsInfo.lastOrNull()?.index == layoutInfo.totalItemsCount - 1
