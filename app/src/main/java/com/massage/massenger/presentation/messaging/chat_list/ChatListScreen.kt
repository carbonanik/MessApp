package com.massage.massenger.presentation.messaging.chat_list

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.HourglassEmpty
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.massage.massenger.model.Chat
import com.massage.massenger.presentation.ui.MessagingActivityViewModel
import com.massage.massenger.presentation.messaging.Screen


@Preview
@Composable
fun ChatPreview() {
//    ChatListScreen()
}

@Composable
fun ChatListScreen(viewModel: MessagingActivityViewModel, chatNavController: NavController) {
    val chats by viewModel.allChat.collectAsState(initial = emptyList())

    if (chats.isEmpty()) {
        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Image(
                imageVector = Icons.Default.HourglassEmpty,
                contentDescription = "Empty Chat List",
                modifier = Modifier.size(100.dp)
            )
        }
    }
    Column {
        Button(onClick = { chatNavController.navigate(Screen.CreateGroupScreen.route)}) {
            Text(text = "CreateGroup")
        }
        LazyColumn(content = {
            chats.forEach { chat ->
                item {
                    ChatListItem(chat, chatNavController = chatNavController)
                }
            }
        })
    }
}

@Composable
fun ChatListItem(chat: Chat, chatNavController: NavController) {
    Surface(color = Color.White) {
        Column {
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        chatNavController.navigate(
                            Screen.SingleChatScreen
                                .routeWithArg(chatId = chat.id)
                        )
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(Modifier.width(15.dp))
                Icon(
                    modifier = Modifier.size(30.dp),
                    imageVector = Icons.Default.Face,
                    contentDescription = "Contact Image"
                )
                Spacer(Modifier.width(15.dp))
                Column {
                    Text(
                        text = chat.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(text = chat.message)
                }
            }
        }
    }
}
