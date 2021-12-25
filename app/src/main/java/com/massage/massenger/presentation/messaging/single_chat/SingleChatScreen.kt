package com.massage.massenger.presentation.messaging.single_chat

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.accompanist.insets.navigationBarsWithImePadding
import com.massage.massenger.model.User
import com.massage.massenger.presentation.messaging.Screen
import com.massage.massenger.presentation.messaging.single_chat.component.ChatTopBar
import com.massage.massenger.presentation.messaging.single_chat.component.MessageList
import com.massage.massenger.presentation.messaging.single_chat.component.UserInput
import kotlinx.coroutines.launch

@Composable
fun SingleChatScreen(
    viewModel: SingleChatViewModel,
    navController: NavController,
) {

//    val messageList by viewModel.displayMessage.collectAsState(initial = emptyList())

    val scrollState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    Surface {
        Box(modifier = Modifier.fillMaxSize()) {
            Column(Modifier.fillMaxSize()) {
                ChatTopBar(
                    conversationName = viewModel.chat?.name ?: viewModel.receiverUser?.name
                    ?: "Unknown",
                    onCallPressed = {},
                    onVideoCallPressed = {}
                )

                viewModel.me?.let {
                    MessageList(
                        messageList = viewModel.displayMessage,
                        modifier = Modifier.weight(1f),
                        scrollState = scrollState,
                        me = it
                    )
                }

                UserInput(
                    onMessageSent = {
                        viewModel.sendTextMessage(
                            me = viewModel.me,
                            text = it,
                            image = null,
                            receiverGroup = null,
                            receiverUser = viewModel.receiverUser
                        )
                    },
                    resetScroll = {
                        scope.launch {
                            scrollState.scrollToItem(0)
                        }
                    },
                    modifier = Modifier.navigationBarsWithImePadding(),
                    onImageSend = {
                        navController.navigate(Screen.SelectPhotoScreen.route)
                    }
                )
            }
        }
    }
}