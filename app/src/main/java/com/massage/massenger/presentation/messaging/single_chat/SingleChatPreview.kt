package com.massage.massenger.presentation.messaging.single_chat

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.extensions.toDate
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.extensions.toTimestamp
import com.massage.massenger.util.state.MessageStatus
import java.util.*

@Preview
@Composable
fun SingleChatContentPrev() {
    val dataState by remember {
        mutableStateOf(
            SingleChatDataState(
                loggedInUser = testMe,
                currentChat = testChat,
                receivingGroup = null,
                receiverUser = testReceiver,
                messageList = testMessages
            )
        )
    }

    MessengerTheme {
        SingleChatContent(
            viewState = dataState,
            onImageSend = { },
            onMessageSent = {

            }, onImageClick = {}
        )
    }
}


val testMe = User(UUID.randomUUID().toString(), "Anik Test Me", "0166")
val testReceiver = User(UUID.randomUUID().toString(), "Sheikh Anik", "018348")

val testChat = Chat(id = testReceiver.id, testReceiver.name)

val testMessages = listOf(
    receivedMessage(" you will get a two-year warranty.", "01-07-2022, 10:09:40"),
    receivedMessage(" In LG air conditioner,", "01-06-2022, 10:09:40"),
    sendMessage("What kind of service does it offer?", "01-06-2022, 10:09:40"),
    receivedMessage(
        "You should try the LG air conditioner. It is already in high demand.",
        "01-06-2022, 10:09:40"
    ),
    sendMessage(
        "I am using Panasonic AC these days but I am not that satisfied with its services.",
        "01-06-2022, 10:09:40"
    ),
    receivedMessage(
        "Could you please specify me the brand so that I can be more transparent with the details?",
        "01-06-2022, 10:09:40"
    ),
    receivedMessage("Sure, Sir.", "01-05-2022, 10:09:40"),
    sendMessage(
        "Actually, I am planning to buy an air conditioner, so could you please help me with that.",
        "01-05-2022, 10:09:40"
    ),
    receivedMessage("How can I help you, sir.", "01-05-2022, 10:09:40"),

    sendMessage("Thank you.", "01-05-2022, 10:09:40"),

    receivedMessage("welcome to our store.", "01-05-2022, 10:09:40"),
    receivedMessage("Hello sir!", "01-04-2022, 10:09:40"),
    receivedMessage(" you will get a two-year warranty.", "01-04-2022, 10:09:40"),
    receivedMessage(" In LG air conditioner,", "01-04-2022, 10:09:40"),
    sendMessage("What kind of service does it offer?", "01-03-2022, 11:09:40"),
    receivedMessage(
        "You should try the LG air conditioner. It is already in high demand.",
        "01-03-2022, 10:09:40"
    ),
    sendMessage(
        "I am using Panasonic AC these days but I am not that satisfied with its services.",
        "01-03-2022, 10:09:00"
    ),
    receivedMessage(
        "Could you please specify me the brand so that I can be more transparent with the details?",
        "01-02-2022, 11:41:40"
    ),
    receivedMessage("Sure, Sir.", "01-02-2022, 11:40:40"),
    sendMessage(
        "Actually, I am planning to buy an air conditioner, so could you please help me with that.",
        "01-02-2022, 11:19:40"
    ),
    receivedMessage("How can I help you, sir.", "01-02-2022, 10:09:40"),

    sendMessage("Thank you.", "01-01-2022, 10:10:50"),

    receivedMessage("welcome to our store.", "01-01-2022, 10:09:42"),
    receivedMessage("Hello sir!", "01-01-2022, 10:09:40")
)

fun receivedMessage(text: String, time: String?): ChatMessage {
    val timestamp = time?.toTimestamp() ?: System.currentTimeMillis()
    return ChatMessage(
        id = UUID.randomUUID().toString(),
        chatId = testChat.id,
        authorId = testReceiver.id,
        authorName = testReceiver.name,
        text = text,
        timestamp = timestamp,
        time = timestamp.toTime() ?: "",
        date = timestamp.toDate() ?: "",
        status = MessageStatus.RECEIVED
    )
}

fun sendMessage(text: String, time: String?): ChatMessage {
    val timestamp = time?.toTimestamp() ?: System.currentTimeMillis()
    return ChatMessage(
        id = UUID.randomUUID().toString(),
        chatId = testChat.id,
        authorId = testMe.id,
        authorName = testMe.name,
        text = text,
        timestamp = timestamp,
        time = timestamp.toTime() ?: "",
        date = timestamp.toDate() ?: "",
        status = MessageStatus.SEEN
    )
}