package com.massage.massenger.presentation.messaging.single_chat

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.navigation.NavController
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.massage.massenger.model.Chat
import com.massage.massenger.model.ChatMessage
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.single_chat.component.ChatTopBar
import com.massage.massenger.presentation.messaging.single_chat.component.MessageList
import com.massage.massenger.presentation.messaging.single_chat.component.UserInput
import com.massage.massenger.presentation.navigation.ImageGridDestination
import com.massage.massenger.presentation.navigation.ImageViewDestination
import com.massage.massenger.presentation.ui.RTCActivity
import com.massage.massenger.util.extensions.generateName
import kotlinx.coroutines.launch


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

    SingleChatContent(
        viewModel.dataState,
        onImageSend = { navController.navigate(ImageGridDestination()) },
        onMessageSent = { text ->
            viewModel.sendTextMessage(
                text = text,
                image = null,
            )
        },
        onImageClick = { chatMessage ->
            val name = chatMessage.timestamp.generateName() ?: chatMessage.timestamp.toString()
            if (chatMessage.mediaUrl != null)
                navController.navigate(ImageViewDestination(chatMessage.mediaUrl, name))
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