package com.massage.massenger.presentation.messaging.chat_list

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.massage.massenger.model.Chat
import com.massage.massenger.model.enumstate.ChatType
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.extensions.timeToTimestamp
import com.massage.massenger.util.state.MessageStatus
import java.util.*


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