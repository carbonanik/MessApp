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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.insets.ExperimentalAnimatedInsets
import com.massage.massenger.model.Chat
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.presentation.messaging.single_chat.component.StatusIndicator
import com.massage.massenger.presentation.navigation.CreateGroupScreen
import com.massage.massenger.presentation.navigation.SingleChatScreen
import com.massage.massenger.presentation.ui.MessagingViewModel
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.extensions.timeToTimestamp
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.state.MessageStatus
import java.util.*

@Composable
fun ChatListScreen(viewModel: MessagingViewModel, chatNavController: NavController) {
    val chats by viewModel.allChat.collectAsState(initial = emptyList())

    ChatListScreenContent(chats = chats,
        createGroup = {
            chatNavController.navigate(CreateGroupScreen())
        },
        onItemChatClick = { chat ->
            chatNavController.navigate(SingleChatScreen(chat = chat))
        }
    )
}

@OptIn(ExperimentalAnimatedInsets::class)
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
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Image(
                    imageVector = Icons.Default.HourglassEmpty,
                    contentDescription = "Empty Chat List",
                    modifier = Modifier.size(100.dp)
                )
            }
        }
        LazyColumn {
            items(testChats) { chat -> // todo test chat
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
    println("Chat List item ${chat.name}")
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
                    ProfileCircle(
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


@Preview
@Composable
fun ChatListScreenPreview() {
    MessengerTheme {
        ChatListScreenContent(
            chats = testChats,
            createGroup = {},
            onItemChatClick = {}
        )
    }
}

@Preview
@Composable
fun ChatItemPreview() {
    MessengerTheme {
        ChatListItem(chat = testChats[0], onItemChatClick = {})
    }
}

fun String.time() = this.timeToTimestamp() ?: System.currentTimeMillis()

val testChats = listOf(
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Mia Maruf",
        type = ChatType.SINGLE,
        message = "Ok I Will Come",
        time = "11:59 PM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Bipu Atikur",
        type = ChatType.SINGLE,
        message = "Good Night",
        time = "11:55 PM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Amin Parves",
        type = ChatType.SINGLE,
        message = "Hello",
        time = "11:54 PM".time(),
        status = MessageStatus.SEEN
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Huda Jakir",
        type = ChatType.SINGLE,
        message = "How r u?",
        time = "11:40 PM".time(),
        status = MessageStatus.SENT
    ),

    Chat(
        id = UUID.randomUUID().toString(),
        name = "Nur Jannatul",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "11:37 PM".time(),
        status = MessageStatus.FAILED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Hassan Parvase",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "08:39 PM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Mohammad Mijanur",
        type = ChatType.SINGLE,
        message = "Hello",
        time = "08:34 PM".time(),
        status = MessageStatus.SEEN_RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Mohammad Mijanur",
        type = ChatType.SINGLE,
        message = "How r u?",
        time = "07:23 PM".time(),
        status = MessageStatus.SEEN
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Hassan Sayed",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "12:23 PM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Mijan Ujjol",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "11:10 AM".time(),
        status = MessageStatus.SEEN
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Nipa Habiba",
        type = ChatType.SINGLE,
        message = "Hello",
        time = "11:09 AM".time(),
        status = MessageStatus.SENT
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Bulbul Ashraful",
        type = ChatType.SINGLE,
        message = "How r u?",
        time = "10:33 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Sheikh Bristi",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "10:30 AM".time(),
        status = MessageStatus.SENT
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Khatun Mariam",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "10:25 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Ruhul Hossen",
        type = ChatType.SINGLE,
        message = "Hello",
        time = "10:10 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Sheikh Shamsun",
        type = ChatType.SINGLE,
        message = "How r u?",
        time = "09:30 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Tareq Mijanur",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "09:28 AM".time(),
        status = MessageStatus.SEEN
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Jakir Al-Amin",
        type = ChatType.SINGLE,
        message = "Hi!",
        time = "09:27 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Ishita Sumiya",
        type = ChatType.SINGLE,
        message = "Hello",
        time = "09:27 AM".time(),
        status = MessageStatus.RECEIVED
    ),
    Chat(
        id = UUID.randomUUID().toString(),
        name = "Kaji Joynal",
        type = ChatType.SINGLE,
        message = "How r u?",
        time = "09:26 AM".time(),
        status = MessageStatus.SEEN_RECEIVED
    ),
)