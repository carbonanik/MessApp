package com.massage.massenger.presentation.messaging.single_chat

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.single_chat.component.ChatTopBar
import com.massage.massenger.presentation.messaging.single_chat.component.MessageList
import com.massage.massenger.presentation.messaging.single_chat.component.UserInput
import com.massage.massenger.presentation.navigation.ImageGridScreen
import com.massage.massenger.presentation.navigation.ImageViewScreen
import com.massage.massenger.presentation.ui.RTCActivity
import com.massage.massenger.presentation.ui.theme.MessengerTheme
import com.massage.massenger.util.extensions.generateName
import com.massage.massenger.util.extensions.toDate
import com.massage.massenger.util.extensions.toTime
import com.massage.massenger.util.extensions.toTimestamp
import com.massage.massenger.util.state.MessageStatus
import kotlinx.coroutines.launch
import java.util.*


@Composable
fun SingleChatScreen(
    viewModel: SingleChatViewModel,
    navController: NavController,
    chat: Chat? = null,
    user: User? = null
) {

    val lifecycleOwner = LocalLifecycleOwner.current

    LaunchedEffect(key1 = lifecycleOwner, block = {
        viewModel.getSingleChatDataState(chat, user)
    })

    val dataState by viewModel.viewState.collectAsState()

    SingleChatContent(
        dataState,
        onImageSend = { navController.navigate(ImageGridScreen()) },
        onMessageSent = { text ->
            viewModel.sendTextMessage(
                me = dataState.loggedInUser,
                text = text,
                image = null,
                receiverUser = dataState.receiverUser,
                receiverGroup = dataState.receivingGroup
            )
        },
        onImageClick = { chatMessage ->
            val name = chatMessage.timestamp.generateName() ?: chatMessage.timestamp.toString()
            if (chatMessage.mediaUrl != null)
                navController.navigate(ImageViewScreen(chatMessage.mediaUrl, name))
        }
    )
}

@Composable
fun SingleChatContent(
    viewState: SingleChatDataState,
    onImageSend: () -> Unit,
    onMessageSent: (text: String) -> Unit,
    onImageClick: (message: ChatMessage) -> Unit
) {

    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(Modifier.fillMaxSize()) {
                ChatTopBar(
                    conversationName = viewState.currentChat?.name
                        ?: viewState.receiverUser?.name
                        ?: "Unknown",
                    onCallPressed = {},
                    onVideoCallPressed = {
                        context.startActivity(Intent(context, RTCActivity::class.java))
                    }
                )

                MessageList(
                    messages = viewState.messageList,
                    modifier = Modifier.weight(1f),
                    scrollState = scrollState,
                    me = viewState.loggedInUser,
                    onImageClick = onImageClick
                )

                UserInput(
                    onMessageSent = {
                        onMessageSent(it)
                    },
                    resetScroll = {
                        scope.launch {
                            scrollState.scrollToItem(0)
                        }
                    },
                    modifier = Modifier.navigationBarsWithImePadding(),
                    onImageSend = onImageSend
                )
            }
        }
    }
}

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